package Varios;

public class n23_UsoArrays {

	public static void main(String[] args) {
		int [] mi_matriz = new int [5];
		mi_matriz[0]=4;
		mi_matriz[1]=45;
		mi_matriz[2]=33;
		mi_matriz[3]=55;
		mi_matriz[4]=1;
		
		System.out.println(mi_matriz[0]);
		System.out.println(mi_matriz[1]);
		System.out.println(mi_matriz[2]);
		System.out.println(mi_matriz[3]);
		System.out.println(mi_matriz[4]);
		
		int miMatriz[]= new int[10];
		for(int i=0;i<miMatriz.length;i++) {
			miMatriz[i]= (int)(Math.random()*100);
			
		}
		for(int i=0;i<miMatriz.length;i++) {
			System.out.println(miMatriz[i]);
		}
	}

}
