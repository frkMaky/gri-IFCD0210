package dia29;

public class EjercicioCoche1 {

	public static void main(String[] args) {
		/* Crea una clase Coche1 con 3 atributos
		* que son numPuertas,modelo, velocidad
		* Crea un constructor con dos parámetros de entrada:
		* modelo y
		* velocidad y crea una instancia de Coche con ese
		* constructor.
		* Crea otro constructor sin parámetros de entrada
		* en donde inicializas numPuertas=5 y modelo=Audi
		* y velocidad =150 (km/h); y crea una instancia de coche
		* con ese constructor.
		*
		*/
		
		Coche1 coche1 = new Coche1();
		Coche1 coche2 = new Coche1("BMW",230);
		System.out.println( coche1 );
		System.out.println( coche2 );

	}

}
class Coche1 {
	int numPuertas;
	String modelo;
	double velocidad;
	
	public Coche1() {
		this.numPuertas = 5;
		this.modelo = "Audi";
		this.velocidad = 150;
	}
	public Coche1(String modelo, double velocidad) {
		this();
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
	@Override
	public String toString() {
		return "Coche1 [numPuertas=" + numPuertas + ", modelo=" + modelo + ", velocidad=" + velocidad + "]";
	}
	
}