package ejercicios;

public class ejercicio1 {

	public static void main(String[] args) {
		/*
		 * 1. Escribe un método Java para encontrar el número más pequeño entre tres números.
			Datos de prueba:
			Ingrese el primer número: 25
			Ingrese el segundo número: 37
			Ingrese el tercer número: 29
		 */
		System.out.println( masPequenho(5, 6, 7));
		System.out.println( masPequenho(7, 6, 5));
		System.out.println( masPequenho(5, 7, 6));
		System.out.println( masPequenho(5, 5, 5));
	}
	public static int masPequenho(int numA,int numB,int numC) {
		
		
		int resultado;
		
		if (numA > numB) {
			if (numC > numB) {
				resultado = numB;
			} else {
				resultado = numC;
			}
		} else if (numA > numC) {
			if (numB > numC) {
				resultado = numC;
			} else {
				resultado = numB;
			}
		} else {
			resultado = numA;
		}
		
		return resultado;
		
	}

}
