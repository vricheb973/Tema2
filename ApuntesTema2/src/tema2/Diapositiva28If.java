package tema2;

import java.util.Scanner;

public class Diapositiva28If {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		System.out.println("Dime tu nota: ");
		int nota = sca.nextInt();
		
		if(nota >= 0 && nota < 5) {
			System.out.println("Insuficiente");
		}
		else if(nota >= 5 && nota < 6) {
			System.out.println("Suficiente");
		}
		else if(nota >= 6 && nota < 7) {
			System.out.println("Bien");
		}
		else if(nota >= 7 && nota < 9) {
			System.out.println("Notable");
		}
		else if(nota >= 9 && nota <= 10) {
			System.out.println("Sobresaliente");
		}
		else {
			System.out.println("Introduce una nota válida (0 - 10).");
		}
		

	}

}
