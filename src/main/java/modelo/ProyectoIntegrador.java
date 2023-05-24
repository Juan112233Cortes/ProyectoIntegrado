package modelo;

public class ProyectoIntegrador {
	
	private String idProyecto;
	private String nombreProyecto;
	private String urlProyecto;
	private String nota;
	private String fecha;
	private String curso;
	private String grupo;
	private int areaCorrespondiente;
	/**
	 * Constructor de la clase ProyectoIntegrador.
	 *
	 * @param idProyecto          ID del proyecto.
	 * @param nombreProyecto      Nombre del proyecto.
	 * @param urlProyecto         URL del proyecto.
	 * @param nota                Nota del proyecto.
	 * @param fecha               Fecha del proyecto.
	 * @param curso               Curso asociado al proyecto.
	 * @param grupo               Grupo asociado al proyecto.
	 * @param areaCorrespondiente Área correspondiente del proyecto.
	 */
	public ProyectoIntegrador (String idProyecto, String nombreProyecto, String urlProyecto, String note, String fecha, String curso, String grupo, int areaCorrespondiente ) {
		this.idProyecto = idProyecto;
		this.nombreProyecto = nombreProyecto;
		this.urlProyecto = urlProyecto;
		this.nota = note;
		this.fecha = fecha;
		this.curso = curso;
		this.grupo = grupo;
		this.areaCorrespondiente = areaCorrespondiente;
	}

	/**
	 * Obtiene el ID del proyecto.
	 *
	 * @return El ID del proyecto.
	 */
	public String getIdProyecto() {
		return idProyecto;
	}

	/**
	 * Establece el ID del proyecto.
	 *
	 * @param idProyecto El nuevo ID del proyecto.
	 */
	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}

	/**
	 * Obtiene el nombre del proyecto.
	 *
	 * @return El nombre del proyecto.
	 */
	public String getNombreProyecto() {
		return nombreProyecto;
	}

	/**
	 * Establece el nombre del proyecto.
	 *
	 * @param nombreProyecto El nuevo nombre del proyecto.
	 */
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	/**
	 * Obtiene la URL del proyecto.
	 *
	 * @return La URL del proyecto.
	 */
	public String getUrlProyecto() {
		return urlProyecto;
	}

	/**
	 * Establece la URL del proyecto.
	 *
	 * @param urlProyecto La nueva URL del proyecto.
	 */
	public void setUrlProyecto(String urlProyecto) {
		this.urlProyecto = urlProyecto;
	}

	/**
	 * Obtiene la nota del proyecto.
	 *
	 * @return La nota del proyecto.
	 */
	public String getNota() {
		return nota;
	}

	/**
	 * Establece la nota del proyecto.
	 *
	 * @param nota La nueva nota del proyecto.
	 */
	public void setNota(String nota) {
		this.nota = nota;
	}

	/**
	 * Obtiene la fecha del proyecto.
	 *
	 * @return La fecha del proyecto.
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * Establece la fecha del proyecto.
	 *
	 * @param fecha La nueva fecha del proyecto.
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * Obtiene el curso asociado al proyecto.
	 *
	 * @return El curso asociado al proyecto.
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * Establece el curso asociado al proyecto.
	 *
	 * @param curso El nuevo curso asociado al proyecto.
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	/**
	 * Obtiene el grupo asociado al proyecto.
	 *
	 * @return El grupo asociado al proyecto.
	 */
	public String getGrupo() {
		return grupo;
	}

	/**
	 * Establece el grupo asociado al proyecto.
	 *
	 * @param grupo El nuevo grupo asociado al proyecto.
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	/**
	 * Obtiene el área correspondiente del proyecto.
	 *
	 * @return El área correspondiente del proyecto.
	 */
	public int getAreaCorrespondiente() {
		return areaCorrespondiente;
	}

	/**
	 * Establece el área correspondiente del proyecto.
	 *
	 * @param areaCorrespondiente La nueva área correspondiente del proyecto.
	 */
	public void setAreaCorrespondiente(int areaCorrespondiente) {
		this.areaCorrespondiente = areaCorrespondiente;
	}
	
	/**
	 * Devuelve una representación en forma de cadena del proyecto.
	 *
	 * @return La representación en forma de cadena del proyecto.
	 */
	@Override
	public String toString() {
		return nombreProyecto + " - " + nota;
	}
	
}
