package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Integer filas = 0, columnas = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número de filas y de columnas para dibujarlo en pantalla: ");

		System.out.print("Filas: ");
		filas = sc.nextInt();

		System.out.print("Cloumnas: ");
		columnas = sc.nextInt();

		sc.close();

		for (int y = 1; y <= filas; y++) {
			for (int x = 1; x <= columnas; x++) {
				if (x == 1 || x == columnas || y == 1 || y == filas) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();
		}

	}
}
