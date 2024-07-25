package dia29;

public class EjercicioProfesor {

	public static void main(String[] args) {
		/* Tenemos una clase Profesor
		* con dos atributos: dni, asignaturaQueImparte
		* Crea sus getters y setters
		* Crea un objeto en el que estableces el dni a 36111111E
		* y la asignatura que imparte es Matemáticas.
		* Luego muestra esos datos.
		*
		*/
		Profesor profesor1 = new Profesor();
		profesor1.setDni("11111111R");
		profesor1.setAsignaturaQueImparte("Diseño Web");
		
		System.out.println(profesor1);

	}

}
class Profesor {
	
	private String dni;
	private String asignaturaQueImparte;
	
	public Profesor() {
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getAsignaturaQueImparte() {
		return asignaturaQueImparte;
	}

	public void setAsignaturaQueImparte(String asignaturaQueImparte) {
		this.asignaturaQueImparte = asignaturaQueImparte;
	}

	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", asignaturaQueImparte=" + asignaturaQueImparte + "]";
	}
	
	
}