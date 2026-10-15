package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Integer numeroA, numeroB, numeroC;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce 3 números para comprobar cuál es el mayor.");
		System.out.print("Introduce el primer número: ");
		numeroA = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		numeroB = sc.nextInt();
		System.out.print("Introduce el tercer número: ");
		numeroC = sc.nextInt();
		sc.close();

		if (numeroA > numeroB && numeroA > numeroC) {
			System.out.print("El numero mayor es " + numeroA + ".");
		} else if (numeroB > numeroA && numeroB > numeroC) {
			System.out.print("El numero mayor es " + numeroB + ".");
		} else if (numeroC > numeroA && numeroC > numeroB) {
			System.out.println("El numero mayor es " + numeroC + ".");
		}
	}

}
