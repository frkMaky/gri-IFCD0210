import java.util.Iterator;

public class EjemploContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}
		
		// Escribe los multiplos de 5 de 20 a 50. En 40 no imprimes
		int num = 20;
		while (num <= 50) {
			if ( num == 40 ) {
				num += 5;
				continue;
			}
			System.out.println(num);
			num +=5;
		}
		
		// Escribe los pares del 10 al 50 no imprimas el 22 y para cuando llegues al 30.
		for (int i=10;i<=50;i+=2) {
			if ( i == 22) {
				continue;
			}
			System.out.println(i);
			if ( i == 30) {
				break;
			}
			
		}
	}

}
