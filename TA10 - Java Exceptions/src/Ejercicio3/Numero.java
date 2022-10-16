package Ejercicio3;

public class Numero {
	public int numeroRan;
	
	//Constructor por defecto
	public Numero() {
	
	}
	
	//Getters y setters
	public int getNumeroRan() {
		return numeroRan;
	}

	
	public void setNumeroRan(int numeroRan) {
		this.numeroRan = numeroRan;
	}

	
	//Método que genera un número aleatorio entre 0 y 999
	public int random() {
		numeroRan=(int) Math.floor(Math.random()*999);
		return numeroRan;	
	}
	
	
	
}


