package actividades;

import java.util.Scanner;

public class Actividad08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Día: ");
		int dia = sc.nextInt();

		System.out.println("Mes: ");
		int mes = sc.nextInt();

		System.out.println("Año: ");
		int year = sc.nextInt();
		
		switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(dia >= 1 && dia <= 31) {
					System.out.println("La fecha es válida. ");
				}
				else {
					System.out.printf("El mes %d tiene 31 días. Introduce un día válido. \n", mes);
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(dia >= 1 && dia <= 30) {
					System.out.println("La fecha es válida. ");
				}
				else {
					System.out.printf("El mes %d tiene 30 días. Introduce un día válido. \n", mes);
				}
				break;
			case 2:
				if(((year%4 == 0 && year%100 != 0) || year%400 == 0) && (dia >= 1 && dia <= 29)) {
					if(dia >= 1 && dia <= 29) {
						System.out.println("La fecha es válida. ");
					}
					else {
						System.out.printf("Febrero de año bisiesto tiene 29 días. Introduce un día válido. \n", mes);
					}
				}
				else {
					if(dia >= 1 && dia <= 28) {
						System.out.println("La fecha es válida. ");
					}
					else {
						System.out.printf("Febrero tiene 28 días. Introduce un día válido. \n", mes);
					}
				}				
				break;
			default:
				System.out.println("El mes no es válido. ");
				
		}
		
	}

}
