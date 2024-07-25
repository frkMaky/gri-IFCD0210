package may08;

import java.io.File; // Importa la clase File

public class EjemploArchivos {

	public static void main(String[] args) {

		File miObj = new File("nombreArchivo.txt");
		if (miObj.exists()) {
			System.out.println("Nombre del fichero: " + miObj.getName());
			System.out.println("Path absoluto: " + miObj.getAbsolutePath());
			System.out.println("Se puede escribir: " + miObj.canWrite());
			System.out.println("Se puede leer: " + miObj.canRead());
			System.out.println("Tamaño del fichero en bytes: " + miObj.length());
		} else {
			System.out.println("El fichero no existe.");
		}

	}

}
