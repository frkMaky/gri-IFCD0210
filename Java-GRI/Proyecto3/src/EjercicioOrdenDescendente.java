import java.util.*;

public class EjercicioOrdenDescendente {
	public static void main (String[] args) {

		// Ordena descendente el array de 1,22, 7
		int[] miArray = {1,22,7};
		
		Arrays.sort(miArray);
		
		int[] ordenDescendente = new int[miArray.length];
		
		// Orden descendente
		for (int i=0; i< miArray.length; i++) {
			ordenDescendente[i] = miArray[(miArray.length-1) - i];	
		}
		
		// Mostrar
		for (int i:ordenDescendente) {
			System.out.println(i);
		}
		
	}
}
