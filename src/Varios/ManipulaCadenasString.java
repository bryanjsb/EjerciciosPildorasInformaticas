package Varios;


public class ManipulaCadenasString {

	public static void main(String[] args) {
		String nombre = "Bryan";
		
		System.out.println("Mi nombre es: "+ nombre);
		System.out.println("Mi nombre tiene "+ nombre.length()+" letras.");
		System.out.println("La primera letra de mi nombre es: "+ nombre.charAt(0));
		
		int ultimo= nombre.length();
		System.out.println("La ultima letra de mi nombre es: " + nombre.charAt(ultimo-1));

	}

}
