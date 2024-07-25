package dia24;

import java.util.Arrays;

public class EjercicioArrayFill {

	public static void main(String[] args) {
		/*Crea un array de 30 posiciones.
        * Inicialízalo con el valor 15 en todos
        * los items del array.
        * Luego modifícalo de forma que desde
        * la posición 3 hasta el final contenga un 7
        */
		int[] numeros = new int[30];
		Arrays.fill(numeros, 15);
		System.out.println(Arrays.toString(numeros));
		Arrays.fill(numeros,3, numeros.length, 7);
		System.out.println(Arrays.toString(numeros));
	}

}
