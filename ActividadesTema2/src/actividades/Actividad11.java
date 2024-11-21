package actividades;

import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime un número entre el 1 y el 6: ");
		int dado = scanner.nextInt();
		
		switch(dado) {
			case 1:
				System.out.println("El lado opuesto es el 6");
				break;
			case 2:
				System.out.println("El lado opuesto es el 5");
				break;
			case 3:
				System.out.println("El lado opuesto es el 4");
				break;
			case 4:
				System.out.println("El lado opuesto es el 3");
				break;
			case 5:
				System.out.println("El lado opuesto es el 2");
				break;
			case 6:
				System.out.println("El lado opuesto es el 1");
				break;
			default:
				System.out.println("El número debe estar entre el 1 y el 6. ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
