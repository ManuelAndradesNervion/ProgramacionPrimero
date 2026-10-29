package ejercicios;

import java.util.Iterator;
import java.util.List;
import utiles.Utiles;

public class Ejercicios {

	// 1. Sumar una lista mediante for-each.
	public static Integer suma1(List<Integer> numeros) {
		Integer suma = 0;

		for (Integer numero : numeros) {
			suma += numero;
		}

		return suma;
	}

	// 2. Sumar una lista mediante for clásico (con índice).
	public static Integer suma2(List<Integer> numeros) {
		Integer suma = 0;

		for (int i = 0; i < numeros.size(); i++) {
			suma += numeros.get(i);
		}

		return suma;
	}

	// 3. Sumar una lista mediante while.
	public static Integer suma3(List<Integer> numeros) {
		Integer suma = 0;
		int i = 0;

		while (i < numeros.size()) {
			suma += numeros.get(i);
			i++;
		}

		return suma;
	}

	// 4. Contar los números pares, incluido el 0.
	public static Integer contarPares(List<Integer> numeros) {
		Integer contador = 0;

		for (Integer numero : numeros) {
			if (numero % 2 == 0) {
				contador++;
			}
		}

		return contador;
	}

	// 5. Contar los números primos mediante la clase Utiles.
	public static Integer contarPrimos(List<Integer> numeros) {
		Integer contador = 0;

		for (Integer numero : numeros) {
			if (Utiles.esPrimo(numero)) {
				contador++;
			}
		}

		return contador;
	}

	// 6. Contar los números perfectos mediante la clase Utiles.
	public static Integer contarPerfectos(List<Integer> numeros) {
		Integer contador = 0;

		for (Integer numero : numeros) {
			if (Utiles.esPerfecto(numero)) {
				contador++;
			}
		}

		return contador;
	}

	// 7. Calcular la media mediante for-each.
	public static Double media1(List<Integer> numeros) {

		Integer suma = 0;
		for (Integer numero : numeros) {
			suma += numero;
		}

		return (double) suma / numeros.size();
	}

	// 8. Calcular la media mediante for clásico.
	public static Double media2(List<Integer> numeros) {

		Integer suma = 0;
		for (int i = 0; i < numeros.size(); i++) {
			suma += numeros.get(i);
		}

		return (double) suma / numeros.size();
	}

	// 9. Calcular la media mediante while.
	public static Double media3(List<Integer> numeros) {

		Integer suma = 0;
		int i = 0;
		while (i < numeros.size()) {
			suma += numeros.get(i);
			i++;
		}

		return (double) suma / numeros.size();
	}

	// TODO Hacer aquí los ejercicios del examen
	// los haremos con distintos bucles

	// Ejercicio 1
	public static boolean puedeEntrar(Integer edad, boolean acompanado, String criatura) {

		boolean res = false;
		if (criatura.equalsIgnoreCase("Vampiro")) {
			return res = true;
		} else if (edad >= 18 || acompanado == true) {
			return res = true;
		}
		return res;
	}

	// Ejercicio 2

	public static Integer cuentaCaramelos(List<String> caramelos, String tipo) {
		Integer numeroCaramelos = 0;
		for (int i = 0; i < caramelos.size(); i++) {
			String tipoCaramelo = caramelos.get(i);
			if (tipoCaramelo.equalsIgnoreCase(tipo)) {
				numeroCaramelos++;
			}
		}
		return numeroCaramelos;
	}

	// Ejercicio 3

	public static Integer pasosLaberinto(List<Integer> recorrido) {
		Integer suma = 0;
		Integer i = 0;
		while (i < recorrido.size()) {
			if (recorrido.get(i) > 0) {
				suma += recorrido.get(i);
			} else {
				break;
			}
			i++;
		}
		return suma;
	}

	// Ejercicio 4

	public static Double promedioMagia(List<Integer> niveles) {
		Integer nivel = 0;
		Integer suma = 0;
		Double media = null;
		Integer division = 0;
		for (int i = 0; i < niveles.size(); i++) {
			nivel = niveles.get(i);
			if (nivel >= 5) {
				suma += nivel;
				division++;
			}
		}
		media = (double) suma / division;
		media = (double) Math.round((media) * 100) / 100;
		return media;
	}
}