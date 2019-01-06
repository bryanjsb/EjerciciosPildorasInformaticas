package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		Coche renault= new Coche();
		renault.setTipo("AutoMovil");
		renault.setColor("verde");
		renault.incorporarAsientoCuero();
		renault.incorporarClimatizador();
		System.out.println(renault.dimeDatos());
		System.out.println("/////////////////////////////////////////////////");
			
		Furgoneta furgoneta1=  new Furgoneta(7,500);
		furgoneta1.incorporarAsientoCuero();
		furgoneta1.incorporarClimatizador();
		furgoneta1.setColor("Rojo");
		
		System.out.println(furgoneta1.dimeDatos());
                System.out.println("/////////////////////////////////////////////////");
                
                Coche furgoneta2=  new Furgoneta(7,500);
		furgoneta2.incorporarAsientoCuero();
		furgoneta2.incorporarClimatizador();
		furgoneta2.setColor("Rojo");
		
               // Furgoneta f2=(Furgoneta)furgoneta2;
		System.out.println(furgoneta2.dimeDatos());
                System.out.println("/////////////////////////////////////////////////");
                
	}

}
