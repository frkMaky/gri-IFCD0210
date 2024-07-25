package animales;

public class Leones extends Felinos {
	
	public Leones() {
		this.nombreCientifico = "Panthera leo";
		this.habitat = "pradera";
		this.sonido ="rugido";
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
		return "Leones [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}
	
}
