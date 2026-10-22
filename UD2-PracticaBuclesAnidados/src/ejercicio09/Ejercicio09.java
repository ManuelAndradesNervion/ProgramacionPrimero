package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		Integer n;
		Scanner sc = new Scanner(System.in);

		System.out.print("Filas y columnas: ");
		n = sc.nextInt();

		for (int y = 0; y < n; y++) {
			for (int x = 0; x < 2 * n - 1; x++) {
				if (x >= n - y - 1 && x <= n + y - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int y = n - 2; y >= 0; y--) {
			for (int x = 0; x < 2 * n - 1; x++) {
				if (x >= n - y - 1 && x <= n + y - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		sc.close();
	}
}