<<<<<<< HEAD
package mx.coppel.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Prueba2 {

	@Before
	public void setUp() throws Exception {
		System.out.println("Prueba JUnit");
		
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testSuma() {
		fail("Not yet implemented");
	}

	@Test
	public void testResta() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplicacion() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivicion() {
		fail("Not yet implemented");
	}

}
=======
package mx.coppel.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Prueba2 {

	@Before
	public void setUp() throws Exception {
		System.out.println("Hello , it´s me");
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		System.out.println("Help! A need somebody!");
	}
	
	@Test
	public void testSuma() {
		fail("Not yet implemented");
	}

	@Test
	public void testResta() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplicar() {
		fail("Not yet implemented");
	}

	@Test
	public void testDividir() {
		fail("Not yet implemented");
	}

}
>>>>>>> branch 'master' of https://github.com/capacitacion-ic/repoclase.git
