package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		Integer numeroDeEntradasActual = 0, numeroDeEntradasTotales;
		double entradaInfantil = 15.50, entradaAdulto = 20, descuento = 5, totalPrecio = 0;
		String tipoDeEntrada;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el numero de entradas a comprar: ");
		numeroDeEntradasTotales = sc.nextInt();

		while (numeroDeEntradasActual < numeroDeEntradasTotales) {
			System.out.println("Que tipo de entrada quieres (infantil o adulto): ");
			tipoDeEntrada = sc.next();

			if (tipoDeEntrada.equalsIgnoreCase("infantil")) {
				totalPrecio += entradaInfantil;
			}

			else if (tipoDeEntrada.equalsIgnoreCase("adulto")) {
				totalPrecio += entradaAdulto;
			}

			else {
				System.out.println("No existe ese tipo de entrada.");
			}

			numeroDeEntradasActual++;
		}

		if (totalPrecio >= 100) {
			totalPrecio = totalPrecio - (0.05 * totalPrecio);
			
			System.out.println("Has superado los 100€, por lo que se te ha aplicado un descuento del 5%. \nCon el descuento se te queda en: " + totalPrecio + "€." );
			return;
		}

		System.out.println("Al no alcanzar los 100€, no se te ha aplicacdo ningún descuento. \nEl precio total es de: " + totalPrecio + "€.");
	}

}
