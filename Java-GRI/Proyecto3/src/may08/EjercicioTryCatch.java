package may08;

public class EjercicioTryCatch {

	public static void main(String[] args) {
		/** Haz la division 100/0 y captura con try catch
		 * Al final muestra 'Fin de programa' */
		
		double resultado;
		
		try {
			resultado = 100/0;
			System.out.println(resultado);
		} 
		catch (ArithmeticException e) {
			System.out.println("Division por 0: " + e.getMessage());
		}
		finally {
			System.out.println("Fin de programa");
		}

	}
}
