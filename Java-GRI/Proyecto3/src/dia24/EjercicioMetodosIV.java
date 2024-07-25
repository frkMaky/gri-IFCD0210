package dia24;

public class EjercicioMetodosIV {

	public static void main(String[] args) {
	   /* Crea un método con tres parámetros de entrada que serán nombre, primer apellido
	    * y edad (entera) que no retorne nada y que se muestre 
	    * nombre-primerapellido:edad
	    * Luego llama dos veces al método uno con un nombre de varón y otro con un nombre de mujer
	    */		
		mostrar("Pablo","Maquieira",39);
		mostrar("Carla","Davila",32);
	}
	public static void mostrar(String nombre, String apellido, int edad) {
		System.out.println(nombre + "-" + apellido + ":" + edad);
	}
}
