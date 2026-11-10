package ejercicios;

import java.util.ArrayList;
import java.util.List;

import utiles.Utiles;

public class Ejercicios {
	// -- Contador --
	// De los 20 primeros números, ¿cuántos son pares?
	public static Integer cuentaParesDeLos20PrimerosNumeros() {
		Integer res = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				res++;
			}
		}
		return res;
	}

	// Método que me diga cuántos pares hau hasta un entero n pasado como parámetro.

	public static Integer cuentaParesHasta(Integer n) {
		Integer res = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				res++;
			}
		}
		return res;
	}

	// Método que me diga cuántos pares hay entre dos enteros a y b pasados como
	// parámetros. Suponemos que a<b.

	public static Integer cuentaParesEntre(Integer a, Integer b) {
		Integer res = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				res++;
			}
		}
		return res;
	}

	// Método que cuenta cuántos pares tiene una lista que se pasa como parámetro.

	public static Integer cuentaParesEn(List<Integer> lis) {
		Integer res = 0;
		for (int i = 0; i <= lis.size() - 1; i++) {
			Integer e = lis.get(i);
			if (e % 2 == 0) {
				res++;
			}
		}
		return res;
	}

	// Método que cuenta cuántos primos tiene una lista que se pasa como parámetro.

	public static Integer cuentaPrimosEn(List<Integer> lis) {
		Integer res = 0;
		for (int i = 0; i <= lis.size() - 1; i++) {
			Integer e = lis.get(i);
			if (Utiles.esPrimo(e)) {
				res++;
			}
		}
		return res;
	}

	// -- Suma --

	public static Boolean sumaDePrimosPrimo(List<Integer> lis) {
		Boolean res = false;
		Integer suma = 0;
		for (Integer i : lis) {
			if (Utiles.esPrimo(i))
				suma += i;
		}
		if (Utiles.esPrimo(suma)) {
			res = true;
		}
		return res;
	}

	// -- Máximo y/o mínimo --

	public static Boolean tablaCreciente(List<Integer> lis) {
		Boolean res = false;
		for (int i = 0; i < lis.size() - 1; i++) {
			Integer nActual = lis.get(i);
			Integer nAnterior = lis.get(i + 1);
			if (nActual > nAnterior) {
				res = true;
				break;
			}
		}
		return res;
	}

	// -- Ejercicios por mi cuenta --

	public class Persona {
		public List<String> holaSoyManolo(String name, String edad, String pj) {
			List<String> prop = new ArrayList<String>();
			prop.add(name);
			prop.add(edad);
			prop.add(pj);
			return prop;
		}
	}

	public static List<Integer> damePares(Integer n) {
		List<Integer> res = new ArrayList<Integer>();
		Integer suma = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				res.add(i);
				suma += i;
			}
			if (i == n) {
				res.add(suma);
			}
		}
		return res;
	}
}
