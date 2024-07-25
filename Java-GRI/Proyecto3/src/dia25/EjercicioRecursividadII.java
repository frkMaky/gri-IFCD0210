package dia25;

public class EjercicioRecursividadII {

	public static void main(String[] args) {
		// resta de números comprendidos entre 8 y 5.
		
		System.out.println( restar(8) );
	}
	public static int restar(int k) {
		if (k == 8) {
			return k + restar(k -1 );
		} else if (k>=5) {
			return --k +  restar(k - 1);
		} else {
			return 0;
		}
	}
}
