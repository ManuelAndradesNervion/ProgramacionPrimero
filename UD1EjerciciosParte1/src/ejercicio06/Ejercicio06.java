package ejercicio06;

import java.util.Scanner; //Paquete encargado de regsitrar la entrada.

public class Ejercicio06 {

	public static void main(String[] args) {

		double numero1, numero2, suma, resta, multiplicacion, division; //Distintas variables de tipo double
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer el valor introducido por el usuario.

		System.out.print("Escribe dos números para realizar su suma, resta, multiplicación y división: "); //El sistema escribe en pantalla para que el usuario introduzca numero1 y numero2.
		numero1 = sc.nextDouble(); //El sistema espera a que el usuario escriba el valor de numero1.
		numero2 = sc.nextDouble(); //El sistema espera a que el usuario escriba el valor de numero2.

		suma = numero1 + numero2; //La variable suma toma el valor de la suma de numero1 y numero2.
		multiplicacion = numero1 * numero2; //La variable multiplicacion toma el valor de la multiplicacion de numero1 y numero2.

		if (numero2 >= numero1) { //La condicion if hace que si el valor de la variable numero2>=numero1, entonces el orden de la resta y division cambia.
			resta = numero2 - numero1; //La variable resta toma el valor de la resta de numero2 y numero1.
			division = numero2 / numero1; //La variable division toma el valor de la division de numero2 y numero1.
		} else { //else hace que si numero2>=numero1 no es verdadera, el orden de resta y division no cambia con respecto a la suma y multiplicacion.
			resta = numero1 - numero2; //La variable resta toma el valor de la resta de numero1 y numero2.
			division = numero1 / numero2; //La variable division toma el valor de la division de numero1 y numero2.
		}

		System.out.println("El resultado de la suma es: " + suma); //El sistema escribe en pantalla un texto y al final de este aparece el valor de suma.
		System.out.println("El resultado de la resta es: " + resta); //El sistema escribe en pantalla un texto y al final de este aparece el valor de resta.
		System.out.println("El resultado de la multiplicación es: " + multiplicacion); //El sistema escribe en pantalla un texto y al final de este aparece el valor de multiplicacion.
		System.out.println("El resultado de la división es: " + division); //El sistema escribe en pantalla un texto y al final de este aparece el valor de .
	}
}