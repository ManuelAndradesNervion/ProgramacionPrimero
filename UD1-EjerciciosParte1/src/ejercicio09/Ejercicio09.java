package ejercicio09;

import java.util.Scanner; //Paquete encargado de regsitrar la entrada.

public class Ejercicio09 {

	public static void main(String[] args) {
		
		byte edad; //Variable del tipo byte.
		boolean mayorDeEdad; //Variable del tipo booleano.
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer el valor introducido por el usuario.
		
		System.out.print("Introduce tu edad para verificar si eres mayor de edad: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.
		edad = sc.nextByte(); //El sistema espera a que el usuario introduzca su edad y le añade un valor a  la variable edad.
		
		if (edad<18) { //La condición de if funciona tal que así: dependiendo si edad<18, mayorDeEdad = false. Además escribe y muestra en pantalla un texto acorde a esos datos.
			mayorDeEdad = false; //La variable mayorDeEdad toma valor de false al ser edad<18.
			System.out.println("Teniendo " + edad + " años, no eres mayor de edad.\nPor lo tanto: " + mayorDeEdad); //El sistema escribe en pantalla la edad del usuario y le muestra que no es mayor de edad.
		}
		else { //Si no se da la condición del if anterior, entonces mayorDeEdad = true, por lo que escribe y muestra en pantalla un texto acorde a esos datos.
			mayorDeEdad = true; //La variable mayorDeEdad toma valor de true al ser edad>=18.
			System.out.println("Teniendo " + edad + " años, eres mayor de edad.\nPor lo tanto: " + mayorDeEdad); //El sistema escribe en pantalla la edad del usuario y le muestra que es mayor de edad.
		}
	}

}