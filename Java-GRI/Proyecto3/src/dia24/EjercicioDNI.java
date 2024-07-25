package dia24;

import java.util.*;

public class EjercicioDNI {

	public static void main(String[] args) {
		/*
		 * Calcula la letra de un DNI, pediremos el DNI por teclado y nos devolverá el
		 * DNI completo. Para calcular la letra, cogeremos el resto de dividir nuestro
		 * dni entre 23, el resultado debe estar entre 0 y 22. Haz un método donde según
		 * el resultado de la anterior formula busque en un array de caracteres la
		 * posición que corresponda a la letra. Esta es la tabla de caracteres:
		 * 0->T,1->R,2->W,3->A,4->G,5->M,6->Y,T->F,8->P,9->D,10->X,11->B,12->N,13->J,
		 * 14->Z,15->S,16->Q,17->V,18->H,19->L,20->C,21->K,22->E Por ejemplo, si
		 * introduzco 70588387, el resultado sera de 7 que corresponde a ‘F’.
		 */
		

		Scanner entrada = new Scanner(System.in);

		// Array con los caracteres
		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };

		System.out.println("Introduce el nº del DNI: ");
		String dni = entrada.nextLine();
		if (dni.length() > 8 || dni.length() < 8) {
			System.out.println("DNI introducido inválido.");
		} else {
			// Calcular la letra
			int valor = Integer.valueOf(dni) % 23;
			char letra = letras[valor];
			System.out.println("DNI completo: " + dni + letra);
		}

		entrada.close(); 

	}

}
