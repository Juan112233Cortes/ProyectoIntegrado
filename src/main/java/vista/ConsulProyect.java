package vista;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;
import control.ConsulBtnListener;
import control.MenuListener;
import modelo.ProyectoIntegrador;

/**
 * Ventana para consultar proyectos
 */
public class ConsulProyect extends JFrame {
    ImageIcon pacImg = new ImageIcon("img/pacTrans.png"); // Icono para la imagen
    JLabel imgLbl = new JLabel(pacImg); // Etiqueta para mostrar la imagen
    private JMenuBar menu; // Barra de menú
    JMenuItem consulItem; 
    JMenuItem addItem; 
    JMenuItem delItem; 
    JMenuItem modItem;
    JMenuItem areasM; 
    JMenuItem alumnosM; 
    private JLabel delTxt; // Etiqueta para el texto de selección de proyecto
    private JList<String> projectList; // Lista de proyectos
    private ArrayList<ProyectoIntegrador> listaProyectos; // Lista de proyectos integradores
    private DefaultListModel<String> listaProy; // Modelo de la lista de proyectos
    private JButton consBtn; // Botón de consulta

    public ConsulProyect() {
        super("Consultar Proyecto");
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

        delTxt = new JLabel("Selecciona el proyecto que quieras consultar"); // Etiqueta de texto
        delTxt.setFont(new Font("Lucida Grande", Font.PLAIN, 19)); // Establecer fuente y tamaño
        delTxt.setBounds(29, 156, 413, 20); // Establecer posición y tamaño
        getContentPane().add(delTxt); // Agregar la etiqueta al content pane

        consBtn = new JButton("Consultar"); // Botón de consulta
        consBtn.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Establecer el cursor al pasar sobre el botón
        consBtn.setBackground(new Color(58, 142, 247)); // Establecer el color de fondo
        consBtn.setBounds(275, 386, 92, 20); // Establecer posición y tamaño
        consBtn.setBorder(new LineBorder(new Color(0, 0, 0), 1, true)); // Establecer borde
        ConsulBtnListener escuchador = new ConsulBtnListener(projectList); // Listener para el botón de consulta
        consBtn.addActionListener(escuchador); // Agregar el listener al botón
        getContentPane().add(consBtn); // Agregar el botón al content pane

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

        setSize(666, 479); // Establecer tamaño de la ventana
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establecer la operación de cierre
    }

    public void setListener(MenuListener listener) {
        consulItem.addActionListener(listener); // Agregar listener a elementos de menú
        addItem.addActionListener(listener);
        delItem.addActionListener(listener);
        modItem.addActionListener(listener);
        areasM.addActionListener(listener);
        alumnosM.addActionListener(listener);
    }

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

    public void desactivar() {
        setVisible(false); // Ocultar la ventana
    }
}
