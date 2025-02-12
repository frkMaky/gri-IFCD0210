package dia29;

public class EjercicioCuenta {

	public static void main(String[] args) {
		/*
		* Crea una clase llamada Cuenta que tendrá
		* los siguientes atributos:
		* titular y cantidad (puede tener decimales, de tipo double).

		El titular será obligatorio y la cantidad
		es opcional.
		Crea dos constructores que cumplan lo anterior (SI LA
		CANTIDAD ES MENOR QUE CERO LO PONEMOS A CERO).
		Crea sus métodos get, set y toString.
		Tendrá dos métodos especiales:
		-ingresar(double cantidad): se ingresa una cantidad a la
		cuenta, si la cantidad introducida es negativa, no se hará nada.
		-retirar(double cantidad): se retira una cantidad a la cuenta, si
		restando la cantidad actual a la que nos pasan es negativa, la
		cantidad de la cuenta pasa a ser 0.
		Haz la comprobación con un titular llamado Juan
		y otro con Pedro con 20 euros. Haz varios ingresos y varias
		retiradas de dinero y comprueba si funciona.
		*/
		Cuenta cuenta1 = new Cuenta("Juan");
		Cuenta cuenta2 = new Cuenta("Pedro",20);
		
		cuenta1.ingresar(100);
		cuenta1.retirar(50);
		
		cuenta2.ingresar(100);
		cuenta2.retirar(150);
		
		System.out.println(cuenta1);
		System.out.println(cuenta2);

	}

}
class Cuenta {
	private String titular;
	private double cantidad;
	
	public Cuenta (String titular) {
		this.titular = titular;
		this.cantidad = 0;
	}
	public Cuenta (String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public void ingresar(double cantidad) {
		this.cantidad += cantidad;
		System.out.println("Se ha ingresdo " + cantidad + " en la cuenta");
	}
	
	public void retirar(double cantidad) {
		if (this.cantidad - cantidad >= 0) {
			this.cantidad -= cantidad;
			System.out.println("Se ha retirado " + cantidad + " de la cuenta");
		} else {
			this.cantidad = 0;
			System.out.println("Se ha retidado de la cuenta. Cuenta a 0");
		}
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
}
