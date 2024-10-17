package tema2;

import java.util.Scanner;

public class Diapositiva12 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero = sca.nextInt();
		
		String resultado = "Es impar";
		
		if(numero % 2 == 0) {
			resultado = "Es par";
		}
			
		System.out.println(resultado);
		
	}

}
