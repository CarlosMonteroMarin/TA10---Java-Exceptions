package Ejercicio1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Instanciamos la clase
		AdivinarNumero aNum= new AdivinarNumero();
		
		//Informaciçón
		System.out.println("---ADIVINA EL NÚMERO RANDOM EN EL MENOR NÚMERO DE INTENTOS---");
		System.out.println("Generando número aleatorio entre 1 y 500 incluidos...");
		
		int intentos=0;
		int numeroIntroducido=0;
		
		//Llamamos al método que genera un número aleatorio
		aNum.valorRandom();

		//Bucle mientras el número que introducimos por teclado sea diferente al valor random generado se ejecute.
		while (numeroIntroducido!=aNum.getValorRan()) {
			
			//Contador de intentos
			intentos++;
			
			//try para filtrar errores.
			try {
				System.out.print("Introduce un número: ");
				numeroIntroducido=sc.nextInt();
				
				//Llamamos al método que comprueba el número introducido
				aNum.comprobarNumero(numeroIntroducido);
				
				
			} catch (InputMismatchException e) {
				System.out.println("No has introducido un valor correcto. Pruebe a introducir un número. Este valor a contado como intento.");
				sc.nextLine();
			}
		}
		sc.close();
		System.out.println("Has hecho "+intentos+" intentos.");
	}
}
