package tema2;

import java.util.Scanner;

public class Diapositiva29If {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		System.out.println("Dime el primer número: ");
		int numero1 = sca.nextInt();
		
		System.out.println("Dime el segundo número: ");
		int numero2 = sca.nextInt();
		
		System.out.println("¿Qué operación quieres realizar (+,-,*,/)? ");
		String operacion = sca.next();
		
		if(operacion.equals("+")) {
			System.out.println(numero1 + numero2);
		}
		else if(operacion.equals("-")) {
			System.out.println(numero1 - numero2);
		}
		else if(operacion.equals("*")) {
			System.out.println(numero1 * numero2);
		}
		else if(operacion.equals("/")) {
			System.out.println(numero1 / numero2);
		}
		else {
			System.out.println("Operación no permitida");
		}

	}

}
