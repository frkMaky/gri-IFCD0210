package ejercicios;

import java.util.*;

public class Diamante {

	public static void main(String[] args) {
		/**
		 * 6.Escriba un programa Java para mostrar el patrón como un diamante.
			Datos de prueba
			Ingrese el número de filas (la mitad del diamante): 7
		 */
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de filas (la mitad del diamante)");
		
		int numero = entrada.nextInt();
		
		dibujarDiamante(numero);

		entrada.close();
	} 
	
	public static void dibujarDiamante(int numeroIntroducido) {
		// i - lineas
		// j - columnas
		// espacios = numeroIntroducido - numeroLinea (i)
		// asteriscos por linea = ( 2 * numeroLinea ) - 1
		// Se pintan los espacios a la izquierda y los asteriscos (los espacios a la derecha no son necesarios)

		// Diamante mitad superior
		for (int i = 1; i <= numeroIntroducido; i++) { // mitad superior 
			
			for (int j = 1; j <= (numeroIntroducido - i );j++) { // Espacios
				System.out.print(" ");
			}
			for (int k = 1; k <= ( (i*2)-1 ); k++) { // Asteriscos
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// Diamante mitad inferior
		for (int i = numeroIntroducido; i >= 1; i--) { // al reves que la mitad superior
			
			for (int j = 1; j <= (numeroIntroducido - i );j++) { // Espacios
				System.out.print(" ");
			}
			for (int k = 1; k <= ( (i*2)-1 ); k++) { // Asteriscos
				System.out.print("*");
			}
			System.out.println("");
		}	
	}
}
