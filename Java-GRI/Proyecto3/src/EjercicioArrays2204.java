import java.util.Scanner;

public class EjercicioArrays2204 {

	public static void main(String[] args) {
		// Crea un array de 5 posiciones para pedir colores por consola. Luego muestralos
		// Muestra tambien el tamaño del array, sustituye el ultimo elemento del array por negro
		// Muestra el ultimo elemento del array
		
		Scanner entrada = new Scanner (System.in);
		String[] colores = new String[5];

		for(int i=0;i< colores.length;i++) {
			System.out.print("Introduce el color " + (i+1) + ": ");
			colores[i] = entrada.nextLine();
		}
		
		System.out.println("Colores en el ARRAY:");
		for (String c: colores) {
			System.out.println( "Color " + c );
		}
		System.out.println("Tamaño del array: " + colores.length);
		
		System.out.println("Cambiando el ultimo elemento a negro");
		colores[colores.length-1] = "negro";
		System.out.println("Mostrando el ultimo elemento del array: " + colores[colores.length-1]);
		
		System.out.println("Colores en el ARRAY:");
		for (String c: colores) {
			System.out.println( "Color " + c );
		}
		
		entrada.close();
	}

}
