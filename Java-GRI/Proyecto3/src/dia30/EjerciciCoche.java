package dia30;

public class EjerciciCoche {

	public static void main(String[] args) {
		/* Tenemos una clase Automóvil con cilindrada y numRuedas.
		Tenemos una clase coche que hereda de Automovil que tiene
		un atributo a mayores que es el color. Cada una de las clases

		tienen el método toString() que muestra los datos de los
		atributos. Implementa el ejercicio. */
		
		Coche coche1 = new Coche();
		coche1.setCilindrada(1000);
		coche1.setNumRuedas(5);
		coche1.setColor("Azul");
		System.out.println(coche1);
	}

}
class Automovil {
	private int cilindrada;
	private int numRuedas;
	
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	@Override
	public String toString() {
		return "Automovil [cilindrada=" + cilindrada + ", numRuedas=" + numRuedas + "]";
	}
	
	
}
class Coche extends Automovil {
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + " Coche [color=" + color + "]";
	}
	

}