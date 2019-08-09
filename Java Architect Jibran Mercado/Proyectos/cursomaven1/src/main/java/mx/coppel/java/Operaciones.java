package mx.coppel.java;

public class Operaciones {

	private final Integer num1;
	private final Integer num2;
	
	Operaciones(Integer num1, Integer num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public Integer getSuma() {
		return num1 + num2;
	}

	public Integer getResta() {
		return num1 - num2;
	}

	public Integer getMultiplicacion() {
		return num1 * num2;
	}

	public Double getDivision() {
		return ((double)num1 / (double)num2);
	}

}
