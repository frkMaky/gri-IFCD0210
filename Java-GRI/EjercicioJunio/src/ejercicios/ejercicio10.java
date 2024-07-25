package ejercicios;

public class ejercicio10 {

	public static void main(String[] args) {
		/**
		 * 10.Escriba un programa Java para crear una clase abstracta Shape con los métodos abstractos
			calcularArea() y calcularPerimetro(). Cree subclases Círculo y Triángulo que extiendan la clase Forma e
			implementen los métodos respectivos para calcular el área y el perímetro de cada forma.
			
			En el siguiente programa, Shape es la clase base abstracta con dos métodos abstractos: calcularArea() y
			calcularPerimetro(). Las clases Círculo y Triángulo son subclases de Forma y proporcionan sus propias
			implementaciones para métodos abstractos.
		 */
		Circulo circulo = new Circulo(3);
		Triangulo triangulo = new Triangulo (5,10);
		
		circulo.calcularArea();
		circulo.calcularPerimetro();
		triangulo.calcularArea();
		triangulo.calcularPerimetro();

	}

}
abstract class Shape {
	public abstract void calcularArea() ;
	public abstract void calcularPerimetro();
}

class Circulo extends Shape {

	private double radio;
	
	public Circulo() {
		this.radio = 0;
	}
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public void calcularPerimetro() {
		// Perímetro = 2(pi) por radio. 
		System.out.println("Perimetro del circulo con radio " + this.radio + " es igual a " + (2*Math.PI*this.radio) );
	}
	@Override
	public void calcularArea() {
		// Área = pi por radio al cuadrado.
		System.out.println("Area del circulo con radio " + this.radio + " es igual a " + (Math.PI * Math.pow(this.radio, 2)) );
		
	}
}

class Triangulo extends Shape {
	
	private double base;
	private double altura;
	
	public Triangulo() {
		this.base = 0;
		this.altura = 0;
	}
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void calcularPerimetro() {
		// Perímetro = suma de los lados. 
		
		double lado = Math.sqrt( Math.pow(base/2, 2) + Math.pow(this.altura,2) ); 
		
		System.out.println("Perimetro del triangulo con base " + this.base+  " y altura "+ this.altura + " es igual a " + (this.base + 2*lado) );
	}
	@Override
	public void calcularArea() {
		// Área = base * altura / 2
		System.out.println("Area del triangulo con base " + this.base+ " y altura "+ this.altura + " es igual a " + ( (this.base * this.altura) / 2) );
		
	}
} 