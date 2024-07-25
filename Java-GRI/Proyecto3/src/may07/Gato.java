package may07;

public class Gato implements Animal{

	@Override
	public void sonido() {
		System.out.println("Miau");	
	}

	@Override
	public void dormir() {
		System.out.println("ZzZzZ");
	}

}
