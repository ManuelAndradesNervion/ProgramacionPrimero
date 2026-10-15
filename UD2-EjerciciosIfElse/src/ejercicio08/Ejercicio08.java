package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Integer a = null;
		Integer b = null;
		Integer c = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe 3 números para comprobar si la suma de los 2 primeros da como resultado el tercer número:");
		System.out.print("A = ");
		a = sc.nextInt();
		System.out.print("B = ");
		b = sc.nextInt();
		System.out.print("C = ");
		c = sc.nextInt();
		
		sc.close();
		
		if (a + b == c) {
			System.out.println("La suma de los números A (" + a + ") y B (" + b + ") da como resultado C (" + c + ").");
		}
		else {
			System.out.println("La suma de los números A (" + a + ") y B (" + b + ") no da como resultado C (" + c + ").");
		}
	}

}
