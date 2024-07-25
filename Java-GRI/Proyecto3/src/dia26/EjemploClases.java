package dia26;

public class EjemploClases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OtraClase objeto = new OtraClase();
		OtraClase objeto2 = new OtraClase();
		System.out.println(objeto.x);
		System.out.println(objeto2.y);
		/** Crea otro objeto 3 que muestre la suma de x+y */
		OtraClase objeto3 = new OtraClase();
		System.out.println(objeto3.x + objeto3.y);
	}
}

class OtraClase {
	int x = 5;
	int y = 10;
}
