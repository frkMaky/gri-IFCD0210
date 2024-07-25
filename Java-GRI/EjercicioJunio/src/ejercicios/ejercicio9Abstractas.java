package ejercicios;

public class ejercicio9Abstractas {

	public static void main(String[] args) {
		/**
		 * 9.Escriba un programa Java para crear una clase abstracta Animal con un método abstracto llamado
		sonido(). Cree subclases León y Tigre que extiendan la clase Animal e implementen el método sound()
		para emitir un sonido específico para cada animal.
		El ejercicio anterior representa la estructura de clases y la relación entre la clase abstracta y sus subclases.
		En el siguiente código, la clase Animal se muestra como una clase abstracta con el método abstracto
		sonido(). Las clases Lion y Tiger son subclases de Animal y proporcionan sus propias implementaciones
		de sonido(). La flecha indica la relación de herencia, donde León y Tigre heredan de Animal.
		 */
		Leon leon = new Leon();
		Tigre tigre = new Tigre();
		leon.sonido();
		tigre.sonido();
	}

}
abstract class Animal {
	public abstract void sonido();
}
class Leon extends Animal  {
	public void sonido() {
		System.out.println("GRRRRRRR!!");
	}
}
class Tigre extends Animal  {
	public void sonido() {
		System.out.println("GRRRRRRR!! de que?");
	}
}



