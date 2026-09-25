package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
	
	double a, b, c, x;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Introduce los valores de a, b, c, d y x para poder realizar la operación y=ax2+bx+c:\r\n");
	
	System.out.print("a: ");
	a = sc.nextDouble();
	System.out.print("b: ");
	b = sc.nextDouble();
	System.out.print("c: ");
	c = sc.nextDouble();
	System.out.print("x: ");
	x = sc.nextDouble();
	
	System.out.print("La funcion con los valores añadidos es: y = " + a + " + " + x + "^2+ " + b + " + " + x + " + " + c);
	}

}