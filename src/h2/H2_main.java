package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 123456789, digits = 0;
		int[] a = new int[9];
		
		/*
		 * Programm, welches die Anzahl der Ziffern, aus denen n besteht, berechnet und in digits speichert. 
		 * Dabei besteht die Zahl 0 aus einer Ziffer, die Zahl 42 aus zwei Ziffern, 
		 * die Zahl 48889 aus fünf Ziffern, und so weiter.
		 * 
		 * jede einzelne Ziffer der Zahl n in einer Zelle des Arrays a abspeichern. 
		 * Dabei soll ganz rechts in a die letzte Ziffer stehen,
		 * links daneben die zweitletzte Ziffer, und so weiter. 
		 * Besteht die Zahl n nur aus k < 9 Ziffern, 
		 * so sollen die linken 9 − k vielen Zellen den Wert 0 beinhalten.
		 */
		
		if (n==0) {
			digits=1;
		} else {
			for (int i=0; i<a.length; i++) {
				if (n !=0)
					digits++;
				a[a.length - i - 1]= n % 10;
				n=n/10;
			}
		}
		
		for (int i=0; i< a.length; i++) {
			System.out.print(a[i]);
		}
	
		
		System.out.println();
		System.out.println("---");
		System.out.println("digits: " + digits);
		
		
		

	}

}
