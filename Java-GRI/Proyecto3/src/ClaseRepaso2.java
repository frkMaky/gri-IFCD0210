import java.util.Scanner;

public class ClaseRepaso2 {

	public static void main(String[] args) {
		// Metemos 3 frases por consola
		// Averigua para cada una: el tamaño de la primera palabra
		// Comprueba si empiezan por A sin importar mayus/minus
		// Comprueba si finalizan por E sin importar mayus/minus

		String[] frases = new String[3];
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i=0; i< frases.length;i++) {
			System.out.println("Introduce la frase numero " + (i+1) );
			frases[i] = entrada.nextLine(); // frases trim upper 
		
			// contar las letras de la primera palabra
			int contador = 0;
			while(frases[i].trim().toUpperCase().charAt(contador) != ' ') {
				contador++;
			}
			System.out.println("Tamaño de la primera palabra de la frase: " + contador);
			
			// comprobar si empiez por A la frase
			System.out.print("La frase empieza por A: ");
			System.out.println(frases[i].trim().toUpperCase().startsWith("A") );
			
			// comprobar si finaliza por E la primera palabra
			System.out.print("La primera palabra " + frases[i].trim().substring(0,contador) + " finaliza por E: ");
			System.out.println(frases[i].trim().toUpperCase().substring(0,contador).endsWith("E"));
		}
		
		entrada.close();
		System.out.println("Fin del programa");
	}

}
