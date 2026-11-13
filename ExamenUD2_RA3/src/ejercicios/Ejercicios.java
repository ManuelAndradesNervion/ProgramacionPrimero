package ejercicios;

import java.util.List;

public class Ejercicios {
	// Ejercicio 1
	public static String clasificarTriangulo(Integer a, Integer b, Integer c) {
		String res = "";
		if ((a + b) > c) {
			if ((c * c) == (a * a) + (b * b)) {
				return res = "RECTÁNGULO";
			}
			if (a == b && a == c && b == c) {
				return res = "EQUILATERO";
			}
			if (a == b || a == c || b == c) {
				return res = "ISÓSCELES";
			}
			if (a != b && a != c && b != c) {
				res = "ESCALENO";
			}
		} else {
			res = "INVALIDO";
		}
		return res;
	}

	// Ejercicio 2
	public static void trianguloAlterno(Integer n) {
		for (int i = 0; i < n; i++) { // este bucle for se encarga de las filas del dibujo.
			for (int j = 0; j < n; j++) { // este bucle for se encarga de las columnas del dibujo

				if (i < j) { // este bucle if es el encargado de que no se dibuje nada en pantalla mientras
								// que la condicion del if sea cierta.
					System.out.print(" ");
				} else if ((i + j) % 2 == 0) { // este bucle else if + el else de abajo son el encargado de la
												// alternancia de los 1 y 0.
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println(); // esta línea se encarga del salto de línea una vez se ha llegado al final de j.
		}

	}

	// Ejercicio 3
	public static Integer primeroConDivisores(Integer inicio, Integer fin, Integer minimoDivisores) {
		Integer res = 0;
		for (inicio = 0; inicio < fin; inicio++) {
			res = inicio;
		}
		return res;
	}

	// Ejercicio 4
	public static Integer tribonacci(Integer n) {
		if (n < 0 || n > 12) { // condición que comprueba si n está dentro del margen de los números válidos.
			System.out.println("El número " + n + " no es válido.");
		} else { // si n está dentro del margen, entonces realiza el contenido del else
			if (n == 0) { // casos bases
				return 0;
			} else if (n == 1) { // casos bases
				return 1;
			} else if (n == 2) { // casos bases
				return 1;
			} else if (n > 2) { // caso que se encarga de la recursividad
				n = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
			}
		}
		return n;
	}

	// Ejercicio 5
	public static Boolean esCasiCreciente(List<Integer> datos) {
		Boolean res = true;
		Integer contadorRupturas = 0;
		for (int i = 1; i < datos.size(); i++) {
			Integer numero2 = datos.get(i);
			Integer numero1 = datos.get(i - 1);

			if (numero1 >= numero2) {
				contadorRupturas++;
				if (contadorRupturas >= 2) {
					res = false;
				}
			}

		}
		return res;
	}

	// Ejercicio 7
	public static Boolean alternatesEvenOdd(List<Integer> numbers) {
		Boolean sol = false;

		if (numbers.isEmpty() || numbers.size() < 2) {
			sol = true;
		} else {
			for (int i = 1; i < numbers.size(); i++) {
				Integer number2 = numbers.get(i);
				Integer number1 = numbers.get(i - 1);
				if ((number2 % 2 == 0 && number1 % 2 != 0) || (number2 % 2 != 0 && number1 % 2 == 0)) {
					sol = true;
				} else {
					sol = false;
					break;
				}
			}
		}
		return sol;
	}
}