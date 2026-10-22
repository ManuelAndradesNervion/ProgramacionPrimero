package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Integer filasCantidad = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número de filas y de columnas para dibujarlo en pantalla: ");

		System.out.print("Filas y columnas: ");
		filasCantidad = sc.nextInt();

		sc.close();

		for (int y = 1; y <= filasCantidad; y++) {
			for (int x = filasCantidad; x >= y; x--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
