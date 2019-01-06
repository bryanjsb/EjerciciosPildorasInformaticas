package pooEmpleado;

public class Alumno extends Persona {

	private String carrera;
	
	public Alumno() {
		super();
		carrera="";
	}
	
	public Alumno(String nom,String c) {
		super(nom);
		carrera=c;
	}
	
	public String getCarrera() {
		return carrera;
	}
	
        @Override
	public String mostrarDatos() {
		return "Nombre: "+getNombre()+" Carrera: "+carrera;
	}
	
}
