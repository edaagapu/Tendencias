package logica;

import java.util.ArrayList;

public class Oficina {
	private int idOficina;
	private int area;
	private ArrayList<Telefono> telefonos;
	// Atributo de Búsqueda
	public ArrayList<Long> idEmpleado;

	public Oficina(int idOficina, int area) {
		setIdOficina(idOficina);
		setArea(area);
		telefonos = new ArrayList<Telefono>();
		idEmpleado = new ArrayList<Long>();
	}

	public int getIdOficina() {
		return idOficina;
	}

	public void setIdOficina(int idOficina) {
		this.idOficina = idOficina;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

}
