package filters;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import saferefactor.core.analysis.safira.analyzer.ImpactAnalysis;
import saferefactor.core.analysis.safira.entity.Class;
import saferefactor.core.analysis.safira.entity.Method;


public class JRRT {
		
	ImpactAnalysis ia;
	int sub;
	
	public final String PUSH_DOWN_METHOD = "m_0";
	
	List<Integer> introduceImplicitCast = new ArrayList<Integer>();
	List<Integer> removeImplicitCast = new ArrayList<Integer>();
	List<Integer> enableOverloading = new ArrayList<Integer>();
	List<Integer> enableOverriding = new ArrayList<Integer>();
	List<Integer> enableOverloadingWithoutShadow = new ArrayList<Integer>();
	List<Integer> enableOverridingWithoutShadow = new ArrayList<Integer>();
	List<Integer> outros = new ArrayList<Integer>();
	
	public void calculate(ImpactAnalysis ia, int sub) {
		
		this.ia = ia;
		
//		if(introduceImplicitCast()) {
//			introduceImplicitCast.add(sub);
//		}
//		if(removeImplicitCast()) {
//			removeImplicitCast.add(sub);
//		}
		
		if (enableOverloading()) {
			enableOverloading.add(sub);
		} else if (enableOverriding()) {
			enableOverriding.add(sub);
		} else if(introduceImplicitCast()) {
			introduceImplicitCast.add(sub);
		} else if(removeImplicitCast()) {
			removeImplicitCast.add(sub);
		} else if(enableOverloadingWithoutShadowDeclaration()) {
			enableOverloadingWithoutShadow.add(sub);
		} else if(enableOverridingWithoutShadowDeclaration()) {
			enableOverridingWithoutShadow.add(sub);
		} else {
			outros.add(sub);
		}
	}
	
	//with shadow declaration
		public boolean enableOverloading() {
			
			HashMap<String, Class> sourceClassess = ia.getSourceClassess();
			
			Class superClass = null;
			Class subClass1 = null;
			Class subClass2 = null;
			
			for (Class c : sourceClassess.values()) {
				if (hasSuperClass(c)) {
					if (subClass1 == null) {
						subClass1 = c;
					} else {
						subClass2 = c;
					}
				} else {
					superClass = c;
				}
			}
			
			//duas classes estendem uma classe
			if (subClass2 != null && superClass != null) {
				if (subClass1.getSimpleName().equals(subClass2.getSimpleName())) {
					
					Method sameMethod = getSameMethod(superClass, subClass1); 
					Class sameMethodSubClass = null;
					if (sameMethod != null) {
						sameMethodSubClass = subClass1; 
					} else {
						sameMethod = getSameMethod(superClass, subClass2);
						if (sameMethod != null) {
							sameMethodSubClass = subClass2;
						}
					}
					//uma das classes tem um metodo com o mesmo nome da superclasse 
					if (sameMethodSubClass != null) {
						
						//as classes que tem o mesmo metodo est‹o em pacotes diferentes
						if (!sameMethodSubClass.getPackage().equals(superClass.getPackage())) {
						
							List<Method> methods = superClass.getMethods();
							for (Method method : methods) {
								//verificando se tem algum metodo da superclasse que chama o metodo que tem o mesmo nome da subclasse
								if (!method.getSimpleName().equals(sameMethod.getSimpleName())) {
									List<Method> methodInvoc = method.getMethodInvoc();
									for (Method mi : methodInvoc) {
										if (mi.getSimpleName().equals(sameMethod.getSimpleName())) {
											return hasNewCall(method) && !mi.getParametersSignature().equals("");
										}
									}
								}
							}
						}
						
					}
				}
			}
			return false;
		}
		
		
		//with shadow declaration
		public boolean enableOverriding() {
			
			HashMap<String, Class> sourceClassess = ia.getSourceClassess();
			
			Class superClass = null;
			Class subClass1 = null;
			Class subClass2 = null;
			
			for (Class c : sourceClassess.values()) {
				if (hasSuperClass(c)) {
					if (subClass1 == null) {
						subClass1 = c;
					} else {
						subClass2 = c;
					}
				} else {
					superClass = c;
				}
			}
			
			//duas classes estendem uma classe
			if (subClass2 != null && superClass != null) {
				if (subClass1.getSimpleName().equals(subClass2.getSimpleName())) {
					
					Method sameMethod = getSameMethod(superClass, subClass1); 
					Class sameMethodSubClass = null;
					if (sameMethod != null) {
						sameMethodSubClass = subClass1; 
					} else {
						sameMethod = getSameMethod(superClass, subClass2);
						if (sameMethod != null) {
							sameMethodSubClass = subClass2;
						}
					}
					//uma das classes tem um metodo com o mesmo nome da superclasse 
					if (sameMethodSubClass != null) {
						
						//as classes que tem o mesmo metodo est‹o em pacotes diferentes
						if (!sameMethodSubClass.getPackage().equals(superClass.getPackage())) {
						
							List<Method> methods = superClass.getMethods();
							for (Method method : methods) {
								//verificando se tem algum metodo da superclasse que chama o metodo que tem o mesmo nome da subclasse
								if (!method.getSimpleName().equals(sameMethod.getSimpleName())) {
									List<Method> methodInvoc = method.getMethodInvoc();
									for (Method mi : methodInvoc) {
										if (mi.getSimpleName().equals(sameMethod.getSimpleName())) {
											return hasNewCall(method) && mi.getParametersSignature().equals("");
										}
									}
								}
							}
						}
						
					}
				}
			}
			return false;
		}
		
		//without shadow declaration
		public boolean enableOverridingWithoutShadowDeclaration() {
			
			HashMap<String, Class> sourceClassess = ia.getSourceClassess();
			Collection<Class> sc1 = sourceClassess.values();
			Collection<Class> sc2 = sourceClassess.values();
			
			boolean overridingMethod = false;
			
			for (Class c1 : sc1) {
				if (overridingMethod) break;
				for (Class c2 : sc2) {
					if (!c1.getFullName().equals(c2.getFullName())) {
						overridingMethod = verifyOverridingMethod(c1,c2);
						if (overridingMethod) break;
					}
				}
			}
			if (overridingMethod) {
				HashMap<String, Method> sourceMethodss = ia.getSourceMethodss();
				for (Method m : sourceMethodss.values()) {
					if (m.getSimpleName().equals(PUSH_DOWN_METHOD) && !m.isInherited()) {
//						if (!hasNewCall(m)) {
							return true;
//						}
					}
				}
			}
			return false;
		}
		
		//without shadow declaration
		public boolean enableOverloadingWithoutShadowDeclaration() {
			
			HashMap<String, Class> sourceClassess = ia.getSourceClassess();
			Collection<Class> sc1 = sourceClassess.values();
			Collection<Class> sc2 = sourceClassess.values();
			
			boolean overloadingMethod = false;
			
			for (Class c1 : sc1) {
				if (overloadingMethod) {
					break;
				}
				for (Class c2 : sc2) {
					if (!c1.getFullName().equals(c2.getFullName())) {
						overloadingMethod = verifyOverloadingMethod(c1,c2);
						if (overloadingMethod) {
							break;
						}
					}
				}
			}
			if (overloadingMethod) {
				HashMap<String, Method> sourceMethodss = ia.getSourceMethodss();
				for (Method m : sourceMethodss.values()) {
					if (m.getSimpleName().equals(PUSH_DOWN_METHOD) && !m.isInherited()) {
//						if (!hasNewCall(m)) {
							return true;
//						}
					}
				}
			}
			return false;
		}
		
		
		private boolean verifyOverridingMethod(Class c1, Class c2) {
			
			List<Method> methods1 = c1.getMethods();
			List<Method> methods2 = c2.getMethods();
			
			for (Method m1 : methods1) {
				for (Method m2 : methods2) {
					if (m1.getSimpleName().equals(m2.getSimpleName()) &&
							!m1.isInherited() && !m2.isInherited() &&
							!m1.getFullName().equals(m2.getFullName()) &&
							m1.getParametersSignature().equals(m2.getParametersSignature())) {
						return true;
					}
				}
			}
			return false;
		}
		
	private boolean verifyOverloadingMethod(Class c1, Class c2) {
			
			List<Method> methods1 = c1.getMethods();
			List<Method> methods2 = c2.getMethods();
			
			for (Method m1 : methods1) {
				for (Method m2 : methods2) {
					if (m1.getSimpleName().equals(m2.getSimpleName()) &&
							!m1.isInherited() && !m2.isInherited() &&
							!m1.getFullName().equals(m2.getFullName()) &&
							!m1.getParametersSignature().equals(m2.getParametersSignature())) {
						return true;
					}
				}
			}
			return false;
		}
	
		public boolean removeImplicitCast() {
			
			HashMap<String, Method> sourceMethodss = ia.getSourceMethodss();
			
			for (Method m : sourceMethodss.values()) {
				if (m.getSimpleName().equals(PUSH_DOWN_METHOD)) {
					List<Method> methodInvoc = m.getMethodInvoc();
					for (Method mi : methodInvoc) {
						if (mi.getParametersSignature().contains("long")) {
							return true;
						}
					}
				}
			}
			
			return false;
		}
		
	public boolean introduceImplicitCast() {
			
			HashMap<String, Method> sourceMethodss = ia.getSourceMethodss();
			
			for (Method m : sourceMethodss.values()) {
				if (m.getSimpleName().equals(PUSH_DOWN_METHOD)) {
					List<Method> methodInvoc = m.getMethodInvoc();
					for (Method mi : methodInvoc) {
						if (mi.getParametersSignature().contains("int")) {
							return true;
						}
					}
				}
			}
			
			return false;
		}

		public boolean hasNewCall(Method m) {
			List<Object> text = m.getText();
			for (Object object : text) {
				if (object.toString().contains("INVOKESPECIAL") && 
						object.toString().contains("<init>")) {
					return true;
				}
			}
			return false;
		}
		
		public boolean hasSuperClass(Class c) {
			return !c.getSuperClass().contains("java.lang.Object"); 
		}
		
		public Method getSameMethod(Class c1, Class c2) {
			List<Method> methods1 = c1.getMethods();
			List<Method> methods2 = c2.getMethods();
			
			for (Method m1 : methods1) {
				for (Method m2 : methods2) {
					if (m1.getSimpleName().equals(m2.getSimpleName())) {
						return m1;
					}
				}
			}
			return null;
			
		}
		
		public static void main(String[] args) throws IOException {
			JRRT jrrt = new JRRT();
			int skip = 1;
			String path = "/Users/melmongiovi/Documents/doutorado/experimentos/jrrt3/pushdownmethod/skip"+skip+"/";
			
			//skip20
			//int [] bc = {178, 181, 191};
			
			
			int [] np = {4, 5, 11, 12, 18, 19, 25, 26, 27, 40, 41, 61, 62, 63, 68, 69, 70, 76, 77, 83, 84, 97, 98, 99, 126, 127, 129, 131, 132, 133, 134, 135, 137, 138, 139, 140, 141, 142, 147, 148, 149, 154, 155, 156, 159, 161, 166, 180, 185, 188, 194, 197, 199, 200, 204, 205, 207, 208, 210, 212, 218, 219, 222, 226, 228, 234, 244, 246, 247, 248, 250, 251, 252, 253, 254, 257, 262, 267, 268, 269, 274, 275, 276, 282, 283, 289, 290, 296, 297, 303, 304, 305, 310, 311, 312, 318, 319, 325, 326, 332, 333, 339, 340, 341, 346, 347, 348, 354, 355, 361, 362, 368, 369, 375, 376, 377, 381, 389, 410, 417, 447, 448, 449, 454, 455, 456, 462, 463, 476, 477, 490, 491, 492, 498, 499, 505, 506, 519, 520, 521, 534, 535, 548, 549, 555, 556, 557, 562, 563, 564, 570, 571, 577, 578, 584, 585, 586, 591, 592, 593, 599, 600, 606, 607, 616, 620, 649, 650, 656, 657, 658, 663, 664, 665, 678, 679, 692, 693, 699, 703, 742, 756, 766, 860, 871, 876, 886, 900, 904, 929};
			
			//skip1
			int bc[] = {3205, 3234, 3238, 3239, 3265, 3269, 3270, 3301, 3330, 3334, 3335, 3361, 3365, 3366, 3560, 3594, 3601, 3612, 3618, 3620, 3625, 3652, 3657, 3690, 3719, 3723, 3724, 3746, 3750, 3751, 3787, 3794, 3805, 3811, 3813, 3818, 3820, 3842, 3847, 3849, 3887, 3891, 3902, 3908, 3910, 3915, 3937, 3942};
			
			//skip3
			//int [] bc = { 1078, 1090, 1110, 1122, 1198, 1204, 1206, 1219, 1230, 1241, 1250, 1271, 1283, 1297, 1305, 1314};
			//skip5
//			int [] bc = {641, 653, 654, 666, 667, 673, 712, 724, 725, 738, 750, 761, 764, 782, 783};
			//skip 10
			//int [] bc = {327, 333, 356, 362, 369, 375, 382, 391};
			//skip20
//			int[] bc = {178, 181, 191};
			
			for (int i = 1; i <= 20544; i++) {
				String sp = path + "test"+i+"/in/";
				String tp = path + "test"+i+"/out/jrrt/";
				
				for (int j : bc) {
					if (j == i) {
						jrrt.calculate(new ImpactAnalysis(sp,tp,""), i);
					}
				}
			}
			
			System.out.println("introduceImplicitCast "+jrrt.introduceImplicitCast.size());
			System.out.println(jrrt.introduceImplicitCast.toString());
			System.out.println("removeImplicitCast "+jrrt.removeImplicitCast.size());
			System.out.println(jrrt.removeImplicitCast.toString());
			System.out.println("enableOverloading "+jrrt.enableOverloading.size());
			System.out.println(jrrt.enableOverloading.toString());
			System.out.println("enableOverriding "+jrrt.enableOverriding.size());
			System.out.println(jrrt.enableOverriding.toString());
			System.out.println("enableOverloading without shadow "+jrrt.enableOverloadingWithoutShadow.size());
			System.out.println(jrrt.enableOverloadingWithoutShadow.toString());
			System.out.println("enableOverriding without shadow "+jrrt.enableOverridingWithoutShadow.size());
			System.out.println(jrrt.enableOverridingWithoutShadow.toString());
			System.out.println("Outros: "+jrrt.outros.size());
			System.out.println(jrrt.outros.toString());
			
		}
}
