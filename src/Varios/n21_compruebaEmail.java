package Varios;

import javax.swing.JOptionPane;

public class n21_compruebaEmail {

	public static void main(String[] args) {
		boolean arroba=false;
		
		String 	mail = JOptionPane.showInputDialog("Ingrese su correo electronico por favor");

		for(int i=0;i<mail.length();i++) {
			
			if(mail.charAt(i)=='@') {
				arroba= true;	
				break;
			}// fin primer if
			
		}// fin for
		
		if(arroba==true) {
			System.out.println("Valido");
		}else {
			System.out.println("Invalido");
		}
		
		
		
		
	}

}
