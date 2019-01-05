package Varios;

import javax.swing.*;
public class n11_AccesoAplicacion {

	public static void main(String[] args) {
		String clave="bryan";
		String pass ="";	
		int contador= 3;
		
		while(clave.equals(pass) == false && contador!=0) {
			pass= JOptionPane.showInputDialog("Ingrese la contrase�a correcta, INTENTO "+contador);
			
			if(clave.equals(pass)==false) {
				System.out.println("CONTRASE�A INCORRECTA");
				contador--;
			}
				
		}// while
		if(contador>0) {
		System.out.println("CONTRASE�A CORRECTA. ACCESO PERMITIDO");
		}else {
			System.out.println(" ACCESO DENEGADO,NUMERO DE INTENTOS ACABADOS");
		}
	}

}
