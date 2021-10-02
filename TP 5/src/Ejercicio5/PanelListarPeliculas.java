package Ejercicio5;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class PanelListarPeliculas extends JPanel {
	
	private JLabel lblPeliculas;
	private JList list;
	private DefaultListModel<Peliculas> listModel;

	/**
	 * Create the panel.
	 */
	public PanelListarPeliculas() {
		setLayout(null);
		
		lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setBounds(24, 105, 56, 16);
		add(lblPeliculas);
		
		list = new JList();
		list.setBounds(102, 23, 295, 184);
		add(list);

	}

	public void setDefaultListModel(DefaultListModel<Peliculas> listModelRecibido) {
		this.listModel = listModelRecibido;
	}
}
