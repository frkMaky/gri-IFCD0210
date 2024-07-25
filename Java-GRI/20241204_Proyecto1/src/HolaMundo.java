public class HolaMundo {

	public static void main(String[] args) {
			
		System.out.println("Hola Mundo");
			
		// Utiliza tres println para conseguir poner Hola que tal
		System.out.print("Hola ");
		System.out.print("que ");
		System.out.println("tal");
	
		// Muestra la suma de 5 + 6
		System.out.println("La suma es:");
		System.out.println( 5 + 6 );
		
		// Crea una variable de tipo entera que guarde el resultado de 5+6 y luego muestrala
		int resultado = 5 + 6;
		System.out.print("La suma de 5 + 6 es = ");
		System.out.println(resultado);
		
		// Crea 2 variables una "La casa de " y otra "Pepe" y muestra por consola la concatenacion
		String cadena1 = "La casa de ";
		String cadena2 = "Pepe";
		System.out.println(cadena1 + cadena2);
		
		// Crea yna variable booleana de valor false y muestrala por consola
		boolean miVariable = false;
		System.out.println("Variable booleana = " + miVariable);
		
		// Crea 4 variables de valores 9.3, 6.3, 4.2, 3.1 y muestra la suma
		float num1 = (float) 9.3;
		float num2 = (float) 6.3;
		float num3 = (float) 4.2;
		float num4 = (float) 3.1;
		
		float suma = num1 + num2 + num3 + num4;
		System.out.println("La suma de " + num1 + " + " + num2 + " + " + num3 + " + " + num4 + " es " + suma );
	
		// Declara una variables de valor z y luego reasignale otro valor que sea e y muestra el resultado
		char letra = 'z';
		letra = 'e';
		System.out.println("El caracter es " + letra);
	
		// Crea 5 variables:a, 7.3,2, "casa", true 
		// Luego muesta casa-2-7.3-a-true
		char variable1 = 'a';
		double variable2 = 7.3;
		int variable3 = 2;
		String variable4 = "casa";
		boolean variable5 = true;
		
		System.out.println(variable4+"-"+variable3+"-"+variable2+"-"+variable1+"-"+variable5);
	}	
	
}
