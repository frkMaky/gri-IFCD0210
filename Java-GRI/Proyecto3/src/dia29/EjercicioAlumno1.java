package dia29;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EjercicioAlumno1 {

	public static void main(String[] args) {
		/*Crea una clase Alumno1 con 3 atributos:
		* dni,nombreCompleto,fechaNac.
		* Hay que crear un constructor con 3 parámetros.
		* Crear un método que sea mostrarEdadActual que
		* muestre la edad actual.
		* Crea 4 objetos de tipo Alumno y halla la edad
		* actual de cada uno de ellos.
		*/
		Alumno1 al1 = new Alumno1 ("11111111R","Jacinto Garcia",LocalDate.of(1954, 5, 10));
		Alumno1 al2 = new Alumno1 ("22222222S","Marisa Perez",LocalDate.of(1984, 6, 20));
		Alumno1 al3 = new Alumno1 ("33333333T","Pepe Lopez",LocalDate.of(1991, 2, 9));
		Alumno1 al4 = new Alumno1 ("44444444V","Ana Smith",LocalDate.of(2012, 1, 18));
		
		Alumno1[] alumnos = {al1,al2,al3,al4};
		for (Alumno1 a:alumnos) {
			System.out.print("Edad actual del alumno "+ a.nombreCompleto +  " ");
			a.edadActual();
			System.out.println(" años");
		}
	}

}
class Alumno1 {
	
	String dni;
	String nombreCompleto;
	LocalDate fechaNac;
	
	public Alumno1 () {
		
	}
	public Alumno1 (String dni, String nombreCompleto, LocalDate fechaNac) {
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
		this.fechaNac = fechaNac;
	}
	public void edadActual() {
		System.out.print( LocalDateTime.now().getYear() - this.fechaNac.getYear() );
	}
	@Override
	public String toString() {
		return "Alumno1 [dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", fechaNac=" + fechaNac + "]";
	}
	
	
}