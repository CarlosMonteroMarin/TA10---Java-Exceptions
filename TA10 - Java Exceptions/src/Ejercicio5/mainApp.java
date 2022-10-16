package Ejercicio5;

import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {

		//main de la classe passowrd, hacemos un extend de Password
		//inicializamos el scnner para pedir la longitud de la contraseña
		Scanner sc = new Scanner(System.in);
		Password contraseña = new Password();
		
		
			try {
				
				System.out.print("Introduce la longitud de la contraseña:");
				int longitud=sc.nextInt();
				char[] arrayContraseña= new char[longitud];
				
		
				//llamamos al metodo y formateamos la salida por pantalla
					String passwordGenerada=contraseña.generarCon(longitud, arrayContraseña);
				System.out.println("Contraseña de "+longitud+" carácteres generada: "+passwordGenerada);
				
				//asignamos el resultado del metodo "esFuerte" al booleano "seguro", si es igual a true imprimirá que la contraseña es segura.
				boolean seguro=contraseña.esFuerte(arrayContraseña);
				if (seguro==true) {
					System.out.println("La contraseña es segura.");
				}else {
					System.out.println("La contraseña no es segura.");
				}
					System.out.println("");
					
				//SEGUNDA PARTE DEL EJERCICIO 
				//Pedimos la longuitud de la lista de contraseñas	
				System.out.print("Indica el tamaño de la lista de passwords: ");
					int longitud2=sc.nextInt();
					
				//creamos array para guardar contraseñas y otro para guardar booleanos
				Password[] arrayPasswords = new Password[longitud2];
				Boolean[] arrayBool = new Boolean[longitud2];
				
				
				//bucle para generar la contraseña, guardarla, comprobar si es segura, guardarlo e imprimir ambos resultados.
				for (int i = 0; i < arrayPasswords.length; i++) {
					arrayPasswords[i] = new Password();
						passwordGenerada=contraseña.generarCon(longitud, arrayContraseña);
					
					arrayBool[i] = arrayPasswords[i].esFuerte(arrayContraseña);
					seguro=contraseña.esFuerte(arrayContraseña);

					System.out.println("Contraseña " +i+": "+ passwordGenerada+" | Es fuerte? "+ seguro);
				}
				
					
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("ERROR. Introduce un valor correcto.");
			}
	}

}
