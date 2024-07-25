package dia29;

public class EjercicioAlumnoMates {

	public static void main(String[] args) {
		/*Crea una clase AlumnoMates
		* con 2 atributos: dni, isMatriculado.
		* Genera los getters y setters.
		* Considera el constructor que viene por defecto
		* Crea un objeto y mete su dni a "36111111A"
		* y matriculado a true.
		* Luego muestra los datos
		*
		*/
		AlumnoMates alumno1 = new AlumnoMates();
		alumno1.setDni("36111111A");
		alumno1.setMatriculado(true);
		
		System.out.println(alumno1);
	}

}
class AlumnoMates {
	
	private String dni;
	private boolean isMatriculado;
	
	public AlumnoMates() {
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean isMatriculado() {
		return isMatriculado;
	}

	public void setMatriculado(boolean isMatriculado) {
		this.isMatriculado = isMatriculado;
	}

	@Override
	public String toString() {
		return "AlumnoMates [dni=" + dni + ", isMatriculado=" + isMatriculado + "]";
	}
	
	
}