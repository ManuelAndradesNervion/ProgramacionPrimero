package ejercicio04;

import java.util.Scanner;//Paquete encargado de registrar la entrada.

public class Ejercicio04 {
	
	public static void main(String[] args) {
		
		Integer nota1, nota2; //Variables de tipo integer que registrarán las notas obtenidas.
		double notaSuma; //Variable de tipo double que tomará el valor de la suma de las 2 notas.
		double notaMedia; //Variable de tipo double que registrará la división de notaSuma.
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer el valor introducido por el usuario.
		
		System.out.print("Escribe la primera nota: "); //El sistema escribe en pantalla para mostrar al usuario que nota debe escribir justo después.
		nota1 = sc.nextInt(); //El sistema espera a que el usuario escriba la nota1.
		
		System.out.print("Escribe la segunda nota: "); //El sistema escribe en pantalla para mostrar al usuario que nota debe escribir justo después.
		nota2 = sc.nextInt(); //El sistema espera a que el usuario escriba la nota2.
		
		notaSuma = nota1 + nota2; //Se realiza la suma de nota1 y nota2 y da resultado al valor de notaS
		notaMedia = notaSuma/2; //NotaSuma se divide entre 2 (ya que han sido 2 notas las que se han sumado) y esto da el valor de notaMedia.
		
		System.out.println("La media aritmética de las dos notas es: " + notaMedia); //El sistema escribe en pantalla el resultado de la media aritmética de las 2 notas.
	}

}