<<<<<<< HEAD
package mx.coppel.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prueba1 {

	@Test
	public void testMain() {
		//fail("Not yet implemented");
		//App aristmetica = new App();
		//assertEquals(2, aristmetica.suma(1, 1),0);
	}

	@Test
	public void testSuma() {
		//fail("Not yet implemented");
		App aristmetica = new App();
		assertEquals(2, aristmetica.suma(1, 1),0);
	}

	@Test
	public void testResta() {
		//fail("Not yet implemented");
		App aristmetica = new App();
		assertEquals(0.0, aristmetica.resta(5, 3),0);
	}

	@Test
	public void testMultiplicacion() {
		//fail("Not yet implemented");
		App aristmetica = new App();
		assertEquals(1, aristmetica.multiplicacion(5, 10),0);
	}

	@Test
	public void testDivicion() {
		//fail("Not yet implemented");
		App aristmetica = new App();
		assertEquals(50.0, aristmetica.divicion(5, 10),0);
	}

}
=======
package mx.coppel.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prueba1 {
	OperacionesBasicas aritmetica = new OperacionesBasicas();
	@Test
	public void testSuma() {
		
		assertEquals(2, aritmetica.suma(1, 1),0);
	}

	@Test
	public void testResta() {
		assertEquals(0, aritmetica.resta(1, 1),0);
	}

	@Test
	public void testMultiplicar() {
		assertEquals(1, aritmetica.multiplicar(1, 1),0);
	}

	@Test
	public void testDividir() {
		assertEquals(1, aritmetica.dividir(1, 1),0);
	}

}
>>>>>>> branch 'master' of https://github.com/capacitacion-ic/repoclase.git
