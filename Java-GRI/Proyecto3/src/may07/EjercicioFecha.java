package may07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EjercicioFecha {

	public static void main(String[] args) {

		// Mostrar la fecha actual
		// LocalDate fecha = LocalDate.now();
		// DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		// System.out.println(fecha.format(formato));

		// Mostrar la hora actual
		/*
		 * LocalTime hora = LocalTime.now(); formato =
		 * DateTimeFormatter.ofPattern("HH:mm:ss");
		 * System.out.println(hora.format(formato));
		 */

		// Mostar fecha y hora actual
		/*
		 * LocalDateTime fechaHora = LocalDateTime.now(); formato =
		 * DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		 * System.out.println(fechaHora.format(formato));
		 */

		// Indica que dia de la semana sera el 27 de abril de 2028
		LocalDate fecha = LocalDate.of(2028, 4, 27);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy E");
		System.out.println(fecha.format(formato));

		// De la fecha anterior restale 40 dias y muestra el dia de la semana

		System.out.println(fecha.minusDays(40).format(formato));

	}

}
