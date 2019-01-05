package Varios;

import java.util.*;
import javax.swing.*;

public class Areas {
	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		System.out.println("Elige una opcion:\n 1.Area Cuadrado\n 2.Area Rectangulo\n 3.Area Triangulo \n 4.Area Circulo");
		int figura=entrada.nextInt();
		
		switch(figura) {
		case 1: {
			String ladoS=JOptionPane.showInputDialog("Introduce el lado");
			int lado=Integer.parseInt(ladoS);
			System.out.println("El area del cuadrado es "+Math.pow(lado,2));	
		}break;
		
		case 2:{
			int base= Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura= Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del rectangulo es : "+(base*altura));
		}break;
		
		case 3:{
			int base= Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura= Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del triangulo es : "+(base*altura)/2);
		}break;
		
		case 4:{
			int radio= Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.print("El area del circulo es : ");
			System.out.printf("%1.2f", (Math.PI*Math.pow(radio, 2.0)) );
		}break;
		
		default:{
			System.out.println("opcion incorrecta");
		}break;
	}
		
	}
}
