import java.util.Scanner;

public class EjercicioLimites {

	public static void main(String[] args) {
		// Escribe un programa que pida el limite inferior y superior de un intervalo
		// Si el inferior es mayor que el superior lo tiene que volver a pedir
		// Se iran introduciendo numeros hasta que introduzcamos el cero
		// Al final muestra la suma de los numeros que estan en el intervalo (CERRADO) 
		// Cuantos numeros estan fuera del intervalo 
		// Informarmar de si hemos introducido algun numero igual a los limites del intervalo
		
		Scanner entrada = new Scanner(System.in);
		
		int limiteInferior = 0;
		int limiteSuperior = 0;
		boolean limites = false;
		int numero = -1;
		int sumaTotal = 0;
		int contadorFuera = 0;
		int contadorInferior = 0;
		int contadorSuperior = 0;
		
		while(!limites) {
			System.out.println("Introduce el limite inferior");
			limiteInferior= entrada.nextInt();

			System.out.println("Introduce el limite superior");
			limiteSuperior= entrada.nextInt();
			
			if (limiteInferior >= limiteSuperior) {
				System.out.println("Los limites no estan bien definidos, se vuelven a pedir");
			} else {
				limites = true;
			}
		}
		
		while (numero != 0) {
			System.out.print("Introduce un numero: ");
			numero = entrada.nextInt();
			if (numero >= limiteInferior && numero <= limiteSuperior) {
				// suma los numeros dentro del intervalo 
				sumaTotal += numero;
				if (numero == limiteInferior) { // Contar si el numero coincide con el limite inferior 
					contadorInferior++;
				}
				if (numero == limiteSuperior) { // Contar si el numero coincide con el limite superior
					contadorSuperior++;
				}
			} else {
				contadorFuera++; // Se cuentan los numeros fuera del intervalo
			}
		}
		
		// Salida por pantalla
		System.out.println("Limite inferior: " + limiteInferior);
		System.out.println("Limite superior: " + limiteSuperior);
		System.out.println("Suma de los numeros introducidos dentro del intervalo: " + sumaTotal);
		System.out.println("Coincidencias con limite inferior: " + contadorInferior);
		System.out.println("Coincidencias con limite superior: " + contadorSuperior);
		System.out.println("Numeros introducidos fuera del intervalo: " + contadorFuera);
		
		

	}

}
