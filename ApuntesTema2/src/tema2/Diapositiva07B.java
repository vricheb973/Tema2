package tema2;

import java.util.Scanner;

public class Diapositiva07B {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime un número entero: ");
		int numero = sca.nextInt();
		
		System.out.println("Dime el múltiplo que quieres comprobar: ");
		int multiplo = sca.nextInt();
		
		boolean divide = (multiplo % numero) == 0;
		
		System.out.println(divide);

	}

}
