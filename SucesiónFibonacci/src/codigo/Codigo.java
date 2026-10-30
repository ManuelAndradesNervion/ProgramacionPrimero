package codigo;

public class Codigo {

	public static Long fibonacci(Integer n) {

		Long numero = 0L;
		if (n == 0) {
			return numero;
		} else if (n == 1) {
			numero = 1L;
			return numero;
		} else {
			numero = fibonacci(n - 1) + fibonacci(n - 2);
			return numero;
		}

	}

	public static Long factorial(Integer n) {
		Long numero = 0L;
		if (n == 0) {
			numero = 1L;
			return numero;
		} else if (n != 0) {
			numero = n * factorial(n - 1);
		}
		return numero;
	}
}