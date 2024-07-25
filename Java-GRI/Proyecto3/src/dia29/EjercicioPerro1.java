package dia29;

public class EjercicioPerro1 {

	public static void main(String[] args) {
		/* Crea una clase Perro1
		* con 2 atributos: colorOjos,raza
		* constructor con dos parámetros.
		* queremos acceder a raza a través de getters o setters
		* 1 objeto de tipo Perro.
		*/
		Perro1 perro1 = new Perro1();
		perro1.setColorOjos("negro");
		perro1.setRaza("pachon");
		
		System.out.println("El perro de color de ojos " + perro1.getColorOjos() + " es de raza de perro " + perro1.getRaza());

	}

}
class Perro1 {
	
	private String colorOjos;
	private String raza;
	
	public Perro1() {
	}

	public Perro1(String colorOjos, String raza) {
		super();
		this.colorOjos = colorOjos;
		this.raza = raza;
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
}