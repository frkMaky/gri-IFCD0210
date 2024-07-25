package may08;

import java.util.HashMap;

public class EjercicioHashMap {

	public static void main(String[] args) {
		/** Crea un Hasmap llamado gente que tenga claves pepe, pedro, jau, carlo y valores 20,70,30,10
		 * Elimina a Pedro 
		 * Halla el tamaño del hashmap
		 * Añade a julia 23
		 * muestra las claves y los valores por separado en foreach
		 */
		
		// Crea un Hasmap llamado gente que tenga claves pepe, pedro, jau, carlo y valores 20,70,30,10
		HashMap<String, Integer> gente = new HashMap<String, Integer>();
		gente.put("Pepe", 20);
		gente.put("Pedro", 70);
		gente.put("Juan", 30);
		gente.put("Carlos", 10);
		
		// Elimina a Pedro
		gente.remove("Pedro");
		
		// Halla el tamaño del hashmap
		System.out.println(gente.size());
		
		// Añade a julia 23
		gente.put("Julia", 23);
		
		//  muestra las claves
		for (String s: gente.keySet()) {
			System.out.println(s);
		}
		// muestra los valores
		for (Integer i: gente.values()) {
			System.out.println(i);
		}
		
		// muestra las claves y los valores
		for (String s: gente.keySet()) {
			System.out.println("Clave: " + s + " Valor: " + gente.get(s) );
		}
	}

}
