package dia29;

public class EjercicioPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona();
		Persona p2 = new Persona("11111111R");

		System.out.println(p1);
		System.out.println(p2);

		/*realizar un objeto p3 con un
        * constructor con dos parámetros de
        * entrada y mostrar sus datos
        */
		Persona p3 = new Persona("22222222V", "Diseño Web");
		System.out.println(p3);

	}

}

class Persona {

	String dni;
	String cursoEspecialidad;

	public Persona() {
		this.dni = "";
		this.cursoEspecialidad ="";
	}
	public Persona(String dni) {
		this.dni = dni;
		this.cursoEspecialidad ="";
	}
	public Persona(String dni, String cursoEpecialidad) {
		this.dni = dni;
		this.cursoEspecialidad = cursoEpecialidad;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", cursoEspecialidad=" + cursoEspecialidad + "]";
	}

}