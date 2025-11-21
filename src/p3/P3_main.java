package p3;

public class P3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ein Programm, das eine 3 × 3-Matrix mit Hilfe eines zweidimensionalen Arrays 
		 * von ganzen Zahlen initialisiert und dann folgende Operationen durchführt:
		 * (a) Erhöht jedes Element der Matrix um 1 und gibt die Matrix aus.
		 * (b) Ermittelt die Summe aller Elemente in der Matrix und gibt den Wert auf der Konsole aus.
		 * (c) Dreht die Matrix um 90 Grad im Uhrzeigersinn und gibt die gedrehte Matrix auf der Konsole aus.
		 */
		
		//int[][] matrix = new int [3] [3];
		
		int[][] matrix = {{1 ,2 ,3}, {4, 5, 6}, {7, 8, 9}};
		int[][] matrix2 = {{1 ,2 ,3}, {4, 5, 6}, {7, 8, 9}};
		int sum = 0;
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length;j++) {
				sum += matrix[i][j];			//(b) Summe ermitteln
				matrix[i][j]++;					//(a) Matrix um 1 erhöhen
				System.out.print(matrix[i][j] + " " + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Summe der Elemente: " + sum);   				//(b) Summe ausgeben
		
		//(c) Matrix drehen
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = matrix2 [matrix.length-1-j][i];
				System.out.print(matrix[i][j] + " " + "\t");
			}
			System.out.println();
		}
		

		
		

	}

}
