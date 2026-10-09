package ejercicio04;

public class Ejercicio04 {

	public static void main(String[] args) {

		final Integer NUMERO_TOTAL = 10;
		Integer numero = 1;
		Integer sumaImpares = 0;

		for (; numero <= NUMERO_TOTAL; numero++) {
			if (numero % 2 != 0) {
				sumaImpares += numero;
			}
		}
		System.out.println("La suma de los impares entre 1 y 10 es: " + sumaImpares);
	}
}