package ejercicio04;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio04 {

	public static void main(String[] args) {

	double a, b, c, x; //Variables que almacenarán los coeficientes a, b, c y el valor de x de la fórmula.
	Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer los valores introducidos por el usuario.

	System.out.print("Introduce los valores de a, b, c y x para poder realizar la operación y=ax2+bx+c:\r\n"); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.

	System.out.print("a: "); //Se pide específicamente el valor de a.
	a = sc.nextDouble(); //El sistema espera a que el usuario introduzca el valor de a y lo asigna a la variable a.
	System.out.print("b: "); //Se pide específicamente el valor de b.
	b = sc.nextDouble(); //El sistema espera a que el usuario introduzca el valor de b y lo asigna a la variable b.
	System.out.print("c: "); //Se pide específicamente el valor de c.
	c = sc.nextDouble(); //El sistema espera a que el usuario introduzca el valor de c y lo asigna a la variable c.
	System.out.print("x: "); //Se pide específicamente el valor de x.
	x = sc.nextDouble(); //El sistema espera a que el usuario introduzca el valor de x y lo asigna a la variable x.
	
	sc.close(); //esta línea se encarga de hacer el sistema no lea más entradas.
	
	System.out.print("La funcion con los valores añadidos es: y = " + a + " * " + x + "^2 + " + b + " * " + x + " + " + c); //Se muestra en pantalla la fórmula original con los valores ya sustituidos en su lugar, tal como pedía el enunciado (sin resolver la operación).
	}

}