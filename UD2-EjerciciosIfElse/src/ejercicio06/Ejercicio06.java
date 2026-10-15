package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		Integer numero, cifras = 0, comprobacion;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero entre 0 y 99999: ");
		numero = sc.nextInt();
		sc.close();

		comprobacion = Math.abs(numero);

		if (numero == 0)
			cifras = 1;
		else {
			while (comprobacion > 0) {
				comprobacion /= 10;
				cifras++;
			}

	}

		System.out.println(cifras);
	}

}