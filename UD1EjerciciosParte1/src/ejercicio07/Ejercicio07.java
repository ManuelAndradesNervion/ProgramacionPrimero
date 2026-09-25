package ejercicio07;

import java.util.Scanner; //Paquete encargado de regsitrar la entrada.

public class Ejercicio07 {

	public static void main(String[] args) {
		
		String nombre, direccion; //Variables de tipo String.
		Integer telefono; //Variable de tipo Integer.
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer el valor introducido por el usuario.
		
		System.out.print("Escribe tu nombre: "); //El sistema imprime en pantalla para que el usuario sepa qué debe escribir.
		nombre = sc.nextLine(); //El sistema espera a que el usuario escriba su dirección. En este caso, sólo la leera si es del tipo string, es decir, texto.
		
		System.out.print("Escribe tu dirección: "); //El sistema imprime en pantalla para que el usuario sepa qué debe escribir.
		direccion = sc.nextLine(); //El sistema espera a que el usuario escriba su dirección. En este caso, sólo la leera si es del tipo string, es decir, texto.
		
		System.out.print("Escribe tu teléfono: "); //El sistema imprime en pantalla para que el usuario sepa qué debe escribir.
		telefono = sc.nextInt(); //El sistema espera a que el usuario escriba su número de teléfono.
		
		System.out.println("Nombre: " + nombre); //El sistema imprime en pantalla un mensaje + el nombre escrito anteriormente por el usuario.
		System.out.println("Dirección: " + direccion); //El sistema imprime en pantalla un mensaje + la dirección escrita anteriormente por el usuario.
		System.out.println("Teléfono: "+ telefono); //El sistema imprime en pantalla un mensaje + el teléfono escrito anteriormente por el usuario.
	}

}