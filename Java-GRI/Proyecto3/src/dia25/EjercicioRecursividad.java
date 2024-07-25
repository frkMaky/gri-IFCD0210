package dia25;

public class EjercicioRecursividad {

	public static void main(String[] args) {
		int resultado = suma(10);
		System.out.println(resultado);
	}

	public static int suma(int k) {
		if (k > 0) {
			return k + suma(k - 1);
		} else {
			return 0;
		}
	}
}
