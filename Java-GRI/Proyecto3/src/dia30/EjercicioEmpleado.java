				package dia30;

public class EjercicioEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado2	 e1 = new Empleado2("Pepe");
		System.out.println(e1.toString());
		Operario o1 = new Operario("Luís");
		System.out.println(o1.toString());	
		Directivo d1 = new Directivo("Pedro");
		System.out.println(d1.toString());
		Oficial of1 = new Oficial("Juan");
		System.out.println(of1.toString());
	}

}

class Empleado2 {

	protected String nombre;

	public Empleado2(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}
}

class Directivo extends Empleado2 {

	public Directivo (String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Directivo []";
	}
}

class Operario extends Empleado2 {

	public Operario (String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Operario []";
	}
}

class Oficial extends Operario {
	
	public Oficial (String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Oficial []";
	}
}

class Tecnico extends Operario {
	
	public Tecnico (String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Tecnico []";
	}
}