package dia26;

public class EjercicioPersona {

	public static void main(String[] args) {
		/* Clase Persona con 3 atributos:
		color de pelo: castaño, color de ojos: marrones
		número de hijos: 2
		considera que el número de hijos es
		una constante*/
		/*crea 2 instancias de la clase persona e intenta
		* modificar en el segundo objeto tanto el color de
		* pelo a negro y el número de hijos a 1*/

		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		persona2.colorPelo = "negro";
		// persona2.nHijos = 1; // No se puede modificar un atributo final
		
		System.out.println("Ojos: " + persona1.colorOjos + " Pelo: " + persona1.colorPelo +  " Nº Hijos: " + persona1.nHijos) ;
		System.out.println("Ojos: " + persona2.colorOjos + " Pelo: " + persona2.colorPelo +  " Nº Hijos: " + persona2.nHijos) ;
		
		// Guarda los colores de pelo en un array y muestra el array
		String[] coloresPelo = new String[2];
		coloresPelo[0] = persona1.colorPelo;
		coloresPelo[1] = persona2.colorPelo;
		for (String c:coloresPelo) {
			System.out.println("Color de pelo " + c);
		}
	}

}


class Persona {
		String colorPelo = "castaño";
		String colorOjos = "marrones";
		final int nHijos = 2;
}