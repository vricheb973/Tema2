package tema2;

import java.util.Scanner;

public class Diapositiva31A {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		System.out.println("Dime número de 3 cifras: ");
		int numero = sca.nextInt();

		int unidades = numero % 10;
		int decenas = (numero / 10) % 10;
		int centenas = (numero / 100) % 10;
		int millares = (numero / 1000) % 10;

		if (numero < 0 || numero > 9999) {
			System.out.println("Introduce un número de 4 cifras.");
		} else if (numero >= 0 && numero < 10) {
			System.out.println("El número es capicúa");
		} else if (numero >= 10 && numero < 100 && decenas == unidades) {
			System.out.println("El número es capicúa");
		} else if (numero >= 100 && numero < 1000 && unidades == centenas) {
			System.out.println("El número es capicúa");
		} else if (numero >= 1000 && numero < 10000 && unidades == millares && decenas == centenas) {
			System.out.println("El número es capicúa");
		} else {
			System.out.println("El número no es capicúa");
		}

	}

}
