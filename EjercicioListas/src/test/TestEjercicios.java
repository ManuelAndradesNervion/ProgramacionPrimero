package test;

import java.util.ArrayList;
import java.util.List;
import ejercicios.Ejercicios;
import utiles.Utiles;

public class TestEjercicios {

	public static void main(String[] args) {
		// List<Integer> numeros = List.of(2, 4, 3, 6, 5, 28);
		List<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(2);
		listaNumeros.add(4);
		listaNumeros.add(3);
		listaNumeros.add(6);
		listaNumeros.add(5);
		listaNumeros.add(28);
		System.out.println("Lista: " + listaNumeros);

		System.out.println("\n--- SUMAS ---");
		System.out.println("Suma 1 (for-each): " + Ejercicios.suma1(listaNumeros));
		System.out.println("Suma 2 (for):      " + Ejercicios.suma2(listaNumeros));
		System.out.println("Suma 3 (while):    " + Ejercicios.suma3(listaNumeros));

		System.out.println("\n--- CONTADORES ---");
		System.out.println("Cantidad de pares:     " + Ejercicios.contarPares(listaNumeros));
		System.out.println("Cantidad de primos:    " + Ejercicios.contarPrimos(listaNumeros));
		System.out.println("Cantidad de perfectos: " + Ejercicios.contarPerfectos(listaNumeros));

		System.out.println("\n--- MEDIAS ---");
		System.out.println("Media 1 (for-each): " + Ejercicios.media1(listaNumeros));
		System.out.println("Media 2 (for):      " + Ejercicios.media2(listaNumeros));
		System.out.println("Media 3 (while):    " + Ejercicios.media3(listaNumeros));

		System.out.println("\n--- PRUEBAS DE UTILES ---");
		System.out.println("¿7 es primo?       " + Utiles.esPrimo(7));
		System.out.println("¿9 es primo?       " + Utiles.esPrimo(9));
		System.out.println("¿6 es perfecto?    " + Utiles.esPerfecto(6));
		System.out.println("¿28 es perfecto?   " + Utiles.esPerfecto(28));
		System.out.println("¿12 es perfecto?   " + Utiles.esPerfecto(12));

		System.out.println("\n--- EJERCICIO 1 ---");
		System.out.println(Ejercicios.puedeEntrar(16, true, "zombie")); // true
		System.out.println(Ejercicios.puedeEntrar(15, false, "vampiro")); // true
		System.out.println(Ejercicios.puedeEntrar(15, false, "bruja")); // false

		System.out.println("\n--- EJERCICIO 2 ---");
		List<String> lista = List.of("dulce", "ácido", "dulce", "misterioso");
		System.out.println(Ejercicios.cuentaCaramelos(lista, "dulce"));// 2

		System.out.println("\n--- EJERCICIO 3 ---");
		List<Integer> recorrido = List.of(2, 3, 4, -1, 5);
		System.out.println(Ejercicios.pasosLaberinto(recorrido)); // 9
		
		System.out.println("\n--- EJERCICIO 4 ---");
		List<Integer> magia = List.of(3, 9, 7, 4, 10);
		System.out.println(Ejercicios.promedioMagia(magia)); // (9+7+10)/3 = 8.67
		
		System.out.println("\n--- EJERCICIO 5 ---");
		Ejercicios.cuentaAtrasSustos(4);
		
		System.out.println("\n--- EJERCICIO 6 ---");
		List<Integer> numeros = List.of(3, 9, 0, 4, 10, 0, -3, 5);
		System.out.println(Ejercicios.sumaEntreCeros(numeros)); // 4+10 = 14
		// TODO Seguir haciendo las pruebas de los ejercicios
	}
}