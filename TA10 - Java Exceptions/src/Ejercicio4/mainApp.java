package Ejercicio4;

import java.util.Scanner;

public class mainApp {
	//Llamamos a scanner y un objeto Operacion 
	static Scanner sc= new Scanner(System.in);
	static Operacion operacion=new Operacion();

	public static void main(String[] args) {
		//Bucle para que ejecute siempre el menú hasta que el usuario pida cerrarlo.
		boolean continuar=true;
		while (continuar==true) {
			System.out.println("\n------CALCULADORA------");
			System.out.println("");
			System.out.println("Opciones de cálculo: ");
			System.out.println("1-Suma");
			System.out.println("2-Resta");
			System.out.println("3-Multiplicación");
			System.out.println("4-Potencia");
			System.out.println("5-Raíz cuadrada");
			System.out.println("6-Raíz cúbica");
			System.out.println("7-División");
			System.out.println("8-Finalizar calculadora");
			System.out.println();
			
			//Dentro de try-catch creamos un switch con todas las opciones operacionales llamando a su respectivo metodo de
			//la clase Operacion. Si la operación necesita dos números llamara al metodo dosNums y le pedira dos números por
			//pantalla, si solo necesita 1 numero llamará a unNum para que solo pida un número.
			try {
				System.out.print("Seleccione una opción: ");
				int opcion=sc.nextInt();
				switch (opcion) {
					case 1:
						dosNums();
						System.out.println("\nResultado: "+operacion.suma()); 
						break;
					case 2:
						dosNums();
						System.out.println("\nResultado: "+operacion.resta());				
						break;
					case 3:
						dosNums();
						System.out.println("\nResultado: "+operacion.multi());
						break;
					case 4:
						dosNums();
						System.out.println("\nResultado: "+operacion.potencia());
						break;
					case 5:
						unNum();
						System.out.println("\nResultado: "+operacion.raizCuadrada());
						break;
					case 6:
						unNum();
						System.out.println("\nResultado: "+operacion.raizCubica());
						break;
					case 7:
						dosNums();
						System.out.println("\nResultado: "+operacion.div());
						break;
					case 8:
						continuar=false;
						break;

					default:
						System.out.println("Opción incorrecta.");
						break;
					}
				
				
				
			} catch (Exception e) {
				System.out.println("VALOR INTRODUCIDO ERRONEO!");
				
				sc.nextLine();			
				
			}
		}
		sc.close();
	}
	
	//Método para pedir un número
	public static void unNum() {
		System.out.print("Introduce un número:");
			double num1=sc.nextDouble();
			operacion.num1=num1;

	}
	
	//Método para pedir dos números
	public static void dosNums() {
		System.out.print("Introduce el primer número:");
			double num1=sc.nextDouble();
			operacion.num1=num1;
			
		System.out.print("Introduce el segundo número:");
			double num2=sc.nextDouble();
			operacion.num2=num2;
			
	}
}
