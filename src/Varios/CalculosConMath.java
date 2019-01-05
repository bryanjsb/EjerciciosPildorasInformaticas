package Varios;


public class CalculosConMath {

	public static void main(String[] args) {
		System.out.print("raiz ");
		double raiz = Math.sqrt(9);// metodo sqrt retorna un valor double por 
								  //lo que la variable raiz tiene que ser double tambien
		System.out.println(raiz);
		
		System.out.print("round ");
		float num1=5.35F;
		int resultado1= Math.round(num1);// HAY DOS METODOS PERO TENGO QUE VER QUE VALOR MANDO POR PARAMETRO 
		System.out.println(resultado1);
		
		// REFUNDICION O CASTEO Y ES PASAR UN TIPO A OTRO TIPO DE DATO
		System.out.print("casteo y round casteo de long a int ");
		double num2=5.95;
		int resultado2= (int)Math.round(num2);// HAY DOS METODOS PERO TENGO QUE VER QUE VALOR MANDO POR PARAMETRO 
		System.out.println(resultado2);
		
		System.out.print("pow ");
		double base=5;
		double exponente = 2;
		int resultado3=(int) Math.pow(base, exponente);
		System.out.println("El resultado " + (int)base + " elevado a " + (int)exponente + " es " + resultado3);
	}

}
