package interfaz;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import modelo.AgendaMateria;
import modelo.Prueba;
import modelo.TipoMateria;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.swing.Action;

/**
*
* @author Roberto Bartolomé
*/
public class NuevaMateria extends JPanel {
	private JTextField nombreMateria;
	private JTextField docenteText;
	private JComboBox enumTipo;
	private final Action action = new SwingAction();

	/**
	 * Create the panel.
	 */
	public NuevaMateria() {
		setBorder(new TitledBorder(null, "Crear nueva materia", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(1, 7, 0, 0));
		
		JLabel lblMateria = new JLabel("Materia");
		add(lblMateria);
		
		nombreMateria = new JTextField();
		add(nombreMateria);
		nombreMateria.setColumns(10);
		
		JLabel lblDocente = new JLabel("Docente");
		add(lblDocente);
		
		docenteText = new JTextField();
		add(docenteText);
		docenteText.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tipo:");
		add(lblNewLabel);
		
		enumTipo = new JComboBox();
		enumTipo.setModel(new DefaultComboBoxModel(TipoMateria.values()));
		System.out.println(enumTipo.getSelectedItem().toString());
		add(enumTipo);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setAction(action);
		
		add(btnAgregar);

	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			AgendaMateria nueva = new AgendaMateria(nombreMateria.getText(), docenteText.getText(), enumTipo.getSelectedItem().toString());
			Prueba prueba = new Prueba();
			try {
				prueba.guardarAgenda(nueva);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
