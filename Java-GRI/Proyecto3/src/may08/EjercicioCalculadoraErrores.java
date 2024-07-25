package may08;

import java.util.*;

public class EjercicioCalculadoraErrores {

	public static void main(String[] args) {
		/*pide al usuario dos números por consola
		* y la operación (+,-,*,/) y realiza la operación
		* Crea un método suma, otro resta, otro producto y otro
		cociente
		* Captura las excepciones pertinentes.
		*/

		Scanner entrada = new Scanner(System.in);
		
		try {
		
			System.out.println("Introduce un numero entero:");
			int primer = Integer.parseInt( entrada.nextLine() );
			System.out.println("Introduce un segundo numero entero:");
			int segundo = Integer.parseInt( entrada.nextLine() );
			System.out.println("Introduce la operacion (+ , - , * ,/ ) :");
			char operacion = entrada.nextLine().charAt(0);
		
			switch(operacion) {
			case '+':
				System.out.println("Suma: " +  suma(primer,segundo) );
				break;
			case '-':
				System.out.println("Resta: " +  resta(primer,segundo) );
				break;
			case '*':
				System.out.println("Producto: " +  producto(primer,segundo) );
				break;
			case '/':
				System.out.println("Division: " +  cociente(primer,segundo));
				break;
			}
		}
		catch (InputMismatchException e) {
			System.err.println("Tipos de datos incorrectos: " + e.getMessage() );
		}
		catch (ArithmeticException e) {
			System.err.println("Division por 0: " + e.getMessage());
		}
		catch ( Exception e) {
			System.err.println("Ha ocurrido un error: " + e.getMessage());
		}
		finally {
			entrada.close();
		}
	}
	public static int suma(int n1,int n2) {
		return n1+n2;
	}
	public static int resta(int n1,int n2) {
		return n1-n2;
	}
	public static int producto(int n1,int n2) {
		return n1*n2;
	}
	public static int cociente(int n1,int n2) {
		return n1/n2;
	}
	

}
