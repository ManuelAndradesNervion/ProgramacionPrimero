package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		Integer nota = null, notas = 1;
		Scanner sc = new Scanner(System.in);

		for (; notas <= 5; notas++) {
			System.out.print("Introduce una nota: ");
			nota = sc.nextInt();
			if (nota < 5) {
				System.out.println("Se ha detectado un suspenso.");
				break;
			} else {
				System.out.println("No se ha detectado ningún suspenso.");
			}

		}
		
	}

}
