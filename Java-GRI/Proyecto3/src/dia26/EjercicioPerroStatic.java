package dia26;

public class EjercicioPerroStatic {

	public static void main(String[] args) {
		/* Realiza una clase llamada Perro
		* con atributos: patas, color, raza
		* y dos métodos
		* que muestre por pantalla el
		* sonido del perro
		* 1. con método static-> sonidoPerroStatic
		* 2. con método public-> sonidoPerroPublic */
		
		Perro perro1 = new Perro (4, "Blanco", "Pastor Aleman");
		Perro perro2 = new Perro (3, "Negro", "ChowChow");
		System.out.println( perro1.sonidoPerroPublic() );
		System.out.println( perro2.sonidoPerroPublic() );
		
		Perro.sonidoPerroStatic();
	}

}
class Perro {
	int patas;
	String color;
	String raza;
	
	public Perro() {
	}
	public Perro(int patas, String color, String raza) {
		super();
		this.patas = patas;
		this.color = color;
		this.raza = raza;
	}
	
	public static void sonidoPerroStatic() {
		System.out.println("GUAU GUAU");
	}
	public String sonidoPerroPublic() {
		return "GUAU GUAU";
	}
}
