package ejercicio05;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio05 {

	public static void main(String[] args) {

	Integer segundos; //Variable que almacenará los segundos introducidos por el usuario.
	double minutos = 60, horas = 3600; //Variables inicializadas con las constantes de conversión (60 segundos por minuto, 3600 segundos por hora), que después se reutilizan para guardar el resultado.
	Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer el valor introducido por el usuario.

	System.out.print("Introduce x segundos para convertirlos a horas y minutos: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.
	segundos = sc.nextInt(); //El sistema espera a que el usuario introduzca una cantidad de segundos y la asigna a la variable segundos.
	sc.close(); //Se cierra el Scanner, ya que no se necesita leer nada más del usuario a partir de aquí.

	minutos = segundos / minutos; //Se divide la cantidad de segundos entre 60 (valor original de minutos) para obtener el equivalente en minutos, y el resultado sobrescribe la variable minutos.
	horas = segundos / horas; //Se divide la cantidad de segundos entre 3600 (valor original de horas) para obtener el equivalente en horas, y el resultado sobrescribe la variable horas.

	System.out.println("Los segundos que has introducido ("+segundos+") son " + minutos + " minutos y " + horas + " horas."); //Se muestra en pantalla la cantidad de segundos original junto con su equivalente en minutos y horas.

	}

}