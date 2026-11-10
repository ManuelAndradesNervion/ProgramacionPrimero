package test;

import java.util.ArrayList;
import java.util.List;

import tipos.Persona;
import tipos.Sexo;

public class Test_personas {
	public static void main(String[] args) {
		Persona p1 = new Persona("Christian", 21, 70.2, Sexo.Masculino);
		System.out.println(p1.getNombre());
		Persona p2 = new Persona("Ana", 20, 60.3, Sexo.Femenino);
		System.out.println(p2.getNombre());

		List<Persona> lis = new ArrayList<Persona>();
		lis.add(p1);
		lis.add(p2);
		lis.add(new Persona("Antonio", 30, 65.0, Sexo.Masculino));
		lis.add(new Persona("María", 19, 50.3, Sexo.Femenino));
		lis.add(new Persona("Lucía", 20, 54.3, Sexo.Femenino));

		System.out.println(filtraPorSexo(lis, Sexo.Masculino));
	}

	public static List<Persona> filtraPorSexo(List<Persona> lis, Sexo sexo) {
		List<Persona> res = new ArrayList<Persona>();
		for (Persona p : lis) {
			if (p.getSexo() == sexo) {
				res.add(p);
			}
		}
		return res;
	}
}
