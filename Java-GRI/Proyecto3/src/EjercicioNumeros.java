import java.util.Scanner;

public class EjercicioNumeros {

	public static void main(String[] args) {
		// Introduce x números por consola. Hacer la suma mientras el número no sea -1

		Scanner entrada = new Scanner (System.in);
		
		int numero = 0;
		int total = 0;
		
		while(numero != -1) {
			if (numero !=-1) {
				System.out.println("Introduce un número: ");
				numero = entrada.nextInt();
				total += numero;
			}
		}
		System.out.println("Suma total: " + total);
		
		entrada.close();
		
	}

}
