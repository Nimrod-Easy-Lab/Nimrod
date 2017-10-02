package safira;

import java.io.IOException;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import saferefactor.core.analysis.safira.entity.Field;
import saferefactor.core.analysis.safira.entity.Method;
import saferefactor.util.SRImpact;



public class Laws extends TestCase{
	
	String path = System.getProperty("user.dir");
	
	//=================correcao==================
	//Não impacta no resultado final mas alguns metodos impactados (não adicionados ou removidos) estavam sendo
	//inseridos na lista de metodos modificados/removidos
	//============================================
	//adiciona um método que causa sobrecarga em outro método da classe
	@Test
	public void testAddMethod1() throws IOException {
		
		String source = path + "/test/subjects/addMethodS1";
		String target = path + "/test/subjects/addMethodT1";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Method> newMethods = c.getIa().getNewMethodss();
		
		assertTrue(contains(newMethods,"method : A.m(int) : A"));
		assertEquals(1,newMethods.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("method : A.teste() : A"));
		assertTrue(fileIntersection.contains("method : A.m(long) : A"));
		assertEquals(3,fileIntersection.size());
		
	}
	
	//=================correcao==================
	//Método repetido na lista de geraçao. Troquei ArrayList por HashSet no fileNtersection
	//=================================================
	//o metodo D.z() foi adicionado. D estende B que implementa II. z() eh metodo de II
	//C.teste(II) chama II.z(), por isso também é impactado. Como C.teste(II) recebe II como parametro,
	//é necessario adicionar todas as dependencias de II: todas as classes que podem implementar z()
	//Essas classes são A, B e C  (A impelmenta I que estende II)
	@Test
	public void testAddMethod2() throws IOException {
		
		String source = path + "/test/subjects/addMethodS2";
		String target = path + "/test/subjects/addMethodT2";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Method> newMethods = c.getIa().getNewMethodss();
		
		assertTrue(contains(newMethods,"method : D.z() : D"));
		assertEquals(1,newMethods.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("cons : D.<init>()"));
		
		assertTrue(fileIntersection.contains("method : C.teste(II) : C"));
		assertTrue(fileIntersection.contains("method : B.z() : D"));
		assertEquals(6,fileIntersection.size());
		
	}
	
	//adiciona um método que sobrescreve um método da classe pai
	@Test
	public void testAddMethod3() throws IOException {
		
		String source = path + "/test/subjects/addMethodS3";
		String target = path + "/test/subjects/addMethodT3";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Method> newMethods = c.getIa().getNewMethodss();
		
		assertTrue(contains(newMethods,"method : B.z() : D"));
		assertEquals(1,newMethods.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("method : A.z() : B"));
		assertTrue(fileIntersection.contains("method : C.teste() : C"));
		
		assertEquals(4,fileIntersection.size());
		
	}
	
	//adiciona um método que é sobrescrito pelo metodo da classe filha.
	//apenas o metodo adicionado eh impactado. Não existe nenhum metodo em comum impactado
	@Test
	public void testAddMethod4() throws IOException {
		
		String source = path + "/test/subjects/addMethodS4";
		String target = path + "/test/subjects/addMethodT4";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(true, c.isRefactoring());
		
		List<Method> newMethods = c.getIa().getNewMethodss();
		
		assertTrue(contains(newMethods,"method : A.z() : A"));
		assertEquals(1,newMethods.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		
		assertEquals(0,fileIntersection.size());
		
	}
	
	
	//adicionar um método que sobrescreve um metodo da classe pai. 
	//A classe filha passa a herdar o metodo adicionado ao inves do metodo sobrescrito
	//O método adicionado e o método herdado são impactados. Além disso, também são impactados 3 metodos que chamam
	//direta ou indiretamente os métodos impactados em até o terceiro nível de indireção
	//OBS: As classes permitidas para executar o metodo sao colocadas de maneira aleatoria, então o teste pode nao passar
	//em algumas execucoes: A.m() : B;C ou A.m() : C;B
	@Test
	public void testAddMethod5() throws IOException {
		
		String source = path + "/test/subjects/addMethodS5";
		String target = path + "/test/subjects/addMethodT5";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Method> newMethods = c.getIa().getNewMethodss();
		
		assertTrue(contains(newMethods,"method : B.m()"));
		assertEquals(1,newMethods.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("cons : D.<init>()"));
		assertTrue(fileIntersection.contains("method : A.m() : B;C") ||fileIntersection.contains("method : A.m() : C;B") );
		assertTrue(fileIntersection.contains("method : D.teste1() : D"));
		assertTrue(fileIntersection.contains("method : D.teste2() : D"));
		assertTrue(fileIntersection.contains("method : D.teste3() : D"));
		
		assertEquals(7,fileIntersection.size());
		
	}
	
	//remove um método que causa sobrecarga em outro método da classe
	@Test
	public void testRemoveMethod1() throws IOException {
		
		String source = path + "/test/subjects/removedMethodS1";
		String target = path + "/test/subjects/removedMethodT1";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Method> removedMethods = c.getIa().getRemovedMethodss();
		
		assertTrue(contains(removedMethods,"method : A.m(int) : A"));
		assertEquals(1,removedMethods.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("method : A.teste() : A"));
		assertTrue(fileIntersection.contains("method : A.m(long) : A"));
		assertEquals(3,fileIntersection.size());
		
	}
	

	//o metodo D.z() foi removido. D estende B que implementa II. z() eh metodo de II
	//C.teste(II) chama II.z(), por isso também é impactado. Como C.teste(II) recebe II como parametro,
	//é necessario adicionar todas as dependencias de II: todas as classes que podem implementar z()
	//Essas classes são A, B e C  (A implementa I que estende II)
	@Test
	public void testRemoveMethod2() throws IOException {
		
		String source = path + "/test/subjects/removedMethodS2";
		String target = path + "/test/subjects/removedMethodT2";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Method> removedMethods = c.getIa().getRemovedMethodss();
		
		assertTrue(contains(removedMethods,"method : D.z() : D"));
		assertEquals(1,removedMethods.size());
		
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("cons : D.<init>()"));
		
		assertTrue(fileIntersection.contains("method : C.teste(II) : C"));
		assertTrue(fileIntersection.contains("method : D.z() : D"));
		assertEquals(6,fileIntersection.size());
		
	}
	
	//remove um método que sobrescreve um método da classe pai
	@Test
	public void testRemoveMethod3() throws IOException {
		
		String source = path + "/test/subjects/removedMethodS3";
		String target = path + "/test/subjects/removedMethodT3";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Method> removedMethods = c.getIa().getRemovedMethodss();
		
		assertTrue(contains(removedMethods,"method : B.z() : D"));
		assertEquals(1,removedMethods.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("method : B.z() : B"));
		assertTrue(fileIntersection.contains("method : C.teste() : C"));
		
		assertEquals(4,fileIntersection.size());
		
	}
	
	//remove um método que é sobrescrito pelo metodo da classe filha.
	//apenas o metodo removido eh impactado. Não existe nenhum metodo em comum impactado
	@Test
	public void testRemoveMethod4() throws IOException {
		
		String source = path + "/test/subjects/removedMethodS4";
		String target = path + "/test/subjects/removedMethodT4";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(true, c.isRefactoring());
		
		List<Method> removedMethods = c.getIa().getRemovedMethodss();
		
		assertTrue(contains(removedMethods,"method : A.z() : A"));
		assertEquals(1,removedMethods.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		
		assertEquals(0,fileIntersection.size());
		
	}
	
	//remover um método que sobrescreve um metodo da classe pai. 
	//A classe filha passa a herdar o metodo adicionado ao inves do metodo sobrescrito
	//O método removido e o método herdado são impactados. Além disso, também são impactados 3 metodos que chamam
	//direta ou indiretamente os métodos impactados em até o terceiro nível de indireção
	@Test
	public void testRemoveMethod5() throws IOException {
		
		String source = path + "/test/subjects/removedMethodS5";
		String target = path + "/test/subjects/removedMethodT5";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Method> removedMethods = c.getIa().getRemovedMethodss();
		
		assertTrue(contains(removedMethods,"method : B.m()"));
		assertEquals(1,removedMethods.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("cons : D.<init>()"));
		assertTrue(fileIntersection.contains("method : B.m() : B;C") || fileIntersection.contains("method : B.m() : C;B"));
		assertTrue(fileIntersection.contains("method : D.teste1() : D"));
		assertTrue(fileIntersection.contains("method : D.teste2() : D"));
		assertTrue(fileIntersection.contains("method : D.teste3() : D"));
		
		assertEquals(7,fileIntersection.size());
		
	}
	
	//=================correcao==================
	//Não impacta no resultado final mas um atributo adicionado/removido estava sendo adicionado na lista de atributos
	//modificados. Então, o calculo do conjunto impactado pela "modificacao" no atributo estava sendo feito 2x a mais
	//Faz sentido o atributo ser modificado porque ele era inicializado no construtor da classe do atributo apenas no source
	//Mesmo assim, fiz uma checagem para não adicionar como modificado um atributo que foi adicionado ou removido
	//===========================================
	//Um atributo eh adicionado em uma classe cuja super classe e subclasse contem o mesmo atributo
	//Um metodo da subclasse chama o atributo mas ele nao eh impactado porque nao chama o atributo adicionado e sim o da classe que ja tinha no programa
	@Test
	public void testAddField1() throws IOException {
		
		String source = path + "/test/subjects/addFieldS1";
		String target = path + "/test/subjects/addFieldT1";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(true, c.isRefactoring());
		
		List<Field> newFields = c.getIa().getNewFields();
		
		assertTrue(containsF(newFields,"B.f"));
		assertEquals(1,newFields.size());
		
		List<Method> changedMethodss = c.getIa().getChangedMethodss();
		
		assertTrue(contains(changedMethodss,"B.<init>()"));
		assertEquals(1,changedMethodss.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));

		
		assertEquals(2,fileIntersection.size());
		
	}
	
	//Eh o mesmo exemplo do teste addField1, entretanto, o metodo da subclasse do atributo adicionado faz uma chamada
	//super.f que no source referencia o atributo da superclasse enquanto no target referencia o atributo adicionado
	@Test
	public void testAddField2() throws IOException {
		
		String source = path + "/test/subjects/addFieldS2";
		String target = path + "/test/subjects/addFieldT2";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Field> newFields = c.getIa().getNewFields();
		
		assertTrue(containsF(newFields,"B.f"));
		assertEquals(1,newFields.size());
		
		List<Method> changedMethodss = c.getIa().getChangedMethodss();
		
		assertTrue(contains(changedMethodss,"B.<init>()"));
		assertEquals(1,changedMethodss.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("method : C.m() : C"));

		
		assertEquals(3,fileIntersection.size());
		
	}
	
	
	//Um atributo eh adicionado em uma classe cuja super classe contem o mesmo atributo. A subclasse herda o atributo
	//adicionado e contem um metodo que chama esse atributo. No source o metodo chama o atributo da superclasse do atributo
	//adicionado e no target ele chama o atributo adicionado 
	@Test
	public void testAddField3() throws IOException {
		
		String source = path + "/test/subjects/addFieldS3";
		String target = path + "/test/subjects/addFieldT3";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Field> newFields = c.getIa().getNewFields();
		
		assertTrue(containsF(newFields,"B.f"));
		assertEquals(1,newFields.size());
		
		List<Method> changedMethodss = c.getIa().getChangedMethodss();
		
		assertTrue(contains(changedMethodss,"B.<init>()"));
		assertEquals(1,changedMethodss.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("method : C.m() : C"));

		
		assertEquals(3,fileIntersection.size());
		
	}
	
	//Um atributo eh adicionado em uma classe cuja super classe e subclasse contem o mesmo atributo
	//Um metodo da subclasse chama o atributo mas ele nao eh impactado porque nao chama o atributo removido e sim o da classe que ja tinha no programa
	@Test
	public void testRemoveField1() throws IOException {
		
		String source = path + "/test/subjects/removeFieldS1";
		String target = path + "/test/subjects/removeFieldT1";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(true, c.isRefactoring());
		
		List<Field> removedFields = c.getIa().getRemovedFields();
		
		assertTrue(containsF(removedFields,"B.f"));
		assertEquals(1,removedFields.size());
		
		
		List<Method> changedMethodss = c.getIa().getChangedMethodss();
		
		assertTrue(contains(changedMethodss,"B.<init>()"));
		assertEquals(1,changedMethodss.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));

		
		assertEquals(2,fileIntersection.size());
		
	}
	
	//Um atributo eh removido em uma classe cujas super e sub classes contem o mesmo atributo.
	//O metodo da subclasse do atributo removido faz uma chamada super.f que no source referencia o atributo removido
	//e no target referencia o atributo da superclasse
	@Test
	public void testRemoveField2() throws IOException {
		
		String source = path + "/test/subjects/removeFieldS2";
		String target = path + "/test/subjects/removeFieldT2";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Field> removedFields = c.getIa().getRemovedFields();
		
		assertTrue(containsF(removedFields,"B.f"));
		assertEquals(1,removedFields.size());
		
		List<Method> changedMethodss = c.getIa().getChangedMethodss();
		
		assertTrue(contains(changedMethodss,"B.<init>()"));
		assertEquals(1,changedMethodss.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("method : C.m() : C"));

		
		assertEquals(3,fileIntersection.size());
		
	}
	
	//Um atributo eh removido em uma classe cuja super classe contem o mesmo atributo. A subclasse herda o atributo
	//removido e contem um metodo que chama esse atributo. No target o metodo chama o atributo da superclasse do atributo
	//removido e no source ele chama o atributo removido 
	@Test
	public void testRemoveField3() throws IOException {
		
		String source = path + "/test/subjects/removeFieldS3";
		String target = path + "/test/subjects/removeFieldT3";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Field> removedFields = c.getIa().getRemovedFields();
		
		assertTrue(containsF(removedFields,"B.f"));
		assertEquals(1,removedFields.size());
		
		List<Method> changedMethodss = c.getIa().getChangedMethodss();
		
		assertTrue(contains(changedMethodss,"B.<init>()"));
		assertEquals(1,changedMethodss.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("method : C.m() : C"));

		
		assertEquals(3,fileIntersection.size());
		
	}
	
	//modifica valor de inicializacao de atributo
	@Test
	public void testChangedField1() throws IOException {
		
		String source = path + "/test/subjects/changedFieldS1";
		String target = path + "/test/subjects/changedFieldT1";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Field> changedFieldss = c.getIa().getChangedFieldss();
		
		assertTrue(containsF(changedFieldss,"A.f"));
		assertEquals(1,changedFieldss.size());
		
		List<Method> changedMethodss = c.getIa().getChangedMethodss();
		
		assertTrue(contains(changedMethodss,"A.<init>()"));
		assertEquals(1,changedMethodss.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("method : B.m() : B"));
		assertTrue(fileIntersection.contains("method : C.z() : C"));

		
		assertEquals(5,fileIntersection.size());
		
	}
	
	//adiciona inicializacao de atributo
	@Test
	public void testChangedField2() throws IOException {
		
		String source = path + "/test/subjects/changedFieldS2";
		String target = path + "/test/subjects/changedFieldT2";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Field> changedFieldss = c.getIa().getChangedFieldss();
		
		assertTrue(containsF(changedFieldss,"A.f"));
		assertEquals(1,changedFieldss.size());
		
		List<Method> changedMethodss = c.getIa().getChangedMethodss();
		
		assertTrue(contains(changedMethodss,"A.<init>()"));
		assertEquals(1,changedMethodss.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("method : B.m() : B"));
		assertTrue(fileIntersection.contains("method : C.z() : C"));

		
		assertEquals(5,fileIntersection.size());
		
	}
	
	//modifica atributo dentro do corpo de um metodo apenas no source
	@Test
	public void testChangedField3() throws IOException {
		
		String source = path + "/test/subjects/changedFieldS3";
		String target = path + "/test/subjects/changedFieldT3";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Field> changedFieldss = c.getIa().getChangedFieldss();
		
		assertTrue(containsF(changedFieldss,"A.f"));
		assertEquals(1,changedFieldss.size());
		
		List<Method> changedMethodss = c.getIa().getChangedMethodss();
		
		assertTrue(contains(changedMethodss,"B.m()"));
		assertEquals(1,changedMethodss.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("method : B.m() : B"));
		assertTrue(fileIntersection.contains("method : C.z() : C"));

		
		assertEquals(5,fileIntersection.size());
		
	}
	
	//modifica valor de inicializacao de atributo estático
	@Test
	public void testChangedField4() throws IOException {
		
		String source = path + "/test/subjects/changedFieldS4";
		String target = path + "/test/subjects/changedFieldT4";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Field> changedFieldss = c.getIa().getChangedFieldss();
		
		assertTrue(containsF(changedFieldss,"A.f"));
		assertEquals(1,changedFieldss.size());
		
		List<Method> changedMethodss = c.getIa().getChangedMethodss();
		
		assertTrue(contains(changedMethodss,"A.<clinit>()"));
		assertEquals(1,changedMethodss.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("method : B.m() : B"));
		assertTrue(fileIntersection.contains("method : C.z() : C"));

		
		assertEquals(5,fileIntersection.size());
		
	}
	
	//=================correcao==================
	//Os atributos herdados também estavam sendo analisados quanto a alguma modificação.
	//Não impacta no resultado final mas é uma análise desnecessaria
	//============================================
	//modifica visibilidade de atributo
	@Test
	public void testChangedField5() throws IOException {
		
		String source = path + "/test/subjects/changedFieldS5";
		String target = path + "/test/subjects/changedFieldT5";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(true, c.isRefactoring());
		
		List<Field> changedFieldss = c.getIa().getChangedFieldss();
		
		assertTrue(containsF(changedFieldss,"A.f"));
		assertEquals(1,changedFieldss.size());
		
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("method : B.m() : B"));
		assertTrue(fileIntersection.contains("method : C.z() : C"));

		
		assertEquals(5,fileIntersection.size());
		
	}
	
	//modifica corpo de metodo mudando instrucoes de um for 
	@Test
	public void testChangeMethod1() throws IOException {
		
		String source = path + "/test/subjects/changeMethodS1";
		String target = path + "/test/subjects/changeMethodT1";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<Method> changedMethods = c.getIa().getChangedMethodss();
		
		assertTrue(contains(changedMethods,"A.m()"));
		assertEquals(1,changedMethods.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("method : B.teste() : B"));
		assertTrue(fileIntersection.contains("method : A.m() : A;B") || fileIntersection.contains("method : A.m() : B;A"));
		
		assertEquals(4,fileIntersection.size());
		
	}
	
	//modifica corpo de metodo mudando instrucoes de um try/catch 
	@Test
	public void testChangeMethod2() throws IOException {
		
		String source = path + "/test/subjects/changeMethodS2";
		String target = path + "/test/subjects/changeMethodT2";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(true, c.isRefactoring());
		
		List<Method> changedMethods = c.getIa().getChangedMethodss();
		
		assertTrue(contains(changedMethods,"A.m()"));
		assertEquals(1,changedMethods.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("method : B.teste() : B"));
		assertTrue(fileIntersection.contains("method : A.m() : A;B") || fileIntersection.contains("method : A.m() : B;A"));
		
		assertEquals(4,fileIntersection.size());
		
	}
	
	//modifica visibilidade de metodo 
	@Test
	public void testChangeMethod3() throws IOException {
		
		String source = path + "/test/subjects/changeMethodS3";
		String target = path + "/test/subjects/changeMethodT3";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(true, c.isRefactoring());
		
		List<Method> changedMethods = c.getIa().getChangedMethodss();
		
		assertTrue(contains(changedMethods,"A.m()"));
		assertEquals(1,changedMethods.size());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("method : B.teste() : B"));
		
		assertEquals(3,fileIntersection.size());
		
	}
	
	private boolean containsF(List<Field> newFields, String name) {
		for (Field field : newFields) {
			if (field.getFullName().contains(name)) {
				return true;
			}
		}
		return false;
	}

	public boolean contains(List<Method> l, String name) {
		for (Method method : l) {
			if (name.contains(method.getFullName())) {
				return true;
			}
		}
		return false;
	}

}
