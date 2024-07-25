package medicamentos;

import java.util.ArrayList;

public class TestMedicamentos {

	public static void main(String[] args) {
		/** 
		 * Se requiere desarrollar un programa que modele la siguiente información de un medicamento:
		Nombre del medicamento, Fabricante del medicamento, Vía de administración del medicamento.
		La clase medicamento debe tener una clase interna, que represente la posología del medicamento con la
		siguiente información:
		Usuarios del medicamento, Dosis del medicamento en miligramos, Periodo de tiempo para tomar el
		medicamento, Recomendaciones.
		En un método main se debe crear el medicamento. También se debe crear una posología y asignársela al
		medicamento creado. Se deben mostrar en pantalla los datos del medicamento y de su posología.
		 */
		
		Medicamento medicamento = new Medicamento("Aspirina","Oral");
		ArrayList<String> recomendaciones = new ArrayList<>();
		recomendaciones.add("Mantener lejos del alcance de los niños");
		recomendaciones.add("Tomar en ayunas");
		recomendaciones.add("Si persiste lconsulte con su médico");
		Medicamento.PosologiaMedicamento posologia = medicamento.new PosologiaMedicamento("adultos",100,"cada 4 horas",recomendaciones);
		
		System.out.println( medicamento );
		System.out.println( posologia );

	}

}
