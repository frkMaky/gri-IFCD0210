package dia29;

public class EjercicioAlumnoIdiomas {

	public static void main(String[] args) {
		/*
		 * Crea una clase llamada AlumnoIdiomas con atributos:
		 * sabeIngles,sabeChino,sabeCastellano crea un método idiomasConocer en donde
		 * concatene los idiomas que sí conoce Crea un alumno con los idiomas inglés y
		 * castellano y llama al método idiomasConocer Crea otro con el idioma chino e
		 * inglés y llama al método idiomasConocer.
		 */

		AlumnoIdiomas alumno1 = new AlumnoIdiomas(false, true, true);
		System.out.println(alumno1.idiomasConocer());

		AlumnoIdiomas alumno2 = new AlumnoIdiomas(true, true, false);
		System.out.println(alumno2.idiomasConocer());

	}

}

class AlumnoIdiomas {

	boolean sabeIngles;
	boolean sabeChino;
	boolean sabeCastellano;

	public AlumnoIdiomas() {
	}

	public AlumnoIdiomas(boolean ingles, boolean chino, boolean castellano) {
		this.sabeIngles = ingles;
		this.sabeChino = chino;
		this.sabeCastellano = castellano;
	}

	public String idiomasConocer() {
		return ((this.sabeChino) ? " Chino":"") +  ((this.sabeIngles) ?  " Inglés" : "") + ((this.sabeCastellano) ? " Castellano" : "");
	}
}
