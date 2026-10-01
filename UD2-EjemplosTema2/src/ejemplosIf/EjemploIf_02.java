package ejemplosIf;

public class EjemploIf_02 {

	public static void main(String[] args) {
		Integer x = 20, y = 14, z = 31;
		Integer mayor = 0;

		if (x > y && x > z) {
			mayor = x;
		}
		if (y > x && y > z) {
			mayor = y;
		}
		if (z > x && z > y) {
			mayor = z;
		}
		System.out.println(mayor);
	}
}
