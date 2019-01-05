package pooEmpleado;
// los modificadores de acceso simpre son public abstract ,
//auque si no los pone , esta por defecto eso modificadores

public interface Jefes extends Trabajadores
{
	public abstract String tomarDecisiones(String decision);
}
