package Varios;

import java.util.Scanner;
public class EvaluaEdad {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		System.out.println("introduce la edad");
		scanner = new Scanner(System.in);
		int edad= scanner.nextInt();
		
		if(edad>=18) {
			System.out.println("mayor de edad");
		}
		else {
			System.out.println("menor de edad");
		}
		
		
		System.out.print("Hola,\nagregamos un salto");
		System.out.print("\tagregamos un tab");
		System.out.println("");

		System.out.println("Mensaje con \\ diagonal inversa");
		System.out.println("Mensaje con \" comillas dobles");
		System.out.println("Mensaje con \' comillas simples");
	}

}
