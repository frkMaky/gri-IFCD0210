package dia25;

import java.util.Scanner;

public class EjercicioMetodoDoble {

	public static void main(String[] args) {
		/* Crea un método que halle el doble
	    * de un número. Coge el número por consola.
	    * El método hallarDoble tendrá un parámetro
	    * de entrada y uno de salida.
	    * Luego muestra el resultado.
	    */
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		double num = Double.parseDouble( entrada.nextLine() ) ;
		System.out.println("Su doble es " +  dobleNumero( num ) );
		entrada.close();
	}

	public static double dobleNumero(double numero) {
		return numero * 2;
	}
}
