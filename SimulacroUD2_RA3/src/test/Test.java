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
	
		System.out.println("-- Ejercicio 4 --");
		Ejercicios.factorialConSaltos(7, 2);
		Ejercicios.factorialConSaltos(8, 3);
		Ejercicios.factorialConSaltos(5, 1);
		Ejercicios.factorialConSaltos(0, 2);
	}

}
