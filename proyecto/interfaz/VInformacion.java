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

import controlador.CInformacion;
import logica.Departamento;
import logica.Empleado;
import logica.Oficina;
import logica.Proyecto;
import logica.Usuario;

public class VInformacion extends JFrame {

	private JPanel contentPane;
	private JPanel infoBasica;
	public JButton btnSalir;

	public VInformacion(Empleado empleado) {
		setBounds(70, 70, 310, 420);
		setUndecorated(true);
		CInformacion controlador = new CInformacion(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 10, 290, 340);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);

		infoBasica = new PInfoBasica(empleado);
		infoBasica.setBounds(10, 10, 270, 310);
		infoBasica.setBackground(Color.WHITE);
		panel.add(infoBasica);

		btnSalir = new JButton("Salir");
		btnSalir.setBounds(180, 365, 110, 20);
		btnSalir.setBackground(Color.WHITE);
		btnSalir.addActionListener(controlador);
		btnSalir.setBorder(new LineBorder(Color.BLACK));
		add(btnSalir);
	}

	public VInformacion(Oficina oficina) {
		setBounds(70, 70, 310, 420);
		CInformacion controlador = new CInformacion(this);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 10, 290, 340);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);

		infoBasica = new PInfoBasica(oficina);
		infoBasica.setBounds(10, 10, 270, 310);
		infoBasica.setBackground(Color.WHITE);
		panel.add(infoBasica);

		btnSalir = new JButton("Salir");
		btnSalir.setBounds(180, 365, 110, 20);
		btnSalir.setBackground(Color.WHITE);
		btnSalir.addActionListener(controlador);
		btnSalir.setBorder(new LineBorder(Color.BLACK));
		add(btnSalir);
	}

	public VInformacion(Proyecto proyecto) {
		setBounds(70, 70, 310, 420);
		CInformacion controlador = new CInformacion(this);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 10, 290, 340);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);

		infoBasica = new PInfoBasica(proyecto);
		infoBasica.setBounds(10, 10, 270, 310);
		infoBasica.setBackground(Color.WHITE);
		panel.add(infoBasica);

		btnSalir = new JButton("Salir");
		btnSalir.setBounds(180, 365, 110, 20);
		btnSalir.setBackground(Color.WHITE);
		btnSalir.addActionListener(controlador);
		btnSalir.setBorder(new LineBorder(Color.BLACK));
		add(btnSalir);

	}
}
