package pooEmpleado;
//final en una clase indica que esa clase ya no va poder heredar, cortando la herencia para las clases derivadas
//public final class Jefatura extends Empleado {
	
public final class Jefatura extends Empleado implements Jefes {
	private double incentivo;
	
	public Jefatura(String n, double s,int anno, int m, int d) {
		super(n,s,anno,m,d);
		incentivo=0.0; 
	}
	
	public void estableceIncentivo(double inc) {incentivo=inc;}
	
	
	public double getSueldo() {
		return super.getSueldo()+incentivo;// tambien puedo usar super para llamar un metodo igual al padre, con super aclaro cual metodo es
	}
	
	public String mostrarDatos() {
		return super.mostrarDatos()+" Incentivo: "+incentivo;
	}

	// metodo de la iterfaz jefes
	@Override
	public String tomarDecisiones(String decision) {
		
		return "Un miembro de la direccionha tomado la decicion de: "+decision;
	}

	// metodo de la iterfaz jefes extends Trabajadores
	@Override
	public double estableceBonus(double gratificacion) {
		double prima=2000;
		return (Trabajadores.BONUSBASE+gratificacion+prima);
	}
	
	
		
}
