package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
	
	double milimetros, centimetros, metros, resultado;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce a continuación los milímetros, centímetros y metros para su posterior suma:");
	
	System.out.print("Introduce los milímetros: ");
	milimetros = sc.nextDouble();
	System.out.print("Introduce los centímetros: ");
	centimetros = sc.nextDouble();
	System.out.print("Introduce los metros: ");
	metros = sc.nextDouble();
	sc.close();
	
	//conversión de los datos
	milimetros = milimetros * 0.10;
	metros = metros * 100;
	
	//operación
	resultado = metros + centimetros + milimetros;
	
	System.out.println("La suma de todos los valores da: " + resultado + " centímetros.");
	}

}