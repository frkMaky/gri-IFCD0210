package dia25;

import java.util.*;

public class EjercicioMetodosIF {

	public static void main(String[] args) {
		/*Se debe mostrar el mensaje "Has ingresado un
        * número de un dígito" si el número es de 1
        * dígito. "Has ingresado dos dígitos" si
        * el número es de 2 dígitos. Y así sucesivamente,
        * como máximo 3 dígitos. Crearás el método
        *sin parámetros de salida y con un parámetro
        *de entrada.
        *introduce num mientras no esté en el rando de 1-3 digitos
        */
		/*
		comprobarDigitos(5);
		comprobarDigitos(15);
		comprobarDigitos(500);
		comprobarDigitos(5000);
		comprobarDigitos(-1);
		comprobarDigitos(-10);
		comprobarDigitos(-100);
		comprobarDigitos(-1000);
		*/
		Scanner entrada = new Scanner (System.in);
		int contador;
		int resultado;
		do {
			System.out.println("Introduce un numero de 1 a 3 digitos");
			resultado = entrada.nextInt();
			contador = String.valueOf(resultado).length();
			
		} while (contador < 1 || contador > 3);
		
		comprobarDigitos(resultado);
		
		entrada.close();
	}
	public static void comprobarDigitos(int numero) {
		
		if (numero >=0 ) {
			if (String.valueOf(numero).length() > 3 ) {
				System.out.println("Numero introducido de mas de 3 digitos");
			} else {
				System.out.println( "Has introducido " +  String.valueOf(numero).length() + " digitos");
			}
		} else {
			if (String.valueOf(numero).length() > 4 ) {
				System.out.println("Numero introducido de mas de 3 digitos");
			} else {
				System.out.println( "Has introducido " +  (String.valueOf(numero).length()-1) + " digitos");	
			}
		}
	}

}
