package may02;

public class Lavadora extends Electrodomestico {

	private double carga;
	private final static double CARGA_DEF = 5;
	
	public Lavadora() {
		super();
		this.carga = Lavadora.CARGA_DEF;
	}
	public Lavadora(double precio, double peso) {
		super(precio,peso);
		this.carga = Lavadora.CARGA_DEF;
	}
	public Lavadora(double precio, double peso, double carga) {
		super(precio,peso);
		this.carga = carga;
	}
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase,color,consumoEnergetico,peso);
		this.carga = carga;
	}
	public double getCarga() {
		return carga;
	}
	public void setCarga(double carga) {
		this.carga = carga;
	}
	@Override
	public double precioFinal() {
		// TODO Auto-generated method stub
		double total = super.precioFinal();
		
		if (this.carga > 30) {
			total += 50;
		}
		return total;
	}
	@Override
	public String toString() {
		return super.toString() + " Lavadora [carga=" + carga + "]";
	}
	
}
