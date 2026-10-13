package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Integer numeroFinal, numeroContador = 1, factorial = 1;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número para calcular su factorial: ");
		numeroFinal = sc.nextInt();
		sc.close();

		for (; numeroContador <= numeroFinal; numeroContador++) {
			factorial *= numeroContador;
		}
		System.out.print("El número factorial del número (" + numeroFinal + ") es: " + factorial);
	}
}
