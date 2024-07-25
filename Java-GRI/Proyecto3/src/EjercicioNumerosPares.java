import java.util.Scanner;

public class EjercicioNumerosPares {

	public static void main(String[] args) {
		// Escribe un programa que imprima todos los numeros pares entre dos numeros que se pidan al usuario
		
		Scanner entrada = new Scanner (System.in);
		
		int num1, num2;
		int inicioPares = -1;
		int finalPares = -1;
		int contadorPares = 0;
		
		System.out.println("Introduce el numero de inicio");
		num1 = entrada.nextInt();
		System.out.println("Introduce el numero de fin");
		num2 = entrada.nextInt();
		
		// Ordenar de inicio a final 
		inicioPares = Math.min(num1, num2);
		finalPares = Math.min(num1, num2);
		
		for ( int i=inicioPares; i<=finalPares; i++) {
			if(i%2==0) {
				System.out.println(i);
				contadorPares++;
			}
		}
		if (contadorPares==0) {
			System.out.println("No hay ningún numero par en el rango establecido");
		}
		
		
		
	}

}
