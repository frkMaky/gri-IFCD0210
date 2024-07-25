package dia26;

public class EjercicioCoche2 {

	public static void main(String[] args) {
		/*creamos una clase Coche con atributos:
		* alto=2.00, largo=4.30 y ancho=3.20 en metros
		* luego calcula el tamaño solo en cuanto a largo y
		* ancho mínimo de una plaza de garaje para poder
		* meter el coche (crea para ello un método static)
		* hallarPlaza (añadirle 50 cm a todos los lados)
		*/
		
		System.out.println("Tamaño para la plaza de garage: " + Coche2.calculoPlaza() + " ham2");
	}

}

class Coche2 {
	
	double alto = 2.0;
	static double largo = 4.30;
	static double ancho = 3.20;
	
	static double calculoPlaza() {
		return (largo + 1) * (ancho + 1);
	}
	
}