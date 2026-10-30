package utiles;

public class Utiles {

	public static boolean esPrimo(Integer numero) {
    	Boolean res = true;

        for (int divisor = 2; divisor < numero ; divisor++) {
            if (numero % divisor == 0) {
                res = false;
            }
        }

        return res;
    }

    public static boolean esPerfecto(Integer numero) {
    	Boolean res = false;
        Integer sumaDivisores = 0;
        for (int divisor = 1; divisor < numero ; divisor++) {
            if (numero % divisor == 0) {
                sumaDivisores += divisor;
            }
        }
        if(sumaDivisores.equals(numero)) {
        	res = true;
        }
        return res;
    }

}
