package dia26;

public class EjercicioPrenda {

	public static void main(String[] args) {
		/* Crea una clase llamada Prenda
		* con los siguientes atributos:
		* tipo
		* talla
		* color
		* numItems
		* Crea un método público mostrarInfo() que nos diga
		* la prenda, la talla y el número de items
		* Crea un objeto que tenga: vestido,xs,rojo,3
		* Crea otro que tenga: falda,xxl,verde,5
		*/
		
		Prenda prenda1 = new Prenda("vestido","xs","rojo",3);
		Prenda prenda2 = new Prenda("falda","xxl","verde",5);
		
		prenda1.mostrarInfo();
		prenda2.mostrarInfo();
		
	}

}
class Prenda {
	String tipo;
	String talla;
	String color;
	int numItems;
	
	public Prenda() {
	}
	
	public Prenda(String tipo, String talla, String color, int numItems) {
		super();
		this.tipo = tipo;
		this.talla = talla;
		this.color = color;
		this.numItems = numItems;
	}


	public void mostrarInfo() {
		System.out.println("\nPrenda: " + this.tipo +  " \nTalla: " + this.talla +  " \nNumero de articulos: " + this.numItems);
	}
}
