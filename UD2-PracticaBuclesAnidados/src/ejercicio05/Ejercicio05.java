package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Integer filasCantidad = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número para dibujarlo en pantalla: ");

		System.out.print("Filas: ");
		filasCantidad = sc.nextInt();

		sc.close();

		for (int y = 0; y < filasCantidad; y++) {
			for (int x = 0; x < filasCantidad; x++) {
				if (x >= filasCantidad - 1 - y) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
