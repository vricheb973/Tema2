package actividades;

import java.math.BigDecimal;
import java.util.Scanner;

public class Actividad02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Usuario: ");
		String usuario = scanner.next();
		
		System.out.println("Password: ");
		String password = scanner.next();
		
		//  usuario == "vladi"
		if(usuario.equals("vladi") &&
		   password.equals("daw")) {
			System.out.println("Has entrado al sistema. ");
		}
		else {
			System.out.println("Error. Credenciales no válidas. ");
		}

	}

}
