package Ejercicio2;

import ExcepcionesPersonalizadas.ExcepcionPersonalizada;

public class mainApp {

	public static void main(String[] args) {

		try {
			
			System.out.println("Mensaje mostrado por pantalla.");
			throw new ExcepcionPersonalizada();
			
		} catch (ExcepcionPersonalizada ex) {

			System.out.println(ex.getMessage());
			
		}finally {
			
			System.out.println("Programa terminado.");
			
		}
	}
}
