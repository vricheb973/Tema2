package tema2;

import java.util.Scanner;

public class Diapositiva20 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		System.out.println("Dime un número: ");
		int numero = sca.nextInt();
		
		if(numero < 0) {
			System.out.println("Has introducido un número negativo");
		}
		else if(numero < 10) {
			System.out.println("El número tiene 1 cifra");
		}
		else if(numero < 100) {
			System.out.println("El número tiene 2 cifras");
		}
		else if(numero < 1000) {
			System.out.println("El número tiene 3 cifras");
		}
		else if(numero < 10000) {
			System.out.println("El número tiene 4 cifras");
		}
		else if(numero < 100000) {
			System.out.println("El número tiene 5 cifras");
		}
		else {
			System.out.println("El número tiene más 5 cifras");
		}

		

	}

}
