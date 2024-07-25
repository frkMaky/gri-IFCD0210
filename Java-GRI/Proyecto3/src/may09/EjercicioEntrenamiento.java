package may09;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjercicioEntrenamiento {

	public static void main(String[] args) {
		try {
			File miObj = new File("src/diasEntrenamiento.txt");
			if (miObj.createNewFile()) {
				System.out.println("Fichero creado: " + miObj.getName());
				
				FileWriter miWriter = new FileWriter(miObj);
				miWriter.write("Martes\n");
				miWriter.write("Jueves\n");
				miWriter.close();
				
			} else {
				System.out.println("Fichero ya existe.");

				System.out.println(miObj.getAbsolutePath());
			}
			
			
			if ( miObj.delete() ) {
				System.out.println("Archivo borrado");
			} else {
				System.out.println("Error al borrar el archivo");
			}
			
		} catch (IOException e) {
			System.out.println("Ocurrió un error.");
			e.printStackTrace();
		}

	}

}
