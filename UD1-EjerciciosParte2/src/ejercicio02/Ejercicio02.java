package ejercicio02;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio02 {

	public static void main(String[] args) {

		Integer numeroEnteroOriginal, numeroEnteroSuma, numeroSuma = 0, numeroMultiplo; //Variables para el número introducido, el número que se va comprobando, la cantidad acumulada a sumar (empieza en 0) y el resultado final múltiplo de 7.
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer el valor introducido por el usuario.

		System.out.print("Escribe un número entero: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.
		numeroEnteroOriginal = sc.nextInt(); //El sistema espera a que el usuario introduzca un número entero y lo asigna a numeroEnteroOriginal.
		sc.close(); //Se cierra el Scanner, pues en este código no necesita más la lectura de entrada.

		numeroEnteroSuma = numeroEnteroOriginal; //Se inicializa numeroEnteroSuma con el valor original, como punto de partida para las comprobaciones del bucle.

		while (numeroEnteroSuma % 7 != 0) { //Mientras el número numeroEnteroSuma no sea múltiplo de 7, se ejecuta el while.
			numeroSuma++; //Se incrementa en 1 la cantidad que se va a sumar.
			numeroEnteroSuma = numeroEnteroOriginal + numeroSuma; //Se recalcula el número con esa nueva cantidad, para volver a comprobar la condición del while.
		}

		numeroMultiplo = numeroEnteroOriginal + numeroSuma; //Una vez el bucle termina pues ya es múltiplo de 7, se calcula el número múltiplo final.
		System.out.println("El número que has puesto es " + numeroEnteroOriginal + ", por lo que hay que sumarle "
				+ numeroSuma + " para que sea múltiplo de 7. \nEl número múltiplo es: " + numeroMultiplo); //Se muestra en pantalla el número original, la cantidad que se ha  y el múltiplo de 7 resultante.
	}

}