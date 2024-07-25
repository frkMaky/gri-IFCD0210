package ejercicios;


public class Estudiante {
	private String curso;
	private int edad;
	private String dni;
	private String nombre;
	
	public Estudiante() {
	}
	
	public Estudiante(String curso, int edad, String dni, String nombre) {
		this.curso = curso;
		this.edad = edad;
		this.dni = dni;
		this.nombre= nombre;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Estudiante [curso=" + curso + ", edad=" + edad + ", dni=" + dni + ", nombre=" + nombre + "]";
	}

}