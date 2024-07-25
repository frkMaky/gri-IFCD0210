package dia29;

import java.time.LocalDate;

public class EjercicioEstudianteIntercambio {

	public static void main(String[] args) {
		/* crea un clase EstudianteDeIntercambio
		* en la que conste como atributos:
		* dni, fechanac, fechaInicioInter, fechaFinInter
		* crea un constructor con dos parámetros dni y fechaNac
		* crea un constructor con los 3 primeros parámetros
		* crea un constructor con 4 parámetros
		* Crea un método que devuelva el número de días
		* que estará de intercambio (saberDiasIntercambio)
		* Crea cinco objetos:
		* 2 realizados con el constructor de 4 parámetros
		* y llama al método saberDiasIntercambio
		* 1 realizado con el de 3 parámetros
		* 2 realizado con el de 2 parámetros
		*
		* */
		EstudianteDeIntercambio estudiante1 = new EstudianteDeIntercambio("11111111R",LocalDate.of(1954, 5, 10));
		EstudianteDeIntercambio estudiante2 = new EstudianteDeIntercambio("22222222S",LocalDate.of(1960, 5, 10));
		EstudianteDeIntercambio estudiante3 = new EstudianteDeIntercambio("33333333T",LocalDate.of(1954, 5, 10), LocalDate.of(2024, 2, 10));
		EstudianteDeIntercambio estudiante4 = new EstudianteDeIntercambio("44444444C",LocalDate.of(1954, 5, 10), LocalDate.of(2024, 2, 10), LocalDate.of(2024, 3, 10));
		EstudianteDeIntercambio estudiante5 = new EstudianteDeIntercambio("55555555F",LocalDate.of(1954, 5, 10), LocalDate.of(2024, 2, 10), LocalDate.of(2024, 5, 10));
		
		EstudianteDeIntercambio[] estudiantes = {estudiante1, estudiante2 , estudiante3 , estudiante4 , estudiante5 };
		for (EstudianteDeIntercambio e:estudiantes) {
			System.out.println("Alumno " + e.dni + " Dias de intercambio: " + e.saberDiasIntercambio());
		}
		
		
	}

}
class EstudianteDeIntercambio {
	String dni;
	LocalDate fechanac;
	LocalDate fechaInicioInter;
	LocalDate fechaFinInter;
	
	public EstudianteDeIntercambio() {
	}
	public EstudianteDeIntercambio(String dni, LocalDate fechanac) {
		this.dni = dni;
		this.fechanac = fechanac;
	}
	public EstudianteDeIntercambio(String dni, LocalDate fechanac, LocalDate fechaInicioInter) {
		this.dni = dni;
		this.fechanac = fechanac;
		this.fechaInicioInter = fechaInicioInter;
	}
	public EstudianteDeIntercambio(String dni, LocalDate fechanac, LocalDate fechaInicioInter, LocalDate fechaFinInter) {
		this.dni = dni;
		this.fechanac = fechanac;
		this.fechaInicioInter = fechaInicioInter;
		this.fechaFinInter = fechaFinInter;
	}
	
	public int saberDiasIntercambio() {
		if (this.fechaInicioInter != null && this.fechaFinInter != null) {
			return this.fechaFinInter.getDayOfYear() - this.fechaInicioInter.getDayOfYear();
		} else {
			return 0;
		}
	}
}