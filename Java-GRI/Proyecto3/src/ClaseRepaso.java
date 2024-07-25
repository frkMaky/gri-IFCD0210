import java.util.*;

public class ClaseRepaso {

	public static void main(String[] args) {
		// Pide 5 palabras por consola y muestra cual tiene el tamaño mas grande 
		// y muestrala con todo minusculas y luego con todo mayusculas

		/*
		 * Scanner entrada = new Scanner(System.in); String[] palabras = new String[5];
		 * 
		 * for (int i=0;i<5;i++) { System.out.println("Introduce la palabra numero " +
		 * (i+1) ); palabras[i]= entrada.nextLine(); }
		 * 
		 * int mayor = -1; int indice = -1; for (int i=0;i < palabras.length;i++) { if (
		 * mayor < palabras[i].length() ) { mayor = palabras[i].length(); indice = i; }
		 * }
		 * 
		 * System.out.println("La palabra más larga es \"" + palabras[indice] +
		 * "\" con " + mayor + " letras"); System.out.println("En minúsculas: " +
		 * palabras[indice].toLowerCase()); System.out.println("En mayúsculas: " +
		 * palabras[indice].toUpperCase());
		 * 
		 * // Cerrar flujo de datos
		 * entrada.close();
		 */
		
		// Pide una frase por consola y localiza la primera "pe"
		// SI esta entre los primeros 5 caracteres indicarlo
		/*
		 * Scanner entrada2 = new Scanner (System.in);
		 * 
		 * System.out.println("Introduce una frase:"); String frase =
		 * entrada2.nextLine(); int indice2 = frase.indexOf("pe"); if (indice2 < 5 ) {
		 * System.out.println("Está entre los primeros 5 caracteres"); }
		 * System.out.println("\"pe\" se encuentra en el indice: " + indice2);
		 * 
		 * // Cerrar flujo de datos entrada2.close();
		 */
		
		// Pide por consola una palabra y devuelve el ultimo caracter de esta
		/*
		 * Scanner entrada = new Scanner(System.in);
		 * System.out.println("Introduce una palabra: "); String palabra =
		 * entrada.nextLine(); System.out.println("El ultimo caracter es: " +
		 * palabra.charAt (palabra.length()-1 ) );
		 * emtrada.close()
		 */

		// Pide 3 palabras por consola, concatenales y muestra la palabra final
		/*
		 * Scanner entrada = new Scanner(System.in);
		 * System.out.println("Primera palaba: "); String palabra1 = entrada.nextLine();
		 * System.out.println("segunda palaba: "); String palabra2 = entrada.nextLine();
		 * System.out.println("Tercera palaba: "); String palabra3 = entrada.nextLine();
		 * System.out.println("Palabra Concatenada: " +
		 * palabra1.concat(palabra2).concat(palabra3) ); entrada.close();
		 */
		
		// Pide una palabra por consola y si no encuentras el carácter r escribe "No encontrado". Usa Contains
		// Si encuentras sa muestra "sa encontrado" independiente de mayus/minus
		/*
		 * Scanner entrada = new Scanner (System.in);
		 * System.out.println("Introduce una palabra:"); String palabra =
		 * entrada.nextLine(); if (!palabra.contains("r") ) {
		 * System.out.println("r No encontrado"); } else {
		 * System.out.println("r encontrada"); } if
		 * (palabra.toLowerCase().contains("sa") ) {
		 * System.out.println("sa encontrado"); }
		 */
		
		// PIde una frase y comprueba si termmina en coche
		/*
		 * Scanner entrada = new Scanner (System.in);
		 * System.out.println("Introduce una frase:"); String frase =
		 * entrada.nextLine(); System.out.println("¿Termina en coche?: " +
		 * frase.endsWith("coche"));
		 */
		
		// teniendo una cadena asignada a vacia comprueba si esta vacia
		/*
		 * String cadena = ""; System.out.println(cadena.isEmpty());
		 */
		
		// Mete una frase por consola. Junta las 2 primeras palabras de la frase en otra cadeba y muestrala
		/*
		 * Scanner entrada = new Scanner(System.in);
		 * System.out.println("Introduce una frase"); String frase =
		 * entrada.nextLine().trim(); String resultado = ""; int contador = 0; for(int
		 * i=0;i<frase.length()-1;i++) { if ((frase.charAt(i) != ' ')&&(contador < 2)) {
		 * resultado+= frase.charAt(i); }else { contador++; } }
		 * System.out.println(resultado);
		 */
		
		// Loteria: Metemos 6 numeros entre 0-10 poc consola, si coincide con el Math.random() entonces mostramos has ganadado!
		
		int[] apuestas = new int[6]; // Array con los 6 nº jugados por el usuario
		Scanner entrada = new Scanner(System.in);
		boolean ganador = false; // comprueba si ha ganado
		
		// Nª aleatorio: (int) (Math.random() * ((maximo-minimo)+minimo) )
		int maximo = 10;
		int minimo = 0;
		int aleatorio = (int) (Math.round( ( Math.random() * ( (maximo - minimo + 1) + minimo) ) ));
		
		// Datos introducidos del usuario 
		for (int i=0;i<6;i++) {
			System.out.println("Introduce el numero " + (i+1) + " de tu apuesta");
			int numero; // Nº introducido por consola
			do { // Se ejecuta la 1ra vez siempre, comprueba si el numero introducido está entre 0 y 10
				System.out.println("El numero debe estar entre 1 y 10");
				numero = entrada.nextInt();
			} while ( numero < 0 || numero > 10 );
			apuestas[i] = numero; // Si es un nº entre 0 y 10 se guarda como apuesta valida
		}
		
		// Se recorren las apuestar para comprobar si coincide con el nº ganador (aleatorio)
		for (int i=0;i<apuestas.length;i++) {
			if (aleatorio == apuestas[i]) {
				ganador = true;
			}
		}
		
		// Salida por pantalla
		System.out.print("Tu apuesta:  " );
		for (int i=0;i< apuestas.length;i++) {
			System.out.print(apuestas[i] + ", " );
		}
		System.out.println();
		System.out.println("Nº premiado: " + aleatorio );
		System.out.println(ganador?"Has ganado!":"Has Perdido"); 
				
		
	}

}
