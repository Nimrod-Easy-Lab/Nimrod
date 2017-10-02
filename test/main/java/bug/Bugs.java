package bug;

import java.io.IOException;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import saferefactor.util.SRImpact;




public class Bugs extends TestCase{
	
	String path = System.getProperty("user.dir");
	
	//A versão anterior estava considerando construtores não comuns às duas versões do programa
	@Test
	public void testConstructors() {
		
		String source = path + "/test/subjects/bugConstrutoresS";
		String target = path + "/test/subjects/bugConstrutoresT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(true, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertEquals("method : A.m() : A", fileIntersection.get(0));
		assertEquals(1,fileIntersection.size());
		
	}
	
	//identificar atributos modificados quando seu valor é alterado diferentemente nas duas versões do programa, 
	//ou é alterado apenas em uma versão. 
	@Test
	public void testModifiedFields()  {
		
		String source = path + "/test/subjects/bugModifiedFieldS";
		String target = path + "/test/subjects/bugModifiedFieldT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("method : B.m() : B"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertEquals(3,fileIntersection.size());
		
	}
	
	//Ao adicionar as dependências de um método, quando esta era uma interface ou classe abstrata, 
	//apenas uma classe que implementa a dependência estava sendo considerada 
	@Test
	public void testImplementerClasses() throws IOException {
		String source = path + "/test/subjects/bugImplementerClassesS";
		String target = path + "/test/subjects/bugImplementerClassesT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("method : C.m(I) : C"));
		assertEquals(4,fileIntersection.size());
		
	}
	
	//Se um metodo chama uma interface, é necessario considerar que este metodo possa chamar todos 
	// os metodos cujas classes implementam a interface
	@Test
	public void testCallInheritedMethods() throws IOException {
		String source = path + "/test/subjects/mutantS";
		String target = path + "/test/subjects/mutantT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("method : A.m() : C;B"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertEquals(3,fileIntersection.size());
		
	}
	
	//SR novo não pega (1.2.2) (a versão que usa design wizard)
	@Test
	public void testBugSR() throws IOException {
		String source = path + "/test/subjects/bugSRS";
		String target = path + "/test/subjects/bugSRT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("method : C.get() : C"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertEquals(2,fileIntersection.size());
		
	}
	
	//bug introduzido ao refatorar o código (v1.0 -> v.1.1), modificando o algoritmo para 
	//diminuir a complexidade e melhorar o tempo de analise:
	//criar o grafo de chamadas dentro do loop de identificar métodos adicionados e removidos.
	//Ao identificar um método adicionado/removido, os métodos que chamam ele também são identificados e 
	//para isso é necessária as informações dos grafos (que não estavam completas). 
	//Na versão anterior era feito de forma diferente. Os grafos não eram construídos.
	//Quando havia o bug era identificado apenas o método A.m() como impactado
	@Test
	public void testBugRefactoring() throws IOException {
		String source = path + "/test/subjects/bugRefactS";
		String target = path + "/test/subjects/bugRefactT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("method : B.z() : B"));
		assertTrue(fileIntersection.contains("method : B.k() : B"));
		assertTrue(fileIntersection.contains("method : C.m() : A"));
		
		assertEquals(5,fileIntersection.size());
		
	}
	
	//bug descoberto ao gerar uma nova versão  (v1.0 -> v.1.1). Uma das modificações foi trocar ArrayList por HashMap
	//nas listas de armazenar metodos, atributos e classes.
	//O bug foi descoberto porque com essa modificação a ordem de análise dos metodos mudou, pois na lista fica em ordem de insercao e no map nao.
	//Seja: - uma interface I com um metodo m.
	//- Uma clase A que implementa I e o metodo m
	//- Uma classe B que implementa I e estende A 
	//- Um meetodo C.z que que chama o metodo m
	//Supondo que A.m foi modificado, com o bug, não era identificado que C.z chamava A.m, pois antes disso, era identificado que C.z chamava I.m
	@Test
	public void testBugExercisedMethods() throws IOException {
		String source = path + "/test/subjects/bugExercisedMethodsS";
		String target = path + "/test/subjects/bugExercisedMethodsT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("method : C.z() : C"));
		assertTrue(fileIntersection.contains("method : A.m() : B"));
		assertEquals(4,fileIntersection.size());
		
	}
	
	//O atributo modificado diferentemente no source e target dentro de um certo método deve ser considerado impactado.
	//Antes (antes da versão 1.0) apenas o método modificado estava sendo impactado. 
	//Os demais métodos que exercitam o atributo também devem ser considerados impactados
	@Test
	public void testBugModifiedFields() throws IOException {
		String source = path + "/test/subjects/bugModifiedFieldsS";
		String target = path + "/test/subjects/bugModifiedFieldsT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("method : A.getF() : A"));
		assertTrue(fileIntersection.contains("method : A.m() : A"));
		assertEquals(3,fileIntersection.size());
		
	}
	
	
	//bug existente. Limitação da ferramenta: não faz análise de fluxo de dados
	@Test
	public void testBugDataFlow() throws IOException {
		String source = path + "/test/subjects/bugDataFlowS";
		String target = path + "/test/subjects/bugDataFlowT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");;
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("method : A.getF() : A"));
		assertTrue(fileIntersection.contains("method : A.setF(I) : A"));
		assertEquals(3,fileIntersection.size());
		
	}
	
	//bug existente. Limitação da ferramenta: não faz análise de bibliotecas
	@Test
	public void testBugLibary() throws IOException {
		String source = path + "/test/subjects/bugLibraryS";
		String target = path + "/test/subjects/bugLibraryT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("method : A.m(Collection<String>) : A"));
		assertTrue(fileIntersection.contains("method : A.teste() : A"));
		assertEquals(4,fileIntersection.size());
		
	}
	
	//bug existente. Limitação da ferramenta: não analisa classes anônimas
	@Test
	public void testBugAnonymousClass() throws IOException {
		String source = path + "/test/subjects/bugAnonymousClassS";
		String target = path + "/test/subjects/bugAnonymousClassT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("method : A.m() : A"));
		assertTrue(fileIntersection.contains("method : A.setF(I) : A"));
		assertTrue(fileIntersection.contains("method : A.getF() : A"));
		assertEquals(4,fileIntersection.size());
		
	}
	
}
