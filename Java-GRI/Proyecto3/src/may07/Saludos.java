package may07;

public class Saludos implements Acciones {

	@Override
	public void escribirHola() {
		System.out.println("Hola");
	}

	@Override
	public void escribirAdios() {
		System.out.println("Adios");		
	}

	@Override
	public void escribirChao() {
		System.out.println("Chao");
	}

}
