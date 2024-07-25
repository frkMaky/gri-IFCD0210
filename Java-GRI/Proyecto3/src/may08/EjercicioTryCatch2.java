package may08;

import java.util.*;

public class EjercicioTryCatch2 {

	public static void main(String[] args) {
		/*
		 * Crea un HashMap de clave texto y de valor numero entero
		 * Intenta meter un decimar e intenta meter el dato con add en vez de put
		 * Captura la excepcion y muestra al final "Fin de programa"
		 	//considera meter dos números
	       //flotantes mediante consola
	       //y almacénalos en formato entero.
	       // Captura3
	       //errores
		 */
		HashMap<String, Integer> miMapa = new HashMap<String, Integer>();
		Scanner entrada = new Scanner (System.in);
		
		try {
			miMapa.put( "Numero", 1 );
			System.out.println( "Introduce un numero:" );
			miMapa.put( "Numero", entrada.nextInt() );
			System.out.println( "Introduce un segundo numero:" );
			miMapa.put( "Numero2", entrada.nextInt() );
			// miMapa.add("Numero2", 1);
		} catch (InputMismatchException e) {
				System.out.println( "No has introducido un numero: " + e.getMessage() );
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			entrada.close();
		}
		
	}

}
