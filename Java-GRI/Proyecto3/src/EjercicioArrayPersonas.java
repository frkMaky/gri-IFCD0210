import java.util.*;

public class EjercicioArrayPersonas {

	public static void main(String[] args) {
		/**
		 * Crea un array de personas: 5 chicas y 2 chicos
		 * Los nomrbes de los alumnos por consola
		 * Habra otro array de notas que se corresponden con el de personas 
		 * ,Muestra, los 2 arrays y muestra todos los aprobados con su nombre
		 * Notas: 8,7,3,6,10 // 4,9
		 * 
		 */
		Scanner entrada = new Scanner(System.in);
		String[] chicas = new String[5];
		String[] chicos = new String[2];
		String[][] personas = {chicas, chicos} ;
		int notas[][] = {
				{8,7,3,6,10},
				{4,9}
		};
		
		// Rellenar array
		for (int i=0; i<personas.length;i++) {
			for (int j=0;j<personas[i].length;j++) {
				if (i == 0) {
					System.out.print("Introduce nombre chica: ");
					personas[i][j] = entrada.next().toUpperCase();
				}
				if (i == 1) {
					System.out.print("Introduce nombre chico: ");
					personas[i][j] = entrada.next().toUpperCase();
				}
			}
		}
		
		// Mostrar los dos arrays
		System.out.println("Listado notas y personas: ");
		for (int i=0; i<personas.length;i++) {
			for (int j=0;j<personas[i].length;j++) {
				System.out.print( personas[i][j] + ": ");
				System.out.print( notas[i][j] + ", ");
			}
			System.out.println();
		}
		
		// Aprobados
		System.out.println("Aprobados: ");
		for (int i=0; i<notas.length;i++) {
			for (int j=0;j<notas[i].length;j++) {
				if (notas[i][j] >= 5) {
					System.out.print( personas[i][j] + ": ");
					System.out.println( notas[i][j] );
				}
			}
		}
		
		entrada.close();

	}

}