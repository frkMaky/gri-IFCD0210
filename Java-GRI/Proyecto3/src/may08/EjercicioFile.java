package may08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioFile {

	public static void main(String[] args) {
		/**
		 * Crea dos archivos: 1 con los dias de la semana y otro con los meses del año
		 * Muestra todo seguido los dias de la semana y por lineas los meses del año
		 * El archivo diasSemana.txt está en el directorios /src
		 * El archivo mesesAnho.txt esta en el escritorio
		 * 
		 */

		File diasSemana = new File("/home/pablo/Cursos/GRI/Java-GRI/Proyecto3/src/diasSemana.txt");
		File mesesAnho = new File("/home/pablo/Escritorio/mesesAnho.txt");
		
		try {
			Scanner dias = new Scanner(diasSemana);
			
			while (dias.hasNext() ) {
				System.out.print(dias.next() + " ");
			}
			System.out.println();
			dias.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Scanner meses = new Scanner(mesesAnho);
			while (meses.hasNext()) {
				System.out.println(meses.next());
			}
			meses.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


 
	}

}