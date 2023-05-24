package vista;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.*;
import control.CloseWindowBtnListener;
/**
 * Clase que representa la ventana de consulta de proyecto.
 */
public class OpenConsulProy extends JFrame {
	ImageIcon pacImg = new ImageIcon("img/pacTrans.png");
	JLabel imgLbl = new JLabel(pacImg);
	private JLabel idLbl;
	private JLabel nombreProyLbl;
	private JLabel urlLbl;
	private JLabel notaLbl;
	private JLabel fechaLbl;
	private JLabel cursoLbl;
	private JLabel grupoLbl;
	
    private JLabel idTxtF;
    private JLabel nombreProyTxtF;
    private JLabel urlTxtF;
    private JLabel notaTxtF;
    private JLabel fechaTxtF;
    private JLabel cursoTxtF;
    private JLabel grupoTxtF;
    private JButton closeButton;
    String nombreProyecto;
    /**
     * Constructor de la clase OpenConsulProy.
     * Crea una nueva instancia de la ventana de consulta de proyecto.
     */
    public OpenConsulProy() {
    	super("Consultar Proyecto");
		getContentPane().setBackground(new Color(195, 219, 255));
    	inicializarComponentes();
    }
    /**
     * Inicializa los componentes de la ventana.
     */
    public void inicializarComponentes() {
		getContentPane().setLayout(null);

		idLbl = new JLabel("ID: ");
		idLbl.setBounds(86, 111, 73, 20);
	    getContentPane().add(idLbl);

		nombreProyLbl = new JLabel("Nombre: ");
		nombreProyLbl.setBounds(86, 170, 63, 20);
	    getContentPane().add(nombreProyLbl);

		urlLbl = new JLabel("URL: ");
		urlLbl.setBounds(86, 230, 73, 20);
	    getContentPane().add(urlLbl);

		notaLbl = new JLabel("Nota: ");
		notaLbl.setBounds(86, 290, 73, 20);
	    getContentPane().add(notaLbl);

		fechaLbl = new JLabel("Fecha: ");
		fechaLbl.setBounds(86, 350, 73, 20);
	    getContentPane().add(fechaLbl);

		cursoLbl = new JLabel("Curso: ");
		cursoLbl.setBounds(86, 400, 73, 20);
	    getContentPane().add(cursoLbl);

		grupoLbl = new JLabel("Grupo: ");
		grupoLbl.setBounds(86, 460, 73, 20);
	    getContentPane().add(grupoLbl);
		
//		idTxtF = new JLabel();
//		idTxtF.setBounds(221, 350, 107, 20);
//	    getContentPane().add(idTxtF);
//
//		nombreProyTxtF = new JLabel();
//		nombreProyTxtF.setBounds(221, 110, 107, 20);
//	    getContentPane().add(nombreProyTxtF);
//
//		urlTxtF = new JLabel();
//		urlTxtF.setBounds(221, 170, 107, 20);
//	    getContentPane().add(urlTxtF);
//
//		notaTxtF = new JLabel();
//		notaTxtF.setBounds(221, 290, 107, 20);
//	    getContentPane().add(notaTxtF);
//
//		fechaTxtF = new JLabel();
//		fechaTxtF.setBounds(221, 230, 107, 20);
//	    getContentPane().add(fechaTxtF);
//
//		cursoTxtF = new JLabel();
//		cursoTxtF.setBounds(221, 400, 107, 20);
//	    getContentPane().add(cursoTxtF);
//
//		grupoTxtF = new JLabel();
//		grupoTxtF.setBounds(221, 460, 107, 20);
//	    getContentPane().add(grupoTxtF);
		
		closeButton = new JButton("Cerrar");
		closeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		closeButton.setSize(107, 29);
		closeButton.setLocation(221, 570);
		CloseWindowBtnListener escuchador = new CloseWindowBtnListener(this, null, null);
		closeButton.addActionListener(escuchador);
	    getContentPane().add(closeButton);

	    setVisible(true);
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(666, 479);
		setLocationRelativeTo(null);    }
    
    
    /**
     * Hace toda la página visible.
     */
    public void hacerVisible() {
        setVisible(true);
    }

    /**
     * Obtiene la etiqueta de ID.
     * @return La etiqueta de ID.
     */
    public JLabel getIdLbl() {
        return idLbl;
    }

    /**
     * Establece la etiqueta de ID.
     * @param idLbl La etiqueta de ID a establecer.
     */
    public void setIdLbl(JLabel idLbl) {
        this.idLbl = idLbl;
    }

    /**
     * Obtiene la etiqueta de nombre del proyecto.
     * @return La etiqueta de nombre del proyecto.
     */
    public JLabel getNombreProyLbl() {
        return nombreProyLbl;
    }

    /**
     * Establece la etiqueta de nombre del proyecto.
     * @param nombreProyLbl La etiqueta de nombre del proyecto a establecer.
     */
    public void setNombreProyLbl(JLabel nombreProyLbl) {
        this.nombreProyLbl = nombreProyLbl;
    }

    /**
     * Obtiene la etiqueta de URL.
     * @return La etiqueta de URL.
     */
    public JLabel getUrlLbl() {
        return urlLbl;
    }

    /**
     * Establece la etiqueta de URL.
     * @param urlLbl La etiqueta de URL a establecer.
     */
    public void setUrlLbl(JLabel urlLbl) {
        this.urlLbl = urlLbl;
    }

    /**
     * Obtiene la etiqueta de nota.
     * @return La etiqueta de nota.
     */
    public JLabel getNotaLbl() {
        return notaLbl;
    }

    /**
     * Establece la etiqueta de nota.
     * @param notaLbl La etiqueta de nota a establecer.
     */
    public void setNotaLbl(JLabel notaLbl) {
        this.notaLbl = notaLbl;
    }

    /**
     * Obtiene la etiqueta de fecha.
     * @return La etiqueta de fecha.
     */
    public JLabel getFechaLbl() {
        return fechaLbl;
    }

    /**
     * Establece la etiqueta de fecha.
     * @param fechaLbl La etiqueta de fecha a establecer.
     */
    public void setFechaLbl(JLabel fechaLbl) {
        this.fechaLbl = fechaLbl;
    }

    /**
     * Obtiene la etiqueta de curso.
     * @return La etiqueta de curso.
     */
    public JLabel getCursoLbl() {
        return cursoLbl;
    }

    /**
     * Establece la etiqueta de curso.
     * @param cursoLbl La etiqueta de curso a establecer.
     */
    public void setCursoLbl(JLabel cursoLbl) {
        this.cursoLbl = cursoLbl;
    }

    /**
     * Obtiene la etiqueta de grupo.
     * @return La etiqueta de grupo.
     */
    public JLabel getGrupoLbl() {
        return grupoLbl;
    }

    /**
     * Establece la etiqueta de grupo.
     * @param grupoLbl La etiqueta de grupo a establecer.
     */
    public void setGrupoLbl(JLabel grupoLbl) {
        this.grupoLbl = grupoLbl;
    }

    /**
     * Obtiene el botón de guardar.
     * @return El botón de guardar.
     */
    public JButton getSaveButton() {
        return closeButton;
    }

    /**
     * Establece el botón de guardar.
     * @param saveButton El botón de guardar a establecer.
     */
    public void setSaveButton(JButton saveButton) {
        this.closeButton = saveButton;
    }

}
