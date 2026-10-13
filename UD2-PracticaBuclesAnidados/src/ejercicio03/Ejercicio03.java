package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Integer filasCantidad = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número de filas y de columnas para dibujarlo en pantalla: ");

		System.out.print("Filas: ");
		filasCantidad = sc.nextInt();

		sc.close();

		for (int y = 0; y < filasCantidad; y++) {
			for (int x = 0; x <= y; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
