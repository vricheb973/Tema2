package tema2;

import java.util.Scanner;

public class Diapositiva07A {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime un número entero: ");
		int num1 = sca.nextInt();
		
		System.out.println("Dime otro número entero: ");
		
		int num2 = sca.nextInt();
		
		boolean compro = num1 != num2 || num1 == 0 || num2 == 0;
		
		System.out.println(compro);

	}

}
