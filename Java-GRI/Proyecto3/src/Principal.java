
public class Principal {

	public static void main(String[] args) {
		// Queremos mostrar el area del circulo sabiendo que su diametro es de 5
		// A = PI * (r^2)
		
		final double PI = Math.PI;
		double diametro = 5;
		double radio = diametro/2;

		double area = PI * ( radio * radio);
		
		System.out.println("El resultado del area del circulo de diametro " + diametro + " es " + area);
		
	}


}