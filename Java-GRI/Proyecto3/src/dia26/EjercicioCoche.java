package dia26;

public class EjercicioCoche {

	public static void main(String[] args) {
		/**
		 * Crea una clase llamada Coche que tenga 2 atributos (color de tipo rojo,
		 * modelo de tipo Audi) e instancia 3 objetos de tipo coche.
		 */
		Coche coche1 = new Coche();
		Coche coche2 = new Coche();
		Coche coche3 = new Coche();

		System.out.println(coche1.modelo +  " " + coche1.color);
		System.out.println(coche2.modelo +  " " + coche2.color);
		System.out.println(coche3.modelo +  " " + coche3.color);
	}

}

class Coche {
	
	String color = "rojo";
	String modelo = "Audi";
}
