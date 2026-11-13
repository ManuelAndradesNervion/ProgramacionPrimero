package ejercicios;

import java.util.List;

public class Ejercicios {
	public static boolean puedeCruzarPuente(Integer puntos, String dificultad, boolean amuleto, boolean guia) {
		Boolean res = false;
		Integer minPuntos = 0;
		Integer puntosAmuleto = 3;
		Integer puntosGuia = 2;
		Integer puntosTotales = puntos;
		switch (dificultad) {
		case "FACIL":
			minPuntos = 8;
			if (amuleto) {
				puntosTotales += puntosAmuleto;
			}
			if (guia) {
				puntosTotales += puntosGuia;
			}
			if (puntosTotales > minPuntos) {
				res = true;
			} else {
				res = false;
			}
			break;
		case "MEDIA":
			minPuntos = 10;
			if (amuleto) {
				puntosTotales += puntosAmuleto;
			}
			if (guia) {
				puntosTotales += puntosAmuleto;
			}
			if (puntosTotales > minPuntos) {
				res = true;
			} else {
				res = false;
			}
			break;
		case "DIFICIL":
			minPuntos = 15;
			if (amuleto) {
				puntosTotales += puntosAmuleto;
			}
			if (guia) {
				puntosTotales += puntosAmuleto;
			}
			if (puntosTotales > minPuntos) {
				res = true;
			} else {
				res = false;
			}
			break;

		default:
			System.out.println("La dificultad introducida no es válida.");
			break;
		}
		return res;
	}

	public static Integer gemasNecesarias(List<Integer> valores, Integer objetivo) {
		Integer res = 0;
		Integer i = 0;
		Integer totalGemas = 0;
		if (valores.size() > 0) {
			while (i < valores.size()) {
				if (objetivo <= 0) {
					res = 0;
					break;
				} else {
					totalGemas += valores.get(i);
					res++;
				}
				if (totalGemas >= objetivo) {
					break;
				}
				i++;
			}
		}
		return res;
	}

	public static void dibujarTablero(Integer lado) {
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("#");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}

	}

	public static Integer primeraChispa(List<Integer> intensidades, Integer diferenciaMinima) {
		Integer res = -1;
		if (intensidades.size() >= 2) {
			for (int i = 1; i < intensidades.size(); i++) {
				Integer posActual = intensidades.get(i);
				Integer posAnterior = intensidades.get(i - 1);
				if ((posActual - posAnterior) > diferenciaMinima) {
					res = i;
					break;
				}
			}
		} else {
			res = -1;
		}
		return res;
	}

	public static Integer pasosColapso(Integer n) {
		if (n == 1) {
			return 0;
		} else {
			if (n % 2 == 0) { // par
				return 1 + pasosColapso(n / 2);
			} else { // impar
				return 1 + pasosColapso((n * 3) + 1);
			}
		}

	}
}