package mx.coppel.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperacionesTest {
	
	Operaciones oper = new Operaciones(5, 7);
	
	@Test
	public void testGetSuma() {
		assertEquals(12, oper.getSuma(), 0);
		//System.out.println("La Suma es: " + oper.getSuma());
	}

	@Test
	public void testGetResta() {
		assertEquals(-2, oper.getResta(), 0);
		//System.out.println("La Resta es: " + oper.getResta());
	}

	@Test
	public void testGetMultiplicacion() {
		assertEquals(35, oper.getMultiplicacion(), 0);
		//System.out.println("La Multiplicacion es: " + oper.getMultiplicacion());
	}

	@Test
	public void testGetDivision() {
		assertEquals(0.7142857142857143, oper.getDivision(), 0);
		//System.out.println("La Division es: " + oper.getDivision());
	}

}
