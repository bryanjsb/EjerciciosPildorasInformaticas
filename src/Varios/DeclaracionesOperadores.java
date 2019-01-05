package Varios;


public class DeclaracionesOperadores {

	public static void main(String[] args) {
		double a, b;
		a=5;
		b=6;
		double c;
		c=a/b;// para que imprima con decimales todas las variables de la dvision deben estar en double
		c+=6;
		System.out.println(++c);
		
		final double apulgadas=2.54;// declarar constantes
		double cm=6;
		double resultado= cm/apulgadas;
		
		System.out.println("En "+ cm +" cm hay "+ resultado +" pulgadas");
	}

}
