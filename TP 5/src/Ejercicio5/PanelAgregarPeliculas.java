package Ejercicio5;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class PanelAgregarPeliculas extends JPanel {
	
	private JTextField txtNombre;
	private JLabel lblID;
	private JLabel lblIDNumero;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JComboBox<Categoria> cbCategoria;
	private JButton btnAceptar;
	private DefaultListModel<Peliculas> listModel;


	/**
	 * Create the panel.
	 */
	public PanelAgregarPeliculas() {
		setLayout(null);
		
		lblID = new JLabel("ID");
		lblID.setBounds(40, 25, 56, 16);
		add(lblID);
		
		lblIDNumero = new JLabel("");
		lblIDNumero.setBounds(165, 25, 56, 16);
		add(lblIDNumero);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(40, 70, 56, 16);
		add(lblNombre);
		
		lblGenero = new JLabel("Genero");
		lblGenero.setBounds(40, 120, 56, 16);
		add(lblGenero);
		
		cbCategoria = new JComboBox<Categoria>();
		cbCategoria.setToolTipText("");
		cbCategoria.setBounds(165, 117, 180, 22);
		add(cbCategoria);
		
		cbCategoria.addItem(new Categoria ("Seleccione un genero"));
		cbCategoria.addItem(new Categoria (1, "Terror"));
		cbCategoria.addItem(new Categoria (2, "Accion"));
		cbCategoria.addItem(new Categoria (3, "Suspenso"));
		cbCategoria.addItem(new Categoria (4, "Romantica"));
		
		
		
		
		txtNombre = new JTextField();
		txtNombre.setBounds(165, 67, 116, 22);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(40, 172, 97, 25);
		add(btnAceptar);
		
	}

	public void setDefaultListModel(DefaultListModel<Peliculas> listModelRecibido) {
		this.listModel = listModelRecibido;
	}
}
