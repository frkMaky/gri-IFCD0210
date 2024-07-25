package dia25;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EjercicioLocalDateII {

	public static void main(String[] args) {
		/**
		 * Halla la fecha actual sumale 3 años, quitale 2 meses y quitale 5 dias Luego
		 * muestrala en formato español
		 */
		LocalDate fecha = LocalDate.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Fecha inicial: " + fecha.format(formato));
		System.out.println("El año es " + fecha.getYear());
		System.out.println("El mes es " + fecha.getMonthValue());
		System.out.println("El día es " + fecha.getDayOfMonth());
		
		fecha = fecha.plusYears(3);
		fecha = fecha.minusMonths(2);
		fecha = fecha.minusDays(5);

		System.out.println("Fecha resultado: " + fecha.format(formato));

	}

}
