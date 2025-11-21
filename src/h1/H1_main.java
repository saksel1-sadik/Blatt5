package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {5, 6, 7, 10, 11, 12, 13};
		int tmp;
		
		/*
		 * Programm, welches die Reihenfolge der Werte in myArray umdreht. 
		 * am Ende des Programms muss also der erste Wert in myArray genau dem Wert entsprechen,
		 * der bei der Initialisierung der letzte Wert in myArray gewesen ist.
		 */
		
		for (int i=0; i< myArray.length; i++) {
			System.out.print(" " + myArray[i]);
		}
		
		for (int i=0; i< myArray.length/2; i++) {
			tmp = myArray[myArray.length - i - 1];
			myArray[myArray.length - i - 1] = myArray[i];
			myArray[i] = tmp;
		}
		
		System.out.println();
		System.out.println("---");
		
		for (int i=0; i< myArray.length; i++) {
			System.out.print(" " + myArray[i]);
		}
		
		

	}

}
