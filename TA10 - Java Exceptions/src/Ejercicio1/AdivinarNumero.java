package Ejercicio1;

import java.util.Random;

public class AdivinarNumero {
	//Atributos
	private int valorRan;
	private int numeroIntroducido;
	Random random = new Random();
	
	//Constructor por defecto
	public AdivinarNumero() {
	}

	//Getters y setters
	public int getValorRan() {
		return valorRan;
	}


	public void setValorRan(int valorRan) {
		this.valorRan = valorRan;
	}


	public int getNumeroIntroducido() {
		return numeroIntroducido;
	}


	public void setNumeroIntroducido(int numeroIntroducido) {
		this.numeroIntroducido = numeroIntroducido;
	}
	
	
	//Método para generar un número aleatorio
	public int valorRandom() {
		valorRan=(int) Math.floor(Math.random()*500)+1;
		return valorRan;
	}

	
	//Método para comprobar cada número introducido por el usuario
	public void comprobarNumero(int numeroIntroducido) {
		
			if (numeroIntroducido==valorRan) {
				System.out.println("Enhorabuena, has adivinado el número."); 
			}else if(numeroIntroducido>500 || numeroIntroducido<1) {
				System.out.println("El rango de números está entre 1 y 500.");
				
			}else if(numeroIntroducido<valorRan) {
				System.out.println("El número que tienes que adivinar es MAYOR al que has introducido.");
				
			}else if (numeroIntroducido>valorRan) {
				System.out.println("El número que tienes que adivinar es MENOR al que has introducido.");

			}
		}
	}

		
		

