package mx.coppel.java;

public class Calculator 
{	
	public static void main( String[] args )
    {        
        try {
        	Integer num1 = 9;
        	Integer num2 = 5;
        	
        	Operaciones oper = new Operaciones(num1, num2);
        	
        	System.out.println("La suma de " + num1 + " y " + num2 + " es: " + oper.getSuma());
    		System.out.println("La resta de " + num1 + " y " + num2 + " es: " + oper.getResta());
    		System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + oper.getMultiplicacion());
    		System.out.println("La division de " + num1 + " y " + num2 + " es: " + oper.getDivision());
        	
        } catch (Exception e) {
        	e.printStackTrace();
        }        
    }     
}
