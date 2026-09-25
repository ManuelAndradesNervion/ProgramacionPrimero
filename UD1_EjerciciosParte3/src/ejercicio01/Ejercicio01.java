package ejercicio01;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio01 {

	public static void main(String[] args) {

		Integer ano; //Variable que almacenará el año introducido por el usuario.
		boolean esBisiesto; //Variable booleana que indicará si el año es bisiesto o no.
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer el valor introducido por el usuario.

		System.out.print("Introduce un año para ver si es bisiesto: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.
		ano = sc.nextInt(); //El sistema espera a que el usuario introduzca un año y lo asigna a la variable ano.
		sc.close(); //Se cierra el Scanner, ya que no se necesita leer nada más del usuario a partir de aquí.

		esBisiesto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0); //Se calcula si el año es bisiesto: es bisiesto si es divisible entre 400, o si es divisible entre 4 pero no entre 100.

		if (esBisiesto) { //Si esBisiesto es true, se ejecuta el contenido del if.
			System.out.println("El " + ano + " es bisiesto, es decir, esBisiesto = " + esBisiesto); //Se muestra el mensaje indicando que sí es bisiesto, junto con el valor de la variable.
		} else { //Si esBisiesto es false, se ejecuta el else.
			System.out.println("El " + ano + " no es bisiesto, es decir, esBisiesto = " + esBisiesto); //Se muestra el mensaje indicando que no es bisiesto, junto con el valor de la variable.
		}
	}
}