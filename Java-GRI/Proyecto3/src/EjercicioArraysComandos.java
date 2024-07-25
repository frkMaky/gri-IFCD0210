import java.util.*;

public class EjercicioArraysComandos {

	public static void main(String[] args) {
		/** 
		 * Crea un array de 4 posiciones, coge sus valores por consola:
		 * A Introduce valroes por consola
		 * B suma a cada item del array 10
		 * C resta a cada item del array 2 unidades
		 * D muestra los valores del array
		 * Q Salir
		 * */

		// Scanner entrada;
		Scanner entrada = new Scanner (System.in); // se inicializa para resetearla
				
		char opcion;
		int[] miArray = {0,0,0,0};
		
		do {
		
			System.out.println("--------------");
			System.out.println("Menu:");
			System.out.println("A: Introduce Valores ");
			System.out.println("B: Suma 10 a cada item");
			System.out.println("C: Resta 2 a cada item");
			System.out.println("D: Muestra el array");
			System.out.println("Q: Salir");
			System.out.print("Opción escogida: ");
			opcion = entrada.next().toUpperCase().charAt(0);
			
			switch (opcion) {
			case 'A': { // Rellena el array
				for (int i=0;i < miArray.length;i++) {
					System.out.print("Introduce el elemento numero " + i + ": ");
					miArray[i] = entrada.nextInt();
				}
				break;
			}
			case 'B': { // +10 a cada elemento
				System.out.println("Sumando 10 a cada elemento del array");
				for (int i=0;i<miArray.length;i++) {
					miArray[i] = miArray[i]  + 10;
				}
				break;
			}
			case 'C': { // -2 a cada elemento
				System.out.println("Restando 2 a cada elemento del array");
				for (int i=0;i<miArray.length;i++) {
					miArray[i] = miArray[i]  - 2;
				}
				break;
			}
			case 'D': { // Mostrar el array
				System.out.println("Mostrando el array");
				for (int i=0;i<miArray.length;i++) {
					System.out.println("Elemento " + i + ": " + miArray[i]);
				}
				break;
			}
			case 'Q': { // Salir
				System.out.println("Saliendo del programa");
				break;
			}
			default:
				System.out.println("Opción no válida");;
			}
			
		
		} while (opcion != 'Q') ;
		
		entrada.close();
		System.exit(0);
		
	}

}
