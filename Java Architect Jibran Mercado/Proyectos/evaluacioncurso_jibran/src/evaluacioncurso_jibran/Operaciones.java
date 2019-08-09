package evaluacioncurso_jibran;

import java.util.Scanner;

public class Operaciones {

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
	
	public static void suma(int X, int Y) {
		int result = X + Y;
		System.out.println("La suma de los numeros es: "+result);
	}
	
	public static void resta(int X, int Y) {
		int result = X - Y;
		System.out.println("La resta de los numeros es: "+result);
	}
	
	public static void multiplicacion(int X, int Y) {
		int result = X * Y;
		System.out.println("La multiplicación de los dos numeros es: "+result);
	}
	
	public static void divicion(int X, int Y) {
		int result = X / Y;
		System.out.println("La divicion de los dos numeros es: "+result);
	}

}
