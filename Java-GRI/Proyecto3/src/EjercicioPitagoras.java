import java.util.Scanner;

public class EjercicioPitagoras {

	public static void main(String[] args) {
		// Usa lo necesario para resolver el teorema de pitagoras 
		// para un triángulo rectangulo con catetos de valores 96 y 79. Halla la hipotenusa
		/*
		 * double cateto1 = 96; double cateto2 = 79;
		 * 
		 * // hipotenusa = raiz cuadrada de la suma de los cuadrados de los catetos
		 * double hipotenusa = Math.sqrt( Math.pow(cateto1, 2) + Math.pow(cateto2, 2) )
		 * ;
		 * 
		 * System.out.println("El triangulo de catetos " + cateto1 + " y " + cateto2 +
		 * " tiene una hipotenusa de " + hipotenusa);
		 */
		
		// comprueba si el numero que mete el usuario por consola es positivo o negativo 
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un numero:");
		
		try {
			int numero = entrada.nextInt();
			
			switch ( (int) Math.signum(numero) ) {
			case 0: {
				System.out.println("El numero es 0");
				break;
			}
			case 1: {
				System.out.println("El numero es positivo");
				break;
			}
			case -1: {
				System.out.println("El numero es negativo");
				break;
			}
			default:
				System.out.println("No has introducido un numero");
			}
		} catch(Exception e) {
			System.out.println("No has introducido un numero");
		}
		System.out.println("Fin");
	
	}

}
