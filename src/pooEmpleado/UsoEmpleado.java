package pooEmpleado;

import java.util.Arrays;// para usar metodos como el sort que es static

public class UsoEmpleado {

	public static void main(String[] args) {
		
		Empleado [] arregloEmpleado= new Empleado[6];
		Empleado empleado1= new Empleado("BRYAN",3000000,2018,01,18);
		Empleado empleado2= new Empleado("ANDREY",2000000,2017,10,8);
		Empleado empleado3= new Empleado("BRAYNER",1000000,2016,12,01);
		Empleado empleado4= new Empleado("HUMBERTO");
				
		arregloEmpleado[0]=empleado1;
		arregloEmpleado[1]=empleado2;
		arregloEmpleado[2]=empleado3;
		arregloEmpleado[3]=empleado4;
		
		Jefatura jefe1= new Jefatura("Sara",1500000,2017,12,01);
		arregloEmpleado[4]=jefe1;
		jefe1.estableceIncentivo(3000);
		
		arregloEmpleado[5]= new Jefatura("Andrea",200000,2150,06,06);
		Jefatura jefe2=(Jefatura)arregloEmpleado[5];
		jefe2.estableceIncentivo(4000);	
		
		System.out.println("El jefe: "+jefe1.getNombre()+" dice Dar mas dias de vacaciones a los empleados");
		
		System.out.println("El jefe: "+jefe1.getNombre()+" tiene un bonus de: "+jefe1.estableceBonus(200));
		
		System.out.println("El empledo: "+arregloEmpleado[0].getNombre()+" tiene un bonus de: "
		+arregloEmpleado[0].estableceBonus(200));
		 System.out.println("___________________________________________________________________\n");
		 
		
		//usando instanceof para saber el tipo de dato
		Empleado directorComercial= new Jefatura("Sandra",8500,2012,05,05);
		Comparable ejemplo= new Empleado("Elisabeth",95000,2011,06,07);
	
		if(directorComercial instanceof Empleado) {
			System.out.println(directorComercial.getNombre()+" Es de tipo jefatura");
		}
		
		if(ejemplo instanceof Comparable) {
			System.out.println("El objeto ejemplo.Implementa la interfaz comparable");
		}
		   
		
		for(Empleado e: arregloEmpleado) {
			e.aumentarSueldo(10);
		}
	
		/*mostrar datos
	    for(int i=0; i<arregloEmpleado.length;i++) {
			System.out.println("Nombre"+arregloEmpleado[i].getNombre()+" sueldo "
		+arregloEmpleado[i].getSueldo()+" alta contrato "+arregloEmpleado[i].getAltaContracto()+" id "+arregloEmpleado[i].getId() );
		}
		*/
		
		//ORDENAR EL ARRAY
		Arrays.sort(arregloEmpleado);// ordena los objetos pero para esto debo de agregar la interface Comparable 
		//e inmplementar el metodo CompareTo(objet arg) para que el el metodo sort pueda ordenar
		//
				
		  for(int i=0; i<arregloEmpleado.length;i++) {
			 // System.out.println("//////////"+(i+1)+"////////////");
				System.out.println(arregloEmpleado[i].mostrarDatos());	
		  }
		  
	    System.out.println("___________________________________________________________________\n");
		Persona lasPersonas[]= new Persona[2];
		lasPersonas[0]= new Alumno("Bryan Sanchez","ing.sistemas UNA");
		lasPersonas[1]= new Empleado("BRYAN",3000000,2018,01,18);
		
		//int cont=1;
		for(Persona vec: lasPersonas) {
			// System.out.println("//////////"+(cont++)+"////////////");
		  System.out.println(vec.mostrarDatos());
		  }
	}

}
