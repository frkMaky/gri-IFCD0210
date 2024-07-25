package may03;

import java.util.ArrayList;

public class EjercicioArrayList {

	public static void main (String[] args) {
		/*Crea un arrayList de planetas.
		    * Añade plutón al final del todo.
		    * Luego muestra el array de datos.
		    * Quitamos Plutón y muestra el array de datos */
		ArrayList<String> planetas = new ArrayList<String>();
		planetas.add("Mercurio");
		planetas.add("Venus");
		planetas.add("Tierra");
		planetas.add("Marte");
		planetas.add("Júpiter");
		planetas.add("Saturno");
		planetas.add("Urano");
		planetas.add("Neptuno");
		planetas.add("Plutón");
		System.out.println( planetas );
		System.out.println( planetas.size() );
		
		planetas.remove("Plutón");
		System.out.println( planetas );	
		System.out.println( planetas.size() );
		
		/** Modifica el arraylist anterior para que los planetas estén en inglés y luego muestralo */
		String [] planets = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
		planetas.clear();
		for (String p:planets) {
			planetas.add(p);
		}
		System.out.println( planetas );
		System.out.println( planetas.size() );
		
		// Muestra los datos mesiante un foreach
		for (String s:planetas) {
			System.out.println("Planeta: " + s);
		}
		
	}
}
