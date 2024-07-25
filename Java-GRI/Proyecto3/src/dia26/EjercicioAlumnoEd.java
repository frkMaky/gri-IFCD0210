package dia26;

public class EjercicioAlumnoEd {

	public static void main(String[] args) {
		/* crea una clase llamada AlumnoEd
		* que contenga los atributos
		* edad 20, dni 11111111A, curso 2DAM y crea un método
		* llamado edad2030 que devuelva la edad en 2030
		* si el año actual es 2023. Crea dos objetos.
		* El primero con los datos por defecto.
		* El segundo con dni=22222222A y edad 18
		* Ejecuta el método para cada objeto
		*/
		AlumnoEd alumno1 = new AlumnoEd();
		AlumnoEd alumno2 = new AlumnoEd();
		alumno2.dni = "22222222A";
		alumno2.edad = 18;
		
		System.out.println("Alumno 1 edad en 2030: " + alumno1.devolverEdad() );
		System.out.println("Alumno 2 edad en 2030: " + alumno2.devolverEdad() );
	}

}

class AlumnoEd {
	
	int edad = 20;
	String dni = "11111111A";
	String curso = "2DAM";
	
	int devolverEdad () {
		/*
		LocalDateTime fecha = LocalDateTime.now();
		return this.edad + (2030 - fecha.getYear()) ;
		*/
		
		// Ejercicio año actual 2023
		int anhoActual = 2023;
		return this.edad + (2030 - anhoActual) ;
	}
	
}