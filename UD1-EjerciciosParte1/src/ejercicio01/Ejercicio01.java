package ejercicio01;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio01 {

	public static void main(String[] args) {
		Integer x; //Variable que registrará el número introducido.
		
		System.out.print("Introduce un número: "); //El sistema escribe en pantalla para que el usuario escriba un número.
		
		Scanner sc = new Scanner(System.in); //La clase Scanner permite leer el número introducido.
		x = sc.nextInt(); //El número introducido solo puede ser leído si es un número entero. El valor introducido será el nuevo valor de x.
		
		System.out.println("El numero introducido es: " + x); //El sistema escribe en pantalla "El número introducidoaes: " y el valor de la variable x.
	}

}
