package Ejercicio4;

public class Operacion {
	public double num1;
	public double num2;
	public double resultado;

	//Constructor por defecto
	public Operacion() {
	}

	
	//Constructor que llama a los dos números
	public Operacion(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	//Getters y setters
	public double getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public double getNum2() {
		return num2;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	
	//Método para cada operación matemática.
	public double suma() {
		resultado=num1+num2;
		
		return resultado;
	}
		
	
	public double resta() {
		resultado=num1-num2;

		return resultado;
	}
	
	
	public double multi() {
		resultado=num1*num2;

		return resultado;
	}
	
	
	public double potencia() {
		resultado=Math.pow(num1, num2);
		return resultado;
	}
	
	
	public double raizCuadrada() {
		resultado=Math.sqrt(num1);

		return resultado;
	}
	
	
	public double raizCubica() {
		resultado=Math.cbrt(num1);

		return resultado;
	}
	
	
	public double div() {
		resultado=num1/num2;

		return resultado;
	}
	
}
