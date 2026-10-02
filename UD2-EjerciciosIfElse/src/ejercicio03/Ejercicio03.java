package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Integer anyo = null;
		Integer mes = null;
		Integer dias = null;
		Boolean esBisiesto = false;
		Boolean esValido = false;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el año y el mes respectivamente, separados por un espacio: ");
		anyo = sc.nextInt();
		mes = sc.nextInt();

		if (anyo % 400 == 0 || anyo % 4 == 0 && anyo % 100 != 0) {
			esBisiesto = true;
		}

		if (mes <= 12) {
			esValido = true;
		} else {
			System.out.println("El mes introducido no es válido.");
			return;
		}

		if (esValido) {

			switch (mes) {
			case 4:
			case 6:
			case 9:
			case 11:
				dias = 30;
				break;

			default:
				dias = 31;
				break;

			case 2:
				if (esBisiesto) {
					dias = 29;
					System.out.println("El mes que ha introducido tiene " + dias + " días ya que el mes es febrero y es un año (" + anyo + ") bisiesto.");

				} else {
					dias = 28;
					System.out.println("El mes que ha introducido tiene " + dias + " días ya que el mes es febrero y no es un año (" + anyo + ") bisiesto.");
				}
				return;

			}

		}

		System.out.println("El mes que ha introducido tiene " + dias + " días.");
	}

}