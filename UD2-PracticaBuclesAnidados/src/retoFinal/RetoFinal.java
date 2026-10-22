package retoFinal;

import java.util.Scanner;

public class RetoFinal {

	public static void main(String[] args) {
		int seleccion = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(
					"Tienes dos figuras para ser representadas, elige una de las 2, si no, puedes salir del programa.");
			System.out.println("\n1: Figura 1\n2: Figura 2\n3: Salir");

			System.out.print("\n¿Qué es lo que deseas hacer?: ");
			seleccion = sc.nextInt();

			switch (seleccion) {
			case 1:
				int filas1 = 0, columnas1 = 0;
				do {
					System.out.print("Filas: ");
					filas1 = sc.nextInt();
					System.out.print("Columnas: ");
					columnas1 = sc.nextInt();

					if (filas1 <= 0 || columnas1 <= 0) {
						System.out.println("El número introducido de ambos debe de ser positivo.");
					}
				} while (filas1 <= 0 || columnas1 <= 0);

				for (int y = 0; y < filas1; y++) {
					for (int x = 0; x < columnas1; x++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;

			case 2:
				int filas2 = 0, columnas2 = 0;
				do {
					System.out.print("Filas: ");
					filas2 = sc.nextInt();
					System.out.print("Columnas: ");
					columnas2 = sc.nextInt();

					if (filas2 <= 0 || columnas2 <= 0) {
						System.out.println("Error: Las dimensiones deben ser números positivos mayores que 0.");
					}
				} while (filas2 <= 0 || columnas2 <= 0);

				for (int y = 0; y < filas2; y++) {
					for (int x = 0; x < columnas2; x++) {
						if (y % 2 != 0) {
							System.out.print("#");
						} else {
							System.out.print("*");
						}
					}
					System.out.println();
				}
				break;

			case 3:
				System.out.println("Has salido del programa.");
				break;

			default:
				System.out.println("No has introducido un número válido.");
				break;
			}

		} while (seleccion != 3);

		sc.close();
	}
}