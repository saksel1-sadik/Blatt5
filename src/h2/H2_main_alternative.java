package h2;

public class H2_main_alternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	int n = 299;     // Beispielwert für n
	        int digits = 0;    // Anzahl der Ziffern
	        int[] a = new int[9]; // automatisch mit 0 initialisiert

	        // Anzahl der Ziffern berechnen
	        if (n == 0) {
	            digits = 1;
	        } else {
	            int tmp = Math.abs(n);
	            while (tmp > 0) {
	                digits++;
	                tmp /= 10;
	            }
	        }

	        // Ziffern von rechts nach links ins Array eintragen
	        int tmp = Math.abs(n);
	        int index = 8; // letzte Array-Zelle

	        while (tmp > 0 && index >= 0) {
	            a[index] = tmp % 10;  // letzte Ziffer
	            tmp /= 10;
	            index--;
	        }

	        // Ausgabe zur Kontrolle
	        System.out.println("digits = " + digits);
	        System.out.print("a = [");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i]);
	            if (i < a.length - 1) System.out.print(", ");
	        }
	        System.out.println("]");
	    
	


}

}
