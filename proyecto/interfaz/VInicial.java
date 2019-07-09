package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import controlador.CInicial;

public class VInicial extends JFrame {

	private JPanel contentPane;
	public JTextField txtUsuario;
	public JPasswordField passwordField;
	private String[] textoBotones = { "Entrar", "Salir" };
	public JButton[] botones = new JButton[textoBotones.length];

	public VInicial() {
		CInicial controlador = new CInicial(this);
		setUndecorated(true);
		setBounds(100, 100, 370, 193);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(12, 12, 346, 143);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(44, 24, 109, 25);
		panel.add(lblUsuario);

		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(44, 61, 109, 25);
		panel.add(lblContrasea);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(171, 27, 124, 19);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setSelectedTextColor(Color.BLACK);
		passwordField.setSelectionColor(Color.WHITE);
		passwordField.setEchoChar('*');
		passwordField.setBounds(171, 64, 124, 19);
		panel.add(passwordField);

		for (int i = 0; i < botones.length; i++) {
			botones[i] = new JButton(textoBotones[i]);
			botones[i].setBackground(Color.WHITE);
			botones[i].setBorder(new LineBorder(Color.BLACK));
			botones[i].addActionListener(controlador);
			panel.add(botones[i]);

		}
		botones[0].setBounds(12, 103, 114, 25);
		botones[1].setBounds(208, 103, 114, 25);
	}
}
