package may06;

public class EjercicioClasesInternas {

	public static void main(String[] args) {
		/** Crea una clase llamada NumPares con 3 variables (2,4,6)
		 * crea clase interna llamada Nums con dos variables (10, 100)
		 * Muestra las variables de la clase externa y las de la clase interna
		 */
		NumPares numPares = new NumPares();
		NumPares.Nums numsInterna = numPares.new Nums();
		
		System.out.println( numPares.getNum1() );
		System.out.println( numPares.getNum2() );
		System.out.println( numPares.getNum3() );

		System.out.println( numsInterna.getNum4() );
		System.out.println( numsInterna.getNum5() );

	}

}
class NumPares {
	private int num1, num2, num3;
	
	class Nums {
		private int num4, num5;
		
		public Nums() {
			this.num4 = 10;
			this.num5 = 100;
		}

		public int getNum4() {
			return num4;
		}

		public void setNum4(int num4) {
			this.num4 = num4;
		}

		public int getNum5() {
			return num5;
		}

		public void setNum5(int num5) {
			this.num5 = num5;
		}
		
		
	} // clase interna
	
	public NumPares() {
		this.num1 = 2;
		this.num2 = 4;
		this.num3 = 6;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	
}
