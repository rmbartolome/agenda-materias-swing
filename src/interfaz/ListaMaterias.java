package interfaz;

import javax.swing.JPanel;
import modelo.AgendaMateria;
import modelo.Prueba;

import java.awt.GridLayout;
import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

/**
*
* @author Roberto Bartolomé
*/
public class ListaMaterias extends JPanel {
	private JTable tablaLista;
	
	public ArrayList<AgendaMateria> materias = new ArrayList<AgendaMateria>();

	/**
	 * Create the panel.
	 */
	public ListaMaterias() {
		setBorder(new TitledBorder(null, "Lista de Materias", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 1, 0, 0));
		
		tablaLista = new JTable();
		tablaLista.setModel(new DefaultTableModel(
			mostrarLista(),
			new String[] {
					"Numero","No	mbre Materia", "Docente", "Tipo"
			}
		));
		add(tablaLista);

	}
	
	public String[][] mostrarLista() {
		Prueba prueba = new Prueba();
		ArrayList<AgendaMateria> listaMaterias;
		String[][] matriz = null;
		try {
			listaMaterias = prueba.listaMaterias();
			matriz = new String[listaMaterias.size()][4];
			for(int i = 0; i < listaMaterias.size(); i++) {
				    matriz[i][0] = String.valueOf(i+1);
					matriz[i][1]= listaMaterias.get(i).getNombreMateria();
					matriz[i][2]= listaMaterias.get(i).getDocente();
					matriz[i][3]= listaMaterias.get(i).getTipoMateria();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return matriz;
	}

}
