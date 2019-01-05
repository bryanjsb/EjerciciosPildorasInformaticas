package pooEmpleado;
// clase abstracta

public abstract  class Persona {
private final String nombre;

	public Persona(String n) {
		nombre= n;
	}
	
	public Persona() {nombre="";}
	
	public String getNombre() {return nombre;}
	
	public abstract String mostrarDatos();
}