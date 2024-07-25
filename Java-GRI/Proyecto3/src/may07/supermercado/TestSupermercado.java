package may07.supermercado;

import java.util.ArrayList;

public class TestSupermercado {

	public static void main(String[] args) {
		/*
		Suponga que debe crear distintas clases Java para describir los productos que
		vende un supermercado.

		Se crean las siguientes interfaces:

		*interfaz EsLiquido: indica que los objetos creados a partir de la clase serán
		líquidos y tendrá los siguientes métodos:
		public void setVolumen(double v);
		public double getVolumen();
		public void setTipoEnvase(String env);
		public String getTipoEnvase();

		*interfaz EsAlimento:indica que los objetos creados a partir de la clase serán
		alimentos y tendrá los siguientes métodos:
		public void setCaducidad(LocalDate fc);
		public LocalDate getCaducidad();
		public int getCalorias();

		*interfaz ConDescuento: indica que el producto tiene descuento e incluirá los
		siguientes métodos:
		public void setDescuento(double des);
		public double getDescuento();
		public double getPrecioDescuento();



		Creación de clases de productos:
		Se pide que programe las siguientes clases de productos, implementando las interfaces
		que sean necesarias.

		*Clase Detergente:
		define una botella de detergente(puede tener descuento),
		Sus propiedades principales son:
		marca (String) y precio (double)
		Constructor con 2 parámetros
		set y get para marca y precio
		Incluye otras propiedades según sea necesario a la hora de implementar las interfaces
		Métodos de las interfaces:
		método toString que devuelve todas las características del producto.

		*Clase Cereales:
		Define el producto caja de cereales (no tiene descuento),
		Propiedades: marca, precio, tipodDeCereal (String)
		constructor con 3 parámetros
		get y set para los 3 parámetros
		Programe los métodos de las interfaces implementadas (si es necesario
		añade más propiedades a la clase)
		calorias: 5 si es espelta, 8 si maíx, 12 si trigo, 15 resto
		método toString que devuelve todas las características del producto.

		*Clase Vino:
		Describe el producto de la botella de vino (puede tener descuento).
		Propiedades: marca, tipoDeVino, gradosAlcohol y precio.
		Constructor 4 parámetros.
		get, set, toString  y los métodos de las interfaces
		Añada nuevas propiedades si es necesario.
		calorías: x4 la graduación de alcohol


		Programa Main:
		Crea varios productos de cada clase.
		Haga un ejemplo de polimorfismo creando un ArrayList de productos
		alimenticios y calculando la suma de sus calorías. */
		
		Object[] productos = new Object[6];
		productos[0] = new Detergente("Ariel", 4.5);
		((Detergente)productos[0]).setDescuento(25);
		((Detergente)productos[0]).setVolumen(1000);
		productos[1] = new Detergente("Flor", 3.95);
		((Detergente)productos[1]).setDescuento(15);;
		((Detergente)productos[1]).setVolumen(1000);
		
		productos[2] = new Cereales("Kellogs",2.5,"trigo");
		productos[3] = new Cereales("Kellogs",3.5,"espelta");
		
		productos[4] = new Vino("Conde De Altramuz","blanco",32, 6.0);
		((Vino)productos[4]).setVolumen(75);
		((Vino)productos[4]).setDescuento(10);
		productos[5] = new Vino("Valdepeñas","rioja",42,3.46);
		((Vino)productos[5]).setVolumen(75);
		((Vino)productos[5]).setDescuento(15);
		
		
		for (Object o:productos) {
			System.out.println( o );
			if (o instanceof Detergente) {
				System.out.println("Precio con dto aplicado:" + ((Detergente)o).getPrecioDescuento() );
			}
			if (o instanceof Vino) {
				System.out.println("Precio con dto aplicado:" + ((Vino)o).getPrecioDescuento() );
			}
		}
		
		ArrayList<EsAlimento> alimentos = new ArrayList<>();
		double totalCalorias = 0;
		for (Object o: productos) {
			if (o instanceof Cereales) {
				alimentos.add((Cereales) o);
				totalCalorias += ((Cereales) o).getCalorias();
			}
			if (o instanceof Vino) {
				alimentos.add((Vino) o);
				totalCalorias += ((Vino) o).getCalorias();
			}
		}
		System.out.println("Total calorias: " + totalCalorias );
		
		System.out.println(alimentos);

	}

}
