package ejercicio03;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio03 {

	public static void main(String[] args) {

		Integer numeroEnteroOriginal, numeroMultiplo, numeroEnteroSuma, numeroSuma = 0, numeroMultiploResultante; //Variables de tipo Integer en la cual tenemos que aportar el valor de numeroEnteroOriginal y numeroMultiplo.
		Scanner sc = new Scanner(System.in); // La clase Scanner permite al sistema leer el valor introducido por el usuario.

		System.out.print("Escribe un número entero y el numero del que debe de ser múltiplo:  "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.
		numeroEnteroOriginal = sc.nextInt(); //El sistema espera a que el usuario introduzca el primer número entero y lo asigna a numeroEnteroOriginal.
		numeroMultiplo = sc.nextInt(); //El sistema espera a que el usuario introduzca el segundo número entero y lo asigna a numeroMultiplo.
		sc.close(); //Se cierra el Scanner, ya que no se necesita leer nada más del usuario a partir de aquí.

		if (numeroMultiplo == 0) { //Se comprueba si el número del que debe ser múltiplo es 0, caso que rompería el programa.
			System.out.println("El número que indica de qué debe de ser múltiplo no puede ser 0."); //Se informa al usuario de que ese valor no es válido.
			return; //Se termina la ejecución del método aquí, sin llegar al resto del código.
		}

		else { //Si numeroMultiplo no es 0, se ejecuta el else.
			numeroEnteroSuma = numeroEnteroOriginal; //Se asigna el valor a numeroEnteroSuma con el valor original, para después comprobarlo en el bucle while.

			while (numeroEnteroSuma % numeroMultiplo != 0) { //Mientras el número (original + suma acumulada) no sea múltiplo de numeroMultiplo, se mantiene activo el bucle while.
				numeroSuma++; //Se incrementa en 1 el valor de numeroSuma.
				numeroEnteroSuma = numeroEnteroOriginal + numeroSuma; //Se recalcula el while con el nuevo valor de numeroEnteroSuma, siendo que si ahora sí se cumple la condición, el bucle while finaliza. 
			}

			numeroMultiploResultante = numeroEnteroOriginal + numeroSuma; //Una vez el bucle termina, se calcula el número múltiplo final.
			System.out.println("El número que has puesto es " + numeroEnteroOriginal + ", por lo que hay que sumarle "
					+ numeroSuma + " para que sea múltiplo de " + numeroMultiplo + "\nEl número múltiplo es: "
					+ numeroMultiploResultante); //Se muestra en pantalla el número original, el número del que es múltiplo, la cantidad a sumar y el resultado.
		}
	}
}