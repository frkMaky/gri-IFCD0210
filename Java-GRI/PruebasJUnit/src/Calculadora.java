
public class Calculadora {

	public int a;
	public int b;

	public Calculadora(int A, int B) {
		this.a = A;
		this.b = B;
	}
	public int suma () {
		return this.a + this.b;
	}
	
	public int resta () {
		return this.a - this.b;
	}
	
	public int producto () {
		return this.a * this.b;
	}
	
	public int cociente() {
		return this.a / this.b;
	}

}
