package test;

import ejercicios.Ejercicios;

public class Test {

	public static void main(String[] args) {
		System.out.println("-- Ejercicio 1 --");		
		System.out.println(Ejercicios.precioEntrada(10, "SABADO", true));
		System.out.println(Ejercicios.precioEntrada(35, "LUNES", false));
 		System.out.println(Ejercicios.precioEntrada(66, "VIERNES", true));
		System.out.println(Ejercicios.precioEntrada(-1, "LUNES", false));

		System.out.println("-- Ejercicio 2 --");		
		Ejercicios.dibujarZ(5);
		
		System.out.println("-- Ejercicio 3 --");
		System.out.println(Ejercicios.sumaPrimerosEspeciales(1, 10, 3));
		System.out.println(Ejercicios.sumaPrimerosEspeciales(1, 10, 5));
		System.out.println(Ejercicios.sumaPrimerosEspeciales(8, 15, 2));
		System.out.println("-- Ejercicio 4 --");

	}

}
