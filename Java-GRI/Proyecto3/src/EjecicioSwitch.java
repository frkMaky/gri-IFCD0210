import java.util.Scanner;

public class EjecicioSwitch {

	public static void main(String[] args) {
		// Metiendo por consola un dia de la semana muestra si es laborable (l-v) o no 
		
		/*
		 * Scanner entrada = new Scanner(System.in);
		 * 
		 * System.out.println("Introduce un día de la semana"); String dia =
		 * entrada.nextLine().toUpperCase();
		 * 
		 * 
		 * switch( dia ) { case "LUNES": case "MARTES": case "MIERCOLES": case
		 * "MIÉRCOLES": case "JUEVES": case "VIERNES":
		 * System.out.println("Es un dia laborable"); break; case "SABADO": case
		 * "SÁBADO": case "DOMINGO": System.out.println("Es un dia NO laborable");
		 * break; default: System.out.println("\"" +dia +
		 * "\" no es un dia reconocible"); }
		 */
		
		// Utilizando un sqitch, introducir un numero y muestra esta entre 20 y26 y  60y 66/ entre 60 y 100 y no se sabe
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero del 1 al 100");
		int numero = entrada.nextInt();
		switch (numero) {
		case 20: case 21: case 22: case 23: case 24: case 25: case 26: {
			System.out.println("Esta entre 20 y 26");
			break;
		} 
		case 60: case 61: case 62: case 63: case 64: case 65: case 66: {
			System.out.println("Esta entre 60 y 66");
			break;
		}
		default:
			System.out.println("No se sabe");
		}
		
	}

}
