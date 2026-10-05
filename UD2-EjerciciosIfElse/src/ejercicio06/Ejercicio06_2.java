package ejercicio06;

import java.util.Scanner;

public class Ejercicio06_2 {

	public static void main(String[] args) {

		Integer numero, cifras = 0, comprobacion;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero entre 0 y 99999: ");
		numero = sc.nextInt();
		sc.close();

		if (numero < -99999 || numero > 99999) {
			System.out.println("El número que has introducido no está dentro de los valores.");
		} else {
			comprobacion = numero;

			if (comprobacion > 1 && comprobacion < 9) {
				cifras = 1;
				System.out.println(cifras);
				return;
			} else if (comprobacion > 10 && comprobacion < 99) {
				cifras = 2;
				System.out.println(cifras);
				return;
			} else if (comprobacion > 100 && comprobacion < 999) {
				cifras = 3;
				System.out.println(cifras);
				return;
			} else if (comprobacion > 1000 && comprobacion < 9999) {
				cifras = 4;
				System.out.println(cifras);
				return;
			} else if (comprobacion > 10000 && comprobacion < 99999) {
				cifras = 5;
				System.out.println(cifras);
				return;
			}
		}

	}

}
