package poo;

public class Furgoneta extends Coche {
	private int capacidadCarga;
	private int plazasExtra;
	
	public Furgoneta(int plazasE,int capacidadC) {
		super();// lo uso para llamar el consttructor de la clase padre.
		capacidadCarga= capacidadC;
		plazasExtra= plazasE;
		super.setTipo("Furgoneta");
		
	}
	
        @Override
	public String dimeDatos() {
		return super.dimeDatos()+"\nla capacidad de carga es:"+ capacidadCarga+
				"kgs \ny las plazas son: "+plazasExtra;
	}
	
	
}
