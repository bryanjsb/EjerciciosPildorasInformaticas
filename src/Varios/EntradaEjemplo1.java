package Varios;

import java.util.Scanner;
public class EntradaEjemplo1 {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		
		System.out.println("ingrese tu nombre");
		String nombre= entrada.nextLine();
		
		System.out.println("Introduce edad");
		int edad= entrada.nextInt();
		
		System.out.println("hola "+nombre+" el a�o que viene tendras "+ (edad+1)+" a�os");
	}

}
