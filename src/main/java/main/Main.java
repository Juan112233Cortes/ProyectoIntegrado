package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import control.ConsulBtnListener;
import vista.*;

public class Main extends JFrame{
	private VentanaPrincipal cover;
	private JLayeredPane bg;
	
	public Main() {
//		inicializarComponentes();
		init();
	}
	
	private void init() {
        // Crear una instancia de VentanaPrincipal

		cover = new VentanaPrincipal();
        // Agregar la ventana principal al JLayeredPane

		bg.add(cover);
	}

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
            // Crear una instancia de la clase Main

			public void run() {
				VentanaPrincipal ventana = new VentanaPrincipal();
		        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ventana.setVisible(true);
			}
		});


	}
}
