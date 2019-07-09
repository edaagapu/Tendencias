package interfaz;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import com.sun.source.tree.Scope;

import logica.Cargo;
import logica.Empleado;
import logica.Oficina;
import logica.Proyecto;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class PInfoBasica extends JPanel {
	public JLabel[] lblTitulo;
	public String[][] textoEtiqueta = { { "Identificador: ", "Área (mt^2): ", "Telefonos: " },
			{ "Identificador: ", "Nombre: ", "Presupuesto: ", "Descripción: " },
			{ "Identificador: ", "Nombre: ", "Salario: " },
			{ "Cédula: ", "P. Nombre: ", "S. Nombre: ", "P. Apellido: ", "S. Apellido: ", "Cargo: " } };

	public PInfoBasica(Empleado empleado) {
		setBackground(Color.WHITE);
		setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Cargo", TitledBorder.LEADING, TitledBorder.TOP, null,
				Color.BLACK));
		setLayout(null);

		lblTitulo = new JLabel[textoEtiqueta[3].length];

		for (int i = 0; i < lblTitulo.length; i++) {
			lblTitulo[i] = new JLabel(textoEtiqueta[3][i]);
			lblTitulo[i].setBounds(10, 20 + (35 * i), 110, 25);
			add(lblTitulo[i]);
		}

		JLabel[] lblInfo = new JLabel[textoEtiqueta[3].length];

		for (int i = 0; i < lblInfo.length; i++) {
			lblInfo[i] = new JLabel();
			lblInfo[i].setBounds(130, 20 + (35 * i), 110, 25);
			add(lblInfo[i]);
		}
		lblInfo[0].setText(Long.toString(empleado.getCedula()));
		lblInfo[1].setText(empleado.getNombreU());
		lblInfo[2].setText(empleado.getNombreD());
		lblInfo[3].setText(empleado.getApellidoU());
		lblInfo[4].setText(empleado.getApellidoD());
		lblInfo[5].setText(empleado.getCargo().getNombre());
	}
	
	public PInfoBasica(Oficina oficina) {
		setBackground(Color.WHITE);
		setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Oficina", TitledBorder.LEADING, TitledBorder.TOP, null,
				Color.BLACK));
		setLayout(null);

		lblTitulo = new JLabel[textoEtiqueta[0].length];

		for (int i = 0; i < lblTitulo.length; i++) {
			lblTitulo[i] = new JLabel(textoEtiqueta[0][i]);
			lblTitulo[i].setBounds(10, 20 + (35 * i), 110, 25);
			add(lblTitulo[i]);
		}

		JLabel[] lblInfo = new JLabel[textoEtiqueta[0].length - 1];

		for (int i = 0; i < lblInfo.length; i++) {
			lblInfo[i] = new JLabel();
			lblInfo[i].setBounds(130, 20 + (35 * i), 110, 25);
			add(lblInfo[i]);
		}
		lblInfo[0].setText(Integer.toString(oficina.getIdOficina()));
		lblInfo[1].setText(Integer.toString(oficina.getArea()));

		String[] modelo = new String[oficina.getTelefonos().size() + 1];
		modelo[0] = "<Escoja un telefono>";
		for (int i = 1; i < modelo.length; i++) {
			modelo[i] = Long.toString(oficina.getTelefonos().get(i - 1).getTelefono());
		}
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(modelo));
		comboBox.setBounds(130, 90, 110, 25);
		add(comboBox);

	}

	/**
	 * @wbp.parser.constructor
	 */
	public PInfoBasica(Proyecto proyecto) {
		setBackground(Color.WHITE);
		setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Proyecto", TitledBorder.LEADING, TitledBorder.TOP,
				null, Color.BLACK));
		setLayout(null);

		lblTitulo = new JLabel[textoEtiqueta[1].length];

		for (int i = 0; i < lblTitulo.length; i++) {
			lblTitulo[i] = new JLabel(textoEtiqueta[1][i]);
			lblTitulo[i].setBounds(10, 20 + (35 * i), 110, 25);
			add(lblTitulo[i]);
		}

		JLabel[] lblInfo = new JLabel[textoEtiqueta[1].length - 1];

		for (int i = 0; i < lblInfo.length; i++) {
			lblInfo[i] = new JLabel();
			lblInfo[i].setBounds(130, 20 + (35 * i), 110, 25);
			add(lblInfo[i]);
		}
		lblInfo[0].setText(Integer.toString(proyecto.getIdProyecto()));
		lblInfo[1].setText(proyecto.getNombre());
		lblInfo[2].setText(Long.toString(proyecto.getPresupuesto()));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(130, 120, 110, 100);
		JTextArea txtrHolaATodos = new JTextArea();
		txtrHolaATodos.setWrapStyleWord(true);
		txtrHolaATodos.setLineWrap(true);
		txtrHolaATodos.setBounds(130, 120, 110, 170);
		txtrHolaATodos.setEditable(false);
		txtrHolaATodos.setText(proyecto.getDescripcion());
		scrollPane.setViewportView(txtrHolaATodos);
		add(scrollPane);
	}

	public PInfoBasica(Cargo cargo) {
		setBackground(Color.WHITE);
		setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Cargo", TitledBorder.LEADING, TitledBorder.TOP, null,
				Color.BLACK));
		setLayout(null);

		lblTitulo = new JLabel[textoEtiqueta[2].length];

		for (int i = 0; i < lblTitulo.length; i++) {
			lblTitulo[i] = new JLabel(textoEtiqueta[2][i]);
			lblTitulo[i].setBounds(10, 20 + (35 * i), 110, 25);
			add(lblTitulo[i]);
		}

		JLabel[] lblInfo = new JLabel[textoEtiqueta[2].length - 1];

		for (int i = 0; i < lblInfo.length; i++) {
			lblInfo[i] = new JLabel();
			lblInfo[i].setBounds(130, 20 + (35 * i), 110, 25);
			add(lblInfo[i]);
		}
		lblInfo[0].setText(Integer.toString(cargo.getIdCargo()));
		lblInfo[1].setText(cargo.getNombre());

		String[] sueldos = new String[cargo.getSueldo().size() + 1];
		sueldos[0] = "<Escoja un sueldo>";
		for (int i = 1; i < sueldos.length; i++) {
			sueldos[i] = Integer.toString(cargo.getSueldo().get(i - 1).getSueldo());
		}

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(sueldos));
		comboBox.setBounds(130, 90, 110, 25);
		add(comboBox);
	}

}
