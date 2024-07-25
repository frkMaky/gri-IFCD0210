
public class EjercicioArrayMultidimensional {

	public static void main(String[] args) {
		/**
		 * Crear un array de 2 dimensiones 
		 * Datos del primer subarray: 9.5, 3.2, 4.7
		 * Datos del segundo subarray: 1.2, 4.9
		 * Muestrar el elemento 4.7 
		 * Cambia el 1.2 por 2.5
		 */
		
		double[][] tabla = { {9.5, 3.2, 4.7}, {1.2, 4.9} };

		System.out.println(tabla[0][2]);
		tabla[1][0] = 2.5;
		System.out.println(tabla[1][0]);
		
		// Amplia el programa anterior para recorrer el array y mostrar tanto el dato como la posicion
		for (int i= 0; i<tabla.length;i++) {
			for (int j=0;j<tabla[i].length;j++) {
				System.out.print(" [" +  i + "][" + j + "] = " + tabla[i][j] );
			}
			System.out.println();
		}
	}

}
