package may02;

public class Television extends Electrodomestico {
	
	private double resolucion;
	private boolean sintonizadorTDT;
	
	private static final double RESOLUCION_DEF= 20;
	private static final boolean SINTONIZADOR_DEF= false;
	
	public Television() {
		super();
		this.resolucion = Television.RESOLUCION_DEF;
		this.sintonizadorTDT = Television.SINTONIZADOR_DEF;
	}
	
	public Television(double precio, double peso){
		super (precio,peso);
		this.resolucion = Television.RESOLUCION_DEF;
		this.sintonizadorTDT = Television.SINTONIZADOR_DEF;
	}
	public Television(double precio, double peso,double resolucion, boolean sintonizadorTDT){
		super (precio,peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	public Television (double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
		super(precioBase,color,consumoEnergetico,peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	@Override
	public double precioFinal() {
		// TODO Auto-generated method stub
		double total = super.precioFinal();
		
		if (this.resolucion > 40) {
			total += (super.precioFinal() * 0.3);
		}
		if (this.sintonizadorTDT ==  true ) {
			total += 50;
		}
		return total;
	}

	@Override
	public String toString() {
		return super.toString() + " Television [resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + "]";
	}


}
