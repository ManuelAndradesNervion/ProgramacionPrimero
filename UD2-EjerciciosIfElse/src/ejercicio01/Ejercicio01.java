package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Integer numero;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("El numero introducido es par.");
		} else {
			System.out.println("El numero introducido es impar.");
		}
	}

}
