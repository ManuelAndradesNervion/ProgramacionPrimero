package ejemplosIf;

public class EjemploIf_03 {

	public static void main(String[] args) {
		Integer anyo = 2000;
		Integer mes = 4;
		Integer dias;
		Boolean esBisiesto = false;

		if (anyo % 400 == 0 || anyo % 4 == 0 && anyo % 100 != 0) {
			esBisiesto = true;
		}

		if (mes == 2 && esBisiesto == true) {
			dias = 29;

		} else {
			if (mes % 2 != 0) {
				dias = 31;
				System.out.println("La fecha que has escogido es " + anyo + "/" + mes + "/" + dias);
				return;
			} else {
				dias = 30;
				System.out.println("La fecha que has escogido es " + anyo + "/" + mes + "/" + dias);
				return;
			}

		}
		System.out.println("El año que has escogido es bisiesto y has escogido febrero, por lo que la fecha es: " + anyo + "/" + mes + "/" + dias);
	}

}
