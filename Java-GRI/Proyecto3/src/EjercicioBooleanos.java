import java.util.Scanner;

public class EjercicioBooleanos {

	public static void main(String[] args) {
		// Muestra si podemos ir de excursion. Podremos ir si se apuntan al menos el 60% de las personas de clase (15)
		// Pide por consola el nº de personas apuntadas
		/*
		 * Scanner entrada = new Scanner (System.in);
		 * 
		 * System.out.
		 * println("¿Cuántas personas se han apuntado para ir de excursión?: ");
		 * 
		 * final int total = 15; // total personas int apuntados = entrada.nextInt(); //
		 * personas apuntadas
		 * 
		 * System.out.println("Total apuntados: " + apuntados);
		 * System.out.println("Minimo para poder ir de excursion: " + (total*0.6)); if
		 * (apuntados >= (total * 0.6) ) {
		 * System.out.println("Podemos ir de excursión"); } else {
		 * System.out.println("No podemos ir de excursión"); }
		 */

		// usa el operador ternario para conseguir el mismo resultado que el if
		/*
		 * if (num<10) { System.out.println("Es menor"); } else if(num>10) {
		 * System.out.println("Es mayor"); } else { System.out.println("Es igual"); }
		 */	
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un numero");
		int num = entrada.nextInt();
		
		System.out.println(num<10?"Es menor":num>10?"Es mayor":"Es igual");
	}

}
