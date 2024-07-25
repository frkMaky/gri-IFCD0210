package animales;

public class TestAnimales {

	public static void main(String[] args) {
		/*Se tiene una jerarquía taxonómica con los siguientes
		animales:
		* Animal es la clase raíz con los atributos:sonido, alimentos,
		hábitat y nombre científico (todos String).Esta clase tiene los
		siguientes métodos abstractos:
		* -getNombreCientífico
		* -getSonido
		* -getAlimentos
		* -getHábitat
		* Los cánidos y los felinos son subclases de Animal.
		* Los perros son cánidos, su sonido es el ladrido, su
		alimentación es carnívora, su hábitat es doméstico y su nombre
		científico es Canis lupus familiaris.
		* Los lobos son cánidos, su sonido es el aullido, su
		alimentación es carnívora, su hábitat es el bosque y su nombre
		científico es Canis lupus.
		* Los leones son felinos, su sonido es el rugido, su
		alimentación es carnívora, su hábitat es la pradera y su nombre
		científico es Panthera leo.
		* Los gatos son felinos, su sonido es el maullido, su
		alimentación son los ratones, su hábitat es doméstico y su
		nombre científico es Felis silvestris catus
		* Además, se requiere una clase de prueba para desarrollar un
		método main que genere un array de animales y la consola
		debe mostrar los valores de sus atributos. */
		
		Animal[] animales = new Animal[4];
		animales [0] = new Perros();
		animales [1] = new Gatos();
		animales [2] = new Leones();
		animales [3] = new Lobos();
		
		for (Animal a: animales) {
			System.out.println(a);
		}
		

	}

}
