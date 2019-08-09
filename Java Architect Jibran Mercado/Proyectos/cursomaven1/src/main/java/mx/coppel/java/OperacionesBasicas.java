package mx.coppel.java;

public class OperacionesBasicas {

	public double suma (double num1, double num2) {
		
		return num1 +  num2;
	}
	
	public double resta (double num1, double num2) {
		
		return num1 -  num2;
	}
	
	public double multiplicar (double num1, double num2) {
		
		return num1 *  num2;
	}
	
	public double dividir (double num1, double num2) {
		
		if (num2 == 0) {
			System.out.println("Error: División sobre 0");
		} 
			return num1/num2;
		
	}
		
}
