package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Integer ano;
		boolean esBisiesto;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un año para ver si es bisiesto: ");
		ano = sc.nextInt();
		sc.close();

		esBisiesto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);

		if (esBisiesto) {
			System.out.println("Es bisiesto el año " + ano);
		} else {
			System.out.println("No es bisiesto el año " + ano);
		}
	}
}
