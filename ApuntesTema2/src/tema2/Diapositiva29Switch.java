package tema2;

import java.util.Scanner;

public class Diapositiva29Switch {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		System.out.println("Dime el primer número: ");
		int numero1 = sca.nextInt();
		
		System.out.println("Dime el segundo número: ");
		int numero2 = sca.nextInt();
		
		System.out.println("¿Qué operación quieres realizar (+,-,*,/)? ");
		String operacion = sca.next();
		
		switch(operacion) {
			case "+":
				System.out.println(numero1 + numero2);
				break;
			case "-":
				System.out.println(numero1 - numero2);
				break;
			case "*":
				System.out.println(numero1 * numero2);
				break;
			case "/":
				System.out.println(numero1 / numero2);
				break;
			default:
				System.out.println("Operación no permitida");
				break;
		
		}
		

	}

}
