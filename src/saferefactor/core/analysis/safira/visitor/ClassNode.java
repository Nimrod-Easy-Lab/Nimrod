/***
 * ASM: a very small and fast Java bytecode manipulation framework
 * Copyright (c) 2000-2011 INRIA, France Telecom
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. Neither the name of the copyright holders nor the names of its
 *    contributors may be used to endorse or promote products derived from
 *    this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */
package saferefactor.core.analysis.safira.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.InnerClassNode;

import saferefactor.core.analysis.safira.analyzer.Tools;
import saferefactor.core.analysis.safira.entity.Class;
import saferefactor.core.analysis.safira.entity.Field;
import saferefactor.core.analysis.safira.entity.Method;


public class ClassNode extends ClassVisitor {

    /**
     * The class version.
     */
    public int version;

    /**
     * The class's access flags (see {@link org.objectweb.asm.Opcodes}). This
     * field also indicates if the class is deprecated.
     */
    public int access;

    /**
     * The internal name of the class (see
     * {@link org.objectweb.asm.Type#getInternalName() getInternalName}).
     */
    public String name;

    /**
     * The signature of the class. Mayt be <tt>null</tt>.
     */
    public String signature;

    /**
     * The internal of name of the super class (see
     * {@link org.objectweb.asm.Type#getInternalName() getInternalName}). For
     * interfaces, the super class is {@link Object}. May be <tt>null</tt>,
     * but only for the {@link Object} class.
     */
    public String superName;

    /**
     * The internal names of the class's interfaces (see
     * {@link org.objectweb.asm.Type#getInternalName() getInternalName}). This
     * list is a list of {@link String} objects.
     */
    public List<String> interfaces;

    /**
     * The name of the source file from which this class was compiled. May be
     * <tt>null</tt>.
     */
    public String sourceFile;

    /**
     * Debug information to compute the correspondance between source and
     * compiled elements of the class. May be <tt>null</tt>.
     */
    public String sourceDebug;

    /**
     * The internal name of the enclosing class of the class. May be
     * <tt>null</tt>.
     */
    public String outerClass;

    /**
     * The name of the method that contains the class, or <tt>null</tt> if the
     * class is not enclosed in a method.
     */
    public String outerMethod;

    /**
     * The descriptor of the method that contains the class, or <tt>null</tt>
     * if the class is not enclosed in a method.
     */
    public String outerMethodDesc;

    /**
     * The runtime visible annotations of this class. This list is a list of
     * {@link AnnotationNode} objects. May be <tt>null</tt>.
     *
     * @associates org.objectweb.asm.tree.AnnotationNode
     * @label visible
     */
    public List<AnnotationNode> visibleAnnotations;

    /**
     * The runtime invisible annotations of this class. This list is a list of
     * {@link AnnotationNode} objects. May be <tt>null</tt>.
     *
     * @associates org.objectweb.asm.tree.AnnotationNode
     * @label invisible
     */
    public List<AnnotationNode> invisibleAnnotations;

    /**
     * The non standard attributes of this class. This list is a list of
     * {@link Attribute} objects. May be <tt>null</tt>.
     *
     * @associates org.objectweb.asm.Attribute
     */
    public List<Attribute> attrs;
    
    public boolean inner = false;

    /**
     * Informations about the inner classes of this class. This list is a list
     * of {@link InnerClassNode} objects.
     *
     * @associates org.objectweb.asm.tree.InnerClassNode
     */
    public List<InnerClassNode> innerClasses;

    /**
     * The fields of this class. This list is a list of {@link FieldNode}
     * objects.
     *
     * @associates org.objectweb.asm.tree.FieldNode
     */
    public List<FieldNode> fields;

    /**
     * The methods of this class. This list is a list of {@link MethodNode}
     * objects.
     *
     * @associates org.objectweb.asm.tree.MethodNode
     */
    public List<MethodNode> methods;
    
    public List<Method> methodDeclarations = new ArrayList<Method>();
    
    public List<Method> constructors = new ArrayList<Method>();
    
    public List<Field> fieldDeclarations = new ArrayList<Field>();

	public  Class c;

    /**
     * Constructs a new {@link ClassNode}. <i>Subclasses must not use this
     * constructor</i>. Instead, they must use the {@link #ClassNode(int)}
     * version.
     */
    public ClassNode() {
        this(Opcodes.ASM4);
    }

    /**
     * Constructs a new {@link ClassNode}.
     *
     * @param api the ASM API version implemented by this visitor. Must be one
     *        of {@link Opcodes#ASM4}.
     */
    public ClassNode(final int api) {
        super(api);
        this.interfaces = new ArrayList<String>();
        this.innerClasses = new ArrayList<InnerClassNode>();
        this.fields = new ArrayList<FieldNode>();
        this.methods = new ArrayList<MethodNode>();
    }

    // ------------------------------------------------------------------------
    // Implementation of the ClassVisitor abstract class
    // ------------------------------------------------------------------------

    @Override
    public void visit(
        final int version,
        final int access,
        final String name,
        final String signature,
        final String superName,
        final String[] interfaces)
    {
    	
        this.version = version;
        this.access = access;
        this.name = name;
        this.signature = signature;
        this.superName = superName;
        if (interfaces != null) {
            this.interfaces.addAll(Arrays.asList(interfaces));
        }
     
    	
    }

    @Override
    public void visitSource(final String file, final String debug) {
        sourceFile = file;
//        try {
//			InputManager out = new InputManagerASCII("/Users/melmongiovi/Documents/workspace3/source//src/"+file);
//			out.openFile();
//			while (!out.isEndOfFile())
//				System.out.println("f "+out.readLine());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
//        sourceDebug = debug;
    }

    @Override
    public void visitOuterClass(
        final String owner,
        final String name,
        final String desc)
    {
        outerClass = owner;
        outerMethod = name;
        outerMethodDesc = desc;
    }

    @Override
    public AnnotationVisitor visitAnnotation(
        final String desc,
        final boolean visible)
    {
        AnnotationNode an = new AnnotationNode(desc);
        if (visible) {
            if (visibleAnnotations == null) {
                visibleAnnotations = new ArrayList<AnnotationNode>(1);
            }
            visibleAnnotations.add(an);
        } else {
            if (invisibleAnnotations == null) {
                invisibleAnnotations = new ArrayList<AnnotationNode>(1);
            }
            invisibleAnnotations.add(an);
        }
        return an;
    }

    @Override
    public void visitAttribute(final Attribute attr) {
        if (attrs == null) {
            attrs = new ArrayList<Attribute>(1);
        }
        attrs.add(attr);
    }

    @Override
    public void visitInnerClass(
        final String name,
        final String outerName,
        final String innerName,
        final int access)
    {
//        InnerClassNode icn = new InnerClassNode(name,
//                outerName,
//                innerName,
//                access);
//        innerClasses.add(icn);
        Class c = new Class();
		String modifier = Tools.extractVisibility(access);
	//	System.out.println(name + " "+ modifier);
		c.setVisibility(modifier);
		c.setFullName(name);
    }

    @Override
    public FieldVisitor visitField(
        final int access,
        final String name,
        final String desc,
        final String signature,
        final Object value)
    {
        FieldNode fn = new FieldNode(access, name, desc, signature, value);
        fields.add(fn);
        return fn;
    }

    @Override
    public MethodVisitor visitMethod(
        final int access,
        final String name,
        final String desc,
        final String signature,
        final String[] exceptions)
    {
        MethodNode mn = new MethodNode(access,
                name,
                desc,
                signature,
                exceptions);
       
          
      

		//depois saber se tira o nome completo do returnType
		//ex: ele esta voltando: java.lang.String ou teste.A
		
		
//		System.out.println("meth name: "+returnType+" "+name+" ("+parameters+")");
		
//		if (name.contains("Inner")) {
//			System.out.println("FAIL");
//		}
     
		methods.add(mn);
		return mn;
    }

    @Override
    public void visitEnd() {
    	
    	if (name.contains(Tools.INNER_CLASS_CHARACTER)) {
    		inner = true;
    		name = name.replace(Tools.INNER_CLASS_CHARACTER, ".");
    	}
    	String simpleName = Tools.extractSimpleName(name);
    	if (simpleName.equals("Payoff")) {
    		access = 32;
    	}
    	name = name.replace(Tools.cep, ".");
  
    	//name = name.replace(".1", "");
    	
    	for (MethodNode method : methods) {
    		
    		//clinit -> inicializador est‡tico (depois ver se realmente deve tir‡-lo)
		//	if (!method.name.contains("<clinit>")){
				Method m = new Method();
				m.setDesc(method.desc);
				Type type = Type.getType(method.desc);
				String returnType = type.getReturnType().toString().replace(Tools.cep, ".");
				Type[] argumentTypes = type.getArgumentTypes();
				List<String> parametersList = Tools.getParameters(argumentTypes);
				m.setParameters(parametersList);
				String parameters = Tools.getParametersSignature(parametersList);
//				String parameters = Tools.getParameters(argumentTypes).replace(Tools.INNER_CLASS_CHARACTER, ".");
				//isso aqui nao eh fullName
				//method.name = method.name.replace(Tools.INNER_CLASS_CHARACTER, ".");
				m.setFullName(this.name+"."+method.name + "("+parameters+")");
				
				
				
				m.setSimpleName(method.name);
				m.setClassFullName(this.name);
				m.setParametersSignature(parameters);
//				System.out.println("parameter: "+parameters);
				m.setVisibility(Tools.extractVisibility(method.access));
				m.setModifier(Tools.extractOpcodes(method.access));
				m.setType(returnType);
				m.setMethodInvoc(method.methodInvocations);
				m.setFieldInvoc(method.fieldInvocations);
				m.setInstructionNodes(method.instructionNodes);
				if (method.name.contains("<init>")){ 
//						|| method.name.contains("<clinit>")) { 
					m.setConstructor(true);
					constructors.add(m);
				} else {
					methodDeclarations.add(m);
				}
					
			}
    		
			//System.out.println(m.getType()+" "+m.getFullName()+" ("+parameters+")");
	//	}
    	
    	for (FieldNode field : fields) {
    		if (!field.name.contains("this$")) {
    			Field f = new Field();
    			//	field.name = field.name.replace(Tools.INNER_CLASS_CHARACTER, ".");
    				Type type = Type.getType(field.desc);
    				f.setModifier(Tools.extractOpcodes(field.access));
    				String visibility = Tools.extractVisibility(field.access);
    				f.setVisibility(visibility);
    				String t = type.getReturnType().getClassName();
    				f.setSimpleName(field.name);
    				f.setClassFullName(this.name);
    				f.setFullName(this.name+"."+field.name);
    				f.setVisibility(Tools.extractVisibility(field.access));
    				f.setType(t);
    				fieldDeclarations.add(f);
    		}
			
		}

    	c = new Class();
    	c.setModifier(Tools.extractOpcodes(access));
		String modifier = Tools.extractVisibility(access);
		c.setVisibility(modifier);
		c.setFullName(name);
		
		c.setSimpleName(simpleName);
		c.setInner(inner);
		
	
//		c.setConstructors(constructors);
//		Tools.putClassinMethods(constructors, c);
		c.setConstructors(Tools.putClassinMethods(constructors, c));
		c.setFields(Tools.putClassInFields(fieldDeclarations, c));
		c.setMethods(Tools.putClassinMethods(methodDeclarations, c));
		
		if (superName != null && !superName.equals("java"+Tools.cep+"lang+"+Tools.cep+"Object")) {
			c.setSuperClass(superName);
		}
		if (interfaces != null) {
			for (String interf : interfaces) {
				String interfaceAux = interf.replace(Tools.cep, ".");
				interfaceAux = interfaceAux.replace(Tools.INNER_CLASS_CHARACTER, ".");
				c.addInterface(interfaceAux);
			}
		}
         
    }

    // ------------------------------------------------------------------------
    // Accept method
    // ------------------------------------------------------------------------

    /**
     * Checks that this class node is compatible with the given ASM API version.
     * This methods checks that this node, and all its nodes recursively, do not
     * contain elements that were introduced in more recent versions of the ASM
     * API than the given version.
     *
     * @param api an ASM API version. Must be one of {@link Opcodes#ASM4}.
     */
    public void check(final int api) {
        // nothing to do
    }

    /**
     * Makes the given class visitor visit this class.
     *
     * @param cv a class visitor.
     */
    public void accept(final ClassVisitor cv) {
        // visits header
        String[] interfaces = new String[this.interfaces.size()];
        this.interfaces.toArray(interfaces);
        cv.visit(version, access, name, signature, superName, interfaces);
        // visits source
        if (sourceFile != null || sourceDebug != null) {
            cv.visitSource(sourceFile, sourceDebug);
        }
        // visits outer class
        if (outerClass != null) {
            cv.visitOuterClass(outerClass, outerMethod, outerMethodDesc);
        }
        // visits attributes
        int i, n;
        n = visibleAnnotations == null ? 0 : visibleAnnotations.size();
        for (i = 0; i < n; ++i) {
            AnnotationNode an = visibleAnnotations.get(i);
            an.accept(cv.visitAnnotation(an.desc, true));
        }
        n = invisibleAnnotations == null ? 0 : invisibleAnnotations.size();
        for (i = 0; i < n; ++i) {
            AnnotationNode an = invisibleAnnotations.get(i);
            an.accept(cv.visitAnnotation(an.desc, false));
        }
        n = attrs == null ? 0 : attrs.size();
        for (i = 0; i < n; ++i) {
            cv.visitAttribute(attrs.get(i));
        }
        // visits inner classes
        for (i = 0; i < innerClasses.size(); ++i) {
            innerClasses.get(i).accept(cv);
        }
        // visits fields
        for (i = 0; i < fields.size(); ++i) {
            fields.get(i).accept(cv);
        }
        // visits methods
        for (i = 0; i < methods.size(); ++i) {
            methods.get(i).accept(cv);
        }
        // visits end
        cv.visitEnd();
    }
}
