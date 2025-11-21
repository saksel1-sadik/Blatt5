package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] einheiten = { { 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		
		/*
		 * int[][] einheiten;
		 * einheiten = new int[][] { 
		 * 							{50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1}, 
		 * 								new int[15]   // automatisch mit 0 initialisiert
		 * };
		 * 
		 * oder mit
		 * 
		 * int[][] einheiten = new int[2][15];
		 * 
		 * einheiten[0] = new int[] {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		 * 
		 * // zweite Zeile ist weiterhin voll mit 0
		 */
		
		
		int input = 88888;
		
		/*
		 * Programm, welches den Geldbetrag (in Cent), welcher in input gespeichert ist, 
		 * in möglichst wenig Scheine und / oder Münzen zerlegt.
		 */
		
		
		for (int i=0; i < 15; i++) {
			einheiten[1][i] = input / einheiten[0][i];
			input = input % einheiten[0][i];

		}
		
		for (int i=0; i<15; i++) {
			System.out.print(einheiten[0][i] + ", " + "\t");
			}
		
		System.out.println();
		
		for (int i=0; i<15; i++) {
			System.out.print(einheiten[1][i] + ", " + "\t");
		}


	}
	
}
