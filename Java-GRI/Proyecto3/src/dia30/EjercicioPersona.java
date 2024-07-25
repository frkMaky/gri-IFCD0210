package dia30;

/** Crea una clase llamada Anciano que tiene el main
 * La clase Pesona tiene los atributos: DNI , nombre completo
 * LA clase Anciano tiene edad 
 * Establece un anciano con dni 11111111R y nombre Pepe Perez, su edad sera 93 años
 * Muestra los datos
 */

public class EjercicioPersona {

	public static void main(String[] args) {

		Anciano anciano1 = new Anciano();
		anciano1.setDni("11111111R");
		anciano1.setNombreCompleto("Pepe Perez");
		anciano1.setEdad(93);
		
		System.out.println( anciano1 );
	}

}
class Persona {
	protected String dni;
	protected String nombreCompleto;
	
	public Persona() {
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombreCompleto=" + nombreCompleto + "]";
	}
	
	
}
class Anciano extends Persona {
	
	private int edad;
	
	public Anciano() {
		this.edad = 80;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return super.toString() + "Anciano [edad=" + edad + "]";
	}

}
