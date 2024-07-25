package dia26;

public class EjercicioCasa2 {

	public static void main(String[] args) {
		/* Crea una clase llamada Casa
		* que tiene varios atributos: numHabitaciones, hayTerraza
		* y numPiso
		* Se pide crear dos métodos que muestren la información
		* anterior. Uno static (infoStatic) y otro public
		* (infoPublic)
		*/
		Casa casa1 = new Casa();
		casa1.infoPublic();
		
		Casa.infoStatic();
	}

}

class Casa  {
	static int numHabitaciones;
	static int numPiso;
	static boolean hayTerraza;
	
	public void infoPublic() {
		System.out.println("Habitaciones: " + Casa.numHabitaciones +  " Piso: " + Casa.numPiso +  " Terraza: " + Casa.hayTerraza);
	}
	static void infoStatic() {
		System.out.println("Habitaciones: " + numHabitaciones +  " Piso: " + numPiso +  " Terraza: " + hayTerraza); 
	}
}
