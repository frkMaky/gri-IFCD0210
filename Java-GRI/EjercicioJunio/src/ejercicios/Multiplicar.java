package ejercicios;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		// Escribe un probada JAva para mostrar la tabla de multiplicar de un numero entero dado
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el numero: ");
		
		int numero = entrada.nextInt();
		
		tablaMultiplicar(numero);
		
		entrada.close();
	}
	
	public static void tablaMultiplicar(int numero) {
		
		for (int i=1;i <=10;i++ ) {
			System.out.println(numero + " * " + i + " = " + (i*numero));
		}
	}

}
