package ejercicio13;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio13 {

	public static void main(String[] args) {

		boolean estaLloviendo, tareasRealizadas, biblioteca, puedoSalirALaCalle = false; //Variables booleanas; puedoSalirALaCalle se inicializa en false por defecto.
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer los valores introducidos por el usuario.

		System.out.print("Indica sí está lloviendo mediante true o false: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.
		estaLloviendo = sc.nextBoolean(); //El sistema espera a que el usuario introduzca true o false y le asigna ese valor a estaLloviendo.

		System.out.print("Indica si las tareas están realizadas mediante true o false: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.
		tareasRealizadas = sc.nextBoolean(); //El sistema espera a que el usuario introduzca true o false y le asigna ese valor a tareasRealizadas.

		System.out.print("Indica si hay que ir a la biblioteca mediante true o false: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.
		biblioteca = sc.nextBoolean(); //El sistema espera a que el usuario introduzca true o false y le asigna ese valor a biblioteca.

		if ((estaLloviendo == false && tareasRealizadas == true) || biblioteca == true) { //Se entra aquí si no llueve y las tareas están hechas, O si hay que ir a la biblioteca (independientemente de lo anterior).
			if (biblioteca == true) { //Dentro del caso anterior, se comprueba específicamente si el motivo es ir a la biblioteca.
				puedoSalirALaCalle = true; //El boolean puedoSalirALaCalle pasa a ser true.
				System.out.println("Puedes ir a la calle para ir a la biblioteca. Biblioteca = " + biblioteca + ". Entonces, puedoSalirALaCalle = " + puedoSalirALaCalle); //Se muestra el mensaje correspondiente al caso de la biblioteca.
				return; //Se termina la ejecución del método aquí, para que no se reproduzcan las líneas siguientes.
			}
			puedoSalirALaCalle = true; //Si no se ha entrado en el if de biblioteca (y por tanto no se ha hecho return), se asigna true porque no llueve y las tareas están hechas.
			System.out.println("Puedes salir a la calle. puedoSalirALaCalle = " + puedoSalirALaCalle); //Se muestra el mensaje de que se puede salir, junto con el valor de la variable.
		} else { //Si no se cumple ninguna de las condiciones del if exterior, se ejecuta el contenido de else.
			puedoSalirALaCalle = false; //puedoSalirALaCalle pasa a ser false ya que está lloviendo, no tengo realizadas las tareas o no tengo que ir a la biblioteca.
			System.out.println("No puedes salir a la calle. puedoSalirALaCalle = " + puedoSalirALaCalle); //Se muestra el mensaje de que no se puede salir, junto con el valor de la variable.
		}
	}
}