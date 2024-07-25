import java.util.Arrays;

public class EjercicioArrayComparar {

	public static void main(String[] args) {
		// Crea 2 arrays de la misma dimension y comprueba si son iguales
		// Muestra si son o no iguales
		
		int[] array1 = {1,2,3};
		int[] array2 = {1,2,3};

		// Ref Memoria
		System.out.println(array1.equals(array2)?"Son iguales":"Son distintos");
		
		// Contenido
		System.out.println(Arrays.equals(array1, array2)?"Mismo contenido":"Diferente contenido");
		
		// Crea un array de 40 posiciones y mete dentro  el numero 80 en todas
		// Muestra el contenido del arraya
		int[] miArrayRelleno = new int[40];
		Arrays.fill(miArrayRelleno, 80);
		System.out.println(Arrays.toString(miArrayRelleno));
	}
}