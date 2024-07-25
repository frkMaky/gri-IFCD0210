package may08;

public class EjemploTryCatch {

	public static void main(String[] args) {
		int[] misNumeros = { 1, 2, 3 };

		try {
			System.out.println(misNumeros[1]); // error
		} 
		catch (Exception e) {
			e.printStackTrace(System.out);
		} 
		finally {
			System.out.println("siempre");
		}
		
		System.out.println("despues del try");
	}
}
