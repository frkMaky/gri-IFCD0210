import java.util.Iterator;
import java.util.Scanner;

public class EjercicioForEach {

	public static void main(String[] args) {
		// Crea un array de 3 posiciones con numeros decimales de poca precision
		// Mete los nº por consola 
		// Muestra los datos del array de dos formas, con for y con for-each
		
		float[] numeros = new float[3];
		Scanner entrada = new Scanner(System.in);
		System.out.println("Rellena el array:");
		for (int i=0;i<numeros.length;i++) {
			System.out.print("Numero " + i + " del array: ");
			numeros[i] = entrada.nextFloat();
		}
		entrada.close();
		
		// Salida por pantalla

		System.out.println("Bucle FOR:");
		for (int i =0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("Bucle FOR-EACH");
		for (float f:numeros) {
			System.out.println(f);
		}
	}

}
