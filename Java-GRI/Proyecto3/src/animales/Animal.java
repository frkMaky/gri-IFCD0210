package animales;

public abstract class Animal {

	protected String sonido;
	protected String alimentos;
	protected String habitat;
	protected String nombreCientifico;
	
	public abstract String getNombreCientífico();
	public abstract String getSonido();
	public abstract String getAlimentos();
	public abstract String getHábitat();
}
