import java.util.*;

public class EjercicioComandos {

	public static void main(String[] args) {
		/* *
		 * Comandos: 
		 * A: escribe por consola los numero del 1 al 10
		 * B: Escribe por consola los numeros del 10 al 1
		 * Q: Salimos del programa "FIN DE PROGRAMA"
		 */

		Scanner entrada = new Scanner(System.in);
		char opcion;
		
		 do {
			System.out.println("Menu:");
			System.out.println("A - Numeros del 1 al 10 :");
			System.out.println("B - Numeros del 10 al 1 :");
			System.out.println("Q - Salir ");
			System.out.println("-------------------------");
			System.out.println("Escoge tu opcion");
			opcion = entrada.nextLine().toUpperCase().charAt(0);
			
			switch (opcion) {
			case 'A': {
				for (int i=1;i<=10;i++) {
					System.out.println(i);
				}
				break;
			}	
			case 'B': {
				for (int i=10;i>0;i--) {
					System.out.println(i);
				}
				break;
			}
			case 'Q':
				System.out.println("FIN DE PROGRAMA");
				break;
			default:
				System.out.println("OPCION NO VALIDA");
			}
			
		} while (opcion != 'Q');
		entrada.close();
		System.exit(0);
		
	}

}