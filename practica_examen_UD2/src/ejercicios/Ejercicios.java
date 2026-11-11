package ejercicios;

import java.util.List;

public class Ejercicios {

	public static boolean puedeEntrar(Integer edad, Boolean vaAcompanado, String criatura) {
		Boolean res = false;
		if (criatura.equalsIgnoreCase("Vampiro")) {
			res = true;
			return res;
		} else if (edad >= 18 || vaAcompanado == true) {
			res = true;
			return res;
		} else {
			res = false;
		}
		return res;
	}

	public static Double promedioMagia(List<Integer> niveles) {
		Double res = 0.0;
		Integer contador = 0;
		Integer suma = 0;
		Double media = 0.0;
		for (Integer nivel : niveles) {
			if (nivel >= 5) {
				contador++;
				suma += nivel;
			}
		}
		if (contador > 0) {
			media = (double) suma / contador;
			res = media;
		} else {
			res = 0.0;
			return res;
		}
		return res;
	}

	public static Integer pasosLaberinto(List<Integer> pasos) {
		Integer res = 0;
		Integer i = 0;
		Integer pasosTotales = 0;

		while (i < pasos.size()) {
			if (pasos.get(i) < 0) {
				break;

			} else {
				pasosTotales += pasos.get(i);
			}
			i++;
		}
		res = pasosTotales;
		return res;
	}

	public static Long fibonacci(Integer n) {
		Long res = 0L;
		if (n == 0) {
			return res;
		} else if (n == 1) {
			res = 1L;
			return res;
		} else {
			res = fibonacci(n - 1) + fibonacci(n - 2);
			return res;
		}
	}
}
