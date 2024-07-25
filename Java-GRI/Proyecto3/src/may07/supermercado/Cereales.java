package may07.supermercado;

import java.time.LocalDate;

public class Cereales implements EsAlimento {

	private String marca;
	private double precio;
	private String tipoDeCereal;
	private LocalDate caducidad;

	private Cereales() {
		this.caducidad = LocalDate.of(2024,1, 1);
	}

	public Cereales(String marca, double precio, String tipoDeCereal) {
		this();
		this.marca = marca;
		this.precio = precio;
		this.tipoDeCereal = tipoDeCereal;
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

	public String getTipoDeCereal() {
		return tipoDeCereal;
	}

	public void setTipoDeCereal(String tipoDeCereal) {
		this.tipoDeCereal = tipoDeCereal;
	}

	@Override
	public void setCaducidad(LocalDate fc) {
		this.caducidad = fc;
	}

	@Override
	public LocalDate getCaducidad() {
		// TODO Auto-generated method stub
		return this.caducidad;
	}

	@Override
	public int getCalorias() {
		// calorias: 5 si es espelta, 8 si maíx, 12 si trigo, 15 resto

		int calorias;
		
		switch (this.tipoDeCereal) {
		case "espelta":
			calorias = 5;
			break;
		case "maiz":
			calorias = 8;
			break;
		case "trigo":
			calorias = 12;
			break;
		default:
			calorias = 15;
		}
		return calorias;
	}

	@Override
	public String toString() {
		return "Cereales [marca=" + marca + ", precio=" + precio + ", tipoDeCereal=" + tipoDeCereal + ", caducidad="
				+ caducidad + " Calorías: " +  this.getCalorias() + "]";
	}
	

}
