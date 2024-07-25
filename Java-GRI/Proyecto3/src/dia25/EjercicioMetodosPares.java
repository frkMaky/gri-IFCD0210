package dia25;

import java.util.*;

public class EjercicioMetodosPares {

	public static void main(String[] args) {
		// Crea un metodo que pida por teclado un numero y muestre los
		// siguientes pares a partir del 2
		// Metodo sin return y con 1 parametro de entrada

		siguientesPares(2);
		siguientesPares(4);
		siguientesPares(5);
		siguientesPares(8);

	}

	/** Solucion Laura (MEJOR)
	public static void mostrarPares(int num) { 
		for (int i = 2; i <= 2 * num; i = i + 2) {
			System.out.println(i);
		}
	}
	*/ 

	public static void siguientesPares(int k) {

		int[] resultados = new int[k];
		int contador = 0;

		while (contador < k) {
			if (contador % 2 == 0) {
				resultados[contador] = 2 + contador;
			} else {
				resultados[contador] = 2 + (contador + 1);
			}
			contador++;
		}
		System.out.println(Arrays.toString(resultados));
	}

}
