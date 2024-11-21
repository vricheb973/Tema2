package actividades;

import java.util.Scanner;

public class Actividad04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu nota (0-10): ");
		double nota = sc.nextDouble();
		
		System.out.println("Dime tu edad: ");
		int edad = sc.nextInt();
		
		System.out.println("Matricula (S/P):");
		String matriculado = sc.next();
		
		if(nota >= 5 && edad >= 18 && matriculado.equalsIgnoreCase("S")) {
			System.out.println("ACEPTADA");
		}
		else if(nota >= 5 && edad >= 18 && matriculado.equalsIgnoreCase("P")) {
			System.out.println("POSIBLE");
		}
		else {
			System.out.println("NO ACEPTADA");
		}
	}

}
