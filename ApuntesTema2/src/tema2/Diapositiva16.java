package tema2;

import java.util.Scanner;

public class Diapositiva16 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero1 = sca.nextInt();
		
		System.out.println("Dime otro número: ");
		int numero2 = sca.nextInt();
		
		if(numero1 == numero2) {
			System.out.printf("%d y %d son iguales \n", numero1, numero2);
		}
		else {
			System.out.printf("%d y %d son distintos \n", numero1, numero2);
		}
		
	}

}
