package dia24;

import java.util.Arrays;

public class EjercicioArraysCopia {

	public static void main(String[] args) {
		/*Crea un array de 10 posiciones
        * con el número 5 en todas ellas.
        * Luego haz una copia del array desde
        * la posición 7 a la 9 y guárdalo
        * en otro array.
        * Luego muestra el array nuevo.
        */
		int[] numeros = new int[10];
		Arrays.fill(numeros, 5);
		int[] numeros2 = Arrays.copyOfRange(numeros, 7,9);

		System.out.println("Primer Array: " + Arrays.toString(numeros));
		System.out.println("Segundo Array: " + Arrays.toString(numeros2));

	}

}
