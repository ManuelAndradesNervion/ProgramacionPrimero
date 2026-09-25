package ejercicio12;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio12 {

	public static void main(String[] args) {

		double kilosManzanas, kilosPeras, dineroGanadoManzanas, dineroGanadoPeras, dineroTotalGanado; //Variables que almacenarán los kilos vendidos y el dinero ganado de cada fruta, además del total.
		final double PRECIO_KILO_MANZANA = 2.35, PRECIO_KILO_PERA = 1.95; //Constantes que indican el precio fijo por kilo de cada fruta.
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer los valores introducidos por el usuario.

		System.out.print("Introduce primero los kilos de manzanas, después los kilos de peras vendidos este año: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir y en qué orden.
		kilosManzanas = sc.nextDouble(); //El sistema espera a que el usuario introduzca los kilos de manzanas vendidos y le asigna ese valor a kilosManzanas.
		kilosPeras = sc.nextDouble(); //El sistema espera a que el usuario introduzca los kilos de peras vendidos y le asigna ese valor a kilosPeras.

		dineroGanadoManzanas = kilosManzanas * PRECIO_KILO_MANZANA; //Se calcula el dinero ganado con las manzanas multiplicando los kilos vendidos por su precio por kilo.
		dineroGanadoPeras = kilosPeras * PRECIO_KILO_PERA; //Se calcula el dinero ganado con las peras multiplicando los kilos vendidos por su precio por kilo.

		dineroTotalGanado = dineroGanadoManzanas + dineroGanadoPeras; //Se suman las ganancias de ambas frutas para obtener el dinero total ganado.

		System.out.println("El dinero total ganado en el año es de: " + dineroTotalGanado + "€.\nEste proviene de: " + dineroGanadoManzanas + "€ de manzanas y " + dineroGanadoPeras + "€ de peras."); //Se muestra en pantalla el dinero total ganado y el desglose de cuánto proviene de cada fruta.

	}

}