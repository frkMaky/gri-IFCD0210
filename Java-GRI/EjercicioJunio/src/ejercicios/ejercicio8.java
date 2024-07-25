package ejercicios;

public class ejercicio8 {

	public static void main(String[] args) {
		/**
		 * 8. Escriba un programa Java para crear una clase llamada Empleado con métodos llamados trabajo() y
			getSalary(). Cree una subclase llamada HRManager que anule el método work() y agregue un nuevo
			método llamado addEmployee().
		 */
		Empleado emp1 = new Empleado();
		HRManager emp2 = new HRManager();
		
		emp1.work();
		emp1.getSalary();
	
		emp2.work();
		emp2.getSalary();
		emp2.addEmployee();

	}

}
class Empleado {
	
	private double salary;
	
	public Empleado () {
		this.salary = 1000;
	}
	
	public void work() {
		System.out.println("Trabajando");
	}
	public double getSalary() {
		return this.salary;
	}
}
class HRManager extends Empleado {
	public void work() {
		System.out.println("Trabajando en HRManager");
	}
	public void addEmployee() {
		System.out.println("añadiendo empleado");
	}
	
}