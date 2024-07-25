import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioScanner2 {

	public static void main(String[] args) {
		// TPedir nombre DNI, edad, peso. 
		// concatenar y validar
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.print("Introduce el nombre: ");
			String nombre = entrada.nextLine();
			
			System.out.print("Introduce el DNI: ");
			String dni= entrada.nextLine();
			
			System.out.print("Introduce tu edad: ");
			int edad = entrada.nextInt();
			
			System.out.print("Introduce tu peso: ");
			float peso = entrada.nextFloat();
			
			System.out.println( nombre.concat(dni).concat(String.valueOf(edad)).concat(String.valueOf(peso)) );
		} 
		catch (InputMismatchException m) {
			System.out.println("No has introducido el formato correcto");
		}
		
		entrada.close();
		
	}

}
