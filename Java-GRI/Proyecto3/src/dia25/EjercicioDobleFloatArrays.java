package dia25;

import java.util.Scanner;

public class EjercicioDobleFloatArrays {

	public static void main(String[] args) {
		/* Crea un método que halle el doble
	        * de un número decimal con poca precisión.
	        * Coge por consola 3 números decimales
	        * y halla su doble.
	        * Luego en el programa principal harás
	        * la suma de los 3 resultados y lo muestras.
	        * El método hallarDoble tendrá un parámetro
	        * de entrada y uno de salida.
	        */
		/* Modifica el programa anterior
	        * para el caso de 20 números
	        */
			Scanner entrada = new Scanner(System.in);
			float sumaTotal = 0;
			
			float[] numeros = new float[20];
			for (int i= 0; i<numeros.length;i++) {
				System.out.print("Introduce el numero " + (i+1) + ": " );
				numeros[i] = Float.parseFloat( entrada.nextLine() );
			}
			for (float f:numeros) {
				System.out.println("El doble del numero " + f  + " es " + hallarDoble(f) );
				sumaTotal += hallarDoble(f) ;
			}
			System.out.println("Suma total de los dobles de los numeros: " + sumaTotal);
			
			entrada.close();
		}
		
		// Devuelve el doble de un numero float
		public static float hallarDoble(float numero) {
			return 2 * numero;
		}
}
