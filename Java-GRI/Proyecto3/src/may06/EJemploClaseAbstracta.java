package may06;

public class EJemploClaseAbstracta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato miGato = new Gato(); // crea un objeto de tipo Gato
		miGato.sonido();

		miGato.duerme();
	}

}	
//clase abstracta
abstract class Animal {
	//método abstracto (no tiene cuerpo)
	public abstract void sonido();
	//método regular
	public void duerme() {
		System.out.println("Zzz");
	}
}
//Subclase (heredado de Animal)
class Gato extends Animal {
	public void sonido() {
		//el cuerpo de sonido() se pone aquí
		System.out.println("El gato dice: miau miau");
	}
}
