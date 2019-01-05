package pooEmpleado;
import java.util.Date;
import java.util.GregorianCalendar;
// agrego comparable para usar el metodo comparableTo(objet arg) para configurar la format que se va ordenar

public class Empleado extends Persona implements Comparable, Trabajadores {
	
	private double sueldo;
	private Date altaContrato; // tengo que llamar el API  java.util.Date
	private  int id;
	private static int idSiguiente=1;
	
	public Empleado(String nom,double suel, int anno, int mes, int dia) {
		super(nom);
		sueldo = suel;
		GregorianCalendar calendario= new GregorianCalendar(anno,mes-1,dia);//tengo que llamar el API  java.util.Calendar
		altaContrato= calendario.getTime();
		id=idSiguiente++;
	}
	
	public Empleado() {
		super(" ");
		sueldo = 0.0;
		GregorianCalendar calendario= new GregorianCalendar(0000,00,00);
		altaContrato= calendario.getTime();
		id=idSiguiente++;
	}
	
	/*public Empleado(String n) {
		nombre=n; 
		sueldo = 0.0;
		GregorianCalendar calendario= new GregorianCalendar(2000,0,1);
		altaContrato= calendario.getTime();
		id=idSiguiente++;
	}
	*/
	
	public Empleado(String n) {
	this(n,30000,2000,01,01);// el this llama al constructor que tenga los argumentos necesarios
	}

	public double getSueldo() {return sueldo;}
	
	//public final double getSueldo() {return sueldo;}
	
	public Date getAltaContracto() {return altaContrato;}
	
	public void setSueldo(double sueldo) {this.sueldo=sueldo;}
	
	public int getId() {return id;}
	
	public void aumentarSueldo(double porcentaje) {
		double aumento = sueldo*(porcentaje/100);
		sueldo+=aumento;
	}
		
	public String mostrarDatos() {
		return "Nombre: "+this.getNombre()+" ID: "+ id+" Alta contrato: "+altaContrato+" Sueldo: "+getSueldo();
	}

	@Override// ESTE METEDO LO USO PARA USAR EL METDO SORT DEL ARRAY
	// EN ESTE MOMENTO EL ORDEN LO QUIERO HACER SEGUN EL SUELDO
	public int compareTo(Object miObjeto) {
		/*
		 *siempre devolvera -1 si es menor
		 *devolvera 1 si es mayor
		 *devolvera 0 si son iguales 
		 */	
		Empleado emp=(Empleado)miObjeto;
		if(this.sueldo<emp.sueldo) {
			return -1;
		}else if(this.sueldo>emp.sueldo){
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public double estableceBonus(double gratificacion) {
		return (Trabajadores.bonusBase+gratificacion);
	}
	
}// fin de la clase
