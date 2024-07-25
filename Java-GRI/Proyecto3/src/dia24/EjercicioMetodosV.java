package dia24;

import java.util.Scanner;

public class EjercicioMetodosV {

	public static void main(String[] args) {
		/* 
		* Crea un método que halle el área de un círculo PI *rcuadrado
	    * y otro que halle la circunferencia L = 2PiR
	    * El radio lo coges por consola y muy preciso con decimales
	    * Los dos métodos tienen un parámetro de entrada que será el radio.
	    * El método hallarCirculo no devuelve nada
	    * y el método hallarCircunferencia devuelve la longitud de la circunferencia.
	    * Luego muestra los resultados obtenidos.
	    */
		Scanner entrada = new Scanner(System.in);	
		System.out.println("Introduce el radio:");
		double radio = entrada.nextDouble();
		hallarCirculo(radio);
		System.out.println("Circunferencia: " + hallarCircunferencia(radio));
		entrada.close();

	}
	public static void hallarCirculo(double radio) {
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("Área: " + area);
	}
	public static double hallarCircunferencia(double radio) {
		return 2 * Math.PI * radio;
	}
}
