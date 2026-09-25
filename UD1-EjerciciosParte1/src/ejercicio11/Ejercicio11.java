package ejercicio11;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio11 {

	public static void main(String[] args) {

		Integer cantidadPesetas; //Variable que almacenará la cantidad de pesetas introducida por el usuario.
		final double conversionPesetas = 166; //Constante que indica cuántas pesetas equivalen a 1 euro.
		double valorEuros; //Variable que almacenará el resultado de la conversión de pesetas a euros.
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer el valor introducido por el usuario.

		System.out.print("Escribe la cantidad de pesetas: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.
		cantidadPesetas = sc.nextInt(); //El sistema espera a que el usuario introduzca la cantidad de pesetas y le asigna ese valor a la variable cantidadPesetas.

		valorEuros = cantidadPesetas / conversionPesetas; //Se divide la cantidad de pesetas entre el valor de conversión, obteniendo así el resultado en euros con decimales.
		System.out.println("El valor de las pesetas introducidas en euros es: " + valorEuros + "€"); //Se muestra en pantalla el resultado de la conversión junto con el símbolo del euro.
	}

}