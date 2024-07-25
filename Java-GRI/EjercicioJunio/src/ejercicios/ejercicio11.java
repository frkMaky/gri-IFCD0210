package ejercicios;

public class ejercicio11 {

	public static void main(String[] args) {
		/**
		 * 11.Escriba un programa Java para crear una clase abstracta Bird con métodos abstractos fly() y
		makeSound(). Cree subclases Eagle y Hawk que amplíen la clase Bird e implementen los métodos
		respectivos para describir cómo cada pájaro vuela y emite un sonido.
		 */

		Eagle aguila = new Eagle();
		Hawk halcon = new Hawk();
		
		aguila.fly();
		halcon.fly();
		
		aguila.makeSound();
		halcon.makeSound();
	}

}
abstract class Bird {
	public abstract void fly();
	public abstract void makeSound();
}

class Eagle extends Bird {

	@Override
	public void fly() {
		System.out.println("The Eagle is flying");
		
	}

	@Override
	public void makeSound() {

		System.out.println("The Eagle is growling");
		
	}
	
}
class Hawk extends Bird {

	@Override
	public void fly() {
		System.out.println("The Hawk is flying");
	}

	@Override
	public void makeSound() {
		System.out.println("The Hawk is growling");
		
		
	}
	
}