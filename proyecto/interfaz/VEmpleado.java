package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import logica.Departamento;
import logica.Usuario;

public class VEmpleado extends JFrame {

	private JPanel contentPane;
	private JPanel[] infoBasica;
	public JButton btnSalir;

	public VEmpleado(Usuario user, Departamento dept) {
		setBounds(70, 70, 820, 385);
		contentPane = new JPanel();
		setUndecorated(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 10, 805, 340);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);

		JLabel lblInicio = new JLabel(
				("Bienvenido " + user.getEmpleado().getNombreU() + " " + user.getEmpleado().getApellidoU())
						.toUpperCase());
		lblInicio.setBounds(10, 10, 790, 30);
		lblInicio.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblInicio);
		infoBasica = new PInfoBasica[3];

		infoBasica[0] = new PInfoBasica(dept.obtenerOficina(user.getEmpleado().idOficina));
		infoBasica[1] = new PInfoBasica(dept.obtenerProyecto(user.getEmpleado().idProyecto));
		infoBasica[2] = new PInfoBasica(user.getEmpleado().getCargo());

		for (int i = 0; i < infoBasica.length; i++) {
			infoBasica[i].setBounds(10 + (265 * i), 50, 260, 250);
			infoBasica[i].setBackground(Color.WHITE);
			panel.add(infoBasica[i]);
		}

		btnSalir = new JButton("Salir");
		btnSalir.setBounds(650, 310, 110, 20);
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setBorder(new LineBorder(Color.BLACK));
		panel.add(btnSalir);

	}
}
