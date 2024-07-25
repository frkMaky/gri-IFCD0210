package dia29;

public class EjercicioLibro2 {

	public static void main(String[] args) {
		/*
		* Crea una clase Libro que contenga los siguientes atributos:
		isbn,titulo,autor,numPaginas
		Crear sus respectivos métodos get y set correspondientes para
		cada atributo. Crear el método toString() para mostrar la
		información relativa al libro con el siguiente formato:
		«El libro con ISBN x con título x creado por el autor x tiene x
		páginas»

		En el fichero main, crear 2 objetos Libro (los valores que se
		quieran) y mostrarlos por pantalla.
		Por último, indicar cuál de los 2 tiene más páginas.
		*/
		
		Libro2 libro1 = new Libro2("9788845292613","El Señor de los Anillos","J. R. R. Tolkien\n",1633);
		Libro2 libro2 = new Libro2("9780062316097","Sapiens","Yuval Noaḥ Harari",443);
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		if (libro1.getNumPaginas() >= libro2.getNumPaginas() ) {
				
			System.out.println("El libro " + libro1.getTitulo() + " tiene más paginas que " + libro2.getTitulo());
		} else {

			System.out.println("El libro " + libro2.getTitulo() + " tiene más paginas que " + libro1.getTitulo());
		}
	}

}
class Libro2 {
	private String isbn;
	private String titulo;
	private String autor;
	private  int numPaginas;
	
	public Libro2() {
	}
	
	public Libro2(String isbn, String titulo, String autor, int numPaginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	@Override
	public String toString() {
		return "El libro con ISBN " + this.isbn + " con título " + this.titulo + " creado por el autor " + this.autor + " tiene " + this.numPaginas+ " páginas";
	}
	
	
}
