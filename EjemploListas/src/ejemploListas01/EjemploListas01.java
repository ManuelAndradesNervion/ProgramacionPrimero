package ejemploListas01;

import java.util.ArrayList;
import java.util.List;

public class EjemploListas01 {

	public static void main(String[] args) {
		List<Integer> lis = new ArrayList<>();
		System.out.println(lis);
		lis.add(7);
		lis.add(4);
		lis.add(3);
		lis.add(12);
		System.out.println(lis);
		System.out.println(lis.size());
		System.out.println(hacerSuma(lis));
	}

	public static Integer hacerSuma(List<Integer> lis) {
		Integer suma = 0;
		for (int i = 0; i < lis.size(); i++) {
			suma += lis.get(i);
		}
		return suma;

	}

}
