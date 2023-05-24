package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

import control.MenuListener;

/**
 * Clase que representa la interfaz gráfica de las áreas del proyecto.
 */
public class AreasProyect extends JFrame {
    ImageIcon pacImg = new ImageIcon("img/pacTrans.png");
    JLabel imgLbl = new JLabel(pacImg);
    private JMenuBar menu;
    JMenuItem consulItem;
    JMenuItem addItem;
    JMenuItem delItem;
    JMenuItem modItem;
    JMenuItem areasM;
    JMenuItem alumnosM;

    private JLabel dawLbl;
    private JLabel dawText;
    private JLabel damLbl;
    private JLabel damText;
    private JLabel asirLbl;
    private JLabel asirText;

    /**
     * Constructor de la clase AreasProyect.
     */
    public AreasProyect() {
        super("Áreas");
        getContentPane().setBackground(new Color(195, 219, 255));
        inicializarComponentes();
    }

    /**
     * Inicializa los componentes y los añade al content pane.
     */
    public void inicializarComponentes() {
        getContentPane().setLayout(null);

        // Objetos
        imgLbl.setSize(304, 118);
        imgLbl.setLocation(156, 14);
        getContentPane().add(imgLbl);

        dawLbl = new JLabel("DAW:");
        dawLbl.setBounds(70, 145, 63, 20);
        getContentPane().add(dawLbl);

        // He usado HTML para poder ajustar el texto al tamaño del JLabel
        dawText = new JLabel("<html><body style='width: 118px;'>El grado de DAW (Diseño y Desarrollo de Aplicaciones Web) se centra en el estudio del diseño y desarrollo de aplicaciones web. Los estudiantes adquieren habilidades en lenguajes de programación web, bases de datos y diseño de interfaces. Aprenden a construir aplicaciones web interactivas utilizando tecnologías como HTML, CSS, JavaScript y frameworks populares. Además, se enfoca en la experiencia del usuario y la creación de interfaces intuitivas y atractivas.</body></html>");
        dawText.setVerticalAlignment(SwingConstants.TOP);
        dawText.setBounds(80, 169, 147, 237);
        getContentPane().add(dawText);

        damLbl = new JLabel("DAM");
        damLbl.setBounds(262, 145, 63, 20);
        getContentPane().add(damLbl);

        damText = new JLabel("<html><body style='width: 118px;'>El grado de DAM (Desarrollo de Aplicaciones Multiplataforma) se enfoca en el estudio y desarrollo de aplicaciones para diferentes plataformas y dispositivos. Durante el grado, los estudiantes adquieren conocimientos en lenguajes de programación como Java, C#, Swift y frameworks populares como Xamarin y Flutter. Aprenden a desarrollar aplicaciones tanto nativas como multiplataforma. Además, se exploran conceptos de diseño de interfaces, interacción de usuario y adaptación a diferentes tamaños de pantalla.</body></html>");
        damText.setVerticalAlignment(SwingConstants.TOP);
        damText.setPreferredSize(new Dimension(147, 200));
        damText.setBounds(272, 169, 147, 237);
        getContentPane().add(damText);

        asirLbl = new JLabel("ASIR:");
        asirLbl.setBounds(450, 145, 63, 20);
        getContentPane().add(asirLbl);

        asirText = new JLabel("<html><body style='width: 118px;'>El grado de ASIR (Administración de Sistemas Informáticos en Red) se centra en la administración y gestión de sistemas informáticos en entornos de red. Durante el grado, los estudiantes adquieren conocimientos en áreas como sistemas operativos, redes de computadoras, seguridad informática y servicios de infraestructura. Aprenden a configurar y mantener sistemas operativos, administrar redes locales y remotas, implementar medidas de seguridad y gestionar servicios.</body></html>");
        asirText.setVerticalAlignment(SwingConstants.TOP);
        asirText.setPreferredSize(new Dimension(147, 200));
        asirText.setBounds(460, 169, 147, 237);
        getContentPane().add(asirText);

        // Menú
        menu = new JMenuBar();
        areasM = new JMenuItem("Áreas");
        alumnosM = new JMenuItem("Alumnos");
        JMenu proyectoM = new JMenu("Proyecto Integrador");

        consulItem = new JMenuItem("Consultas");
        addItem = new JMenuItem("Añadir Proyecto");
        delItem = new JMenuItem("Borrar Proyecto");
        modItem = new JMenuItem("Modificar Proyecto");

        proyectoM.add(consulItem);
        proyectoM.add(addItem);
        proyectoM.add(delItem);
        proyectoM.add(modItem);
        menu.add(proyectoM);
        menu.add(areasM);
        menu.add(alumnosM);
        setJMenuBar(menu);
        Border border = BorderFactory.createLineBorder(Color.BLACK);

        // Listener
        MenuListener menuList = new MenuListener(this);
        setListener(menuList);

        setSize(666, 479);
        setLocationRelativeTo(null);
    }

    /**
     * Establece el listener para los elementos del menú.
     *
     * @param listener El objeto MenuListener que manejará los eventos del menú.
     */
    public void setListener(MenuListener listener) {
        consulItem.addActionListener(listener);
        addItem.addActionListener(listener);
        delItem.addActionListener(listener);
        modItem.addActionListener(listener);
        areasM.addActionListener(listener);
        alumnosM.addActionListener(listener);
    }

    /**
     * Hace toda la página visible.
     */
    public void hacerVisible() {
        setVisible(true);
    }

    /**
     * Método getter para el elemento consulItem (creado solo para testing).
     *
     * @return El elemento consulItem.
     */
    public Object getConsulItem() {
        return null;
    }

    /**
     * Método getter para el elemento addItem (creado solo para testing).
     *
     * @return El elemento addItem.
     */
    public Object getAddItem() {
        return null;
    }
}
