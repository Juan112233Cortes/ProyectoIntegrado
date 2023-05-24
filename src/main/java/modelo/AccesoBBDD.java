package modelo;

import java.sql.*;
import java.util.ArrayList;

public class AccesoBBDD {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/ProyectoIntegrador";
	private String user = "root";
	private String pwd = "rootroot";

	//s_consulProyect y consulProyect.java
	private String userAlumno, usrname, resultado;
	private String password = "";
	private boolean check;
	int r;
	
	//addProyect.java
	private String id, nombre, urlP, nota, fecha, curso, grupo;
	private int area;
	
	Connection conexion = null;
	/**
     * Obtiene una conexión a la base de datos.
     * @return La conexión establecida.
     */
	public Connection getConexion() {
		conexion = null;

		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(url, user, pwd);
			System.out.println("Conexión conseguida");
		} catch (SQLException a) {
			System.out.println("Error!");
		} catch (Exception e) {
			System.out.println("Error!");
		}
		return conexion;
	}
	/**
     * Comprueba si existe un usuario con el nombre especificado en la base de datos.
     * @return true si el nombre existe, false en caso contrario.
     */
	//Login page
	public boolean comprobarNombre() {
		check = false;

		try {
			Statement statement = conexion.createStatement();
			String query = "SELECT * FROM administrado WHERE username='" + usrname.trim() + "'";
			ResultSet resultados = statement.executeQuery(query);
			if (resultados.next()) {
				check = true;

			} else {
				check = false;

			}
		} catch (SQLException a) {

		} catch (Exception e) {

		}
		return check;
	}
	/**
     * Registra un nuevo usuario en la base de datos.
     */
	public void register() {
		try {
			conexion = DriverManager.getConnection(url, user, pwd);
			String query = "INSERT INTO administrado VALUES('" + usrname.trim() + "','" + password.trim() + "')";
			Statement statement = conexion.createStatement();
			r = statement.executeUpdate(query);
		} catch (SQLException a) {
			System.out.println("No se ha podido insertar");
			a.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error de aplicación");
			e.printStackTrace();
		}
	}
	 /**
     * Realiza el proceso de inicio de sesión.
     * @return true si el inicio de sesión es exitoso, false en caso contrario.
     */
	public boolean login() {
		boolean check = false;
		try {
			Statement statement = conexion.createStatement();
			String query = "SELECT username FROM administrado WHERE username='" + usrname.trim() + "'";
			ResultSet resultados = statement.executeQuery(query);

			if (resultados.next()) {
				if (resultados.getString("username").equals(usrname.trim())) {
					query = "SELECT pass FROM administrado WHERE username='" + usrname.trim() + "'";
					resultados = statement.executeQuery(query);
					resultados.next();
					if (password.trim().equals(resultados.getString("pass"))) {
						check = true;

					} else {
						check = false;
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Error al intentar el login");
			e.printStackTrace();
		}
		
		try {
			Statement statement = conexion.createStatement();
			String query = "SELECT numExpediente FROM alumno WHERE numExpediente='" + userAlumno.trim() + "'";
			ResultSet resultados = statement.executeQuery(query);

			if (resultados.next()) {
				if (resultados.getString("numExpediente").equals(userAlumno.trim())) {
					resultados.next();
					System.out.println("Número de expediente válido");
					check = true;

				} else {
					System.out.println("Número de expediente incorrecto");
					check = false;
				}
			}
		} catch (Exception e) {
			System.out.println("Error al intentar el login");
			e.printStackTrace();
		}
		return check;
	}
	 /**
     * Carga los proyectos integradores que coinciden con el criterio de búsqueda especificado.
     * @param buscar Criterio de búsqueda para los proyectos.
     * @return Una lista de proyectos integradores que coinciden con el criterio de búsqueda.
     */
	//Consultar project page	
	public ArrayList<ProyectoIntegrador> cargarProyectos(String buscar) {
        		ArrayList<ProyectoIntegrador> proyectos = new ArrayList();
            try {
        			Statement statement = conexion.createStatement();
        			String query = buscar;
        			ResultSet resultados = statement.executeQuery(query);

                while (resultados.next()) {
                    String idProyecto = resultados.getString("idProyecto");
                    String nombre = resultados.getString("nombreProyecto");
                    String urlProy = resultados.getString("urlProyecto");
                    String notaP = resultados.getString("nota");
                    String fechaP = resultados.getString("fecha");
                    String cursoP = resultados.getString("curso");
                    String grupoP = resultados.getString("grupo");
                    int areaP = resultados.getInt("areaCorrespondiente");

                    ProyectoIntegrador proyecto = new ProyectoIntegrador(idProyecto, nombre, urlProy, notaP, fechaP, cursoP, grupoP, areaP);
                    proyectos.add(proyecto);
                }
            } catch (SQLException a) {

            } catch (Exception e) {

            }
            return proyectos;
	 }
	 /**
     * Agrega un nuevo proyecto integrador a la base de datos.
     * @return true si el proyecto se agrega correctamente, false en caso contrario.
     */
	//Add project page
	public boolean proyectoNuevo(){
		boolean check = false;
		try {
			Statement statement = conexion.createStatement();
			String query = "INSERT INTO proyectoIntegrador (idProyecto, nombreProyecto, urlProyecto, nota, fecha, curso, grupo, areaCorrespondiente) VALUES ('" + id.trim() + "', '" + nombre.trim() + "', '" + urlP.trim() + "', '" + nota.trim() + "', '" + fecha.trim() + "', '" + curso.trim() + "', '" + grupo.trim() + "', '" + area + "')";
			int resultados = statement.executeUpdate(query);
			System.out.println("Datos guardados correctamente");
			if(resultados != 0) {
				check = true;
			}
			//Restablecer textos a vacios
		} catch (SQLException a) {
			System.out.println("No se ha podido insertar");
			a.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error de aplicación");
			e.printStackTrace();
		}
		return check;
	}
	/**
     * Comprueba si ya existe un proyecto con el mismo nombre en la base de datos.
     * @return true si el proyecto ya existe, false en caso contrario.
     */
	public boolean proyectoRepetido(){
		boolean check = false;
		try {
			Statement statement = conexion.createStatement();
			String query = "SELECT * FROM proyectoIntegrador WHERE nombreProyecto = '" + nombre.trim() + "'";
			ResultSet resultados = statement.executeQuery(query);
			if(resultados.next()) {
				check = true;
			}
		} catch (Exception e) {
			
		}
		return check;
	}
	/**
     * Elimina los proyectos integradores que coinciden con el criterio de búsqueda especificado.
     * @param buscar Criterio de búsqueda para los proyectos a eliminar.
     * @return Una lista de proyectos integradores que coinciden con el criterio de búsqueda y serán eliminados.
     */
	//Delete project page
	public ArrayList<ProyectoIntegrador> deleteProyects(String buscar) {
		ArrayList<ProyectoIntegrador> proyectos = new ArrayList();
    try {
			Statement statement = conexion.createStatement();
			String query = buscar;
			ResultSet resultados = statement.executeQuery(query);

        while (resultados.next()) {
            String idProyecto = resultados.getString("idProyecto");
            String nombre = resultados.getString("nombreProyecto");
            String urlProy = resultados.getString("urlProyecto");
            String notaP = resultados.getString("nota");
            String fechaP = resultados.getString("fecha");
            String cursoP = resultados.getString("curso");
            String grupoP = resultados.getString("grupo");
            int areaP = resultados.getInt("areaCorrespondiente");

            ProyectoIntegrador proyecto = new ProyectoIntegrador(idProyecto, nombre, urlProy, notaP, fechaP, cursoP, grupoP, areaP);
            proyectos.add(proyecto);
        }
    } catch (SQLException a) {

    } catch (Exception e) {

    }
    return proyectos;
}

	/**
	 * GETTERS Y SETTERS
	 */
	/**
     * Obtiene el valor del atributo userAlumno.
     * @return El valor de userAlumno.
     */
    public String getUserAlumno() {
        return userAlumno;
    }

    /**
     * Establece el valor del atributo userAlumno.
     * @param userAlumno El nuevo valor para userAlumno.
     */
    public void setUserAlumno(String userAlumno) {
        this.userAlumno = userAlumno;
    }

    /**
     * Obtiene el valor del atributo usrname.
     * @return El valor de usrname.
     */
    public String getUsrname() {
        return usrname;
    }

    /**
     * Establece el valor del atributo usrname.
     * @param usrname El nuevo valor para usrname.
     */
    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

    /**
     * Obtiene el valor del atributo password.
     * @return El valor de password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece el valor del atributo password.
     * @param password El nuevo valor para password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Obtiene el valor del atributo check.
     * @return El valor de check.
     */
    public boolean isCheck() {
        return check;
    }

    /**
     * Obtiene el valor del atributo id.
     * @return El valor de id.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el valor del atributo id.
     * @param id El nuevo valor para id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el valor del atributo nombre.
     * @return El valor de nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el valor del atributo nombre.
     * @param nombre El nuevo valor para nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el valor del atributo urlP.
     * @return El valor de urlP.
     */
    public String getUrlP() {
        return urlP;
    }

    /**
     * Establece el valor del atributo urlP.
     * @param urlP El nuevo valor para urlP.
     */
    public void setUrlP(String urlP) {
        this.urlP = urlP;
    }

    /**
     * Obtiene el valor del atributo nota.
     * @return El valor de nota.
     */
    public String getNota() {
        return nota;
    }

    /**
     * Establece el valor del atributo nota.
     * @param nota El nuevo valor para nota.
     */
    public void setNota(String nota) {
        this.nota = nota;
    }

    /**
     * Obtiene el valor del atributo fecha.
     * @return El valor de fecha.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece el valor del atributo fecha.
     * @param fecha El nuevo valor para fecha.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el valor del atributo curso.
     * @return El valor de curso.
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Establece el valor del atributo curso.
     * @param curso El nuevo valor para curso.
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Obtiene el valor del atributo grupo.
     * @return El valor de grupo.
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * Establece el valor del atributo grupo.
     * @param grupo El nuevo valor para grupo.
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    /**
     * Obtiene el valor del atributo area.
     * @return El valor de area.
     */
    public int getArea() {
        return area;
    }

    /**
     * Establece el valor del atributo area.
     * @param area El nuevo valor para area.
     */
    public void setArea(int area) {
        this.area = area;
    }

	public void setCheck(boolean check) {
		this.check = check;
	}
	
	

//	public int getR() {
//		return r;
//	}
//
//	public void setR(int r) {
//		this.r = r;
//	}

//	public void cerrarConexion() {
//		try {
//			conexion.close();
//			System.out.print("Conexion cerrada");
//		} catch (Exception e) {
//			System.out.println("Error!");
//			e.printStackTrace();
//		}
//	}
}
