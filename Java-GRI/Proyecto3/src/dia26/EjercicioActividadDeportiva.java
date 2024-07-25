package dia26;

public class EjercicioActividadDeportiva {

	public static void main(String[] args) {
		/*Tenemos una clase ActividadDeportiva con
		varios atributos:
		* nombre (baloncesto), numParticipantes(5),
		diaSemana(Lunes), numPlazasTotales(20)
		* Queremos hacer dos métodos hallarPlazasLibresStatic
		* ( static) y otro hallarPlazasLibresPublic (public) que devuelva
		el número de plazas libres y luego muéstralo.
		*/

		System.out.println( ActividadDeportiva.hallarPlazasLibresStatic() ) ;
	
		ActividadDeportiva miActividad = new ActividadDeportiva();
		System.out.println( miActividad.hallarPlazasLibresPublic() );
		
	}

}
class ActividadDeportiva{
	
	static String nombre = "baloncesto";
	static int numParticipantes = 5;
	static String diaSemana = "Lunes";
	static int numPlazasTotales = 20;
	
	static int hallarPlazasLibresStatic () {
		return numPlazasTotales - numParticipantes;
	}
	public int hallarPlazasLibresPublic () {
		return numPlazasTotales - numParticipantes;
	}
}
