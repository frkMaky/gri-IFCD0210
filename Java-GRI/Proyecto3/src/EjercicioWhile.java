import java.util.Scanner;

public class EjercicioWhile {
	
	public static void main (String[] args) {
		/* Pide 10 números por consola comprendidos
	    * entre 20 y 30. Si no están en ese rango
	    * vuélvelos a pedir.
	    * Luego haz la media de ellos.
	    */
		Scanner entrada = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		int numero = 0;
		int contador = 0;
		while (contador < 10) {
			numero = 0;
			contador++;
			System.out.println("Introduce un numero entre 20 y 30 (elemento numero: " + contador + ")");
			while (numero <20 || numero>30) {
				System.out.print("El numero debe estar entre 20 y 30: ");
				numero = entrada.nextInt();
			}
			numeros[contador-1] = numero;
		}
		
		int suma = 0;
		for (int i=0;i<numeros.length;i++) {
			//System.out.println("Elemento "+ i +": " + numeros[i]);
			suma += numeros[i];
		}
		double media = suma/numeros.length;
		System.out.println("La media es " + media);
	}

}
