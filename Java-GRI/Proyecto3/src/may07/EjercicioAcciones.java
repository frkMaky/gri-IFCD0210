package may07;

public class EjercicioAcciones {
	/*Crea una interfaz llamada Acciones
	    * en la que se declaren 3 métodos.
	    * Uno es escribirHola, otro escribirAdios, y
	    * escribirChao
	    * Crea una clase llamada Saludos que implemente
	    * esas acciones.
	    * Por último crea una clase principal en donde
	    * se puedan llamar a esas acciones
	    */
		public static void main(String[] args) {
			Saludos saludo = new Saludos();
			
			saludo.escribirHola();
			saludo.escribirChao();
			saludo.escribirAdios();
		}
		
}