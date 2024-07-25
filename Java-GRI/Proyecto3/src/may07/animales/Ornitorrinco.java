package may07.animales;

public class Ornitorrinco extends Mamiferos implements Oviparos {

	@Override
	public void ponerHuevos() {
		System.out.println("El ornitorrinco pone un huevo");
		
	}

	@Override
	public void amamantarCrías() {

		System.out.println("Amamantando a las crías de ornitorrinco");
		
	}

}
