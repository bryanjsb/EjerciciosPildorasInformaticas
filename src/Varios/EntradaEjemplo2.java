package Varios;

import javax.swing.*;
public class EntradaEjemplo2 {

	public static void main(String[] args) {
		String nombre= JOptionPane.showInputDialog("introduce tu nombre");// usando esta forma , abrira una ventana donde escribir el dato a guardar
		String edad= JOptionPane.showInputDialog("ingrese la edad");
		int edadInt= Integer.parseInt(edad);
		System.out.println("hola "+nombre+" su edad el proximo a�o sera "+(edadInt+1)+" a�os");
	}

}
