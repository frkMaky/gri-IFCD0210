package animales;

public class Lobos extends Canidos {

	public Lobos() {
		this.nombreCientifico = "Canis lupus";
		this.habitat = "bosque";
		this.sonido ="aullido";
		this.alimentos ="carnívoro";
	}
	@Override
	public String getNombreCientífico() {
		return this.getNombreCientífico();
	}

	@Override
	public String getSonido() {
		return this.getSonido();
	}

	@Override
	public String getAlimentos() {
		return this.getAlimentos();
	}

	@Override
	public String getHábitat() {
		return this.getHábitat();
	}
	
	public String toString() {
		return "Lobos [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}
	
}
