package ejercicio08;

import java.util.Scanner; //Paquete encargado de regsitrar la entrada.

public class Ejercicio08 {

	public static void main(String[] args) {
		
		String nombre; //Variable de tipo String llamada nombre.
		Integer edad; //Variable de tipo integrer llamada edad.
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer el valor introducido por el usuario.
		
		System.out.print("Escribe tu nombre: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.
		nombre = sc.next(); //El sistema espera a que el usuario introduzca su nombre.
		
		System.out.print("Escribe tu edad: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.
		edad = sc.nextInt(); //El sistema espera a que el usuario introduzca su edad. Al ser sc.nextInt() sólo la leerá si es introducido por números.

		if (edad>=18) { //La condición if hace que dependiendo de que si la edad introducida es menor o mayor o igual que 18, imprimirá en pantalla un texto distinto.
			System.out.println("¡Hola " + nombre + ", qué grande estás! \n¡Ya tienes " + edad + " años!\n"); //Texto escrito en pantalla al ser edad>=18. El \n hace un salto de línea sin tener que realizar otro syso.
		}
		else { //else hace que si edad es menor a 18, entonces se ejecutan las líneas de código en el interior de else.
			System.out.println("¡Hola " + nombre + ", has crecido bastante! \nPero todavía te queda mucho por crecer pues tienes " + edad + " años.\n" ); //Texto escrito en pantalla al ser edad<18. El \n hace un salto de línea sin tener que realizar otro syso.
		}
	}

}
