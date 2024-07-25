import java.util.Scanner;

public class EjercicioMaximo {

	public static void main(String[] args) {
		// Halla el maximo de  4 numeros introducidos por consola
		Scanner entrada = new Scanner(System.in);
		
		int[] numeros = new int[4];
		
		for (int i=0; i < numeros.length; i++) {
			System.out.println("Introduce el primer numero");
			numeros[i] = entrada.nextInt();
		}

		System.out.println("El valor mas grande de los numeros es: " + Math.max(
					Math.max(numeros[0],numeros[1]), 
					Math.max(numeros[2],numeros[3])
				)
		);
	}

}
