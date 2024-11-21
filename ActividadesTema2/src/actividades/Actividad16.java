package actividades;

import java.util.Scanner;

public class Actividad16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número (30-99): ");
		int numero = sc.nextInt();

		int decenas = numero / 10;
		int unidades = numero % 10;

		switch (decenas) {
		case 3:
			System.out.print("Treinta");
			break;
		case 4:
			System.out.print("Cuarenta");
			break;
		case 5:
			System.out.print("Cincuenta");
			break;
		case 6:
			System.out.print("Sesenta");
			break;
		case 7:
			System.out.print("Setenta");
			break;
		case 8:
			System.out.print("Ochenta");
			break;
		case 9:
			System.out.print("Noventa");
			break;
		}
		
		switch (unidades) {
		case 1:
			System.out.println(" y uno");
			break;
		case 2:
			System.out.println(" y dos");
			break;
		case 3:
			System.out.println(" y tres");
			break;
		case 4:
			System.out.println(" y cuatro");
			break;
		case 5:
			System.out.println(" y cinco");
			break;
		case 6:
			System.out.println(" y seis");
			break;
		case 7:
			System.out.println(" y siete");
			break;
		case 8:
			System.out.println(" y ocho");
			break;
		case 9:
			System.out.println(" y nueve");
			break;
		default:
			
		}
		
		

	}

}
