package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Integer filas = 0, columnas = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número de filas y de columnas para dibujarlo en pantalla: ");

		System.out.print("Filas: ");
		filas = sc.nextInt();

		System.out.print("Columnas: ");
		columnas = sc.nextInt();

		sc.close();

		for (int y = 0; y < filas; y++) {
			for (int x = 0; x < columnas; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
