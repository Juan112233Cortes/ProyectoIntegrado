package modelo;
/**
 * 
 * clase que representa un alumno
 */
public class Alumno {

	private int numExpediente;
	private int codigo;
	private String nombre;
	private String apellidos;
	private int idProyecto;
	 /**
     * Constructor de la clase Alumno.
     *
     * @param numExpediente Número de expediente del alumno.
     * @param codigo        Código del alumno.
     * @param nombre        Nombre del alumno.
     * @param apellidos     Apellidos del alumno.
     * @param idProyecto    ID del proyecto asociado al alumno.
     */
	public void datosAlumno (int numExpediente, int codigo, String nombre,String apellidos, int idProyecto) {
		this.numExpediente = numExpediente;
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.idProyecto = idProyecto;
	}
	/**
	 * GETTERS Y SETTERS
	 */
	/**
     * Obtiene el número de expediente del alumno.
     *
     * @return El número de expediente.
     */
    public int getNumExpediente() {
        return numExpediente;
    }

    /**
     * Establece el número de expediente del alumno.
     *
     * @param numExpediente El nuevo número de expediente.
     */
    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }

    /**
     * Obtiene el código del alumno.
     *
     * @return El código del alumno.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del alumno.
     *
     * @param codigo El nuevo código del alumno.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre del alumno.
     *
     * @return El nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno.
     *
     * @param nombre El nuevo nombre del alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene los apellidos del alumno.
     *
     * @return Los apellidos del alumno.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del alumno.
     *
     * @param apellidos Los nuevos apellidos del alumno.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene el ID del proyecto asociado al alumno.
     *
     * @return El ID del proyecto asociado al alumno.
     */
    public int getIdProyecto() {
        return idProyecto;
    }

    /**
     * Establece el ID del proyecto asociado al alumno.
     *
     * @param idProyecto El nuevo ID del proyecto asociado al alumno.
     */
    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }
	
//	public String toString() {
//		return "Nombre: "+ nombreProyecto + " - "+ idProyecto + " - " + areaCorrespondiente;
//	}	
}
