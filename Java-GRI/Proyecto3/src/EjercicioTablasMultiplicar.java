
public class EjercicioTablasMultiplicar {

	public static void main(String[] args) {
		// Raliza las tablas de multiplicar con bucles anidados
		for(int i=1;i<=10;i++) {
			System.out.println("Tabla del " + i);
			for(int j=1;j<=10;j++) {
				System.out.println( i + " * " + j + " = " + (i*j));
			}
			System.out.println("--------------------------------");
		}

	}

}
