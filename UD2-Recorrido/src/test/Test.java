package test;

import java.util.List;

import ejercicios.Ejercicios;

public class Test {
	public static void main(String[] args) {
		System.out.println("-- Ejercicio cuenta de pares hasta el 20 --");
		System.out.println(Ejercicios.cuentaParesDeLos20PrimerosNumeros());
		System.out.println();

		System.out.println("-- Ejercicio cuenta de pares hasta x número --");
		System.out.println(Ejercicios.cuentaParesHasta(20));
		System.out.println();

		System.out.println("-- Ejercicio cuenta de pares entre 2 números dados --");
		System.out.println(Ejercicios.cuentaParesEntre(1, 20));
		System.out.println();

		System.out.println("-- Ejercicio cuenta de pares en una lista --");
		System.out.println(Ejercicios.cuentaParesEn(List.of(5, 7, 3, 8, 7)));
		System.out.println();
		
		System.out.println("-- Ejercicio cuenta de primos en una lista --");
		System.out.println(Ejercicios.cuentaPrimosEn(List.of(5, 7, 3, 8, 7)));
		System.out.println();
		
		System.out.println("-- Ejercicio comprobación si suma de primos en una lista da primo --");
		System.out.println(Ejercicios.sumaDePrimosPrimo(List.of(5, 7, 3, 8, 7)));
		System.out.println();
		
		System.out.println("-- Ejercicio comprobación si una tabla es creciente --");
		System.out.println(Ejercicios.tablaCreciente(List.of(5, 7, 3, 8, 7)));
		System.out.println();
		
		System.out.println("-- Ejercicio primer y ultimo num lista --");
		System.out.println(Ejercicios.tablaCreciente(List.of(5, 7, 3, 8, 7)));
		System.out.println();
		
		System.out.println("-- Ejercicio devolver una lista solo con los pares hasta ese número --");
		System.out.println(Ejercicios.damePares(16));
		System.out.println();

	}
}
