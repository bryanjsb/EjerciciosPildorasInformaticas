package Enum;
import java.util.Scanner;
public class UsoTallas {
	// enum es un objeto donde podemos especificar los valores que se pueden usar en la variable
	// 1.  enum talla{MINI,MEDIANO,GRANDE,MUY_GRANDE};
	
	//////////////////////////////
	
	private static Scanner entrada;
	//2.
	enum talla{
		
		MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
		
		private talla(String abreviatura) {//CONSTRUCTOR PRIVADO
			this.abreviatura=abreviatura;
		}
		
		public String getAbreviatura() {return abreviatura;}
		
		private String abreviatura;
	}
	public static void main(String[] args) {
	/*	1.
	talla s=talla.MINI;
	talla m=talla.MEDIANO;
	talla l=talla.GRANDE;
	talla x=talla.MUY_GRANDE;
	*/
		
	entrada = new Scanner(System.in);
	String datosRecibido;
	System.out.println("Escribe una talla, MINI, MEDIANO, GRANDE,MUY_GRANDE");
	datosRecibido=entrada.next().toUpperCase();
	talla la_talla = Enum.valueOf(talla.class, datosRecibido);
	System.out.println("LA TALLA ES:"+la_talla);
	System.out.println("LA ABREVIATURA ES:"+la_talla.getAbreviatura());
	
}
	
}
