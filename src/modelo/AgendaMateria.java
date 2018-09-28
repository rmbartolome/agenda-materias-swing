package modelo;

/**
*
* @author Roberto Bartolomé
*/
public class AgendaMateria {

	private int id_agenda;
	private String nombreMateria;
	private String docente;
	private String tipoMateria;
	
	public AgendaMateria(String nombre, String docente, String tipo) {
		this.nombreMateria = nombre;
		this.docente = docente;
		this.tipoMateria = tipo;
	}
	public AgendaMateria() {
	}

	public int getId_agenda() {
		return id_agenda;
	}

	public void setId_agenda(int id_agenda) {
		this.id_agenda = id_agenda;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public String getDocente() {
		return docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}

	public String getTipoMateria() {
		return tipoMateria;
	}

	public void setTipoMateria(String tipoMateria) {
		this.tipoMateria = tipoMateria;
	}
	
	

}
