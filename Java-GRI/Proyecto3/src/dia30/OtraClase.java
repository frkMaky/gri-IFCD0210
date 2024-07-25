package dia30;

import java.util.Scanner;

public class OtraClase {
	
	int atributo1;
	int atributo2;
	
	public OtraClase() {
		this.atributo1 = 0;
		this.atributo2 = 0;	
	}
	
	public void suma() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el primer numero a sumar");
		this.atributo1 = entrada.nextInt();

		System.out.println("Introduce el segundo numero a sumar");
		this.atributo2 = entrada.nextInt();
		
		System.out.println("Resultado: " + (this.atributo1+this.atributo2) );
		entrada.close();
	}
}
