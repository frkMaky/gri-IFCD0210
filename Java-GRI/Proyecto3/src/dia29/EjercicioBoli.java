package dia29;

public class EjercicioBoli {

	public static void main(String[] args) {
		/* Creamos una clase Boli
		* con dos atributos: marca y color
		* Creamos los setter
		* Creamos dos constructores:
		* uno sin parámetros y otro con los dos parámetros
		* Creamos dos objetos, uno con cada constructor.
		* Uno con los datos: bic, azul y otro con bic, rojo.
		* Muestra con el toString si los datos son correctos
		* Luego modifica el bic rojo por bic verde
		* y vuelve a comprobar si los datos son correctos.
		*/
		Boli boli1  = new Boli();
		boli1.setMarca("bic");
		boli1.setColor("azul");
		Boli boli2 = new Boli("bic","rojo");
	
		System.out.println(boli1);

		System.out.println(boli2);
		boli2.setColor("verde");
		System.out.println(boli2);
	}

}
class Boli {
	
	private String marca;
	private String color;
	
	public Boli() {
	}
	public Boli(String marca,String color) {
		this.marca = marca;
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Boli [marca=" + marca + ", color=" + color + "]";
	}
	
	
}