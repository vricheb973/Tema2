package actividades;

import java.util.Scanner;

public class Actividad05 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		System.out.println("x1: ");
		int x1 = sca.nextInt();

		System.out.println("y1: ");
		int y1 = sca.nextInt();

		System.out.println("x2: ");
		int x2 = sca.nextInt();

		System.out.println("y2: ");
		int y2 = sca.nextInt();

		System.out.println("r1: ");
		int r1 = sca.nextInt();

		System.out.println("r2: ");
		int r2 = sca.nextInt();
		
		double xCuadrado = Math.pow((x2-x1), 2);
		double yCuadrado = Math.pow((y2-y1), 2);
		
		double distancia = Math.sqrt(xCuadrado + yCuadrado);
		
		if(distancia == 0) {
			System.out.println("Son concéntricas. ");
		}
		else if(distancia > r1+r2) {
			System.out.println("Son exteriores. ");
		}
		else if(distancia == r1+r2) {
			System.out.println("Son tangentes exteriores. ");
		}
		else if(distancia < r1+r2 && distancia > Math.abs(r1-r2)) {
			System.out.println("Son secantes. ");
		}
		else if(distancia == Math.abs(r1-r2)) {
			System.out.println("Son tangentes interiores. ");
		}
		else if(distancia > 0 && distancia < Math.abs(r1-r2)) {
			System.out.println("Son interiores. ");
		}
		
			
			
			
			
			
			
		

	}

}
