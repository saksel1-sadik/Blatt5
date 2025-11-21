package p2;

public class P2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] numbers = { 4, 2, 3, 4, 1 };
		int[] numbers = {2,-8000, 5};

		int max = 0, minIndex = 0;

		/*
		 * Programm, welches in max den größten aller in numbers enthaltenen Werte
		 * speichert. In minIndex soll der kleinste Index einer Zelle, 
		 * die den Wert aus max enthält, gespeichert werden.
		 */

		max = numbers[0];
		minIndex = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				minIndex = i;
				
			}
		}
		
		System.out.println("max: " + max);
		System.out.println("minIndex: " + minIndex);
	}

}
