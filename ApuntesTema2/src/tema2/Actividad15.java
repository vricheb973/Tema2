package tema2;

import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("¿Cuántas acciones quieres comprar?");
		int acciones = sca.nextInt();
		
		double costeTotal = 0.0;
		
		if(acciones > 0 && acciones <= 10) {
			costeTotal = acciones * 50;
		}
		else if(acciones > 10 && acciones <= 50) {
			costeTotal = (10 * 50) + (acciones - 10) * 150;
		}
		else if(acciones > 50 && acciones <= 100) {
			costeTotal = (10 * 50) + (40 * 150) + (acciones - 50) * 300;
		}
		else if(acciones > 100 ) {
			costeTotal = (10 * 50) + (40 * 150) + (50 * 300) + (acciones - 100) * 500;
		}
		
		System.out.println("¿Eres gran accionista? (S/N)");
		String granAccionista = sca.next();
		
		if(granAccionista.equalsIgnoreCase("S")) {
			costeTotal = costeTotal * 1.15;
		}
		else {
			System.out.println("¿Cuántos años de carnet llevas?");
			int aniosCarnet = sca.nextInt();
			
			if(aniosCarnet < 10) {
				costeTotal = costeTotal * 0.90;
			}
			else {
				costeTotal = costeTotal * 0.80;
			}
		}
		
		System.out.printf("El coste total de las acciones es %.2f €", costeTotal);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
