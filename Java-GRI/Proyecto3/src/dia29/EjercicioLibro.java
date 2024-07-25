package dia29;

public class EjercicioLibro {

	public static void main(String[] args) {
		/* Crea una clase Libro
		* que contenga 3 atributos:
		* autor
		* titulo
		* numPaginas
		* Crea un método público hallarInfo
		* que muestre la información:
		* "El libro x es del autor y"
		* Crea un objeto con un constructor
		* sin parámetros en donde
		* inicialices "Los pilares","Follet"
		* Crea otro objeto con otro constructor
		* con 3 parámetros
		* en donde metas:"La fundación","Vallejo",1200
		* Luego llama al método hallarInfo
		* Apartado 2:
		* Imagina que quieres cambiar el número de
		* páginas del último objeto a 1300
		*/
		
		Libro libro1 = new Libro();
		Libro libro2 = new Libro("Vallejo","La fundación",1200);
		libro1.hallarInfo();
		libro2.hallarInfo();
		libro2.numPaginas = 1300;
		libro2.hallarInfo();

	}

}
class Libro {
	String autor;
	String titulo;
	int numPaginas;
	
	public Libro() {
		this.autor = "Follet";
		this.titulo = "Los pilares";
	}
	public Libro(String autor, String titulo, int numPaginas) {
		this.autor = autor;
		this.titulo = titulo;
		this.numPaginas = numPaginas;
	}
	public void hallarInfo() {
		System.out.println("El libro " + this.titulo + " es del autor " + this.autor + " y tiene " + this.numPaginas + " páginas");
	}
	
}