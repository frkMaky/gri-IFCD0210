package test;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class TestSwing {

	public static void main(String[] args) {

		JFrame miVentana = new JFrame();
		miVentana.setBounds(300, 300, 500, 500);
		miVentana.setVisible(true);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setTitle("Ventana de Prueba");
		ImageIcon miIcono = new ImageIcon("flecha.jpg");
		miVentana.setIconImage(miIcono.getImage());
		
		
		JPanel miPanel = new JPanel();
		miPanel.setBounds(0, 0, 500, 500);
		miPanel.setVisible(true);
		miPanel.setLayout(new FlowLayout() );
		
		JLabel miEtiqueta = new JLabel ("Etiqueta:");
		miPanel.add(miEtiqueta);
		JTextField miCampo = new JTextField("prueba");
		miCampo.setSize(new Dimension (300,300) );
		miPanel.add(miCampo, FlowLayout.CENTER);
		
		miVentana.add(miPanel);
	}
}
