package Varios;


public class n25_UsoArrayBidimensional {

	public static void main(String[] args) {
		int [][] matrix= new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				matrix[i][j]=i+1*j;
			}
		}
		///////////////////////////
		System.out.print("Matriz");
		for(int i=0; i<5; i++) {
			System.out.println();
			for(int j=0; j<5; j++) {
				System.out.print("|"+matrix[i][j] +"|");
			}
		}
		System.out.println();
		System.out.println();
		
		///////////////////////////
		System.out.print("Matriz con for each");
		for(int[]fila:matrix) {
			System.out.println();
			for(int z:fila) {
				System.out.print(z+" ");
			}
		}
		System.out.println();
		System.out.println();
		
		
		
		
		
		
	}

}
