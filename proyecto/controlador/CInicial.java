package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import interfaz.VEmpleado;
import interfaz.VInicial;
import interfaz.VJefe;
import logica.Cargo;
import logica.Departamento;
import logica.Empleado;
import logica.Oficina;
import logica.Proyecto;
import logica.Salario;
import logica.Telefono;
import logica.Usuario;

public class CInicial implements ActionListener {
	public ArrayList<Usuario> usuarios;
	public VInicial ventana;
	public Departamento departamento = null;

	public CInicial(VInicial ventana) {
		departamento = cargar();
		try {
			importarUsuarios();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		if (boton.equals(ventana.botones[0])) {
			if (validarEmpleado(Long.parseLong(ventana.txtUsuario.getText()),
					new String(ventana.passwordField.getPassword()))) {
				ventana.setVisible(false);
				if (usuarios.get(0).getEmpleado().getCedula() == Long.parseLong(ventana.txtUsuario.getText())) {
					VJefe ventanaJefe = new VJefe(usuarios.get(0).getEmpleado(), departamento);
					ventanaJefe.setVisible(true);
				} else {
					VEmpleado ventanaEmpleado = new VEmpleado(obtenerUser(Long.parseLong(ventana.txtUsuario.getText())),
							departamento);
					ventanaEmpleado.setVisible(true);
				}
				ventana.setVisible(false);
			} else {
				System.out
						.println(ventana.txtUsuario.getText() + " " + new String(ventana.passwordField.getPassword()));
				JOptionPane.showMessageDialog(null, "El usuario y/o la contraseña son incorrectos");
			}
		} else if (boton.equals(ventana.botones[1])) {
			System.exit(0);
		}
	}

	public Departamento cargar() {
		Oficina oficinaPrincipal = new Oficina(1, 100);
		Departamento departamento = new Departamento(1, 100000000,
				new Empleado(1032498996, "Edwin", "Garcia", oficinaPrincipal));
		departamento.getOficinas().add(oficinaPrincipal);
		departamento.getOficinas().add(new Oficina(2, 50));
		departamento.getOficinas().add(new Oficina(3, 60));
		departamento.getOficinas().add(new Oficina(4, 45));
		departamento.getOficinas().add(new Oficina(5, 55));

		for (int i = 0; i < departamento.getOficinas().size(); i++) {
			departamento.getOficinas().get(i).getTelefonos().add(new Telefono(i + 1, i * 1234567));
			departamento.getOficinas().get(i).getTelefonos().add(new Telefono(i + 1, i * 2234562));
			departamento.getOficinas().get(i).getTelefonos().add(new Telefono(i + 1, i * 4322123));

		}
		departamento.getProyectos()
				.add(new Proyecto(1, 1000000, "KRONOS", "Generador de horario estudiantil universitario."));
		departamento.getProyectos().add(new Proyecto(2, 1400000, "Valeria",
				"Dispositivo que ayuda a evaluar la condición pulmonar de un recién nacido"));
		departamento.getProyectos().add(new Proyecto(3, 1600000, "JARVIS",
				"Inteligencia artificial con la capacidad de reconocer patrones en las imagenes almacenadas en su memoria"));
		departamento.getProyectos().add(
				new Proyecto(4, 1200000, "EduSoft", "Plataforma de juegos para ayudar a los niños con el aprendizaje"));
		departamento.getProyectos().add(new Proyecto(5, 1110000, "MeTube", "Sala de chat on-line"));
		departamento.getProyectos().add(new Proyecto(6, 2420000, "MovieYou", "Gestor de reproducción de películas."));
		departamento.getProyectos()
				.add(new Proyecto(7, 1000000, "Ahorcado", "Videojuego basado en el popular juego clásico"));
		departamento.getProyectos()
				.add(new Proyecto(8, 1000000, "SquirrEd", "Desarrollo de un videojuego con Realidad Aumentada"));

		departamento.getEmpleados().add(new Empleado(1010203402, "Alejandro", "Morales",
				departamento.getProyectos().get(0), departamento.getOficinas().get(1)));
		departamento.getEmpleados().add(new Empleado(78459128, "Pablo", "Garcia", departamento.getProyectos().get(1),
				departamento.getOficinas().get(1)));

		departamento.getEmpleados().add(new Empleado(11023429, "Felipe", "Renteria", departamento.getProyectos().get(2),
				departamento.getOficinas().get(2)));
		departamento.getEmpleados().add(new Empleado(22104950, "Katherine", "Mahecha",
				departamento.getProyectos().get(3), departamento.getOficinas().get(2)));

		departamento.getEmpleados().add(new Empleado(13245683, "Estefania", "Garcia",
				departamento.getProyectos().get(4), departamento.getOficinas().get(3)));
		departamento.getEmpleados().add(new Empleado(342019411, "Jose", "Cortazar", departamento.getProyectos().get(5),
				departamento.getOficinas().get(3)));

		departamento.getEmpleados().add(new Empleado(129388, "Leonardo", "Martinez", departamento.getProyectos().get(6),
				departamento.getOficinas().get(4)));
		departamento.getEmpleados().add(new Empleado(99817233, "Paula", "Gomez", departamento.getProyectos().get(7),
				departamento.getOficinas().get(4)));

		String[] cargo = { "Gerente general", "Ingeniero", "Auditor",
				"Licenciado", "Ingeniero", "Contador",
				"Ingeniero", "Fisico" };
		for (int i = 0; i < departamento.getEmpleados().size(); i++) {
			departamento.getEmpleados().get(i)
					.setCargo(new Cargo(i + 1, cargo[i], new Salario(100000, (i * 2) % 28, ((i + 4) * 3) % 12, 2010)));
		}

		return departamento;
	}

	public void importarUsuarios() throws Exception {
		this.usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario(departamento.getJefe(), "Ed10"));
		for (int i = 0; i < departamento.getEmpleados().size(); i++) {
			usuarios.add(new Usuario(departamento.getEmpleados().get(i), departamento.getEmpleados().get(i).getNombreU()
					+ Long.toString(departamento.getEmpleados().get(i).getCedula()).substring(0, 3)));
		}
	}

	public Usuario obtenerUser(long user) {
		for (int j = 0; j < usuarios.size(); j++) {
			if (user == usuarios.get(j).getEmpleado().getCedula()) {
				return usuarios.get(j);
			}
		}
		return null;

	}

	public boolean validarEmpleado(long user, String password) {
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getEmpleado().getCedula() == user && password.equals(usuarios.get(i).getPassword())) {
				return true;
			}
		}

		return false;
	}
}
