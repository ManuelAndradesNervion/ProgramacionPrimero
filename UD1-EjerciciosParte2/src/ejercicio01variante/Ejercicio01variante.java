package ejercicio01variante;

import java.util.Scanner;

public class Ejercicio01variante {

	public static void main(String[] args) {

		double numeroIntroducido, resta;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un numero: ");
		numeroIntroducido = sc.nextDouble();
		sc.close();

		double techo = Math.ceil(numeroIntroducido);
		double suelo = Math.floor(numeroIntroducido);
		
		
		
		
		
		Integer res = (numeroIntroducido +0.5 )>techo? (int)techo : (int)suelo;
		
		System.out.print(res);
	}

}
