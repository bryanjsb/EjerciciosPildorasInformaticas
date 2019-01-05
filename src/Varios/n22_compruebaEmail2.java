package Varios;

import javax.swing.JOptionPane;

public class n22_compruebaEmail2 {

	public static void main(String[] args) {
		int arroba=0;
		
		String 	mail = JOptionPane.showInputDialog("Ingrese su correo electronico por favor");

		for(int i=0;i<mail.length();i++) {
			
			if(mail.charAt(i)=='@') {
				arroba++;	
			}// fin primer if
			
		}// fin for
		
		if(arroba==1) {
			System.out.println("Valido");
		}else {
			System.out.println("Invalido");
		}
		
		
	}

}
