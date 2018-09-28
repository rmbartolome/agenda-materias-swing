package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import interfaz.Agenda;

/**
*
* @author Roberto Bartolomé
*/
public class Prueba extends Conexion{
	
	public boolean guardarAgenda (AgendaMateria nueva) throws SQLException {
		
		Statement st = con.createStatement();
        
        String insert = "INSERT INTO Agenda(nombre_materia, docente, tipoMateria) VALUES\r\n('"
        + nueva.getNombreMateria()+"','"+nueva.getDocente()+"','"+nueva.getTipoMateria()+"');";
        System.out.println(insert);
        try {
			st.execute(insert);
			System.out.println("true");
			return true;
		} catch (SQLException e) {
			System.out.println(e.toString()+" false");
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean borrarAgenda (int id) throws SQLException {
		
		Statement st = con.createStatement();
        
        String delete = "DELETE FROM Agenda WHERE Id_Agenda = "+id;
        System.out.println(delete);
        try {
			st.execute(delete);
			System.out.println("true delete");
			return true;
		} catch (SQLException e) {
			System.out.println(e.toString()+" false delete");
			e.printStackTrace();
			return false;
		}
		
	}
	
	
    public void mostrar() throws SQLException
    {
        Statement st = con.createStatement();
        ResultSet rs = null;
        String Consulta = "Select * from Agenda";
        rs = st.executeQuery(Consulta);
        while(rs.next()) {
        	System.out.println(rs.getString("Id_Agenda"));
        	System.out.println(rs.getString("nombre_materia"));
        	System.out.println(rs.getString("docente"));
        	System.out.println(rs.getString("tipoMateria"));
        }  
        
    }
    
    public ArrayList<AgendaMateria> listaMaterias() throws SQLException
    {
        Statement st = con.createStatement();
        ResultSet rs = null;
        String Consulta = "Select * from Agenda";
        rs = st.executeQuery(Consulta);
        ArrayList<AgendaMateria> listaMaterias = new ArrayList<AgendaMateria>();
        while(rs.next()) {
        	AgendaMateria agenda = new AgendaMateria(rs.getString("nombre_materia"), rs.getString("docente"), rs.getString("tipoMateria"));
        	agenda.setId_agenda(rs.getInt("Id_Agenda"));
        	listaMaterias.add(agenda);
        }
        
		return listaMaterias; 
        
    }
    
	public static void main(String[] args) throws SQLException {
		Prueba prueba = new Prueba();
		prueba.mostrar();
		/*AgendaMateria agendaNueva = new AgendaMateria("Ciencias Naturales", "Roberto Bartolome", TipoMateria.Cuantitativa.toString());
		System.out.println(agendaNueva.getDocente());
		prueba.guardarAgenda(agendaNueva);*/
		Agenda agenda = new Agenda();
        agenda.setVisible(true);
	}

}
