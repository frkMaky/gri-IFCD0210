import java.util.Scanner;

public class EjercicioVocal {

	public static void main(String[] args) {
		/* Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario,
		 *  el programa termina cuando se introduce un espacio.*/
		Scanner entrada = new Scanner(System.in);
		int contadorVocales = 0;
		int contadorConsonantes = 0;
		
		char letra = '.';
		
		while ( letra != ' ' ) { // con espacio termina de pedir letras
			System.out.println("Introduce una letra");
			// NextLine() lee espacios en blanco  next() no lee espacios en blanco
			letra = entrada.nextLine().toLowerCase().charAt(0);	
			
			// Comprobar si es VOCAL o NO VOCAL	
			if (letra == 'a'|| letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || 
					letra == 'á'|| letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú') {
				System.out.print("VOCAL: ");
				contadorVocales++;
			} else {
				System.out.print("NO VOCAL: ");
				contadorConsonantes++;
			}
			System.out.println(letra);
		}
		System.out.println("Vocales totales: " + contadorVocales);
		System.out.println("NO vocales totales: " + contadorConsonantes);
		System.out.println("Fin");
	}

}
