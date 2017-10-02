//package manipulator;
//
//import io.OutputManager;
//import io.OutputManagerASCII;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.PrintStream;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import org.apache.tools.ant.DefaultLogger;
//import org.apache.tools.ant.Project;
//import org.apache.tools.ant.ProjectHelper;
//import org.jdom.Document;
//import org.jdom.Element;
//import org.jdom.filter.ElementFilter;
//import org.jdom.input.SAXBuilder;
//
//import saferefactor.ProjectInfo;
//import saferefactor.Saferefactor;
//import randoop.util.Constants;
//
//import entity.Method;
//
//
//
//public class Coverage {
//	
//	private ClassManipulator c;
//	private int changeCovered = 0;
//	private int coverageSourceNumber = 0;
//	private int coverageTargetNumber = 0;
//	private List<Method> coverageSource;
//	private List<Method> coverageTarget;
//	private List<Method> methodsExerciseTheChangeCoverage;
//	public String testPath = Constants.TEST+"/bin/";
//	
//	public int coverage = 0;
//	
//	private boolean isCalledByTheList(List<Method> list, Method m) {
//		String fullName = m.getFullName().trim();
//		
//		for (Method method : list) {
//			if (method.getFullName().equals(m.getFullName())) {
//				return true;
//			}
//			List<Method> miv = method.getMethodInvoc();
//			for (Method methodInvocation : miv) {
//				
//				if (methodInvocation.getFullName().trim().equals(fullName)) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
//	
//	public List<Method> union(List<Method> source, List<Method> target) {
//		
//		List<Method> returnList = new ArrayList<Method>();
//		for (Method m: source) {
//			returnList.add(m);
//		}
//		
//		for(Method method: target) {
//			if (containsMethod(source, method) == null) {
//				returnList.add(method);
//			}
//		}
//		
//		return returnList;
//	}
//	
//	//returnList ja vem com todos os metodos que exercitam diretamente a mudanÁa
//	public List<Method> getMethodsExerciseTheChangeForCoverage(List<Method> impactedMethods, 
//			List<Method> returnList) {
//		
//		while (true) {
//			boolean ok = false;
//			for (Method method : impactedMethods) {
//				if (containsMethod(returnList, method) == null) {
//					//verifica se "method"é chamado por alguém de returnList, se sim, adiciona a returnList
//					if (isCalledByTheList(returnList, method)) {
//						returnList.add(method);
//						ok = true;
//					}
//				}
//			}
//			if (!ok) break;
//		}
//		
//		return returnList;
//	}
//	
//	public List<Method> getMethodsExercisedByTheTests(List<Method> impactedMethods, 
//			List<Method> tests) {
//		List<Method> returnList = new ArrayList<Method>();
//		while (true) {
//			boolean ok = false;
//			for (Method method : impactedMethods) {
//				if (containsMethod(returnList, method) == null) {
//					//verifica se "method"é chamado por alguém de returnList, se sim, adiciona a returnList
//					if (isCalledByTheList(tests, method) || isCalledByTheList(returnList, method)) {
//						returnList.add(method);
//						ok = true;
//					}
//				}
//			}
//			if (!ok) break;
//		}	
//		
//		return returnList;
//	}
//	
//	public List<Method> getMethodsExercisedDirectlyByTheTests(List<Method> impactedMethods, 
//			List<Method> tests) {
//		List<Method> returnList = new ArrayList<Method>();
//			for (Method method : impactedMethods) {
//				if (containsMethod(returnList, method) == null) {
//					//verifica se "method"é chamado por alguém de returnList, se sim, adiciona a returnList
//					if (isCalledByTheList(tests, method)) {
//						returnList.add(method);
//					}
//				}
//			}	
//		
//		return returnList;
//	}
//	
//	private List<Method> invokeMethodCoverage(List<Method> l, List<Method> commonImpacted, String fullNameMethod) {
//		
//		List<Method> returnList = new ArrayList<Method>();
//		
//		for (Method method : l) {
//			if (method.getFullName().equals(fullNameMethod)) {
//				if (containsMethod(commonImpacted, method) == null)
//					returnList.add(method);
//			}
//		}
//		
//		return returnList;
//	}
//	
//	private Method containsMethod(List<Method> l, Method m) {
//		
//		for (Method method : l) {
//				if (method.equals(m)) {
//					return method;
//				}
//		}
//		return null;
//	}
//	
//	public List<String> getNotImpactedMethods(List<Method> tests, List<Method> impactedMethods) {
//		List<String> notImpactedMethods = new ArrayList<String>();
//		for (Method method : tests) {
//			List<Method> miv = method.getMethodInvoc();
//			for (Method methodInvocation : miv) {
//				for (Method im : impactedMethods) {
//					if (methodInvocation.getFullName().trim().equals(im.getFullName())) {
//						if (!notImpactedMethods.contains(methodInvocation.getFullName()))
//							notImpactedMethods.add(methodInvocation.getFullName());
//					}
//				}
//				
//			}
//		}
//		return notImpactedMethods;
//	}
//	
//	public void calculateCoverageSafira(String testPath) throws IOException {
//		
//		ClassManipulator cTest = new ClassManipulator(testPath);
//		List<Method> testMethods = cTest.getSourceMethod();
//		List<Method> union = c.getSourceMethod();
//		List<Method> coverage = this.getMethodsExercisedByTheTests(union, testMethods);
//		System.out.println("coverage---------");
////		for (Method method : coverage) {
////			System.out.println(method.getFullName());
////		}
//		
//		for (Method method : union) {
//			if (!coverage.contains(method)) {
//				System.out.println(method.getFullName());
//			}
//		}
//		
//		if (union.size() > 0) {
//			changeCovered = coverage.size()*100/union.size();
//			System.out.println("cobertura-------------------: "+changeCovered);
//		}
//		
//	}
//	
//	public void calculateCoverage() throws IOException {
//		
////		String testPath = "/var/folders/uB/uBSypadvEUa5OUqqynr2Tk+++TI/-Tmp-/safeRefactorAJ/tests/";
//		String testPath = "/private/var/folders/uB/uBSypadvEUa5OUqqynr2Tk+++TI/-Tmp-/safeRefactorAJ/tests/";
////		String testPath = c.getTestPath();
//		
////		String testPath = "/Users/melmongiovi/Desktop/toys/";
//		List<Method> impactedMethodsSource = c.getImpactedMethodsSource();
//		List<Method> impactedMethodsTarget = c.getImpactedMethodsTarget();
//		ClassManipulator cTest = new ClassManipulator(testPath);
//		List<Method> testMethods = cTest.getSourceMethod();
//		
//		List<Method> union = this.union(impactedMethodsSource, impactedMethodsTarget);
//		
//		System.out.println("union: "+union.size());
//		for (Method method : union) {
//			System.out.println(method.getFullName());
//		}
//		
//		
//		if (union != null) {
//			int impactedMethods = union.size();
//			coverageSource = this.getMethodsExercisedByTheTests(impactedMethodsSource, testMethods);
//			coverageTarget = this.getMethodsExercisedByTheTests(impactedMethodsTarget, testMethods);
//			
//			
//			methodsExerciseTheChangeCoverage = this.union(coverageSource, coverageTarget);
//			System.out.println("metodos que sao exercitados pelos testes");
//			for (Method method : methodsExerciseTheChangeCoverage) {
//				System.out.println(method.getFullName());
//			}
//			
//			int ims = impactedMethodsSource.size();
//			int imt = impactedMethodsTarget.size();
//			
//			if (impactedMethods > 0) {
//				changeCovered = methodsExerciseTheChangeCoverage.size()*100/impactedMethods;
//				System.out.println("cobertura-------------------: "+changeCovered);
//			}
//			
//			if (ims >0) {
//				coverageSourceNumber = coverageSource.size()*100/impactedMethodsSource.size();
//				System.out.println("coberturaSOurce-------------------: "+coverageSourceNumber);
//			}
//			
//			if (imt >0) {
//				coverageTargetNumber = coverageTarget.size()*100/impactedMethodsTarget.size();
//				System.out.println("coberturaTarget-------------------: "+coverageTargetNumber);
//			}
//		}
//		
//		System.out.println("Metodos impactados: "+union.size()+ " metodos exercitados: "+methodsExerciseTheChangeCoverage.size());
//		List<Method> methodsExercisedDirectlyByTheTests = getMethodsExercisedDirectlyByTheTests(impactedMethodsSource, testMethods);
//	}
//	
//	public MethodCoverage getMethod(List<MethodCoverage> l, Method m) {
//		
//		String name = "";
//		for (MethodCoverage methodCoverage : l) {
//			name = m.getContainsClass().getFullName() + "."+m.getSimpleName();
//			if (methodCoverage.getName().equals(name)
//					&& methodCoverage.getSignature().equals(m.getDesc())) {
//				if (m.isInherited()) {
//					MethodCoverage mc = new MethodCoverage();
//					mc.setBranch_rate(methodCoverage.getBranch_rate());
//					mc.setLine_rate(methodCoverage.getLine_rate());
//					mc.setSignature(methodCoverage.getSignature());
//					mc.setName(m.getClassFullName()+"."+m.getSimpleName());
//					return mc;
//				}
//				return methodCoverage;
//			}
//		}
//		if (m.isInherited()) {
//		//	System.out.println(m.getFullName());
//		}
//		return null;
//	}
//	
//	public MethodCoverage getMethodEmma(List<MethodCoverage> l, Method m) {
//		
//		String name = "";
//		for (MethodCoverage methodCoverage : l) {
//			name = m.getContainsClass().getFullName() + "."+m.getSimpleName();
//			String signature = methodCoverage.getSignature().trim();
//			String[] splitSignature = signature.split(",");
//			String parametersSignature = m.getParametersSignature().trim();
//			String[] splitPSignature = parametersSignature.split(",");
//			if (splitSignature.length == splitPSignature.length) {
//				boolean equals = true;
//				for (int i = 0; i < splitPSignature.length; i++) {
//					if (!splitPSignature[i].contains(splitSignature[i])) {
//						equals = false;
//						break;
//					}
//				}
//				if (equals) {
//				
//					if (methodCoverage.getName().equals(name)) {
//						if (m.isInherited()) {
//							MethodCoverage mc = new MethodCoverage();
////							mc.setBranch_rate(methodCoverage.getBranch_rate());
//							mc.setLine_rate(methodCoverage.getLine_rate());
//							mc.setSignature(methodCoverage.getSignature());
//							mc.setName(m.getClassFullName()+"."+m.getSimpleName());
//							return mc;
//						}
//						return methodCoverage;
//					}
//				}
//			}
//		}
//	
//		return null;
//	}
//	
//	public boolean contains(List<Method> l, Method m) {
//		for (Method method : l) {
//			if (method.equals(m)) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public List<MethodCoverage> getCoveragedMethods(String coverageFile, String source, String target) throws MalformedURLException {
//		
//		this.executeScript(source, target, "bin", "src", "", true);
//		
//		List<MethodCoverage> coveragedMethodsSource = calculateCoverageForEmma(coverageFile);
//		
//		this.executeScript(source, target, "bin", "src", "", false);
//		
//		List<MethodCoverage> coveragedMethodsTarget = calculateCoverageForEmma(coverageFile);
//		
//		return this.unionCoveragedMethods(coveragedMethodsSource, coveragedMethodsTarget);
//	}
//	
////	public List<MethodCoverage> getCoveragedMethods(String coverageFile, String source, String target) throws MalformedURLException {
////		
////		
////		List<MethodCoverage> coveragedMethodsSource = calculateCoverageForEmma(coverageFile);
////				
////		return coveragedMethodsSource;
////	}
//	
//	public List<MethodCoverage> unionCoveragedMethods(
//			List<MethodCoverage> source,
//			List<MethodCoverage> target) {
//		
//		List<MethodCoverage> returnList = new ArrayList<MethodCoverage>();
//		for (MethodCoverage m: source) {
//			returnList.add(m);
//		}
//		
//		for(MethodCoverage method: target) {
//			if (containsMethod(source, method) == null) {
//				returnList.add(method);
//			}
//		}
//		
//		return returnList;
//		
//		
//	}
//
//
//
//	private MethodCoverage containsMethod(List<MethodCoverage> list,
//			MethodCoverage method) {
//		for (MethodCoverage methodCoverage : list) {
//			if (method.getName().equals(methodCoverage.getName()) && 
//					method.getSignature().equals(methodCoverage.getSignature())) {
//				return methodCoverage;
//			}
//		}
//		return null;
//	}
//
//	public List<MethodCoverage> calculateCoverage(String coverageFile, String source, String target) throws MalformedURLException {
//			
//		List<Method> impactedMethodsS = c.getImpactedMethodsSource();
//		
//		List<Method> impactedMethodsT = c.getImpactedMethodsTarget();
//		
//		List<Method> impactedMethods = this.union(impactedMethodsS, impactedMethodsT);
//		
////		List<MethodCoverage> allCoveragedMethods = calculateCoverageForEmma(coverageFile);
//		
//		List<MethodCoverage> allCoveragedMethods = getCoveragedMethods(coverageFile, source, target);
//				
//		int coveragedMethodsSize = 0;
//		
//		List<MethodCoverage> impactedMethodsCoverage = new ArrayList<MethodCoverage>();
//		int coverage = 0;
//		System.out.println("------------------------------------");
//		for (Method method : impactedMethods) {
//			MethodCoverage metCoverage = getMethodEmma(allCoveragedMethods, method);
//			if (metCoverage != null && metCoverage.getLine_rate() != 0) {
//				impactedMethodsCoverage.add(metCoverage);
//				coveragedMethodsSize++;
//				coverage+= metCoverage.getLine_rate();
//				System.out.println(method.getFullName());
//			} 
//		}
//		
//		
//		System.out.println("imc "+impactedMethodsCoverage.size());
////		for (MethodCoverage methodCoverage : impactedMethodsCoverage) {
////		}
//		if (impactedMethods.size() == 0) 
//			this.coverage = 0;
//		else
//			this.coverage = (coveragedMethodsSize*100/impactedMethods.size());
////		System.out.println("Coverage: "+this.coverage);
////		System.out.println("Coverage dos metodos cobertos: "+(coverage)/coveragedMethodsSize+"%");
//		
//		return impactedMethodsCoverage;
//	}
//	
//	private List<MethodCoverage> calculateCoverageForCobertura(String coverageFile) {
//			//JAXB
//		//marshall / unmarshall
//		   Document doc = null;
//
//	      SAXBuilder builder = new SAXBuilder();
//	      try {
//	            doc = builder.build(coverageFile);
//	      } catch (Exception e) {
//	            e.printStackTrace();
//	      }
//		
//	      Element root = doc.getRootElement();	      
//	      List<MethodCoverage> methods = new ArrayList<MethodCoverage>();
//	      Iterator classes = root.getDescendants(new ElementFilter("class"));
//	      while (classes.hasNext()) {
//	    	  Object next = classes.next();
//	    	  if (next instanceof Element) {
//	    		  String className = ((Element)next).getAttribute("name").getValue();
//	    		  Iterator methodNodes = ((Element)next).getDescendants(new ElementFilter("method"));
//	    		  while (methodNodes.hasNext()) {
//	    			  Object nextMethod = methodNodes.next();
//	    			  if (nextMethod instanceof Element) {
//	    				  String methodName = ((Element)nextMethod).getAttribute("name").getValue();
//	    				  String signature = ((Element)nextMethod).getAttribute("signature").getValue();
//	    				  String lineRate = ((Element)nextMethod).getAttribute("line-rate").getValue();
//	    				  String branchRate = ((Element)nextMethod).getAttribute("branch-rate").getValue();
//	    				  if (methodName.equals("&lt;init&gt")) {
//	    					  methodName = "<init>";
//	    				  }
//	    				  MethodCoverage mc = new MethodCoverage();
//	    				  mc.setName(className + "."+methodName);
//	    				  mc.setSignature(signature);
//	    				  mc.setLine_rate(Double.parseDouble(lineRate));
//	    				  mc.setBranch_rate(Double.parseDouble(branchRate));
//	    				  methods.add(mc);
//	    			  }
//	    		  }
//	    	  }
//	      }
//	      return methods;
//	}
//	
//	
//	
//	public List<MethodCoverage> calculateCoverageForEmma(String coverageFile) {
//		//JAXB
//	//marshall / unmarshall
////		   Document doc = null;
////
////		      SAXBuilder builder = new SAXBuilder();
////		      try {
////		            doc = builder.build(coverageFile);
////		      } catch (Exception e) {
////		            e.printStackTrace();
////		      }
////			
////		      Element root = doc.getRootElement();
////		      List<MethodCoverage> methods = new ArrayList<MethodCoverage>();
////		      Iterator packages = root.getDescendants(new ElementFilter("package"));
////		      while (packages.hasNext()) {
////		    	  Object nextPack = packages.next();
////		    	  if (nextPack instanceof Element) {
////		    		  String packageName = ((Element)nextPack).getAttribute("name").getValue();
////		    		  Iterator classes = ((Element)nextPack).getDescendants(new ElementFilter("class"));
////		    		  while (classes.hasNext()) {
////		    	    	  Object next = classes.next();
////		    	    	  if (next instanceof Element) {
////		    	    		  String className = ((Element)next).getAttribute("name").getValue();
////		    	    		  Iterator methodNodes = ((Element)next).getDescendants(new ElementFilter("method"));
////		    	    		  while (methodNodes.hasNext()) {
////		    	    			  Object nextMethod = methodNodes.next();
////		    	    			  if (nextMethod instanceof Element) {
////		    	    				  String line = "";
////		    	    				  Iterator coverageNodes = ((Element)next).getDescendants(new ElementFilter("coverage"));
////				    	    		  while (coverageNodes.hasNext()) {
////				    	    			  Object nextCoverage = coverageNodes.next();
////				    	    			  if (nextCoverage instanceof Element) {
////				    	    				  String coverage = ((Element)nextCoverage).getAttribute("type").getValue();
////				    	    				  if (coverage.equals("line, %")) {
////				    	    					  line = ((Element)nextCoverage).getAttribute("value").getValue();
////				    	    				  }
////				    	    			  }
////				    	    		  } 
////		    	    				  String methodName = ((Element)nextMethod).getAttribute("name").getValue();
////		    	    				  String[] split = methodName.split(" ");
////		    	    				  String simpleName = split[0];
////		    	    				  if (simpleName.equals(className)) {
////		    	    					  simpleName = "<init>";
////		    	    				  }
////		    	    				  String parameters = "";
////		    	    				  if (methodName.contains("("))
////		    	    					  parameters = methodName.substring(methodName.indexOf("(")+1, methodName.indexOf(")"));
////		    	    				  String fullName = "";
////		    	    				  if (packageName.equals("default package")) {
////		    	    					  fullName = className+"."+simpleName;
////		    	    				  } else {
////		    	    					  fullName = packageName + "."+ className+"."+simpleName;
////		    	    				  }
////		    	    				  
////		    	    				  line = line.substring(0,line.indexOf("%"));
////		    	    				  MethodCoverage mc = new MethodCoverage();
////		    	    				  mc.setName(fullName);
////		    	    				  mc.setSignature(parameters);
////		    	    				  mc.setLine_rate(Integer.parseInt(line));
////		    	    				  System.out.println(fullName + " "+Integer.parseInt(line));
////		    	    				  methods.add(mc);
////		    	    			  }
////		    	    		  }
////		    	    	  }
////		    	      }
////		    	  }
////		      }
//	      return methods;
//}
//
//	
//	public Coverage(ClassManipulator c) throws IOException {
//		
//		this.c = c;
////		this.calculateCoverage();
//		
//	}
//	
//	public Coverage() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public int getChangeCovered() {
//		return changeCovered;
//	}
//
//	public void setChangeCovered(int changeCovered) {
//		this.changeCovered = changeCovered;
//	}
//
//	public int getCoverageSourceNumber() {
//		return coverageSourceNumber;
//	}
//
//	public void setCoverageSourceNumber(int coverageSourceNumber) {
//		this.coverageSourceNumber = coverageSourceNumber;
//	}
//
//	public int getCoverageTargetNumber() {
//		return coverageTargetNumber;
//	}
//
//	public void setCoverageTargetNumber(int coverageTargetNumber) {
//		this.coverageTargetNumber = coverageTargetNumber;
//	}
//	
//	public void executeScript(String source, String target, String bin, String src, String lib, boolean runSource) throws MalformedURLException {
//		
//		ProjectInfo pinfo = new ProjectInfo(source, target, bin, src, lib);
//		FileUtil.createFolders();
//		
//		//URL file = this.getClass().getResource("/build.xml");
//		
//		File buildFile = new File("/Users/melmongiovi/Documents/workspace3/AnalisadorASM/ant" + Constants.FILE_SEPARATOR + "buildSafiraEmma.xml");
//		URL file = buildFile.toURL();
//		// File buildFile = new File("ant" + Constants.FILE_SEPARATOR +
//		// "build.xml");
//		Project p = new Project();
//
//		// propriedades
//		p.setProperty("junit","/Users/melmongiovi/Documents/workspace3/AnalisadorASM/lib/junit-4.5.jar");
//		p.setProperty("source", pinfo.getSource());
//		if (runSource) {
//			p.setProperty("targetBin",source + "/bin/");
//			p.setProperty("targetSrc", source + "/src/");
//		} else {
//			p.setProperty("targetBin",target + "/bin/");
//			p.setProperty("targetSrc", target + "/src/");
//		}
//		
//		p.setProperty("target", pinfo.getTarget());
//		System.out.println("target: "+pinfo.getTarget());
//		// p.setProperty("methodlist", methodList.toString());
//		p.setProperty("bin", pinfo.getBinDir());
//		p.setProperty("lib", pinfo.getLib());
//		p.setProperty("src", pinfo.getSrcDir());
//		p.setProperty("tests.folder", testPath);
//		
//		
//		// log do ant no console
//		DefaultLogger consoleLogger = new DefaultLogger();
//		consoleLogger.setErrorPrintStream(System.err);
//		consoleLogger.setOutputPrintStream(System.out);
//		consoleLogger.setMessageOutputLevel(Project.MSG_INFO);
//		p.addBuildListener(consoleLogger);
//		
//		// logar em arquivo
//		DefaultLogger consoleLogger2 = new DefaultLogger();
//		File f = new File(Constants.TEMP + Constants.FILE_SEPARATOR +  "log.txt");
//		System.out.println(f.getAbsolutePath());
//		try {
//			f.createNewFile();
//			FileOutputStream myFile;
//			PrintStream myStream;
//			myFile = new FileOutputStream(Constants.TEMP + Constants.FILE_SEPARATOR +  "log.txt");
//			myStream = new PrintStream(myFile);
//			consoleLogger2.setErrorPrintStream(myStream);
//			consoleLogger2.setOutputPrintStream(myStream);
//			consoleLogger2.setMessageOutputLevel(Project.MSG_INFO);
//			p.addBuildListener(consoleLogger2);
//		} catch (IOException ex) {
//			Logger.getLogger(Saferefactor.class.getName()).log(Level.SEVERE,
//					null, ex);
//		}
//
//		p.init();
//		ProjectHelper helper = ProjectHelper.getProjectHelper();
//		p.addReference("ant.projectHelper", helper);
//		helper.parse(p, file);
//		p.executeTarget(p.getDefaultTarget());
//	}
//	
//	public static void main(String[] args) throws IOException {
//
//		
////		String source = "/Users/melmongiovi/Desktop/manipulator/";
//	
////		String source = "/Users/melmongiovi/Documents/workspace3/pushDownDissertacaoS/";
////		String target = "/Users/melmongiovi/Documents/workspace3/pushDownDissertacaoT/";
//		
////		String source = "/Users/melmongiovi/Documents/workspace3/AnalisadorASM/subjects/sub1.2.1source/";
////		String target = "/Users/melmongiovi/Documents/workspace3/AnalisadorASM/subjects/sub1.2.1target/";
////		
//		
////		String source = "/Users/melmongiovi/Documents/workspace3/c637489source/";
////		String target = "/Users/melmongiovi/Documents/workspace3/c637489target/";
//
////		String source = "/Users/melmongiovi/Documents/subject4/subject4source/";
////		String target = "/Users/melmongiovi/Documents/subject4/subject4target/";
//		
////		String source = "/private/var/folders/uB/uBSypadvEUa5OUqqynr2Tk+++TI/-Tmp-/EncapsulateField22/test19/in";
////		String target = "/private/var/folders/uB/uBSypadvEUa5OUqqynr2Tk+++TI/-Tmp-/EncapsulateField22/test19/out/jrrt";
//		
////		String source = "/Users/melmongiovi/Documents/subject1/subject1source/";
////		String target = "/Users/melmongiovi/Documents/subject1/subject1target/";
//		
//		
//		
//		int subject = 151;
//		List<Integer> subjects = new ArrayList<Integer>();
//		subjects.add(134);
//		
//		subjects.add(156);
//		subjects.add(173);
//		subjects.add(176);
//		subjects.add(193);
//		subjects.add(251);
//		subjects.add(267);
//		subjects.add(274);
//		subjects.add(275);
//		subjects.add(300);
//		subjects.add(304);
//		subjects.add(318);
//		subjects.add(322);
//		subjects.add(324);
//		subjects.add(344);
//		subjects.add(384);
//		subjects.add(405);
//		subjects.add(409);
//		subjects.add(458);
//		subjects.add(501);
//		subjects.add(503);
//		subjects.add(590);
//		subjects.add(596);
//		subjects.add(609);
//		subjects.add(649);
//		subjects.add(650);
//		subjects.add(660);
//		subjects.add(697);
//		subjects.add(704);
//		subjects.add(743);
//		
//		for (Integer integer : subjects) {
//			if (integer != 590) {
//				continue;
//			}
//			subject = integer;
//			String timeLimit = "1";
//			String arquivo = "/Users/melmongiovi/Documents/resultados/safira1"+subject;
//			OutputManager out = new OutputManagerASCII(arquivo);
//			out.createFile();
//			for (int i = 0; i < 1; i++) {
//				if (i == 1) {
//					timeLimit = "5";
//				}
//				if (i == 2) {
//					timeLimit = "60";
//				}
//				if (i == 3) {
//					timeLimit = "120";
//				}
//				
//				String source = "/Users/melmongiovi/Documents/workspace4/JHD"+subject+"source/";
//				String target = "/Users/melmongiovi/Documents/workspace4/JHD"+subject+"target/";
//				
//				long time = System.currentTimeMillis();
//				ClassManipulator c = new ClassManipulator(source, target, "lib", timeLimit,"",true);
//				c.print();
//				time = System.currentTimeMillis() - time;
//				
//				Coverage coverage = new Coverage(c);
////				coverage.executeScript(source, target, "bin", "src", "", false);
//				coverage.calculateCoverage("/private/var/folders/uB/uBSypadvEUa5OUqqynr2Tk+++TI/-Tmp-/safeRefactorAJ/tests/bin/coverage/coverage.xml", source, target);
//				
//				out.writeLine("TimeLimit: "+timeLimit+" \n");
//				out.writeLine("Tempo total: "+(time/1000)+"s \n");
//				out.writeLine("Métodos: "+c.methods+" \n");	
//				out.writeLine("Testes: "+c.generatedTests+" \n");
//				out.writeLine("Cobertura: "+coverage.coverage+"% \n");
//				out.writeLine("Resultado: "+c.isRefactoring+"\n");
//				
//				
//				
//				
//				
//			}
//			
//			out.closeFile();
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
////		coverage.executeScript(source, target, "bin", "src", "");
////		coverage.calculateCoverageForEmma("/private/var/folders/uB/uBSypadvEUa5OUqqynr2Tk+++TI/-Tmp-/safeRefactorAJ/tests/bin/coverage/coverage.xml");
//		
//		
////		coverage.calculateCoverageSafira("/Users/melmongiovi/Desktop/toys/");
////		coverage.calculateCoverage("/Users/melmongiovi/Documents/subject4/subject4source/coverage.xml", true);
////		coverage.calculateCoverage("/Users/melmong	iovi/Documents/workspace3/c637489source/coverage.xml", true);
//		
//		
//		
//		
//		
////		coverage.calculateCoverage("/Users/melmongiovi/Documents/workspace3/JHD503source/coverage.xml", true);
//
//		
//		
//		
//		
//		
//		//		coverage.calculateCoverage("/private/var/folders/uB/uBSypadvEUa5OUqqynr2Tk+++TI/-Tmp-/EncapsulateField22/test19/in/coverage.xml", true);
////		coverage.calculateCoverage("/Users/melmongiovi/Documents/workspace3/AnalisadorASM/tests/toys/coverage.xml",true);
////		coverage.calculateCoverage("/Users/melmongiovi/Documents/subject4/subject4source/coverage.xml",true);
////		coverage.calculateCoverage("/Users/melmongiovi/Documents/subject4/subject4target/coverage.xml",false);
////		coverage.calculateCoverage("/Users/melmongiovi/Documents/workspace3/junitSource/coverage.xml",true);
////		coverage.calculateCoverage("/Users/melmongiovi/Documents/workspace3/junitSource2/coverage.xml",false);
//	
//	}
//	
//}
