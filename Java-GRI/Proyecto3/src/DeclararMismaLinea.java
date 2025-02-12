import java.util.Scanner;

public class DeclararMismaLinea {

	public static void main(String[] args) {
		
		// Crea 3 variables: 5, 7, 2 y muestra el resultado de 5 elevado a 7 y luego menos dos
		int a=5, b=7, c=2;
		int resultado = (int) Math.pow(a, b) - c;
		System.out.println("El resultado es " + resultado);
		
		// Declara el tipo de dato mas adecuado para cada uno de estos numeros
		byte numero1 = 26;
		int numero2 = 181818181;
		double numero3 = 13.45567888938f;
		
		// Halla el area del triangulo de base 3 y altura 4 
		// A = (b*h) / 2
		double base = 3;
		double altura = 4;
		double areaTriangulo = (base*altura)/2;
		System.out.println(areaTriangulo);
		
		// Muestra la mitada del siguiente numero 922337203685477587
		System.out.println(922337203685477587L / 2);
	
		// Calcula la suma de 25 millones con 32000
		// Las variables declaralas con notacion cientifica
		double primerNumero = 25e6d;
		double segundoNumero = 32e3d;
		double resultadoSuma = primerNumero + segundoNumero;
		System.out.println("El resultado es: " + resultadoSuma );
	
		// Crea una variable boolean que indique puerta abierta false y muestra el resultado
		boolean isPuertaAbierta = false;
		System.out.println("Está la puerta abierta: " + isPuertaAbierta );
	
		// Teniendo un lado de 5, y un diametro de 20; halla el area de un cuadrado del rectangulo
		// sabiendo que los lados largos son el doble del pequeño y el area del circulo
		double lado = 5;
		double diametro = 20;
		System.out.println("El area del cuadrado es: " + (lado * lado) );
		System.out.println("El area del rectangulo es: " + (lado * (2*lado) ) );
		System.out.println("El area del círculo es: " + (Math.PI * (Math.pow(diametro/2, 2)) ) );
		
		// Representar caracteres con numero ascii
		char miVar1 = 65, miVar2 = 66, miVar3 = 67;
		System.out.println(miVar1);
		System.out.println(miVar2);
		System.out.println(miVar3);
	
		// Clase SCANNER 
		System.out.print("Introduce un número: ");
		Scanner entrada = new Scanner(System.in); // Terminal
		int num = entrada.nextInt();
		System.out.println("Has introducido el numero: " + num);
		
		// pide dos números con decimales por consola y muestra la suma de ellos: "La suma de x más y es z"
		System.out.print("Introduce el valor de x: ");
		int x = entrada.nextInt();
		System.out.print("Introduce el valor de y: ");
		int y = entrada.nextInt();
		int z = x + y;
		System.out.println("La suma de " + x + " mas " + y + " es  "+  z);
		
		// pide una cadena por consola * y muestra "La cadena es x "
		System.out.println("Introduce una cadena");
		Scanner entradaCadena = new Scanner(System.in);
		String cadena = entradaCadena.nextLine();
		System.out.println("La cadena es " + cadena);
		
		// Mete 3 numeros enteros por consola y luego haz un contador que sume x veces esos numeros
		System.out.println("introduce el primer numero");
		int n1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		int n2 = entrada.nextInt();
		System.out.println("Introduce el nº de veces que quieres sumarlos");
		int contador = entrada.nextInt();
		int resultadoBucle = (n1+n2) * contador;
		System.out.println("El resultado es: " + resultadoBucle);
	
		// Pide por consola 2 numeros y muestra true o false si el num1 es mayor/menor
		System.out.println("Introduce el numero 1");
		int num1 = entrada.nextInt();
		System.out.println("Introduce el numero 2");
		int num2 = entrada.nextInt();
		boolean isNumero = (num1 > num2) || (num1 < num2);
		System.out.println(isNumero);
		
		// Mete por consola un dia de la semana. Si es "domingo" muestra "estoy de descansao",
		// si es sabado trabaja un poco y cualquier otro dia "TRabaja un monton"
		// Modifica el programa anterior para que solo funcione con dias de la semana
		System.out.println("Introduce un dia de la semana");
		String diaSemana = entradaCadena.nextLine();
		if (diaSemana.equalsIgnoreCase("domingo") ){
			System.out.println("Estoy de descanso");
		} else if (diaSemana.equalsIgnoreCase("sabado") ) {
			System.out.println("Trabaja un poco");
		} else if (diaSemana.equalsIgnoreCase("lunes")||diaSemana.equalsIgnoreCase("martes")||diaSemana.equalsIgnoreCase("miercoles")||diaSemana.equalsIgnoreCase("jueves")||diaSemana.equalsIgnoreCase("viernes")){
			System.out.println("Trabaja un montón");
		}
		
		// Numero por consola muestra si es par, multiplo de 3, ambos o no se sabe
		System.out.println("Introduce un numero");
		int numeroMultiplo = entrada.nextInt();
		if (numeroMultiplo%2 == 0 && numeroMultiplo%3==0) {
			System.out.println("Es par y multiplo de 3");
		} else if (numeroMultiplo%2==0) {
			System.out.println("Es par");
		} else if (numeroMultiplo%3==0) {
			System.out.println("Es multiplo de 3");
		} else {
			System.out.println("No se sabe");
		}
	
		/*Introduce dos números
        * Comprueba si estos son múltiplos de 5.
        * Si lo son los dos "Son los dos múltiplos de 5"
        * Si solo lo es uno "El número x es
        * múltiplo de 5" */
		System.out.println("Introduce un numero");
		int multiploUno = entrada.nextInt();
		System.out.println("Introduce un segundo numero");
		int multiploDos = entrada.nextInt();
		if (multiploUno%5==0 && multiploDos%5==0) {
			System.out.println("Son los dos multiplos de 5");
		} else if (multiploUno%5==0) {
			System.out.println("El numero " + multiploUno + " es multiplo de 5");
		} else if (multiploDos%5==0) {
			System.out.println("El numero " + multiploDos + " es multiplo de 5");
		}
		
		 /*Pide 2 números y una palabra.
	    * Muestra por consola la suma de los
	    * números y la palabra de esta forma:
	    * "La suma de x más z es k y la palabra es s"
	    */
		  Scanner sc = new Scanner(System.in);
	       System.out.println("Introduzca el primer número:");
	       double num11 = sc.nextDouble();
	       System.out.println("Introduzca el segundo número:");
	       double num22 = sc.nextDouble();
	       System.out.println("Introduzca una palabra");
	       String palabra = sc.next();
	       System.out.println("La suma de " + num11+ " más " + num22 + " es " + (num11+num22) + " y la palabra es " + palabra);
	       //System.out.println((num1+num2) + palabra);
	       
		// Cerrar flujos de datos 
		entrada.close();
		entradaCadena.close();
		
	} // public static void main(String[] args) 

}
