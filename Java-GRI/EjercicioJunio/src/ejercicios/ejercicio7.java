package ejercicios;

public class ejercicio7 {

	public static void main(String[] args) {
		/**
		 * 7.Escriba un programa Java para crear una clase llamada Vehículo con un método llamado drive(). Cree
			una subclase llamada Coche que anule el método drive() para imprimir "Reparación de un coche".
			Este programa crea una clase llamada 'Vehículo' con un método llamado drive() y una subclase llamada
			Car que anula el método drive() para imprimir "Reparando un automóvil".
		 */
		
		Vehiculo coche1 = new Vehiculo();
		Vehiculo coche2 = new Coche();
		
		System.out.println(coche1.drive());
		System.out.println(coche2.drive());
		
	}

}
class Vehiculo {
	
	public String drive() {
		return "Conduciendo...";
	}
}
class Coche extends Vehiculo {
	@Override
	public String drive() {
		return "Reparación de un coche";
	}
}
