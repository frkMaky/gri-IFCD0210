package ejercicios;

public class ejercicio9 {

	public static void main(String[] args) {
		/**
		 * 9.Escriba un programa Java para crear una clase llamada Shape con métodos llamados getPerimeter() y
		getArea(). Cree una subclase llamada Círculo que anule los métodos getPerimeter() y getArea() para
		calcular el área y el perímetro de un círculo.
		 */
		Shape1 forma = new Shape1();
		Circulo1 circulo = new Circulo1(3);
		
		System.out.println("Perimetro Shape: " + forma.getPerimeter());
		System.out.println("Area Shape: " + forma.getArea());
		System.out.println("Perimetro circulo: " + circulo.getPerimeter());
		System.out.println("Area circulo: " + circulo.getArea());
	}

}
class Shape1 {
	
	
	public double getPerimeter() {
		return 0;
	}
	public double getArea() {
		return 0;
	}
	
}
class Circulo1 extends Shape1 {
	
	private double radio;
	
	public Circulo1() {
		this.radio = 0;
	}
	public Circulo1(double radio) {
		this.radio = radio;
	}
	public double getPerimeter() {
		return 2 * Math.PI * this.radio;
	}
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}
}