package dia25;

public class EjercicioSobreacarga {

	public static void main(String[] args) {
		/*Sobrecarga
        * Crea 4 métodos con el mismo nombre
        * que calculen el perímetro de:
        * -la circunferencia de radio 2.5
        * -el triángulo de lados 2,3,5
        * -el cuadrado de lado 2
        * -el rectángulo de lado mayor 4 y menor 2
        * Los métodos devolverán el perímetro.
        * Luego muestra los resultados:
        * "Perímetro circunferencia: x"
        * "Perímetro triángulo: x"
        * "Perímetro cuadrado: x"
        * "Perímetro rectángulo: x"
        */
		System.out.println("Perimerto circunferencia: " + perimetro(2.5) );
		System.out.println("Perimerto triángulo: " + perimetro(2,3,5) );
		System.out.println("Perimerto cuadrado: " + perimetro(2) );
		System.out.println("Perimerto rectangulo: " + perimetro(4,2) );
	}

	public static double perimetro(int lado) { // Perimetro cuadrado
		return lado*4;
	}
	public static double perimetro(int altura, int base) { // Perimetro rectangulo
		return (altura * 2 + base*2);
	}
	public static double perimetro(int lado1, int lado2, int lado3) { // Perimetro triangulo
		return lado1+lado2+lado3;
	}
	public static double perimetro(double radio) { // Perimetro circulo
		return radio * Math.PI * 2;
	}
	
}
