package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import interfaz.VInformacion;
import logica.Departamento;

public class CInformacion implements ActionListener {
	public VInformacion  ventana;
	public Departamento departamento;;

	public CInformacion(VInformacion ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		if (boton.equals(ventana.btnSalir)) {
			ventana.dispose();
		}
	}
}
