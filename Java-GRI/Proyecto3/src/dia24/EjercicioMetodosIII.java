package dia24;

import java.util.Scanner;

public class EjercicioMetodosIII {

	public static void main(String[] args) {
		/* Crea un método llamado sumar
        * que tenga 2 parámetros de entrada
        * y uno de salida que será el resultado
        * de la suma.
        * Luego muestra el resultado
        */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Primer numero:");
		int n1 = entrada.nextInt();
		System.out.println("Segundo numero:");
		int n2 = entrada.nextInt();
		System.out.println(sumarTexto(n1,n2));
		entrada.close();	
	}
	public static String sumarTexto(int a, int b) {
		
		int suma = a + b;
		String cadena ="";
		switch (suma) {
		case 0: 
			cadena = "cero";
			break;
		case 1: 
			cadena = "uno";
			break;
		case 2: 
			cadena = "dos";
			break;
		case 3: 
			cadena = "tres";
			break;
		case 4: 
			cadena = "cuatro";
			break;
		default:
			cadena = "indefinido";
		}
		return cadena;
	}

}
