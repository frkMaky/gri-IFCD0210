package dia29;

import java.util.Scanner;

public class EjercicioPassword {

	public static void main(String[] args) {
		/* Haz una clase llamada Password que siga las siguientes
		condiciones:

		Que tenga los atributos longitud y contrasenha. Por

		defecto, la longitud será de 8.

		Los constructores serán los siguientes:
		-Un constructor por defecto.
		-Un constructor con la longitud que nosotros le pasemos.

		Generará una contraseña aleatoria con esa longitud.

		Los métodos que implementa serán:

		-generarPassword(): genera la contraseña del objeto

		con la longitud que tenga.

		-esFuerte(): devuelve un booleano si es fuerte o no, para
		que sea fuerte debe tener más de 2 mayúsculas, más de 1
		minúscula y más de 5 números.

		-Método get para contraseña y longitud.
		-Método set para longitud.
		Ahora, crea una clase clase ejecutable:
		Crea un array de Passwords con el tamaño que le

		indiques por teclado.

		Crea un bucle que cree un objeto para cada posición del

		array.

		Indica también por teclado la longitud de las Passwords

		(antes de bucle).

		Crea otro array de booleanos en donde se almacene si
		la password del array de Password es o no fuerte (usa el bucle
		anterior).

		Al final, muestra la contraseña y si es o no fuerte (usa el
		bucle anterior). Usa este simple formato:
		contraseña1 valor_booleano1
		contraseña2 valor_booleano2
		*/
		Scanner entrada = new Scanner (System.in);
		int numPass = 0;
		int longitud = 0;
		Password[] contrasenhas;
		boolean[] fuertes;
		
		System.out.println("¿Cuantos passwords se guardaran?");
		numPass = entrada.nextInt();
		System.out.println("Longitud de los password");
		longitud = entrada.nextInt();
		
		contrasenhas = new Password[numPass];
		fuertes = new boolean[numPass];
		int contador = 0;
		for (int i=0;i<contrasenhas.length;i++){
			contrasenhas[i] = new Password(longitud);
			contrasenhas[i].generarPassword();
			fuertes[contador] = contrasenhas[i].esFuerte();
			System.out.println(contrasenhas[i].getContrasenha() + " " + fuertes[contador]);
			contador++;
		}
		entrada.close();
	}

}
class Password {
	
	private int longitud;
	private String contrasenha;
	
	public Password() {
		this.longitud = 8;
	}
	public Password(int longitud ){
		this.longitud = longitud;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContrasenha() {
		return contrasenha;
	}
	public void generarPassword() {
		
		char[] pass = new char[this.longitud];
		char letra ='\u0000';
		
		for (int i=0;i<pass.length;i++) {
			do {
				letra = (char) (Math.random()*100 + 65);
			} while ( (letra>=(char)48 && letra<=(char)57) || (letra>=(char)65 && letra<=(char)90) || (letra>=(char)97 && letra<=(char)122) ) ;
			System.out.print(letra);
			pass[i] = letra;
		}
		this.contrasenha = pass.toString();
		
	}
	public boolean esFuerte() {
		int mayus = 0;
		int minus = 0;
		int numeros = 0;
		boolean resultado;
		
		// Contar mayus, minus y numeros
		for (int i=0;i< this.contrasenha.length();i++) {
			if (contrasenha.charAt(i) >=65 && contrasenha.charAt(i) <= 90 ) {
				mayus++;
			}
			if (contrasenha.charAt(i) >=97 && contrasenha.charAt(i) <= 122 ) {
				minus++;
			}
			if (contrasenha.charAt(i) >=48 && contrasenha.charAt(i) <= 57 ) {
				numeros++;
			}
		}

		//  2 mayúsculas, más de 1 minúscula y más de 5 números.
		if (mayus >= 2 && minus > 1 && numeros >=5) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
}
