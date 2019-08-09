package mx.coppel.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OperacionesTest2 {
	
	Operaciones oper = new Operaciones(5, 7);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
	}
		
	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}
	
	@Test
	public void testGetSuma() {
		assertEquals(12, oper.getSuma(), 0);		
	}

	@Test
	public void testGetResta() {
		assertEquals(-2, oper.getResta(), 0);		
	}

	@Test
	public void testGetMultiplicacion() {
		assertEquals(35, oper.getMultiplicacion(), 0);	
	}

	@Test
	public void testGetDivision() {
		assertEquals(0.7142857142857143, oper.getDivision(), 0);		
	}

}
