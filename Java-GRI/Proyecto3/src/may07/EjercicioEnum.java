package may07;

public class EjercicioEnum {

	public static void main(String[] args) {
		/** Crea un enum de dias de la semana y muestra si es fin de semana o laboral
		 * */
		
		DiasSemana dia = DiasSemana.SABADO;
	
		if (dia == DiasSemana.LUNES || dia == DiasSemana.MARTES || dia == DiasSemana.MIERCOLES || dia == DiasSemana.JUEVES 
				|| dia == DiasSemana.VIERNES) {
			System.out.println("Es dia laborable");
		} else {
			System.out.println("Es fin de semana");
		}
		
		DiasSemana[] semana = {
				DiasSemana.LUNES,DiasSemana.MARTES,DiasSemana.MIERCOLES,DiasSemana.JUEVES,DiasSemana.VIERNES,DiasSemana.SABADO,DiasSemana.DOMINGO
		};
		
		for (DiasSemana d: semana) {
			System.out.println( d );
		}
		
	}

}

enum DiasSemana {
	LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}
