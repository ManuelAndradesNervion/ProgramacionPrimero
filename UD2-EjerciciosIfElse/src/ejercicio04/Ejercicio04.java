package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Double numeroIntroducido = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número para comprobar si es un número casi-cero: ");
		numeroIntroducido = sc.nextDouble();
		sc.close();

		if (numeroIntroducido > -1 && numeroIntroducido < 1) {
			System.out.print("El número introducido (" + numeroIntroducido + ") es un número casi-entero.");
		} else {
			System.out.print("El número introducido (" + numeroIntroducido + ") no es un número casi-entero.");

		}
	}
}
