package may07.supermercado;

public class Detergente implements ConDescuento, EsLiquido {
	
	private String marca;
	private double precio;
	private double des; // descuento
	private String envase;
	private double volumen;
	
	private Detergente() {
		this.envase = "Botella plástico";
		this.volumen = 0;
	}
	public Detergente(String marca, double precio) {
		this();
		this.marca = marca;
		this.precio = precio;
	}
	
	@Override
	public void setDescuento(double des) {
		// TODO Auto-generated method stub
		this.des = des;
	}

	@Override
	public double getDescuento() {
		// TODO Auto-generated method stub
		return this.des;
	}

	@Override
	public double getPrecioDescuento() {
		// TODO Auto-generated method stub
		return this.precio - ((this.precio * this.des)/100) ;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public void setVolumen(double v) {
		this.volumen = v;
		
	}
	@Override
	public double getVolumen() {
		return this.volumen;
	}
	@Override
	public void setTipoEnvase(String env) {
		this.envase = env;
	}
	@Override
	public String getTipoEnvase() {
		return this.envase;
	}
	@Override
	public String toString() {
		return "Detergente [marca=" + marca + ", precio=" + precio + ", des=" + des + ", envase=" + envase
				+ ", volumen=" + volumen + "]";
	}
	
	
}
