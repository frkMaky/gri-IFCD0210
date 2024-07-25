package ejercicios;

import java.util.Scanner;

public class Rombo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe el número de filas: ");
		
		int nfilas = sc.nextInt();
		
		
		int c = 1; // columnas
		int f = 1; // filas 
	
		int numeroLinea = 1; // Ponemos un contador para saber en que linea vamos 

		// CUENTA LAS FILAS 
		
		while(f<=nfilas) { // MITAD SUPERIOR DEL ROMBO

				for (int j=1;j<= (nfilas - numeroLinea);j++ ) { // Espacios
					System.out.print(" ");
				}
				for (int j=1;j<= ( (2*numeroLinea) - 1 ) ;j++ ) { // Asteriscos por linea
					System.out.print("*");
				}

				numeroLinea++; // pasamos a la siguiente linea
			f++;
			System.out.println(" ");
		}

		// MITAD INFERIOR 
		f = nfilas;
		numeroLinea = nfilas;
		
		while(f>=1) { // MITAD INFERIOR DEL ROMBO

			for (int j=1;j<= (nfilas - numeroLinea);j++ ) { // Espacios
				System.out.print(" ");
			}
			for (int j=1;j<= ( (2*numeroLinea) - 1 ) ;j++ ) { // Asteriscos por linea
				System.out.print("*");
			}

			numeroLinea--; // pasamos a la siguiente linea (descontando)
			f--;
			System.out.println(" ");
		}

	}

}
