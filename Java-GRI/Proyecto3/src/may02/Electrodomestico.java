package may02;

public class Electrodomestico {

	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	// Constantes con valores default
	private final static String COLOR_DEF = "Blanco";
	private final static char CONSUMO_DEF = 'F';
	private final static double PRECIO_DEF = 100;
	private final static double PESO_DEF = 5;

	// Constructores
	public Electrodomestico() {
		this.color = Electrodomestico.COLOR_DEF;
		this.consumoEnergetico = Electrodomestico.CONSUMO_DEF;
		this.peso = Electrodomestico.PESO_DEF;
		this.precioBase = Electrodomestico.PRECIO_DEF;
		comprobarConsumoEnergetico(this.consumoEnergetico);
		comprobarColor(this.color);
	}

	public Electrodomestico(double precio, double peso) {
		this.color = Electrodomestico.COLOR_DEF;
		this.consumoEnergetico = Electrodomestico.CONSUMO_DEF;
		this.peso = peso;
		this.precioBase = precio;
		comprobarConsumoEnergetico(this.consumoEnergetico);
		comprobarColor(this.color);
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		comprobarConsumoEnergetico(this.consumoEnergetico);
		comprobarColor(this.color);
	}

	// Getters & Setters
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergético) {
		this.consumoEnergetico = consumoEnergético;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Comprobar el consumo energético
	private void comprobarConsumoEnergetico(char letra) {
		if (letra >= 'A' && letra <= 'F') {
			this.consumoEnergetico = letra;
		} else {
			this.consumoEnergetico = Electrodomestico.CONSUMO_DEF;
		}

	}

	// Comprobar el color
	private void comprobarColor(String color) {
		String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };

		boolean colorValido = false;
		for (String c : colores) {
			if (c.equals( color.toLowerCase().trim() )) {
				colorValido = true;
			}
		}

		if (colorValido) {
			this.color = color;
		} else {
			this.color = Electrodomestico.COLOR_DEF;
		}

	}

	// Calcular el precio final
	public double precioFinal() {

		double total = 0;
		
		// Segun consumo
		switch (this.consumoEnergetico) {
		case 'A':
			total += 100;
			break;
		case 'B':
			total += 80;
			break;
		case 'C':
			total += 60;
			break;
		case 'D':
			total += 50;
			break;
		case 'E':
			total += 30;
			break;
		case 'F':
			total += 10;
			break;
		}
		// Segun tamanho
		if ( this.peso <= 19 && this.peso >= 0) {
			total += 10;
		} else if ( this.peso <= 49 && this.peso >= 20) {
			total += 50;
		} else if ( this.peso <= 79 && this.peso >= 50) {
			total += 80;
		} else {
			total += 100;
		}
		
		return this.precioBase + total;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
}
