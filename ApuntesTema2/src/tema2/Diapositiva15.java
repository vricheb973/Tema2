package tema2;

import java.util.Scanner;

public class Diapositiva15 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		System.out.println("Dime un número: ");
		int numero1 = sca.nextInt();

		System.out.println("Dime otro número: ");
		int numero2 = sca.nextInt();

		if (numero1 > numero2) {
			System.out.printf("%d es mayor que %d \n", numero1, numero2);
		} 
		else if (numero2 > numero1) {
			System.out.printf("%d es mayor que %d \n", numero2, numero1);
		} 
		else {
			System.out.printf("%d es igual que %d \n", numero1, numero2);
		}

	}

}
