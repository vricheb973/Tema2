package actividades;

import java.util.Scanner;

public class Actividad03 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime una letra: ");
		String letra = sca.next();

		if(letra.length() != 1 || !letra.matches("a-z A-Z")) {
			System.out.println("Error. Debes introducir una letra. ");
		}
		else if(letra.equals(letra.toUpperCase())) {
			System.out.println("Es una letra mayúscula. ");
		}
		else {
			System.out.println("Es una letra minúscula. ");
		}
		
		

	}

}
