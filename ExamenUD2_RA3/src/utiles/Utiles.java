package utiles;

public class Utiles {

	public static Integer primerDivisor(Integer inicio) {
		Integer res = 0;
		for (int divisor = 1; divisor < inicio; divisor++) {
			if (inicio % divisor == 0) {
				res = divisor;
			}
		}
		return res;
	}

}
