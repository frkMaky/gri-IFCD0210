package may02;

public class EjercicioElectrodomestico {

	public static void main(String[] args) {
		/*Crearemos una supeclase llamada Electrodomestico con las siguientes características:

			Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso. Indica que se podrán heredar.
			Por defecto, el color sera blanco, el consumo energético sera F, el precioBase es de 100 € y el peso de 5 kg. 
			Usa constantes para ello.
			Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre esta en mayúsculas o en minúsculas.
			Los constructores que se implementaran serán
			Un constructor por defecto.
			Un constructor con el precio y peso. El resto por defecto.
			Un constructor con todos los atributos.
			Los métodos que implementara serán:
			Métodos get de todos los atributos.
			comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra por defecto. 
			Se invocara al crear el objeto y no sera visible.
			comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto. Se invocara al crear 
			el objeto y no sera visible.
			precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:
			Letra    Precio
			A    100 €
			B    80 €
			C    60 €
			D    50 €
			E    30 €
			F    10 €
			Tamaño    Precio
			Entre 0 y 19 kg    10 €
			Entre 20 y 49 kg    50 €
			Entre 50 y 79 kg    80 €
			Mayor que 80 kg    100 €Crearemos una subclase llamada Lavadora con las siguientes características:
			Su atributo es carga, ademas de los atributos heredados.
			Por defecto, la carga es de 5 kg. Usa una constante para ello.
			Los constructores que se implementaran serán:
			Un constructor por defecto.
			Un constructor con el precio y peso. El resto por defecto.
			Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
			Los métodos que se implementara serán:
			Método get de carga.
			precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio.
			 Llama al método padre y añade el código necesario. Recuerda que las condiciones que hemos visto en la clase Electrodomestico 
			 también deben afectar al precio.
			Crearemos una subclase llamada Television con las siguientes características:

			Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), ademas de los atributos heredados.
			Por defecto, la resolución sera de 20 pulgadas y el sintonizador sera false.
			Los constructores que se implementaran serán:
			Un constructor por defecto.
			Un constructor con el precio y peso. El resto por defecto.
			Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. 
			Recuerda que debes llamar al constructor de la clase padre.
			Los métodos que se implementara serán:
			Método get de resolución y sintonizador TDT.
			precioFinal(): si tiene una resolución mayor de 40 pulgadas, 
			se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €. 
			Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
			Ahora crea una clase ejecutable que realice lo siguiente:

			Crea un array de Electrodomesticos de 10 posiciones.
			Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
			Ahora, recorre este array y ejecuta el método precioFinal().
			Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras
			 por otro y la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television y Lavadora 
			 también son electrodomésticos). Recuerda el uso operador instanceof.
			Por ejemplo, si tenemos un Electrodomestico con un precio final de 300, una lavadora de 200 y una televisión de 500, 
			el resultado final sera de 1000 (300+200+500) para electrodomésticos, 200 para lavadora y 500 para televisión.
			*/
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		/*for (int i=0;i<electrodomesticos.length;i++) {
			electrodomesticos[i] = new Electrodomestico();
		} */
		
		electrodomesticos[0] = new Electrodomestico(100,"azul",'A',50);
		electrodomesticos[1] = new Electrodomestico(300,"rojo",'B',75);
		electrodomesticos[2] = new Electrodomestico(45,"negro",'C',100);
		electrodomesticos[3] = new Lavadora(56,14,20);
		electrodomesticos[4] = new Lavadora(100,100,50);
		electrodomesticos[5] = new Lavadora(124,321,100);
		electrodomesticos[6] = new Television(500,25,25,true);
		electrodomesticos[7] = new Television(750,30,25,true);
		electrodomesticos[8] = new Television(999,48,75,true);
		electrodomesticos[9] = new Electrodomestico(10,10);
		
		double total = 0;
		double totalTV = 0;
		double totalLavadoras = 0;
		
		for (Electrodomestico e:electrodomesticos) {
			if ( e instanceof Lavadora) {
				totalLavadoras +=  e.precioFinal();
			}
			if ( e instanceof Television) {
				totalTV +=  e.precioFinal();
			}
			total += e.precioFinal();
			System.out.println( e + " Precio final: " + e.precioFinal() + "€");
		}
		System.out.println( "El total de todos los articulos es: " + total + "€" );
		System.out.println( "Precio TVs: " + totalTV + "€" );
		System.out.println( "Precio Lavadoras: " + totalLavadoras + "€" );
	}

}