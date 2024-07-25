package animales;

public class Perros extends Canidos {

	public Perros() {
		this.nombreCientifico = "Canis lupus familiaris";
		this.habitat = "doméstico";
		this.sonido ="ladrido";
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
	@Override
	public String toString() {
		return "Perros [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}
	
}
