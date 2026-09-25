package ejercicio05;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio05 {

	public static void main(String[] args) {

		double radio, longitud, area, pi = Math.PI; //variables de tipo double que registrarán distintos valores. Entre esos valores está Math.PI, que es una constante de clase, la cual
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer el valor introducido por el usuario.

		System.out.print("Introduce el radio de la circunferencia: "); //El sistema escribe en pantalla para que el usuario escriba un valor para radio.
		radio = sc.nextDouble(); //El sistema espera a que el usuario escriba el valor de radio.

		longitud = (2 * pi) * radio; //longitud toma el valor de la fórmula que se encuentra a su derecha.
		System.out.println("Según el radio introducido, el valor de la longitud de la circunferencia es: " + longitud); //El sistema escribe en pantalla un texto en el que al final aparece el nuevo valor de longitud (resultado de la operación anterior).

		area = Math.pow(radio, 2) * pi; //area toma el valor de la fórmula que se encuentra a su derecha.
		System.out.println("Según el radio introducido, el valor del área de la circunferencia es: " + area); //El sistema escribe en pantalla un texto en el que al final aparece el nuevo valor de area (resultado de la operación anterior).

	}

}