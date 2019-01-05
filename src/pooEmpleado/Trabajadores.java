package pooEmpleado;
 // si no declaro el metodo como public abstract , eclipse lo va a detectar por defecto

public interface Trabajadores {
	double estableceBonus(double gratificacion);

	public static final double bonusBase=1500;
	// tambien en una interfaz las variables deben ser public static final
}
