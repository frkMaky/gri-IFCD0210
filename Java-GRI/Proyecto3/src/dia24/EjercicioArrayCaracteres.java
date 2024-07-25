package dia24;

import java.util.*;

public class EjercicioArrayCaracteres {

	public static void main(String[] args) {
		/*
        * Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas).
        * Después, ve pidiendo posiciones del array por teclado y si la posición es correcta, 
        * se añadirá a una cadena que se mostrará al final, se dejará de insertar cuando se introduzca un -1.
		Por ejemplo, si escribo los siguientes números
		0 //Añadirá la ‘A’
		5 //Añadirá la ‘F’
		25 //Añadirá la ‘Z’
		50 //Error, inserte otro número
		-1 //fin
		Cadena resultante: AFZ
		*/
		
		Scanner entrada = new Scanner (System.in);		
		String cadena ="";
		// Array con los caracteres de la A a la Z
	 	char[] letras = new char[26];
		for (int i=0;i<26;i++) {
			letras[i] = (char) (i + 65);
		}

		int posicion;
		do {
			
			// Mostrar el array + cadena
			System.out.println();
			System.out.println("Contenido Array + Cadena:");
			for (char c: letras) {
				System.out.print(c + " ");
			}
			System.out.println(cadena);
			// Menu
			System.out.println("OPCIONES:");
			System.out.println("0  - Añadir A");
			System.out.println("5  - Añadir F");
			System.out.println("25 - Añadir Z");
			System.out.println("50 - Error inserte otro numero");
			System.out.println("-1 - Fin");
			System.out.print("Indica opción: ");
			posicion = entrada.nextInt();

			switch (posicion) {
			case 0: {
				cadena += "A ";
				break;
			}
			case 5: {
				cadena += "F ";
				break;
			}
			case 25: {
				cadena += "Z ";
				break;
			}
			case 50: {
				System.out.println("Error inserte otro numero");
				break;
			}
			case -1: {
				System.out.println("Fin");
				break;
			}
			default:
				System.out.println("Opcion inválida. Intentalo de nuevo");
			}
		}while(posicion != -1);
		
		entrada.close();
		System.exit(0);
	}

}
