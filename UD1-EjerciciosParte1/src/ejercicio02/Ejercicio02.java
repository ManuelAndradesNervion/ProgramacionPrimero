package ejercicio02;

import java.util.Scanner; //Paquete encargado de registrar la entrada

public class Ejercicio02 {

	public static void main(String[] args) {
		byte edad; //Variable que registrará la edad del usuario.
		
		System.out.print("Introduce tu edad: "); // El sistema escribe en pantalla para que el usuario escriba su edad.
		
		Scanner sc = new Scanner(System.in); //La clase Scanner permite leer el número introducido.
		edad = sc.nextByte(); //El número introducido solo puede ser leído si es un número entero del tipo byte. El valor introducido será el valor inicial de edad.
		edad++; //El valor que antes poseía edad ahora se incrementa en 1.
		
		System.out.println("Para el próximo año tendrás " + edad + " años."); //El sistema escribe en pantalla "Para el próximo año tendrás: " y el valor de la variable edad.
	}

}
