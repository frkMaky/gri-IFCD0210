package dia29;

public class EJercicioPortatil {

	public static void main(String[] args) {
		/*Crea una clase llamada Portatil
		* con 3 atributos: marca, modelo, precio (número con
		decimales)
		* Crea el constructor sin parámetros
		* Crea los getter y setter de esos atributos
		* Crea un objeto con los datos: Asus, M16, 2100.99 euros.
		* Comprueba que esos datos son los correspondientes
		mediante los getter.
		*/
		Portatil portatil = new Portatil();
		portatil.setMarca("Asus");
		portatil.setModelo("M16");
		portatil.setPrecio(2100.99);
		System.out.println(portatil.getMarca() + " " + portatil.getModelo() +  " : " + portatil.getPrecio() + "€");
	}

}
class Portatil {
	
	private String marca;
	private String modelo;
	private double precio;
	
	public Portatil() {
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
		
}