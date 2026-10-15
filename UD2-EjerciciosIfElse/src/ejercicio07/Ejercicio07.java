package ejercicio07;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		//Variables
		String robot = null;
		String jugador = null;
		Integer numeroAleatorio;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		numeroAleatorio = random.nextInt(2); //numeroAleatorio toma un valor aleatorio entre 0 y 2
		
		if (numeroAleatorio == 0) { //se da un numero aleatorio y según este, robot toma un valor string u otro.
			robot = "Piedra";
			System.out.println(robot); //Se imprime en pantalla el valor string de robot.
		}
		if (numeroAleatorio == 1) {
			robot = "Papel";
			System.out.println(robot); //Se imprime en pantalla el valor string de robot.
		}
		if (numeroAleatorio == 2) {
			robot = "Tijeras";
			System.out.println(robot); //Se imprime en pantalla el valor string de robot.
		}
		
		System.out.println("Escribe Piedra, Papel o Tijeras:");
		jugador = sc.nextLine(); //espera a que el jugador escriba su valor de string.
		sc.close();

		if (robot == jugador) { //si el valor string es igual en ambos, ejecuta el if
			System.out.println("Esta partida ha acabado en empate.");
		} else if ((robot == "Tijeras" && jugador == "Piedra") || (robot == "Piedra" && jugador == "Papel") || (robot == "Papel" && jugador == "Tijeras")) { //si no es igual, realiza una serie de comprobaciones, si jugador tiene x valores gana (se ejecuta este if).
			System.out.println("Ganas esta partida.");
		} else { //si el jugador tiene x valores pierde (se ejecuta este else).
			System.out.println("Robot gana esta partida.");
		}

	}
}