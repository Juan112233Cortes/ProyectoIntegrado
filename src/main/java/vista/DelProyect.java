package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;

import control.DelProyBtnListener;
import control.MenuListener;
import modelo.ProyectoIntegrador;

/**
 * 
 * Ventana para borrar proyectos
 */
public class DelProyect extends JFrame {
	ImageIcon pacImg = new ImageIcon("img/pacTrans.png"); // Icono para la imagen
	JLabel imgLbl = new JLabel(pacImg); // Etiqueta para mostrar la imagen
	private JMenuBar menu; // Barra de menú
	JMenuItem consulItem; // Elemento de menú para consultas
	JMenuItem addItem; // Elemento de menú para añadir proyecto
	JMenuItem delItem; // Elemento de menú para borrar proyecto
	JMenuItem modItem; // Elemento de menú para modificar proyecto
	JMenuItem areasM; // Elemento de menú para áreas
	JMenuItem alumnosM; // Elemento de menú para alumnos

	private JLabel delTxt; // Etiqueta para el texto de selección de proyecto
	private JList<String> projectList; // Lista de proyectos
	private ArrayList<ProyectoIntegrador> listaProyectos; // Lista de proyectos integradores
	private DefaultListModel<String> listaProy; // Modelo de la lista de proyectos
	private JButton delBtn; // Botón de eliminación de proyecto

	public DelProyect() {
		super("Borrar Proyecto");
		listaProyectos = new ArrayList<ProyectoIntegrador>();
		getContentPane().setBackground(new Color(195, 219, 255)); // Establecer el color de fondo
		inicializarComponentes();
	}

	/**
	 * Inicializa los componentes y los añade al content pane
	 */
	public void inicializarComponentes() {
		getContentPane().setLayout(null); // Establecer el diseño nulo

		// Objetos
		imgLbl.setSize(304, 118); // Establecer el tamaño de la imagen
		imgLbl.setLocation(156, 14); // Establecer la ubicación de la imagen
		getContentPane().add(imgLbl); // Agregar la imagen al content pane

		delTxt = new JLabel("Selecciona el proyecto que quieras eliminar"); // Etiqueta de texto
		delTxt.setFont(new Font("Lucida Grande", Font.PLAIN, 19)); // Establecer fuente y tamaño
		delTxt.setBounds(10, 162, 413, 20); // Establecer posición y tamaño
		getContentPane().add(delTxt); // Agregar la etiqueta al content pane

		delBtn = new JButton("Eliminar"); // Botón de eliminación de proyecto
		delBtn.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Establecer el cursor al pasar sobre el botón
		delBtn.setBackground(new Color(58, 142, 247)); // Establecer el color de fondo
		delBtn.setBounds(261, 386, 117, 20); // Establecer posición y tamaño
		delBtn.setBorder(new LineBorder(new Color(0, 0, 0), 1, true)); // Establecer borde
		getContentPane().add(delBtn); // Agregar el botón al content pane

		// Menú
		menu = new JMenuBar(); // Crear la barra de menú
		areasM = new JMenuItem("Áreas"); // Elemento de menú para áreas
		alumnosM = new JMenuItem("Alumnos"); // Elemento de menú para alumnos
		JMenu proyectoM = new JMenu("Proyecto Integrador"); // Menú para proyecto integrador
		consulItem = new JMenuItem("Consultas"); // Elemento de menú para consultas
		addItem = new JMenuItem("Añadir Proyecto"); // Elemento de menú para añadir proyecto
		delItem = new JMenuItem("Borrar Proyecto"); // Elemento de menú para borrar proyecto
		modItem = new JMenuItem("Modificar Proyecto"); // Elemento de menú para modificar proyecto
		proyectoM.add(consulItem); // Agregar elemento de menú a proyecto integrador
		proyectoM.add(addItem);
		proyectoM.add(delItem);
		proyectoM.add(modItem);
		menu.add(proyectoM); // Agregar proyecto integrador al menú
		menu.add(areasM);
		menu.add(alumnosM);
		setJMenuBar(menu); // Establecer la barra de menú en la ventana
		Border border = BorderFactory.createLineBorder(Color.BLACK); // Crear borde
		listaProy = new DefaultListModel(); // Crear modelo de lista

		// Listener de menú
		MenuListener menuList = new MenuListener(this); // Listener para el menú
		setListener(menuList); // Establecer el listener en los elementos de menú

		// Lista
		projectList = new JList<>(listaProy); // Crear lista con el modelo
		projectList.setLocation(43, 205); // Establecer posición de la lista
		projectList.setSize(563, 171); // Establecer tamaño de la lista
		Border buttonBorder = BorderFactory.createLineBorder(Color.BLACK); // Crear borde

		JScrollPane scrollPane = new JScrollPane(projectList); // Crear panel de desplazamiento para la lista
		scrollPane.setBounds(43, 205, 563, 171); // Establecer posición y tamaño del panel
		getContentPane().add(scrollPane); // Agregar el panel al content pane

		DelProyBtnListener delListenerButton = new DelProyBtnListener(projectList); // Listener para el botón de eliminación de proyecto
		delBtn.addActionListener(delListenerButton); // Agregar el listener al botón de eliminación de proyecto

		setSize(666, 479); // Establecer tamaño de la ventana
		setLocationRelativeTo(null); // Centrar la ventana en la pantalla
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establecer la operación de cierre
	}

	/**
	 * Establece el listener en los elementos de menú
	 * @param listener El listener del menú
	 */
	public void setListener(MenuListener listener) {
		consulItem.addActionListener(listener); // Agregar listener a elementos de menú
		addItem.addActionListener(listener);
		delItem.addActionListener(listener);
		modItem.addActionListener(listener);
		areasM.addActionListener(listener);
		alumnosM.addActionListener(listener);
	}

	/**
	 * Muestra los proyectos en la lista
	 * @param lista La lista de proyectos a mostrar
	 */
	public void showProys(ArrayList<ProyectoIntegrador> lista) {
		for (ProyectoIntegrador p : lista) { // Recorrer la lista de proyectos
			listaProy.addElement(p.toString()); // Agregar cada proyecto al modelo de lista
		}
	}

	/**
	 * Hace toda la página visible
	 */
	public void hacerVisible() {
		setVisible(true); // Hacer visible la ventana
	}

	/**
	 * Desactiva la ventana
	 */
	public void desactivar() {
		setVisible(false); // Ocultar la ventana
	}
}
