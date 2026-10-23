package ejemploListas02;

import java.util.ArrayList;
import java.util.List;

public class EjemploListas02 {

	public static void main(String[] args) {
		List<Integer> recorrido = List.of(2, 3, 4, -1, 5);
		System.out.println(pasosLaberinto(recorrido)); //9
	}

	public static Integer pasosLaberinto(List<Integer> recorrido) {
		Integer suma = 0;
		Integer i = 0;
		while (i < recorrido.size()) {
			if (recorrido.get(i) > 0) {
				suma += recorrido.get(i);
			} else {
				break;
			}
			i++;
		}
		return suma;
	}

	public static Integer hacerSumaConWhile(List<Integer> lis) {
		Integer suma = 0;
		for (int i = 0; i < lis.size(); i++) {
			suma += lis.get(i);
		}
		return suma;

	}
}