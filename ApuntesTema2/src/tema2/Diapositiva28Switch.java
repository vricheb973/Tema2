package tema2;

import java.util.Scanner;

public class Diapositiva28Switch {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		System.out.println("Dime tu nota: ");
		int nota = sca.nextInt();
		
		switch(nota) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Insuficiente");
				break;
			case 5:
				System.out.println("Suficiente");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
			case 10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("Introduce una nota válida (0 - 10).");
				break;
		}

	}

}
