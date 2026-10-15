package ejemplosIf;

public class EjemploIf_03 {

	public static void main(String[] args) {
		Integer anyo = 2000;
		Integer mes = 2;
		Integer dias = null;
		Boolean esBisiesto = false;

		if (anyo % 400 == 0 || anyo % 4 == 0 && anyo % 100 != 0) {
			esBisiesto = true;
		}

		switch (mes) {
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		default:
			dias = 31;
			break;
		}

		if (mes == 2 && esBisiesto) {
			dias = 29;
		} else {
			dias = 28;
		}
		System.out.println("La fecha que es: " + dias + "/" + mes + "/" + anyo);
	}
}