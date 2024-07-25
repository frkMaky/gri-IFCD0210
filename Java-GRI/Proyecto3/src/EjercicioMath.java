import java.util.Scanner;

public class EjercicioMath {

	public static void main(String[] args) {
		// Di que devuelven ceil y floor para 7.92 y el numero 7.32
		/*
		 * double num = 7.92; double num2 = 7.32;
		 * 
		 * System.out.println("Numero "+ num);
		 * System.out.println("Ceil redondea hacia arriba: " + Math.ceil(num));
		 * System.out.println("Floor redondea hacia abajo: " + Math.floor(num));
		 * System.out.println("Round: " + Math.round(num));
		 * 
		 * System.out.println("Numero "+ num2);
		 * System.out.println("Ceil redondea hacia arriba: " + Math.ceil(num2));
		 * System.out.println("Floor redondea hacia abajo: " + Math.floor(num2));
		 * System.out.println("Round: " + Math.round(num2));
		 * 
		 * // halla el seno coseno y tangente de un numero en grados que metes por
		 * consola Scanner entrada = new Scanner(System.in);
		 * System.out.println("Medida en grados"); int grados = entrada.nextInt(); int
		 * radianes = (int) Math.toRadians(grados);
		 * 
		 * System.out.println("Seno: " + Math.sin(radianes));
		 * System.out.println("Coseno: " + Math.cos(radianes));
		 * System.out.println("Tangente: " + Math.tan(radianes));
		 */
		
		//  convierte 2PI rad en grados y muéstralo por consola (2PI rad = 180º)
		double rad = 2*Math.PI;
		double grados  = Math.toDegrees(rad);
		
		System.out.println(grados);
		
		
	}

}
