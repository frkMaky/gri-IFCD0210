package dia26;

public class EjercicioAlumno {

	public static void main(String[] args) {
		/* atributos de Alumno: edad= 20, curso= 2DAM*/
		/*crea 3 objetos de tipo Alumno
		pepe, jose, juan y a jose le cambiamos el curso
		a 1DAM y a juan le cambiamos la edad a 19*/
		
		Alumno pepe = new Alumno();
		Alumno jose = new Alumno();
		Alumno juan = new Alumno();
		
		jose.curso = "1DAM";
		juan.edad = 19;
		
		System.out.println("Pepe: " + pepe.curso + " " + pepe.edad);
		System.out.println("José: " + jose.curso + " " + jose.edad);
		System.out.println("Juan: " + juan.curso + " " + juan.edad);

	}

}
class Alumno {
	int edad = 20;
	String curso = "2DAM";
}
