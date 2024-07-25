package dia29;

public class EjercicioCamion {

	public static void main(String[] args) {
		/*Crea una clase Camión con dimensiones de alto 5.00m, ancho=3.00 m
		* y largo=20.00 m, pero inicializa sus valores en el constructor SIN PARAMETROS
		* crea un método público que halle el tamaño en volumen del camión.
		* Muestra la propiedad alto
		*/
		Camion camion1 = new Camion(5,20,3);
		camion1.calcularVolumen();
		System.out.println("Altura: " + camion1.alto);
	}

}
class Camion {
	double alto;
	double ancho;
	double largo;
	
	public Camion () {
		this.alto = 5.0;
		this.ancho = 3.0;
		this.largo = 20.0;
	}
	
	public Camion (double alto, double largo, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
	}
	
	public void calcularVolumen () {
		System.out.println("Volumen: " + (this.largo*this.ancho*this.alto) + " m3");
	}
	
	@Override
	public String toString() {
		return "Camion [alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + "]";
	}
	
}