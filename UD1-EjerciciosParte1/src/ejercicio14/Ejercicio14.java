package ejercicio14;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio14 {

	public static void main(String[] args) {

		double primerTrimestre, segundoTrimestre, tercerTrimestre; //Variables que almacenarán las notas de cada trimestre, en formato decimal.
		Integer boletinCalificaciones; //Variable que almacenará la nota media truncada (sin decimales), como se muestra un boletín.
		double expedienteAcademico; //Variable que almacenará la nota media con decimales, tal como se muestra en el expediente académico.
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer los valores introducidos por el usuario.

		System.out.print("Introduce por orden las notas del primer, segundo y tercer trimestre: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir y en qué orden.
		primerTrimestre = sc.nextDouble(); //El sistema espera a que el usuario introduzca la nota del primer trimestre y la asigna a primerTrimestre.
		segundoTrimestre = sc.nextDouble(); //El sistema espera a que el usuario introduzca la nota del segundo trimestre y la asigna a segundoTrimestre.
		tercerTrimestre = sc.nextDouble(); //El sistema espera a que el usuario introduzca la nota del tercer trimestre y la asigna a tercerTrimestre.

		boletinCalificaciones = ((int) primerTrimestre + (int) segundoTrimestre + (int) tercerTrimestre) / 3; //Se convierte cada nota a int (truncando decimales, aunque aquí no debería haberlos), se suman y se divide entre 3 con división entera, obteniendo solo la parte entera de la media.
		expedienteAcademico = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3; //Se suman las notas (ya en double) y se divide entre 3, obteniendo la media con decimales.

		System.out.println("La nota media del boletin de calificaciones es: " + boletinCalificaciones); //Se muestra en pantalla la media truncada, sin decimales.
		System.out.println("La nota media del expediente académico es: " + expedienteAcademico); //Se muestra en pantalla la media con decimales.
	}
}