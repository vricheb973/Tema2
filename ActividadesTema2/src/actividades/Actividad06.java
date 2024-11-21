package actividades;

import java.util.Scanner;

public class Actividad06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lado A: ");
		int a = sc.nextInt();
		
		System.out.println("Lado B: ");
		int b = sc.nextInt();
		
		System.out.println("Lado C: ");
		int c = sc.nextInt();
		
		double a2 = Math.pow(a, 2);
		double b2 = Math.pow(b, 2);
		double c2 = Math.pow(c, 2);
		
		//Caso equilatero
		if(a == b && b == c) {
			System.out.println("Es equilátero. ");
		}
		//Caso isósceles
		else if(a == b || b == c || a == c) {
			System.out.println("Es isósceles. ");
		}
		//Caso rectángulo
		else if((a2 == b2 + c2) || (b2 == a2 + c2) || (c2 == a2 + b2)) {
			System.out.println("Es rectángulo. ");
		}
		//Caso escaleno
		else {
			System.out.println("Es escaleno. ");
		}

	}

}
