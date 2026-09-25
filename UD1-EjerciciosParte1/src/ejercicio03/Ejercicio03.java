package ejercicio03;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Integer anoActual; //Variable que registrará el año actual.
		final Integer ANO_NACIMIENTO; //Constante que registrará el año de nacimiento del usuario.
		Integer edadUsuario; //Variable que mostrará el resultado de la resta de anoActual - ANO_NACIMIENTO.
		
		System.out.print("Escribe el año actual: "); //El sistema escribe en pantalla para que el usuario escriba el año actual.
		Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer el valor introducido por el usuario.
		anoActual = sc.nextInt(); //El sistema espera a que el usuario escriba el año actual. El valor introducido sólo puede ser leído si es del tipo Integer (Int).
		
		System.out.print("Ahora, escribe tu año de nacimiento: "); //El sistema escribe en pantalla para que el usuario escriba su año de nacimiento.
		ANO_NACIMIENTO = sc.nextInt(); //El sistema espera a que el usuario introduzca su año de nacimiento.
		
		edadUsuario = anoActual - ANO_NACIMIENTO; //Una vez se tienen los valores de las variables anoActual y ANO_NACIMIENTO, la variable edadUsuario entra en juego, pues su valor es la resta de estas 2.
		
		System.out.println("Tienes " + edadUsuario + " años."); //El sistema escribe en pantalla la edad actual del usuario con el valor de edadUsuario.
	}

}