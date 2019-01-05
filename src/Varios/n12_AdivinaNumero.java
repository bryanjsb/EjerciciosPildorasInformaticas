package Varios;

import java.util.*;
public class n12_AdivinaNumero {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int aleatorio= (int) (Math.random()*100);
		int numero=-1;
		int intentos=0;
		System.out.println("Descubra el numero aleatorio");
		while(numero!=aleatorio) {
			intentos++;
			System.out.println("Introduce un numero");
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				System.out.println("Mas bajo");
			}else if(aleatorio>numero){
				System.out.println("Mas alto");
			}else {
				System.out.println("Correcto. Los has conseguido en "+intentos+" intentos.");
			}

		}// while
	}

}
