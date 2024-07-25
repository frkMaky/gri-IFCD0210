package may08;

import java.util.*;

public class EjercicioHashMapAlumnos {

	public static void main(String[] args) {
		/* Crau un HashMap de 5 nombre de alumnos con su altura en metros
		 * Luego muestra todos los nombres
		 * Luego elimina el penultimo alumno y muestra tanto las claves como sus valores*/
		
		HashMap<String, Float> alumnos = new HashMap<String, Float>();
		alumnos.put("Pepe", 1.73f);
		alumnos.put("Cristina", 1.6f);
		alumnos.put("Paco", 1.8f);
		alumnos.put("Martin", 2.0f);
		alumnos.put("Lorena", 1.5f);
		
		for (String s: alumnos.keySet() ) {
			System.out.println(s);
		}
		
		alumnos.remove("Martin");
		
		for (String s: alumnos.keySet() ) {
			System.out.println("Clave: " + s  + " Valor: " + alumnos.get(s) );
		}
	}

}
