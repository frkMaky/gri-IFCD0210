package may07.supermercado;

import java.time.LocalDate;

public class Vino implements EsLiquido, EsAlimento, ConDescuento {

	private String marca;
	private String tipoDeVino;
	private double gradosAlcohol;
	private double precio;
	
	private LocalDate caducidad;
	private double volumen;
	private String envase;
	private double descuento;
	
	private Vino() {
		this.caducidad = LocalDate.of(2024,1, 1);
		this.volumen = 75;
		this.envase = "Botella Cristal";
		this.descuento = 0;
	}

	public Vino(String marca, String tipoDeVino, double gradosAlcohol, double precio) {
		this();
		this.marca = marca;
		this.tipoDeVino = tipoDeVino;
		this.gradosAlcohol = gradosAlcohol;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoDeVino() {
		return tipoDeVino;
	}

	public void setTipoDeVino(String tipoDeVino) {
		this.tipoDeVino = tipoDeVino;
	}

	public double getGradosAlcohol() {
		return gradosAlcohol;
	}

	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public void setCaducidad(LocalDate fc) {
		this.caducidad = fc;

	}

	@Override
	public LocalDate getCaducidad() {
		return this.caducidad;
	}

	@Override
	public int getCalorias() {
		return (int)(4 * this.gradosAlcohol);
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
		return "Vino [marca=" + marca + ", tipoDeVino=" + tipoDeVino + ", gradosAlcohol=" + gradosAlcohol + ", precio="
				+ precio + ", caducidad=" + caducidad + ", volumen=" + volumen + ", envase=" + envase + " Calorias:"+ this.getCalorias() + "]";
	}

	@Override
	public void setDescuento(double des) {
		this.descuento = des;
		
	}

	@Override
	public double getDescuento() {
		return this.descuento;
	}

	@Override
	public double getPrecioDescuento() {
		return this.precio - ((this.precio *this.descuento)/100);
	}

}
