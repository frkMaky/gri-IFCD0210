package animales;

public class Gatos extends Felinos {
	
	public Gatos() {
		this.nombreCientifico = "Felis silvestris catus";
		this.habitat = "doméstico";
		this.sonido ="maullido";
		this.alimentos ="ratones";
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
		return "Gatos [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}
	
}
