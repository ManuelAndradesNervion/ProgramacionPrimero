package test;

import java.util.List;

import ejercicios.Ejercicios;

public class TestEjercicios {

	public static void main(String[] args) {
		System.out.println("-- Ejercicio 1 --");
		System.out.println(Ejercicios.puedeEntrar(15, false, "Vampiro"));
		System.out.println(Ejercicios.puedeEntrar(16, true, "lobo"));
		System.out.println(Ejercicios.puedeEntrar(17, false, "zombie"));
		System.out.println();

		System.out.println("-- Ejercicio 2 --");
		System.out.println(Ejercicios.promedioMagia(List.of(2, 5, 8, 4, 8)));
		System.out.println(Ejercicios.promedioMagia(List.of(1, 2, 4)));
		System.out.println();

		System.out.println("-- Ejercicio 3 --");
		System.out.println(Ejercicios.pasosLaberinto(List.of(10, 5, 12, -3, 8)));
		System.out.println(Ejercicios.pasosLaberinto(List.of(-1, 5, 5)));
		System.out.println();
		
		System.out.println("-- Ejercicio 4 --");
		System.out.println(Ejercicios.fibonacci(0));
		System.out.println(Ejercicios.fibonacci(4));
		System.out.println(Ejercicios.fibonacci(6));
		System.out.println();
	}
}
