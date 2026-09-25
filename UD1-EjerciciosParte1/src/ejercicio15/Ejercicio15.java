package ejercicio15;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio15 {

	public static void main(String[] args) {

		final double IVA = 21; //Constante que representa el porcentaje de IVA a aplicar (21%).
		double precio, precioIva; //Variables que almacenarán el precio introducido y el precio final con el IVA incluido.
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer el valor introducido por el usuario.

		System.out.print("Introduce un precio para añadirle el IVA del 21%: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.
		precio = sc.nextDouble(); //El sistema espera a que el usuario introduzca el precio y le asigna ese valor a la variable precio.

		precioIva = ((precio * IVA) / 100) + precio; //Se calcula el 21% del precio (precio * IVA / 100) y se suma al precio original, obteniendo el precio final con el IVA aplicado.
		System.out.println("El precio con el IVA incluído es de: " + precioIva + "€"); //Se muestra en pantalla el precio final junto con el símbolo del euro.
	}
}