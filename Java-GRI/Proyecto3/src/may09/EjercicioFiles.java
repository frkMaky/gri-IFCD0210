package may09;

import java.util.*;
import java.io.*;

public class EjercicioFiles {

	public static void main(String[] args) {
		/* 	
		 * Swith case 3 opciones:
		 * - q para salir
		 * - c crear archivo
		 * - d borrar archivo 
		 * . i introducir datos al archivo 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		char opc;
		do {
			menu();
			
			opc = entrada.nextLine().toLowerCase().charAt(0);
			
			switch (opc) {
			case 'c':
				crearArchivo(entrada);
				break;
			case 'd':
				borrarArchivo(entrada);
				break;
			case 'i':
				modificarArchivo(entrada);
				break;
			case 'q':
				System.out.println("Saliendo del programa. Hasta pronto.");
				break;
			default:
				System.out.println("Opción no válida. Intentalo de nuevo");
			}
			
		} while ( opc != 'q' );
		
		System.exit(0);
		entrada.close();
		

	}
	public static void menu() {
		System.out.println("Menu:");
		System.out.println("c - Crear archivo");
		System.out.println("d - Borrar archivo");
		System.out.println("i - Introducir datos al archivo");
		System.out.println("q - salir");
	}
	public static void crearArchivo(Scanner entrada) {
		System.out.print("Nombre de archivo:");
		String nombre = entrada.nextLine().trim();
		File nuevoArchivo = new File ("src/" + nombre);
		
		try {
			if ( nuevoArchivo.createNewFile() ) {
				System.out.println("Archivo creado con éxito");
			} else {
				System.out.println("Archivo ya exite");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void borrarArchivo(Scanner entrada) {
		System.out.print("Nombre de archivo a eliminar:");
		String nombre = entrada.nextLine().trim();
		File borrarArchivo = new File (nombre);
		
		if ( borrarArchivo.delete() ) {
			System.out.println("Archivo eliminado correctamente");
		} else {
			System.out.println("Ocurrió un error al eliminar el archivo");
		}
	
	}
	public static void modificarArchivo(Scanner entrada) {
		System.out.print("Nombre de archivo a modificar:");
		String nombre = entrada.nextLine().trim();
		File modificarArchivo = new File (nombre);
		
		if ( modificarArchivo.exists() ) {
			
			System.out.println("Contenido a añadir:");
			String contenido = entrada.nextLine();
			
			FileWriter escribir;
			try {
				escribir = new FileWriter(modificarArchivo);
				escribir.write( contenido );
				escribir.close();
				System.out.println("Contenido añadido al archivo");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("No existe el archivo indicado");
		}
		
	}

}
