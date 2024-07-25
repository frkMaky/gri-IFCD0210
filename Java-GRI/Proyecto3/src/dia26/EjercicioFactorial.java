package dia26;

public class EjercicioFactorial {

	public static void main(String[] args) {
		// Factorial

		System.out.println( factorial(5) );
	}
	
	public static double factorial(int k) {
		if (k > 0) {
			return k * factorial (k -1);
		} else {
			return 1;
		}
	}
}
