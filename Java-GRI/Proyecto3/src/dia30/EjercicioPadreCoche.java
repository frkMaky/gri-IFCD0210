package dia30;

public class EjercicioPadreCoche {

	public static void main(String[] args) {
		/*Tenemos una clase PadreVehiculo con un atributo
		* rama de valor Ford y un método sonido que
		* muestra "tut,tut!".
		* Tenemos una clase HijoCoche que hereda de
		* PadreVehiculo y tiene a mayores un atributo
		* llamado nombreModelo de valor Mustang
		* Crea un objeto de tipo HijoCoche que llame al
		* método sonido, que acceda al atributo rama
		* y que acceda al atributo nombre modelo.
		*/

		HijoCoche coche = new HijoCoche();
		coche.sonido();
		System.out.println( coche.getRama() );

		System.out.println( coche.getNombreModelo() );
	}

}
class PadreVehiculo {
	
	protected String rama;
	
	public PadreVehiculo () {
		this.rama = "Ford";
	}
	
	public void sonido() {
		System.out.println("tut, tut!");
	}

	public String getRama() {
		return rama;
	}

	public void setRama(String rama) {
		this.rama = rama;
	}
	
}

class HijoCoche extends PadreVehiculo {
	
	private String nombreModelo;
	
	public HijoCoche() {
		this.nombreModelo = "Mustang";
	}

	public String getNombreModelo() {
		return nombreModelo;
	}

	public void setNombreModelo(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}
	
	
	
}