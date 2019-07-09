package logica;

import java.util.ArrayList;

public class Cargo {
	private int idCargo;
	private String nombre;
	private ArrayList<Salario> sueldo;
	
	public Cargo(int idCargo, String nombre, Salario salario) {
		setIdCargo(idCargo);
		setNombre(nombre);
		sueldo = new ArrayList<Salario>();
		sueldo.add(salario);
	}
	
	public int getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Salario> getSueldo() {
		return sueldo;
	}

}
