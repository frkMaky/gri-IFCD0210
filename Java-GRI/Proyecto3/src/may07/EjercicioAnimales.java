package may07;

import may07.animales.*;

public class EjercicioAnimales {

	public static void main(String[] args) {
		/*Realiza un programa que implemente las siguientes clases y
		métodos relacionados con una jerarquía taxonómica de
		animales.
		* Los mamíferos son una clase abstracta con el método
		abstracto amamantarCrías, que no devuelve nada.

		* Las ballenas son mamíferos e implementan el método
		abstracto heredado, la pantalla muestra un mensaje indicando
		que La ballena amamanta a sus crías.
		* Los animales ovíparos son una interfaz con el método
		ponerHuevos.
		* El ornitorrinco es un mamífero que pone huevos. Por lo tanto,
		es una clase que hereda de mamífero e implementa la interfaz
		Ovíparo. El método heredado de la clase padre muestra en
		pantalla que El ornitorrinco amamanta a sus crías, y el método
		implementado desde la interfaz muestra en pantalla que El
		ornitorrinco pone huevos.
		*/
		Ballenas ballena1 = new Ballenas();
		Ornitorrinco ornitorrinco1 = new Ornitorrinco();
		
		ballena1.amamantarCrías();
		ornitorrinco1.amamantarCrías();
		ornitorrinco1.ponerHuevos();
	}

}
