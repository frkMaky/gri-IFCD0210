package may06;

public class EjercicioClaseInterna2 {

	public static void main(String[] args) {
		/** 
		 * Crear una clase externa NumPares con un array con los 10 primeros pares
		 * Crear clase interna Nums con metodo mostrarNums que muestre los pares
		 * */
		NumPares2 numeros = new NumPares2();
		NumPares2.Nums2 ci = numeros.new Nums2();
		
		ci.mostrarNums();
	}

}

class NumPares2{
	
	private int[] pares;
	
	public NumPares2() {
		this.pares = new int[10];
		
		for (int i=0;i<pares.length;i++) {
			this.pares[i] = (2 * i) + 2;
		}
	}
	class Nums2 {
		public void mostrarNums() {
			for (int i: pares) {
				System.out.println("Pares: " + i);
			}
		}
	}
}