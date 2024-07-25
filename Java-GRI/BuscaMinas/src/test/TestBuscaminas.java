package test;

import domain.Tablero;
import java.util.*;

public class TestBuscaminas {
	/**
	 * Minijuego "Busca el tesoro"
	 *
	 * Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
	 * cuatro filas por cinco columnas. El usuario intentará averiguar dónde
	 * está el tesoro.

	*/
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int x, y, intentos;
		boolean encontrado = false;
		
		// Se dispone Tablero de 4x5 con una mina en una posicion
		Tablero tablero = new Tablero();
		System.out.println(tablero.posiscionMina());
		tablero.dibujarTablero();
		System.out.println("Mina 0:"  + tablero.getMina()[0] );
		System.out.println("Mina 1:"  + tablero.getMina()[1] );
		// Se piden posiciones al usuario
		intentos = 5;
		while (intentos > 0 && encontrado == false) {
			System.out.println("Nº de intentos restantes: " + intentos);
			System.out.println("S");
			System.out.println("Introduce x: ");
			x = Integer.parseInt( entrada.nextLine() );
			System.out.println("Introduce y: ");
			y = Integer.parseInt( entrada.nextLine() );
			if ( x != tablero.getMina()[0] || y != tablero.getMina()[1] ) {
				intentos--;
			} else {
				encontrado = true;
				break;
			}
		}
		if (encontrado) {
			System.out.println("Has encontrado el tesoro!!! FELICIDADES !!!");
		} else {
			System.out.println("No te quedan fuerzas para seguir buscando, Vuelve a intentarlo");
		}
		
	}

	
}
