package actividades;

import java.util.Scanner;

public class Actividad01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		double numero1 = scanner.nextDouble();
		
		System.out.println("Dime otro número: ");
		int numero2 = scanner.nextInt();
		
		if(numero2 == 0) {
			System.out.println("Error. No se puede dividir entre cero.");
		}
		else {
			System.out.printf("%.2f/%d = %.2f", numero1, numero2, numero1/numero2);
		}

	}

}
