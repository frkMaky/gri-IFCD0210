import java.util.Scanner;

public class EjercicioScanner {

	public static void main(String[] args) {
		// Introduce por consola un valor booleano
		// veredadero escribe pares del 10 al 20
		// falso impares del 10 al 20

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿true o false?");
		boolean opcion = entrada.nextBoolean();
		for(int i=10;i<=20;i++) {
			if (opcion) {
				if (i%2==0) {
					System.out.println(i);
				}
			} else {
				if (i%2!=0) {
					System.out.println(i);
				}
			}
		}
		entrada.close();
	
	}

}
