package test;

import java.util.List;

import ejercicios.Ejercicios;

public class test {
	public static void main(String[] args) {
		System.out.println("-- Ejercicio 1 --");
		System.out.println(Ejercicios.puedeCruzarPuente(3, "FACIL", true, false));
		System.out.println(Ejercicios.puedeCruzarPuente(7, "MEDIA", false, true));
		System.out.println(Ejercicios.puedeCruzarPuente(10, "DIFICIL", true, true));
		System.out.println(Ejercicios.puedeCruzarPuente(20, "IMPOSIBLE", true, true));
		System.out.println();

		System.out.println("-- Ejercicio 2 --");
		System.out.println(Ejercicios.gemasNecesarias(List.of(3, 5, 4, 2), 10));
		System.out.println(Ejercicios.gemasNecesarias(List.of(1, 1, 1), 10));
		System.out.println(Ejercicios.gemasNecesarias(List.of(), 5));
		System.out.println(Ejercicios.gemasNecesarias(List.of(5, 5), 0));
		System.out.println();

		System.out.println("-- Ejercicio 3 --");
		Ejercicios.dibujarTablero(4);
		System.out.println();

		System.out.println("-- Ejercicio 4 --");
		System.out.println(Ejercicios.primeraChispa(List.of(2, 3, 4, 9, 5), 3));
		System.out.println(Ejercicios.primeraChispa(List.of(2, 3, 4), 5));
		System.out.println(Ejercicios.primeraChispa(List.of(5), 2));
		System.out.println();
		
		System.out.println("-- Ejercicio 5 --");
		System.out.println(Ejercicios.pasosColapso(1));
		System.out.println(Ejercicios.pasosColapso(2));
		System.out.println(Ejercicios.pasosColapso(6));
		System.out.println();
	}
}
