<<<<<<< HEAD
package mx.coppel.java;

import java.util.Scanner;

public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Ingresa primer número: ");
	    int numero1 = Integer.parseInt(myObj.nextLine());  // Read user input
	    
	    System.out.println("Ingresa segundo número: ");
	    int numero2 = Integer.parseInt(myObj.nextLine());  // Read user input
	    
	    System.out.println("Ingresa operacion: ");
	    String operacion = myObj.nextLine();  // Read user input
	    
	    if(operacion.equals("suma")) {
	    	suma(numero1,numero2);
	    }else if(operacion.equals("resta")) {
	    	resta(numero1,numero2);
	    }else if(operacion.equals("multiplicacion")) {
	    	multiplicacion(numero1,numero2);
	    }else{
	    	divicion(numero1,numero2);
	    }
	    
	}
	
	public static float suma(int X, int Y) {
		float result = X + Y;
		System.out.println("La suma de los numeros es: "+result);
		return result;
	}
	
	public static float resta(int X, int Y) {
		float result = X - Y;
		System.out.println("La resta de los numeros es: "+result);
		return result;
	}
	
	public static float multiplicacion(int X, int Y) {
		float result = X * Y;
		System.out.println("La multiplicación de los dos numeros es: "+result);
		return result;
	}
	
	public static float divicion(int X, int Y) {
		float result = X / Y;
		System.out.println("La divicion de los dos numeros es: "+result);
		return result;
	}
}
=======
package mx.coppel.java;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        	double n1 = 0 ,n2 = 0;
    		int Opcion = 0;
    		//String res = "";
    		OperacionesBasicas Operacion = new OperacionesBasicas();		
    				
    	
    			System.out.println("Elija operacion: ");
    			System.out.println("1.- Suma ");
    			System.out.println("2.- Resta ");
    			System.out.println("3.- Multiplicación");
    			System.out.println("4.- División");
    			
    			Scanner sc = new Scanner(System.in);
    			Opcion = sc.nextInt();
    			
    			switch (Opcion) {
    			case 1:
    				System.out.println("Introduzca el primer número: ");
    				n1 = sc.nextDouble();
    				System.out.println("Introduzca el segundo número: ");
    				n2 = sc.nextDouble();
    				System.out.println("Resultado: " + Operacion.suma(n1, n2));				
    				break ;
    			case 2:
    				System.out.println("Introduzca el primer número: ");
    				n1 = sc.nextDouble();
    				System.out.println("Introduzca el segundo número: ");
    				n2 = sc.nextDouble();
    				System.out.println("Resultado: " + Operacion.resta(n1, n2));				
    				break ;
    			case 3:
    				System.out.println("Introduzca el primer número: ");
    				n1 = sc.nextDouble();
    				System.out.println("Introduzca el segundo número: ");
    				n2 = sc.nextDouble();
    				System.out.println("Resultado: " + Operacion.multiplicar(n1, n2));				
    				break ;
    			case 4:
    				System.out.println("Introduzca el primer número: ");
    				n1 = sc.nextDouble();
    				System.out.println("Introduzca el segundo número: ");
    				n2 = sc.nextDouble();
    				System.out.println("Resultado: " + Operacion.dividir(n1, n2));				
    				break ;
    			default:
    				System.out.println("Opcion no encontrada");
    			}
    			sc.close();
    	}
        
    }
>>>>>>> branch 'master' of https://github.com/capacitacion-ic/repoclase.git
