package dia26;

public class EjercicioPais {

	public static void main(String[] args) {
		/*Crea una clase llamada Pais
		* con atributos capital Madrid y numHabitantes 46millones
		* y dos métodos llamados infoStatic e infoPublic
		* que muestren la capital seguida del numHabitantes
		*/
		
		Pais.infoStatic();
		
		Pais miPais = new Pais();
		miPais.infoPublic();
	}

}
class Pais {
		
	static String capital = "Madrid";
	static int numHabitantes = 460000000;
	
	static void infoStatic() {
		System.out.println("Capital: " + capital + " Num Habitantes: " + numHabitantes);
	}
	public void infoPublic() {
		System.out.println("Capital: " + capital + " Num Habitantes: " + numHabitantes);
	}
	
}