package dia25;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EjerciciosLocalDate {

	public static void main(String[] args) {
		// Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        // Formatear la fecha como una cadena
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaActual.format(formato);
        // Imprimir la fecha formateada
        System.out.println("Fecha actual: " + fechaFormateada);
	}

}
