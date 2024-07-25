package dia29;

public class EjerciciCancion {

	public static void main(String[] args) {
		/* Crea una clase Cancion con tres atributos:
		* nombre , grupo duracion
		* Inicializa los valores de los atributos en el constructor sin parámetros:
		* When september ends, Green Day,3.05
		* Crea también el método toString para mostrar datos.
		*/
		Cancion cancion1 = new Cancion();
		System.out.println( cancion1 );
	}

}
class Cancion {
	
	String nombre;
	String grupo;
	double duracion;
	
	public Cancion () {
		this.nombre = "When september ends";
		this.grupo = "Green Day";
		this.duracion = 3.05;
	}

	@Override
	public String toString() {
		return "Cancion [nombre=" + this.nombre + ", grupo=" + this.grupo + ", duracion=" + this.duracion + "]";
	}

}
