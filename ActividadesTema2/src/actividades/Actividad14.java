package actividades;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuánto pesa el paquete?");
		int peso = sc.nextInt();

		System.out.println("¿A qué zona va dirigido?");
		System.out.println("1. América del Norte.");
		System.out.println("2. América Central.");
		System.out.println("3. América del Sur.");
		System.out.println("4. Europa.");
		System.out.println("5. Asia.");
		int zona = sc.nextInt();

		if (peso < 1 || peso > 5000) {
			System.out.println("ERROR. Solo se envían paquetes entre 1 y 5000 gramos");
		} else {
			double kilos = peso*1.0 / 1000;
			
			switch(zona) {
				case 1:
					System.out.printf("El precio del paquete es %.2f € \n", kilos*24);
					break;
				case 2:
					System.out.printf("El precio del paquete es %.2f € \n", kilos*20);
					break;
				case 3:
					System.out.printf("El precio del paquete es %.2f € \n", kilos*21);
					break;
				case 4:
					System.out.printf("El precio del paquete es %.2f € \n", kilos*10);
					break;
				case 5:
					System.out.printf("El precio del paquete es %.2f € \n", kilos*18);
					break;
				default:
					System.out.println("Inserte una zona válida (1-5). ");
					break;
			}

		}

	}

}
