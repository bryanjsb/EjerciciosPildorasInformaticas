package ProbandoClasesPredefinidas;


public class Ejemplo{
	public static void main(String [] args){
	
	
		String mensaje = "Hola Mundo";
		System.out.println(mensaje.length());
		
		
		
		mensaje = "Hola Mundo";
		char lentraH = mensaje.charAt(0);
		System.out.println(lentraH);
		
		
		
		mensaje = "Hola Mundo";
		int indice = mensaje.indexOf("M");
		System.out.println(indice); 
		
		mensaje = "Hola Mundo";
		indice = mensaje.lastIndexOf("M");
		System.out.println(indice);
		
		mensaje = "Este mensaje posee muchas letras a";
		int indicePrimeraA = mensaje.indexOf("a");
		int indiceSegundaA = mensaje.indexOf("a",indicePrimeraA+1);
		System.out.println(indiceSegundaA);
		System.out.println(mensaje);
		
		 mensaje = "Hola Mundo";
		int indiceLetraM = mensaje.indexOf("M");
		String subString = mensaje.substring(indiceLetraM);
		System.out.println(subString);
		
		
		 mensaje = "Hola Mundo";
		 indiceLetraM = mensaje.indexOf("M"); 
		 subString = mensaje.substring(indiceLetraM, indiceLetraM + 2);
		System.out.println(subString);
	}
}