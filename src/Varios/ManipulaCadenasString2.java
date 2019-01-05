package Varios;


public class ManipulaCadenasString2 {

	public static void main(String[] args) {
		String frase= "hoy  es un estupendo dia para aprender a programar en java";
		String fraseResumen= frase.substring(0,29)+" irnos a la playa y "+frase.substring(29,57) ;
		System.out.println("Frase: "+frase);
		System.out.println("FraseResumen: "+fraseResumen);

		
		String alumno1,alumno2;
		alumno1="Bryan";
		alumno2="bryan";
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2));// ignora mayusculas y minusculas
	}

}
