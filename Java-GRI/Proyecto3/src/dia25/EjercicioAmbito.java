package dia25;

import java.util.Scanner;

public class EjercicioAmbito {

	public static void main(String[] args) {
		/**
		 * Diseñe un metodo que al ingresar por teclado un numero, si es par muestra el doble,
		 *  se es impar muestra el triple.
		 * El metodo tendra un return con el restultado final y un parametro de entrada
		 */

		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un numero:");
		int numero = entrada.nextInt();
		System.out.println( devolverMultiplo(numero) );
		entrada.close();
		
	}
	public static int devolverMultiplo(int numero) {
		int multiplicador = 3;
		if (numero%2 == 0) {
			multiplicador =2;
		} 
		return numero*multiplicador;
	}

}
