package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		Integer filasCantidad = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número de filas y de columnas para dibujarlo en pantalla: ");

		System.out.print("Filas y columnas: ");
		filasCantidad = sc.nextInt();

		sc.close();

		for (int y = 0; y < filasCantidad; y++) {
			for (int x = 0; x <= y; x++) {
				for (int numero = 1; numero >= filasCantidad; numero++)
					System.out.print(numero);
			}
			System.out.println("");
		}

	}
}