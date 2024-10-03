package tema2;

import java.util.Scanner;

public class Diapositiva19 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		System.out.println("Dime un número: ");
		int a = sca.nextInt();

		System.out.println("Dime otro número: ");
		int b = sca.nextInt();

		System.out.println("Dime otro número: ");
		int c = sca.nextInt();
		
		//A es el mayor
		if(a > b && a > c) {
			// A > B > C
			if(b > c) {
				System.out.printf("%d > %d > %d", a, b, c);
			}
			// A > C > B
			else {
				System.out.printf("%d > %d > %d", a, c, b);
			}
		}
		//B es el mayor
		else if(b > a && b> c) {
			// B > A > C
			if(a > c) {
				System.out.printf("%d > %d > %d", b, a, c);
			}
			// B > C > A
			else {
				System.out.printf("%d > %d > %d", b, c, a);
			}
		}
		//C es el mayor
		else if(c > a && c > b) {
			// C > A > B
			if(a > b) {
				System.out.printf("%d > %d > %d", c, a, b);
			}
			// C > B > A
			else {
				System.out.printf("%d > %d > %d", c, b, a);
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
