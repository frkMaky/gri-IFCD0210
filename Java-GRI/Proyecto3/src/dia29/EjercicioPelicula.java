package dia29;

public class EjercicioPelicula {

	public static void main(String[] args) {
		/* Crea una clase Pelicula con los atributos:
		* nombre, protagonista, anhoCreacion
		* Crea un constructor sin parámetros que contenga lo siguiente:
		* Titanic, DiCaprio, 2015
		* Realiza el método toString para visualizar datos
		*/
		Pelicula pelicula1 = new Pelicula();
		System.out.println( pelicula1 );
	}

}
class Pelicula {
	String nombre;
	String protagonista;
	int anhoCreacion;
	
	public Pelicula() {
		this.nombre = "Titanic";
		this.protagonista = "DiCaprio";
		this.anhoCreacion = 2015;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", protagonista=" + protagonista + ", anhoCreacion=" + anhoCreacion + "]";
	}
	
}