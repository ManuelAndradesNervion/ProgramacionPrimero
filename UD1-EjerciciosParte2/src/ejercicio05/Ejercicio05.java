package ejercicio05;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio05 {

	public static void main(String[] args) {

	Integer totalSegundos;
	double segundos, minutos, horas;
	Scanner sc = new Scanner(System.in);

	System.out.print("Introduce x segundos para convertirlos a horas y minutos: ");
	totalSegundos = sc.nextInt(); 
	sc.close();
	segundos = (totalSegundos % 3600) % 3600;
	minutos = (totalSegundos % 3600) / 60; 
	horas = totalSegundos/3600;

	System.out.println("Los segundos que has introducido ("+ totalSegundos +") es igual a " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");

	}

}