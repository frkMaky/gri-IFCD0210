import java.util.Scanner;

public class EjercicioSigmun {

	public static void main(String[] args) {
		/*Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). 
		 * El programa debe informar de cuántos números introducidos son mayores que 0, 
		 * menores que 0 e iguales a 0. */
		
		Scanner entrada = new Scanner(System.in);
		
		// Tamaño del array
		System.out.println("¿Cuantos numeros vas a introducir?");
		int nums = entrada.nextInt();
		int[] numeros = new int[nums];
		
		// Numeros introducidos por el usuario
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el numero " + (i+1) + ":");
			numeros[i] = entrada.nextInt();
		}
		
		// Contar y comprobar mayores, menores e iguales a 0 
		int menores = 0;
		int mayores = 0;
		int iguales =0;
		for (int i = 0; i < numeros.length; i++) {
			switch( (int) Math.signum(numeros[i]) ) {
				case 0:
					iguales++;
					break;
				case 1:
					mayores++;
					break;
				case -1:
					menores++;
					break;
			}
		}
		
		// Salida por pantalla
		System.out.println("Numeros iguales a 0: " +  iguales);
		System.out.println("Numeros menores a 0: " +  menores);
		System.out.println("Mumeros mayores a 0: " +  mayores);
		

	}

}
