import java.util.*;

public class EjercicioArrays2504 {

	public static void main(String[] args) {
		/**
		 * Crea un array de 10 posisiciones con colores pedidos por consola
		 * Las opciones disponibles son:
		 * A: paso a mayusculas
		 * B: paso a minusculas
		 * C: Muestra el array
		 * Q: Salir
		 * Al salir mostrar "fin de programa"
		 */
		
		Scanner entrada = new Scanner (System.in);
		char opcion;
		String[] colores = new String[10];
		
		// Rellenar array
		System.out.println("Introduce los colores en el Array:");
		for (int i=0;i<colores.length;i++) {
			System.out.print("Introduce color " + (i+1) + ": ");
			colores[i] = entrada.next();
		}
		
		// MENU 
		do {
			System.out.println("Menu de opciones:");
			System.out.println("A: Pasar a MAYUSCULAS");
			System.out.println("B: Pasar a MINUSCULAS");
			System.out.println("C: Mostrar el ARRAY");
			System.out.println("Q: Salir");
			System.out.print("Escoge opción: ");
			opcion = entrada.next().toUpperCase().charAt(0);
			
			switch (opcion) {
			case 'A': {
				for (int i=0;i<colores.length;i++) {
					colores[i] = colores[i].toUpperCase();
				}
				System.out.println("Colores pasados a MAYÚSCULAS");
				break;
			}
			case 'B': {
				for (int i=0;i<colores.length;i++) {
					colores[i] = colores[i].toLowerCase();
				}
				System.out.println("Colores pasados a minúsculas");
				break;
			}
			case 'C': {
				for (int i=0;i<colores.length;i++) {
					System.out.println( "Color: " + colores[i] );
				}
				break;
			}
			case 'Q': {
				System.out.println("Fin de Programa");
				break;
			}
			default:
				System.out.println("Opcion escogida no válida. Vuelve a intentarlo. ");
			}
			
		} while(opcion != 'Q');
		
		entrada.close();
		System.exit(0);
	}

}
