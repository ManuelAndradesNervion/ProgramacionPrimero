package ejercicio10;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio10 {

	public static void main(String[] args) {

		Integer numero; //Variable que almacenará el número introducido por el usuario.
		boolean par; //Variable del tipo booleano que indicará si el número es par o no.
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer el valor introducido por el usuario.

		System.out.print("Introduce un número para verificar si es par o impar: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.
		numero = sc.nextInt(); //El sistema espera a que el usuario introduzca un número y le asigna ese valor a la variable numero.

		if (numero % 2 == 0) { //La condición del if comprueba si el resto de dividir numero entre 2 es igual a 0.
			par = true; //Si se cumple la condición, se le asigna el valor true a la variable par.
			System.out.println("El numero es par ya que el resto al dividirlo entre 2 es 0, es decir, par = " + par + "."); //Se muestra en pantalla el resultado junto con el valor de par.
		}
		else { //Si no se cumple la condición del if, entonces se ejecuta else.
			par = false; //Al ser numero distinto de 0, se le asigna el valor false a la variable par.
			System.out.println("El numero es impar ya que el resto al dividirlo entre 2 es distinto de 0, es decir, par = " + par + "."); //Se muestra en pantalla el resultado junto con el valor de par.
		}
	}
}