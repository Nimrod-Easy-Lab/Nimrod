package saferefactor.core.analysis.safira.entity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import saferefactor.core.analysis.safira.entity.Class;


public class Method extends Entity{
	
	String type;
	
	String desc;
	
	String parametersSignature;
	
	List<Method> methodInvoc = new ArrayList<Method>();
	
	List<Method> methodThatCall = new ArrayList<Method>();
	
	StringBuffer code = new StringBuffer();

	List<Field>fieldInvoc = new ArrayList<Field>();
	
	Map<String, String> mapInvoc = new HashMap<String, String>();
	
	List<InstructionNode> instructionNodes = new ArrayList<InstructionNode>();
	 
	Class c;
	
	List<String> parameters = new ArrayList<String>();
	
	boolean constructor = false;
	
	
	Class declaringClass;
	
	String signatureRandoop;
	
	String modifier = "";
	
	boolean hasInnerParameter = false;
	
	
	//instruções do metodo
	List<Object> text = new ArrayList<Object>();
	
	//esse atributo só serve para methodInvoc
	boolean isThis = false;
	
	Set<String> allowedClasses = new HashSet<String>();
	
	public boolean equals(Method m){
		if (this.getFullName().equals(m.getFullName())  &&
				 this.parametersSignature.equals(m.parametersSignature)) {
			return true;
		}
		return false;
	}

	
	public boolean equalsText(List<Object> text) {
		
		if (text.size() == this.text.size()) {
			for (int i = 0; i < text.size(); i++) {
				String text1 = text.get(i).toString();
				String text2 = this.text.get(i).toString();
				if (!text1.equals(text2)) {
					System.out.println();
					return false;
				}
			}
		} else
			return false;
		
		return true;
	}
	
	public void setFieldInvocationInstructions() {
		if (this.getFullName().contains("LocationPathPattern.simplify")) {
			System.out.println("");
		}
		int i = 0;
		String instruction = "";
		String readFieldName = "";
		String writtenFieldName = "";
		for (Object object : text) {
			String inst = object.toString();
			if (inst.contains("GETFIELD") || inst.contains("GETSTATIC")) {
				inst = inst.replaceAll("/", ".");
				String[] split = inst.split(" ");
				readFieldName = split[5];
			} else if (inst.contains("PUTFIELD") || inst.contains("PUTSTATIC")) {
				inst = inst.replaceAll("/", ".");
				String[] split = inst.split(" ");
				writtenFieldName = split[5];
			}
			
			
			if ((inst.trim()).startsWith("L")) {
				String substring = inst.trim().substring(1);
				try{  
		            int parseInt = Integer.parseInt(substring);
		           i = parseInt; 
				if (!instruction.equals("")) {
					boolean getField = instruction.contains("GETFIELD") || instruction.contains("GETSTATIC");
					boolean putField = instruction.contains("PUTFIELD") || instruction.contains("PUTSTATIC");

					if (getField || putField) {
						boolean fieldHasInstruction;
						for (Field field : fieldInvoc) {
							fieldHasInstruction = false;
							if (field.getFullName().equals(writtenFieldName)) {
								field.setWritten(true);
								//só colocar no map se ele for escrito, pois nao vai interessar
								//saber que um field lido mudou
								// o objetivo é colocar o field como impactado se ele mudar a escrita
									String fieldInst = mapInvoc.get(field.getFullName());
									if (fieldInst != null) {
										mapInvoc.put(field.getFullName(), fieldInst + instruction);
									} else
										mapInvoc.put(field.getFullName(), instruction);
							}
							if (field.getFullName().equals(readFieldName)) {
								field.setRead(true);
							}
						}
					}
					instruction = "";
					readFieldName = "";
					writtenFieldName = "";
				}
				}catch(Exception e){  
//		            System.out.println("NÃO é numero");  
		        } 
			} else {
				instruction += inst;
			}
		}
	}
	
	//revisar se esta certo.
	public void doSignatureRandoop() {
		
		String sr = "";
		if (isConstructor()) {
			sr += "cons : "+this.fullName;
		} else {
			
			if (isInherited()) {
				sr += "method : "+declaringClass.getFullName() + "."+simpleName + "("+ parametersSignature+ ") : "+
				c.fullName;
			} else {
				sr += "method : "+this.fullName + " : "+ c.fullName;
			}
			addAllowedClass(c.fullName);
			
		}
		this.setSignatureRandoop(sr);
	}

	public List<Field> getFieldInvoc() {
		return fieldInvoc;
	}

	public void setFieldInvoc(List<Field> fieldInvoc) {
		this.fieldInvoc = fieldInvoc;
	}

	public void addParameter(String parameter) {
		this.parameters.add(parameter);
	}
	
	public void addMethodInvoc(Method m) {
		methodInvoc.add(m);
	}
	public List<Method> getMethodInvoc() {
		return methodInvoc;
	}
	public void setMethodInvoc(List<Method> methodInvoc) {
		this.methodInvoc = methodInvoc;
	}
	public String getParametersSignature() {
		return parametersSignature;
	}

	public void setParametersSignature(String parameters) {
		this.parametersSignature = parameters;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Class getC() {
		return c;
	}

	public void setC(Class c) {
		this.c = c;
	}

	public boolean isConstructor() {
		return constructor;
	}

	public void setConstructor(boolean constructor) {
		this.constructor = constructor;
	}

	public StringBuffer getCode() {
		return code;
	}


	public void setCode(StringBuffer code) {
		this.code = code;
	}


	@Override
	public boolean isInherited() {
		return inherited;
	}

	@Override
	public void setInherited(boolean inherited) {
		this.inherited = inherited;
	}

	public Class getDeclaringClass() {
		return declaringClass;
	}

	public List<InstructionNode> getInstructionNodes() {
		return instructionNodes;
	}

	public void setInstructionNodes(List<InstructionNode> instructionNodes) {
		this.instructionNodes = instructionNodes;
	}

	public void setDeclaringClass(Class containsClass) {
		this.declaringClass = containsClass;
	}

	public String getSignatureRandoop() {
		return signatureRandoop;
	}

	public void setSignatureRandoop(String signatureRandoop) {
		this.signatureRandoop = signatureRandoop;
	}


	public boolean isThis() {
		return isThis;
	}


	public void setThis(boolean isThis) {
		this.isThis = isThis;
	}


	@Override
	public String getModifier() {
		return modifier;
	}


	@Override
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}


	public boolean isHasInnerParameter() {
		return hasInnerParameter;
	}


	public void setHasInnerParameter(boolean hasInnerParameter) {
		this.hasInnerParameter = hasInnerParameter;
	}


	public List<String> getParameters() {
		return parameters;
	}


	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public List<Object> getText() {
		return text;
	}


	public void setText(List<Object> text) {
		this.text = text;
		this.setFieldInvocationInstructions();
		
	}
	
	public Field getFieldInvocation(String fullName) {
		for (Field fi : fieldInvoc) {
			if (fi.getFullName().equals(fullName)) {
				return fi;
			}
		}
		return null;
	}
	
	public String getFieldInstruction(String fieldFullName) {
		return this.mapInvoc.get(fieldFullName);
	}


	public List<Method> getMethodThatCall() {
		return methodThatCall;
	}


	public void setMethodThatCall(List<Method> methodThatCall) {
		this.methodThatCall = methodThatCall;
	}
	
	public void addMethodThatCall(Method m) {
		if (!this.methodThatCall.contains(m) && !m.getFullName().equals(this.fullName))
			this.methodThatCall.add(m);
	}
	
	public void addAllMethodThatCall(List<Method> m) {
		for (Method method : m) {
			addMethodThatCall(method);
		}
	}


	public Set<String> getAllowedClasses() {
		return allowedClasses;
	}


	public void setAllowedClasses(Set<String> allowedClasses) {
		this.allowedClasses = allowedClasses;
	}

	public void addAllowedClass(String c) {
		this.allowedClasses.add(c);
	}

	
//	@Override
//	public int compare(Object paramT1, Object paramT2) {
//		if (((Method) paramT1).getFullName().equals(((Method)paramT2).getFullName())) {
//			return 0;
//		}
//		return -1;
//	}
	

	
}
