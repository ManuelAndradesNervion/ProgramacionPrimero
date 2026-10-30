package ejercicios;

import java.util.Iterator;

public class Ejercicios {

	public static Integer precioEntrada(Integer edad, String dia, Boolean socio) {

		Integer precio = 0;

		switch (dia) {
		case "LUNES":
		case "MARTES":
		case "MIÉRCOLES":
		case "MIERCOLES":
		case "JUEVES":
			precio = 8;
			if (edad < 0) {
				precio = -1;
			} else if (edad < 12 || edad >= 65) {
				precio = precio - 3;

			}
			if (socio == true) {
				precio = precio - 2;
			}

			break;
		case "VIERNES":
			precio = 10;
			if (edad < 0) {
				precio = -1;
			} else if (edad < 12 || edad >= 65) {
				precio = precio - 3;

			}
			if (socio == true) {
				precio = precio - 2;
			}
			break;
		case "SÁBADO":
		case "SABADO":
		case "DOMINGO":
			precio = 12;
			if (edad < 0) {
				precio = -1;
			} else if (edad < 12 || edad >= 65) {
				precio = precio - 3;

			}
			if (socio == true) {
				precio = precio - 2;
			}
			break;
		}

		return precio;
	}

	public static void dibujarZ(Integer lado) {

		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				if (i == 0 || i == lado - 1 || j + i == lado - 1) {
					System.out.print("*"); // Esta línea hace que se imprima en pantalla según las condiciones del if,
											// que i sea 0 (la primera fila ) o que i sea un número menos que el numero
											// introducido (la última fila) o que la suma de j + i sea la longitud de
											// lado menos un número (la diagonal).
				} else {
					System.out.print(" "); // Si no se dan las condiciones del if, entonces se ejecutará el else, que su
											// funcion en este código es que los * que tienen
				}
			}
			System.out.println();
		}
	}

	public static Integer factorialConSaltos(Integer numero, Integer salto) {
		Integer num = 0;

		if (numero == 0) {
			num = 1;
			return num;
		} else if (numero != 0) {
			num = numero * factorialConSaltos(numero - salto, salto);
		}
		return num;
	}
}
