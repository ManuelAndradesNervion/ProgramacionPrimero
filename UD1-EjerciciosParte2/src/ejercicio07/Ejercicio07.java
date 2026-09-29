package ejercicio07;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio07 {

	public static void main(String[] args) {

		Integer numeroDeEntradasActual = 0, numeroDeEntradasTotales; //Contador de entradas ya gestionadas (empieza en 0) y número total de entradas que el usuario quiere comprar.
		double entradaInfantil = 15.50, entradaAdulto = 20, totalPrecio = 0; //Precios fijos de cada tipo de entrada, y el precio total acumulado (empieza en 0).
		String tipoDeEntrada; //Variable que almacenará el tipo de entrada que el usuario indica en cada vuelta del bucle.
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer los valores introducidos por el usuario.

		System.out.print("Introduce el numero de entradas a comprar: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.
		numeroDeEntradasTotales = sc.nextInt(); //El sistema espera a que el usuario introduzca el número total de entradas y lo asigna a numeroDeEntradasTotales.

		while (numeroDeEntradasActual < numeroDeEntradasTotales) { //Mientras no se hayan gestionado todavía todas las entradas...
			System.out.println("Que tipo de entrada quieres (infantil o adulto): "); //...se pregunta el tipo de la entrada actual.
			tipoDeEntrada = sc.next(); //El sistema espera a que el usuario escriba el tipo de entrada y lo asigna a tipoDeEntrada.

			if (tipoDeEntrada.equalsIgnoreCase("infantil")) { //Si el tipo introducido es "infantil" (sin distinguir mayúsculas/minúsculas)...
				totalPrecio += entradaInfantil; //...se suma el precio de una entrada infantil al total.
				numeroDeEntradasActual++; //...y se avanza el contador, ya que esta entrada ha quedado gestionada.

			}

			else if (tipoDeEntrada.equalsIgnoreCase("adulto")) { //Si el tipo introducido es "adulto"...
				totalPrecio += entradaAdulto; //...se suma el precio de una entrada de adulto al total.
				numeroDeEntradasActual++; //...y se avanza el contador, ya que esta entrada ha quedado gestionada.

			}

			else { //Si el tipo introducido no es ni "infantil" ni "adulto"...
				System.out.println("No existe ese tipo de entrada."); //...se informa del error, y como no se incrementa el contador, se volverá a preguntar por esta misma entrada.
			}
		}
		sc.close(); //Se cierra el Scanner aquí, justo después del bucle, ya que a partir de este punto no se necesita seguir leyendo nada más del usuario, sea cual sea el resultado final.

		if (totalPrecio >= 100) { //Si el precio total acumulado alcanza o supera los 100€...
			totalPrecio = totalPrecio - (0.05 * totalPrecio); //...se le resta un 5% de descuento al precio total.

			System.out.println("Has superado los 100€, por lo que se te ha aplicado un descuento del 5%. \nCon el descuento se te queda en: " + totalPrecio + "€."); //Se informa del descuento aplicado y del precio final con descuento.
			return; //Se termina la ejecución del método aquí, sin llegar al resto del código.
		}

		System.out.println("Al no alcanzar los 100€, no se te ha aplicacdo ningún descuento. \nEl precio total es de: " + totalPrecio + "€."); //Se muestra en pantalla que no ha habido descuento y el precio total final.
	}

}