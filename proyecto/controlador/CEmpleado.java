package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import interfaz.VEmpleado;
import interfaz.VInicial;
import logica.Cargo;
import logica.Departamento;
import logica.Empleado;
import logica.Oficina;
import logica.Proyecto;
import logica.Salario;
import logica.Telefono;
import logica.Usuario;

public class CEmpleado implements ActionListener {
	public VEmpleado ventana;
	public Departamento departamento;;

	public CEmpleado(VEmpleado ventana, Departamento departamento) {
		this.ventana = ventana;
		this.departamento = departamento;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		if (boton.equals(ventana.btnSalir)) {
			System.exit(0);
		}
	}
}
