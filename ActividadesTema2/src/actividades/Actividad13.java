package actividades;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime un número entre el 1 y el 12: ");
		int mes = scanner.nextInt();
		
		switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Tiene 31 días. ");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Tiene 30 días. ");
				break;
			case 2:
				System.out.println("Tiene 28 días. ");
				break;
			default:
				System.out.println("El mes debe estar entre 1 y 12. ");
		}
		
	}

}
