package actividades;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime un día de la semana (1-7): ");
		int dia = scanner.nextInt();
		
		switch(dia) {
			case 1:
				System.out.println("Lunes. ");
				break;
			case 2:
				System.out.println("Martes. ");
				break;
			case 3:
				System.out.println("Miércoles. ");
				break;
			case 4:
				System.out.println("Jueves. ");
				break;
			case 5:
				System.out.println("Viernes. ");
				break;
			case 6:
				System.out.println("Sábado. ");
				break;
			case 7:
				System.out.println("Domingo. ");
				break;
			default:
				System.out.println("Introduce un día válido. ");
		}

	}

}
