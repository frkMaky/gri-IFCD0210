import java.util.Scanner;

public class EjercicioRaizCuadrada {

	public static void main(String[] args) {
		// Mete un numero por consola y devuelve la raiz cuadrada
		// luego elevalo al cuadrado  y dividelo entre 3
		Scanner entrada = new Scanner(System.in);
		

		System.out.println("Introduce un numero:");
		int num = entrada.nextInt();
		
		System.out.println("Su raíz cuadrada es: " + Math.sqrt((double) num));
		System.out.println("Su cuadrado es: " + Math.pow(num, 2));
		System.out.println("y su cuadrado entre 3 es : " + (Math.pow(num, 2)/3));
	}

}
