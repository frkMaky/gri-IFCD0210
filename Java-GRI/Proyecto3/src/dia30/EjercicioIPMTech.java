package dia30;

public class EjercicioIPMTech {

	public static void main(String[] args) {
		/*
		* La empresa informática “IPM Tech” necesita llevar un registro de todos sus empleados que se encuentran en la
		oficina central, para eso ha creado un diagrama de clases que debe incluir lo siguiente:
		1) Empleado
		Atributos:

		- nombre: tipo cadena (Debe ser nombre y apellido)
		- oficina: tipo cadena
		- edad : entero (Rango entre 18 y 45 años)
		- casado: boolean
		- salario: tipo numérico doble
		
		Métodos:
		- No crear los getters ni setters
		- Constructor con y sin parámetros de entrada
		- Método que permita mostrar la clasificación según la edad de
		acuerdo al siguiente algoritmo:
		Si edad es menor o igual a 21, Principiante
		Si edad es >=22 y <=35, Intermedio
		Si edad es >35, Senior.-
		- Imprimir los datos del empleado por pantalla (utilizar salto de
		línea \n para separar los atributos.
		- Un método que permita aumentar el salario en un porcentaje
		que sería pasado como parámetro al método.
		2. Programador (Especialización de Empleado). Clase que
		hereda de Empleado todos los atributos y métodos.
		- Atributos:
		
		- lineasDeCodigoPorHora : tipo entero
		- lenguajeDominante: tipo cadena
		- Metodos:
		
		- Constructor con y sin parámetos de entrada.
		*/
		Empleado emp1 = new Empleado ("Jose Manuel Perez","Central",23,true,2000);
		System.out.println(emp1);
		emp1.aumento(25);
		emp1.mostrarClasificacion();
		System.out.println(emp1);
		
		Programador prog1 = new Programador("Pablo Maquieira","GRI",39,false,1000,300,"Java");
		System.out.println(prog1);
		prog1.aumento(50);
		prog1.mostrarClasificacion();
		System.out.println(prog1);
	}

}
class Empleado {
	protected String nombre;
	protected String oficina;
	protected int edad;
	protected boolean casado;
	protected double salario;
	
	public Empleado() {
		
	}
	public Empleado(String nombre, String oficina, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.oficina = oficina;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}
	public void mostrarClasificacion() {
		
		System.out.print("Clasificacion: ");
		if (this.edad <=21 ) {
			System.out.println("Principiante");
		} else if (this.edad >= 22 && this.edad <=35) {
			System.out.println("Intermedio");
		} else if (this.edad > 35 ) {
			System.out.println("Senior");
		}
	}
	@Override
	public String toString() {
		return "\nnombre: " + nombre + "\noficina: " + oficina + "\nedad: " + edad + "\ncasado:" + casado
				+ "\nsalario: " + salario + "€";
	}
	public void aumento (int porcentaje) {
		System.out.println("Se ha aumentado el salario un " + porcentaje +  "% (" + (porcentaje*this.salario/100) + " €)");
		this.salario += (porcentaje*this.salario/100);
	}
	
}
class Programador extends Empleado {
	private int lineasDeCodigoPorHora;
	private String lenguajeDominante;
	
	public Programador() {
	}
	public Programador(int lineasDeCodigoPorHora, String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
	}
	public Programador(String nombre, String oficina, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante) {
		super(nombre, oficina,edad,casado,salario);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}
	public int getLineasDeCodigoPorHora() {
		return lineasDeCodigoPorHora;
	}
	public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
	}
	public String getLenguajeDominante() {
		return lenguajeDominante;
	}
	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}
	@Override
	public String toString() {
		return super.toString() + "\nProgramador [lineasDeCodigoPorHora=" + lineasDeCodigoPorHora + ", lenguajeDominante="
				+ lenguajeDominante + "]";
	}
	
}