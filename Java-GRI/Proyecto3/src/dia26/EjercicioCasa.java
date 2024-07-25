package dia26;

public class EjercicioCasa {

	public static void main(String[] args) {
		/* Tenemos una clase Casa2
		* que contiene 3 atributos
		* color
		* ubicacion
		* isVendida
		* Crea el método toString para mostrar esa info
		* Crea dos casas:
		* granate, "Avda Europa 13", true
		* blanca,"Avda Samil 12", false
		*
		*/
		
		Casa2 casa1 = new Casa2("granate","Avda Europa 13", true);
		Casa2 casa2 = new Casa2("blanca","Avda Samil 12", false);
		
		System.out.println( casa1 );
		System.out.println( casa2 );

	}

}

class Casa2 {
	
	String color;
	String ubicacion;
	boolean isVendida;
	
	public Casa2() {
	}
	public Casa2(String color, String ubicacion, boolean isVendida) {
		this.color = color;
		this.ubicacion = ubicacion;
		this.isVendida = isVendida;
	}
	@Override
	public String toString() {
		return "Casa2 [color=" + color + ", ubicacion=" + ubicacion + ", isVendida=" + isVendida + "]";
	}
	
	
}