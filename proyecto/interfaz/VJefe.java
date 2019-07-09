package interfaz;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controlador.CJefe;
import logica.Departamento;
import logica.Empleado;

public class VJefe extends JFrame {

	private JPanel contentPane;
	private String[] textoBtn = { "Oficinas", "Empleados", "Proyectos", "Ver más", "Salir" };
	public JButton[] botones = new JButton[textoBtn.length];
	public JComboBox comboBox;

	public VJefe(Empleado empl, Departamento dept) {
		CJefe controlador = new CJefe(this,dept);
		setBounds(100, 100, 450, 245);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(10, 10, 430, 200);
		panel.setLayout(null);
		contentPane.add(panel);

		JLabel lblBienvenido = new JLabel(
				("Bienvenido " + empl.getNombreU() + " " + empl.getApellidoU()).toUpperCase());
		lblBienvenido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBienvenido.setBounds(10, 10, 410, 30);
		panel.add(lblBienvenido);

		for (int i = 0; i < botones.length; i++) {
			botones[i] = new JButton(textoBtn[i]);
			botones[i].setBounds(25 + (130 * i), 60, 110, 25);
			botones[i].setBorder(new LineBorder(Color.BLACK));
			botones[i].setBackground(Color.WHITE);
			botones[i].addActionListener(controlador);
			panel.add(botones[i]);
		}

		String[] texto = { "" };
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(texto));
		comboBox.setBorder(new LineBorder(Color.BLACK));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(35, 100, 260, 30);
		panel.add(comboBox);

		botones[3].setBounds(315, 105, 100, 20);
		botones[4].setBounds(310, 155, 110, 30);
	}

}
