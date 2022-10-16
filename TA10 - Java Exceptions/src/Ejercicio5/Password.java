package Ejercicio5;
import java.security.SecureRandom;

public class Password {
	
	private final int LONGITUD_D=8;
	
	private int longitud;
	private String contraseña;
	
	//Constructor por defecto
	public Password() {
		this.longitud = LONGITUD_D;
		this.contraseña = "";
	}

	//Constructor con el atributo longitud como parametro
	public Password(int longitud) {
		this.longitud = longitud;
	}

	
	//Getters
	public int getLongitud() {
		return longitud;
	}

	
	public String getContraseña() {
		return contraseña;
	}

	//Setters
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	public String generarCon(int longitud, char[] arrayContraseña) {
		//declaramos un string constante con todos los caracteres que queramos
		final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		String contraseña = "";
		String caracter = "";
		char c;
		
		//Recorremos un for con longitud como máximo 
		for (int i = 0; i < longitud; i++) {
			
			//Cogemos aleatoriamente caracteres y los asignamos a "c" y se lo añadimos a la cadena de caracteres "caracter
			//y a la vez lo guardamos en un array
			c = CHARS.charAt((int) (Math.random() * 62));
			caracter = "" + c;
			contraseña += caracter;
			arrayContraseña[i] = c;
		}

		return contraseña;
	}
	
	
	//Método para comprobar si la contraseña es segura.
	public boolean esFuerte(char[] arrayContraseña) {
		int mayus=0;
		int min=0;
		int nums=0;
		
		//for para recorrer el array generado en con los caracteres "c"
		for (int i = 0; i < arrayContraseña.length; i++) {
			Character caracter= arrayContraseña[i];
			
			//condiciones para ir acumulando uno por uno el tipo de caracter que es
			if (caracter >= 48 && caracter <= 57 ) {
				nums++;
			} else if (caracter == Character.toLowerCase(caracter)) {
				min++;
			} else {
				mayus++;

			}
		}
		//si cumple esta condición retornara true indicando que es segura.
		if (nums>=5 && min>=1 && mayus>=2){
            return true;
        }else{
            return false;
        }
	}
}
