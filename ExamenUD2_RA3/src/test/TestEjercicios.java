package test;

import java.util.List;

import ejercicios.Ejercicios;

public class TestEjercicios {

	public static void main(String[] args) {
		System.out.println("-- Ejercicio 1 --");
		System.out.println(Ejercicios.clasificarTriangulo(3, 4, 5));
		System.out.println(Ejercicios.clasificarTriangulo(5, 5, 5));
		System.out.println(Ejercicios.clasificarTriangulo(5, 5, 8));
		System.out.println(Ejercicios.clasificarTriangulo(4, 6, 9));
		System.out.println(Ejercicios.clasificarTriangulo(2, 2, 4));
		System.out.println();

		System.out.println("-- Ejercicio 2 --");
		Ejercicios.trianguloAlterno(5);
		System.out.println();

		System.out.println("-- Ejercicio 3 --");
		System.out.println(Ejercicios.primeroConDivisores(10, 20, 4));
		System.out.println(Ejercicios.primeroConDivisores(2, 10, 3));
		System.out.println(Ejercicios.primeroConDivisores(13, 13, 2));
		System.out.println(Ejercicios.primeroConDivisores(10, 10, 3));
		System.out.println();

		System.out.println("-- Ejercicio 4 --");
		System.out.println(Ejercicios.tribonacci(0));
		System.out.println(Ejercicios.tribonacci(1));
		System.out.println(Ejercicios.tribonacci(2));
		System.out.println(Ejercicios.tribonacci(3));
		System.out.println(Ejercicios.tribonacci(5));
		System.out.println(Ejercicios.tribonacci(7));
		System.out.println(Ejercicios.tribonacci(14));
		System.out.println();

		System.out.println("-- Ejercicio 5 --");
		System.out.println(Ejercicios.esCasiCreciente(List.of(2, 4, 6, 8)));
		System.out.println(Ejercicios.esCasiCreciente(List.of(2, 5, 3, 7, 9)));
		System.out.println(Ejercicios.esCasiCreciente(List.of(2, 5, 3, 7, 4)));
		System.out.println(Ejercicios.esCasiCreciente(List.of(1, 3, 3, 5)));
		System.out.println(Ejercicios.esCasiCreciente(List.of(3, 4, 8, 5))); // prueba mía numero 1
		System.out.println(Ejercicios.esCasiCreciente(List.of(8, 3, 1, 5))); // prueba mía numero 2
		System.out.println();

		System.out.println("-- Ejercicio 7 --");
		System.out.println(Ejercicios.alternatesEvenOdd(List.of(2, 3, 8, 5)));
		System.out.println(Ejercicios.alternatesEvenOdd(List.of(1, 4, 7, 10)));
		System.out.println(Ejercicios.alternatesEvenOdd(List.of(2, 3, 5, 8)));
		System.out.println(Ejercicios.alternatesEvenOdd(List.of(2, 4, 7, 8)));
		System.out.println(Ejercicios.alternatesEvenOdd(List.of(3)));
		System.out.println(Ejercicios.alternatesEvenOdd(List.of()));
	}

}
