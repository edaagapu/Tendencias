package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import interfaz.VInformacion;
import interfaz.VJefe;
import logica.Departamento;

public class CJefe implements ActionListener {
	public VJefe ventana;
	public Departamento departamento;
	public int sel;

	public CJefe(VJefe ventana, Departamento departamento) {
		this.ventana = ventana;
		this.departamento = departamento;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		for (int i = 0; i < ventana.botones.length; i++) {
			if (ventana.botones[i].equals(boton)) {
				accion(i);
			}
		}
	}

	public void reconstruir(int i) {
		String[] modelo = null;
		sel = i;
		switch (i) {
		case 0:
			modelo = new String[departamento.getOficinas().size() + 1];
			modelo[0] = "<Escoge una oficina>";
			for (int j = 0; j < departamento.getOficinas().size(); j++) {
				modelo[j + 1] = Integer.toString(departamento.getOficinas().get(j).getIdOficina());
			}
			break;
		case 1:
			modelo = new String[departamento.getEmpleados().size() + 1];
			modelo[0] = "<Escoge un empleado>";
			for (int j = 0; j < departamento.getEmpleados().size(); j++) {
				modelo[j + 1] = departamento.getEmpleados().get(j).getNombreU() + " "
						+ departamento.getEmpleados().get(j).getApellidoU();
			}
			break;
		case 2:
			modelo = new String[departamento.getProyectos().size() + 1];
			modelo[0] = "<Escoge un proyecto>";
			for (int j = 0; j < departamento.getProyectos().size(); j++) {
				modelo[j + 1] = departamento.getProyectos().get(j).getNombre();
			}
			break;
		}
		ventana.comboBox.setModel(new DefaultComboBoxModel(modelo));

	}

	public void accion(int i) {
		if (i < 3) {
			reconstruir(i);
		} else {
			switch (i) {
			case 3:
				VInformacion ventana = mostrar();
				ventana.setVisible(true);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}

	public VInformacion mostrar() {
		switch (sel) {
		case 0:
			for (int i = 0; i < departamento.getOficinas().size(); i++) {
				if (ventana.comboBox.getSelectedItem()
						.equals(Integer.toString(departamento.getOficinas().get(i).getIdOficina()))) {
					return new VInformacion(departamento.getOficinas().get(i));
				}
			}
			break;
		case 1:
			for (int i = 0; i < departamento.getEmpleados().size(); i++) {
				if (ventana.comboBox.getSelectedItem().equals(departamento.getEmpleados().get(i).getNombreU() + " "
						+ departamento.getEmpleados().get(i).getApellidoU())) {
					return new VInformacion(departamento.getEmpleados().get(i));
				}
			}
			break;
		case 2:
			for (int i = 0; i < departamento.getProyectos().size(); i++) {
				if (ventana.comboBox.getSelectedItem().equals(departamento.getProyectos().get(i).getNombre())) {
					return new VInformacion(departamento.getProyectos().get(i));
				}
			}
			break;
		}
		return null;
	}
}
