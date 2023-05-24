package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.*;
import control.CloseWindowBtnListener;
import control.ConsulBtnListener;
import control.EditStdntBtnListener;
import modelo.ProyectoIntegrador;

/**
 * Clase que representa la ventana de editar alumnos.
 */
public class AddAlumn extends JFrame {
    private JLabel numExpLbl; // Etiqueta para el número de expediente
    private JLabel codigoLbl; // Etiqueta para el código
    private JLabel nombreLbl; // Etiqueta para el nombre
    private JLabel apellidosLbl; // Etiqueta para los apellidos
    private JTextField numExpTxtF; // Campo de texto para el número de expediente
    private JTextField codigoTxtF; // Campo de texto para el código
    private JTextField nombreTxtF; // Campo de texto para el nombre
    private JTextField apellidosTxtF; // Campo de texto para los apellidos
    private JList<String> alumnList; // Lista de alumnos
    private ArrayList<ProyectoIntegrador> listaAlumnos; // Lista de alumnos
    private DefaultListModel<String> listaAlumn; // Modelo de lista para los alumnos
    private JButton saveButton; // Botón para guardar la edición

    /**
     * Constructor de la clase AddAlumn.
     * Inicializa los componentes de la ventana.
     */
    public AddAlumn() {
        super("Editar Alumnos");
        listaAlumnos = new ArrayList<ProyectoIntegrador>();
        getContentPane().setBackground(new Color(195, 219, 255)); // Establece el color de fondo
        inicializarComponentes();
    }

    /**
     * Inicializa los componentes de la ventana.
     */
    public void inicializarComponentes() {
        getContentPane().setLayout(null); // Establece un diseño nulo para colocar los componentes manualmente
        alumnList = new JList<>(listaAlumn); // Inicializa la lista de alumnos con el modelo

        // Inicializa las etiquetas y las coloca en posiciones específicas
        numExpLbl = new JLabel("Nº expediente: ");
        numExpLbl.setBounds(86, 110, 73, 20);
        getContentPane().add(numExpLbl);

        codigoLbl = new JLabel("Código: ");
        codigoLbl.setBounds(86, 185, 63, 20);
        getContentPane().add(codigoLbl);

        nombreLbl = new JLabel("Nombre: ");
        nombreLbl.setBounds(86, 260, 73, 20);
        getContentPane().add(nombreLbl);

        apellidosLbl = new JLabel("Apellidos: ");
        apellidosLbl.setBounds(86, 335, 73, 20);
        getContentPane().add(apellidosLbl);

        // Inicializa los campos de texto y los coloca en posiciones específicas
        numExpTxtF = new JTextField();
        numExpTxtF.setBounds(221, 110, 107, 20);
        getContentPane().add(numExpTxtF);

        codigoTxtF = new JTextField();
        codigoTxtF.setBounds(221, 335, 107, 20);
        getContentPane().add(codigoTxtF);

        nombreTxtF = new JTextField();
        nombreTxtF.setBounds(221, 260, 107, 20);
        getContentPane().add(nombreTxtF);

        apellidosTxtF = new JTextField();
        apellidosTxtF.setBounds(221, 185, 107, 20);
        getContentPane().add(apellidosTxtF);

        // Inicializa y configura el botón de guardar
        CloseWindowBtnListener escuchador = new CloseWindowBtnListener(null, null, this);
        saveButton.addActionListener(escuchador);
        getContentPane().add(saveButton);

        saveButton = new JButton("Editar");
        saveButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        saveButton.setSize(85, 29);
        saveButton.setLocation(221, 401);
        getContentPane().add(saveButton);

        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(666, 479);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }

    /**
     * Muestra los alumnos en la lista.
     * @param lista La lista de alumnos a mostrar.
     */
    public void showAlumn(ArrayList<ProyectoIntegrador> lista) {
        for (ProyectoIntegrador a : lista) {
            listaAlumn.addElement(a.toString()); // Agrega cada alumno al modelo de lista
        }
    }

    /**
     * Hace visible la ventana de añadir alumnos.
     */
    public void hacerVisible() {
        setVisible(true);
    }

    // Getters y Setters para los componentes de la ventana

    public JLabel getNumExpLbl() {
        return numExpLbl;
    }

    public void setNumExpLbl(JLabel numExpLbl) {
        this.numExpLbl = numExpLbl;
    }

    public JLabel getCodigoLbl() {
        return codigoLbl;
    }

    public void setCodigoLbl(JLabel codigoLbl) {
        this.codigoLbl = codigoLbl;
    }

    public JLabel getNombreLbl() {
        return nombreLbl;
    }

    public void setNombreLbl(JLabel nombreLbl) {
        this.nombreLbl = nombreLbl;
    }

    public JLabel getApellidosLbl() {
        return apellidosLbl;
    }

    public void setApellidosLbl(JLabel apellidosLbl) {
        this.apellidosLbl = apellidosLbl;
    }

    public JTextField getNumExpTxtF() {
        return numExpTxtF;
    }

    public void setNumExpTxtF(JTextField numExpTxtF) {
        this.numExpTxtF = numExpTxtF;
    }

    public JTextField getCodigoTxtF() {
        return codigoTxtF;
    }

    public void setCodigoTxtF(JTextField codigoTxtF) {
        this.codigoTxtF = codigoTxtF;
    }

    public JTextField getNombreTxtF() {
        return nombreTxtF;
    }

    public void setNombreTxtF(JTextField nombreTxtF) {
        this.nombreTxtF = nombreTxtF;
    }

    public JTextField getApellidosTxtF() {
        return apellidosTxtF;
    }

    public void setApellidosTxtF(JTextField apellidosTxtF) {
        this.apellidosTxtF = apellidosTxtF;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;
    }
}
