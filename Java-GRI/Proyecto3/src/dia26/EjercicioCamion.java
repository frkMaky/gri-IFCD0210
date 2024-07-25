package dia26;

public class EjercicioCamion {

	public static void main(String[] args) {

		/*Crea una clase Camión con
		* dimensiones de alto 5.00m, ancho=3.00 m
		* y largo=20.00 m, de donde 4 metros de largo
		* son de cabina
		* crea un método público que halle el tamaño
		* de la zona de carga (hallarZonaCarga)
		*/
		
		Camion miCamion = new Camion ();
		System.out.println( miCamion.hallarZonaCarga() );
		
	}

}
class Camion {
	
	double alto = 5.0;
	double ancho = 3.0;
	double largo = 20.0;
	
	public double hallarZonaCarga() {
		// 4 metros de largo son de cabina
		return this.alto * this.ancho * (this.largo - 4.0);
	}
	
}
