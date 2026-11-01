package ejercicios;

import java.util.Iterator;

public class Ejercicios {

	public static Integer precioEntrada(Integer edad, String dia, Boolean socio) {
		Integer edadCliente = edad;
		String diaSemana = dia;
		Boolean esSocio = socio;
		Integer precio;
		final Integer DESCUENTO_EDAD = 3;
		final Integer DESCUENTO_SOCIO = 2;
		switch (diaSemana) {
		case "LUNES":
		case "MARTES":
		case "MIERCOLES":
		case "JUEVES":
			precio = 8;
			if (edadCliente < 0) {
				precio = -1;
				break;
			} else if (edadCliente >= 0 && (edadCliente < 12 || edadCliente >= 65)) {
				precio -= DESCUENTO_EDAD;
			}
			if (esSocio == true) {
				precio -= DESCUENTO_SOCIO;
			}
			break;
		case "VIERNES":
			precio = 10;
			if (edadCliente < 0) {
				precio = -1;
				break;
			} else if (edadCliente >= 0 && (edadCliente < 12 || edadCliente >= 65)) {
				precio -= DESCUENTO_EDAD;
			}
			if (esSocio == true) {
				precio -= DESCUENTO_SOCIO;
			}
			break;
		case "SABADO":
		case "DOMINGO":
			precio = 12;
			if (edadCliente < 0) {
				precio = -1;
				break;
			} else if (edadCliente >= 0 && (edadCliente < 12 || edadCliente >= 65)) {
				precio -= DESCUENTO_EDAD;
			}
			if (esSocio == true) {
				precio -= DESCUENTO_SOCIO;
			}
			break;
		default:
			System.out.println("El día introducido no es válido.");
			precio = -1;
			break;
		}
		return precio;
	}

	public static void dibujarZ(Integer lado) {
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				if() {
					System.out.println("*");
				} else if () {
					System.out.print(" ");
				}
			}
		} System.out.println();
	}
}