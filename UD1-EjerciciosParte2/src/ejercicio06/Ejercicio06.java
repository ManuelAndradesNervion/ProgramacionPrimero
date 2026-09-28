package ejercicio06;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio06 {

	public static void main(String[] args) {

		double milimetros, centimetros, metros, resultado; //Variables para las tres distancias introducidas y el resultado final de la suma.
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer los valores introducidos por el usuario.

		System.out.println("Introduce a continuación los milímetros, centímetros y metros para su posterior suma\n(el programa realiza la conversión automáticamente)"); //El sistema escribe en pantalla para que el usuario sepa qué debe introducir y que no necesita convertir él mismo las unidades.

		System.out.print("Introduce los milímetros: "); //Se pide específicamente el valor en milímetros.
		milimetros = sc.nextDouble(); //El sistema espera a que el usuario introduzca los milímetros y los asigna a la variable milimetros.
		System.out.print("Introduce los centímetros: "); //Se pide específicamente el valor en centímetros.
		centimetros = sc.nextDouble(); //El sistema espera a que el usuario introduzca los centímetros y los asigna a la variable centimetros.
		System.out.print("Introduce los metros: "); //Se pide específicamente el valor en metros.
		metros = sc.nextDouble(); //El sistema espera a que el usuario introduzca los metros y los asigna a la variable metros.
		sc.close(); //Se cierra el Scanner, ya que no se necesita leer nada más del usuario a partir de aquí.
		
		if(milimetros < 1 || centimetros < 1 || metros < 1) { //si se da una de las condiciones del if, entonces se ejecuta.
			System.out.println("Has introducido erróneamente un valor."); //Escribe en pantalla para informar que el usuario ha escrito un valor erróneamente.
		}
		else { //si no se da ninguna de las condiciones del if, entonces ejecuta el else.
			milimetros = milimetros * 0.10; //Se convierten los milímetros a centímetros (dividiendo entre 10, equivalente a multiplicar por 0.10).
			metros = metros * 100; //Se convierten los metros a centímetros (multiplicando por 100).

			resultado = metros + centimetros + milimetros; //Se suman las tres distancias, ya todas en la misma unidad (centímetros).

			System.out.println("La suma de todos los valores da: " + resultado + " centímetros."); //Se muestra en pantalla el resultado total de la suma en centímetros.
		}
	}
}