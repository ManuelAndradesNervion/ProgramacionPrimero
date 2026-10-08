package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero = 1;
		Integer numeroActual = 0;
		Integer numeroIntroducido = null;
		Double sumaNumeros = 0.0;
		Double media;

		System.out.println("Introduce 5 números para mostrar la media: ");

		for (; numero <= 5; numero++) {
			numeroActual++;
			System.out.println("Introduce el numero " + numeroActual);
			numeroIntroducido = sc.nextInt();
			sumaNumeros += numeroIntroducido;
		}
		sc.close();
		media = sumaNumeros / 5;
		System.out.println("La media de los numeros introducidos es: " + media);
	}
}
