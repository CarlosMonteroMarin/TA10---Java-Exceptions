package Ejercicio3;

import ExcepcionesPersonalizadas.ExcepcionParImpar;

public class mainApp {

	public static void main(String[] args) {
		try {
			//Inicializamos un objeto Numero
			Numero numero = new Numero();
			//Llamamos al método random() de la clase Numero para que genere un número aleatorio
			int numeroRan=numero.random();
			
			System.out.println("El número generado aleatoriamente es: "+numeroRan);
			
			//Hacemos un throw para llamar la excepcion y le pasamos el numero random generado.
			throw new ExcepcionParImpar(numeroRan);
			
		} catch (ExcepcionParImpar ex) {

		System.out.println(ex.getMessage());
		
		}
		
	}

}
