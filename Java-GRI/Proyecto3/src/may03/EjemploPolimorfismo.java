package may03;

public class EjemploPolimorfismo {

	public static void main(String[] args) {
		Animal miAnimal = new Animal(); // Crea un objeto de tipo Animal
		Animal miGato = new Gato(); // Crea un objeto de tipo Gato
		Animal miPerro = new Perro(); // Crea un objeto de tipo Perro
		miAnimal.sonido();
		miGato.sonido();
		miPerro.sonido();
	}

}
class Animal {
public void sonido() {
System.out.println("El animal hace un sonido");
}
}
class Gato extends Animal {
public void sonido() {
System.out.println("El gato dice: miau miau");
}
}
class Perro extends Animal {
public void sonido() {
System.out.println("El perro dice: guau guau");
}
}