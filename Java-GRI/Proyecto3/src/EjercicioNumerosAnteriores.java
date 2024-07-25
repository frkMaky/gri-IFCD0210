
public class EjercicioNumerosAnteriores {

	public static void main(String[] args) {
		// Numeros del 10 al 20 muestra los tres numeros anteriores
		for (int i=10;i<=20;i++) {
			for (int j=1;j<=3;j++) {
				System.out.println(i-j);
			}

			System.out.println("----");
		}
		
		// Pos*tenemos los números del 100 al 120. Por cada número muestra los 5 pares posteriores de cada número

		for (int i =100; i<=120;i++) {
			System.out.println(i);
			if (i%2==0) {	// PAR
				for (int j=2;j<=10;j+=2) {
					System.out.println(i+j);
				}	
			} else {	// Impar
				for (int j=1;j<=9;j+=2) {
					System.out.println(i+j);
				}
			}
			System.out.println("-----");
		}
		
		
		// Ejemplo break - continue
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
	}

}
 