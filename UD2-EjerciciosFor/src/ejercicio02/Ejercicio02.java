package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		Integer numMultiplos = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				numMultiplos++;
			}

		}
		System.out.println("Entre 1 y " + num + " hay " + numMultiplos + " multilplos de 3.");
		sc.close();
	}

}