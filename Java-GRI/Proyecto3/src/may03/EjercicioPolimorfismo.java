package may03;

import java.util.*;

public class EjercicioPolimorfismo {
		
	public static void main(String[] args) {

		ListinProfesores listin = new ListinProfesores();
		listin.addProfesor(new ProfesorInterino("Manolo","Garcia",45,"11111111R", new GregorianCalendar() ) );
		listin.addProfesor(new ProfesorTitular("Lola","Perez",25,"111111112R") );
		listin.addProfesor(new Profesor("Juan","Gonzales",34,"11111113R") );
		
		listin.addProfesor(new ProfesorInterino("Pedro","Garcia",20,"11111114R", new GregorianCalendar(2024, 4, 20) ) );
		listin.addProfesor(new ProfesorInterino("Lucia","Garcia",50,"11111115R", new GregorianCalendar(2024, 4, 7) ) );
		
		listin.listar();
	}

}
class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;

	public Persona() {
		
	}
	public Persona(String nombre, String apellidos, int edad, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni=" + dni + "]";
	}
	
	
}

class Profesor extends Persona {
	
	private int idProfesor;
	private static int contadorProfesor = 0;
	
	public Profesor () {
		this.idProfesor = ++Profesor.contadorProfesor;
	}
	public Profesor (String nombre, String apellidos, int edad, String dni) {
		super(nombre,apellidos,edad, dni);
		this.idProfesor = ++contadorProfesor;

	}
	public int getIdProfesor() {
		return idProfesor;
	}
	
	public String mostrarDatos() {
		return "Nombre: " + this.getNombre() + " Edad: " + this.getEdad() + " ID: " + this.idProfesor + " DNI: " + super.getDni();
	}
	@Override
	public String toString() {
		return "Profesor [idProfesor=" + idProfesor + ", dni=" + super.getDni() + "]";
	}

	
	
}
class ProfesorTitular extends Profesor {
	
	public ProfesorTitular() {
		
	}
	public ProfesorTitular(String nombre, String apellidos, int edad, String dni) {
		super(nombre,apellidos,edad, dni);
	}
}
class ProfesorInterino extends Profesor {
	
	private Calendar fechaIniInterino;
	
	public ProfesorInterino() {
		this.fechaIniInterino = new GregorianCalendar();
		
	}
	public ProfesorInterino(Calendar fecha) {
		this.fechaIniInterino = fecha;
		
	}
	public ProfesorInterino(String nombre, String apellidos, int edad, String dni) {
		super(nombre,apellidos,edad, dni);
		this.fechaIniInterino = new GregorianCalendar();
	}
	public ProfesorInterino(String nombre, String apellidos, int edad,String dni, Calendar fecha) {
		super(nombre,apellidos,edad, dni);
		this.fechaIniInterino = fecha;
	}
	public Calendar getFechaIniInterino() {
		return fechaIniInterino;
	}
	public void setFechaIniInterino(Calendar fechaIniInterino) {
		this.fechaIniInterino = fechaIniInterino;
	}
	public String mostrarDatos() {
		return super.mostrarDatos() + " Datos Profesor Interino. Comienzo interinidad: " + this.fechaIniInterino.getTime() ;
	}
	@Override
	public String toString() {
		return super.toString() + "ProfesorInterino [fechaIniInterino=" + fechaIniInterino.getTime() + "]";
	}
	
}
class ListinProfesores {
	private ArrayList<Profesor> profesores;
	
	public ListinProfesores() {
		this.profesores = new ArrayList<Profesor>();
	}
	public void addProfesor(Profesor profesor) {
		this.profesores.add(profesor);
	}
	public void listar() {
		for (Profesor p:this.profesores) {
			System.out.println( p.mostrarDatos() );
		}
	}
}

