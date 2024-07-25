package dia26;

import java.time.LocalDateTime;

public class EjercicioPerro {

	public static void main(String[] args) {
		/*Crea una clase Perro2 que contenga los atributos siguientes:
		* nombrePerro
		* razaPerro
		* edadPerro
		* Crea un método estimarEdad en donde
		* estimes la edad en 2050
		* Crea un objeto: Lucas,Salchicha,1.5
		* Crea otro objeto: Spock,Bulldog,2.0
		* Modifica el nombre del segundo objeto por Shelly
		* Llama al método estimarEdad en los dos objetos
		* Crea también un método toString en donde se

		* recoja la información de los datos de cada
		* objeto.
		* */
		Perro2 perro1 = new Perro2 ("Luca","Salchicha", 1.5);
		Perro2 perro2 = new Perro2 ("Spock","Bulldog", 2.0);
		
		System.out.println("El perro " + perro1.nombrePerro + " tendra en 2050 " +  perro1.estimarEdad()  + " años");
		System.out.println("El perro " + perro2.nombrePerro + " tendra en 2050 " +  perro2.estimarEdad()  + " años");
		
		System.out.println(perro1);
		System.out.println(perro2);
	}

}
class Perro2 {
	
	String nombrePerro;
	String razaPerro;
	double edadPerro;
	
	public Perro2() {
	}
	public Perro2 (String nombrePerro, String razaPerro, double edadPerro) {
		this.nombrePerro = nombrePerro;
		this.razaPerro = razaPerro;
		this.edadPerro = edadPerro;
	} 
	public double estimarEdad() { // Devuelve la edad estimada en 2050
		return (2050- LocalDateTime.now().getYear()) + this.edadPerro;
	}
	@Override
	public String toString() {
		return "Perro [nombrePerro=" + nombrePerro + ", razaPerro=" + razaPerro + ", edadPerro=" + edadPerro + "]";
	}
	
	
	
}