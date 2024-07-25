package dia29;

public class EjercicioRueda {

	public static void main(String[] args) {
		/* Tenemos una clase Rueda
		* con dos atributos:
		* marca y numItems
		* Luego tenemos un método hallarNumRuedas según
		* vehículo: suponemos que hay motos, coches y
		* sidecars
		* este método tiene que tener un parámetro de
		* entrada de tipo cadena que puede ser moto o coche o
		sidecar
		* Queremos un constructor sin parámetros en donde
		* inicializamos marca Michelín y 20000000 unidades
		* QUeremos otro constructor con dos parámetros
		* en donde indicamos marca GoodYear y 300000000 unidades.
		* Crea dos objetos, uno con cada constructor
		* y llama al método hallarNumRuedas.
		* Crea también el método toString() para obtener
		* toda la info asociada con el objeto.
		*/
		Rueda item1 = new Rueda();
		Rueda item2 = new Rueda("GoodYear",300000000);
		
		item1.hallarNumRuedas("coche");
		item1.hallarNumRuedas("moto");
		item1.hallarNumRuedas("sidecar");
		
		item2.hallarNumRuedas("coche");
		item2.hallarNumRuedas("moto");
		item2.hallarNumRuedas("sidecar");

	}

}
class Rueda {
	int numItems;
	String marca;
	
	public Rueda() {
		this.marca = "Michelin";
		this.numItems = 20000000;
	}

	public Rueda(String marca, int numItems) {
		super();
		this.numItems = numItems;
		this.marca = marca;
	}
	public void hallarNumRuedas(String vehiculo) {
		switch (vehiculo.toLowerCase() ){
		case "moto": {
			System.out.println("Vehiculo de 2 ruedas, tenemos ruedas para " + (this.numItems /2 ) + " vehículos ");
			break;
		}
		case "coche": {
			System.out.println("Vehiculo de 4 ruedas, tenemos ruedas para " + (this.numItems /4 ) + " vehículos ");
			break;
		}
		case "sidecar": {
			System.out.println("Vehiculo de 3 ruedas, tenemos ruedas para " + (this.numItems /3 ) + " vehículos ");
			break;
		}
		default:
			System.out.println("Vehiculo desconocido");	
		}
	}
}