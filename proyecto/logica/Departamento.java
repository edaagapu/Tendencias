package logica;

import java.util.ArrayList;

public class Departamento {
	private int idDept;
	private long presupuesto;
	private Empleado jefe;
	private ArrayList<Empleado> empleados;
	private ArrayList<Proyecto> proyectos;
	private ArrayList<Oficina> oficinas;

	public Departamento(int id, long presupuesto, Empleado jefe) {
		setJefe(jefe);
		setIdDept(id);
		setPresupuesto(presupuesto);
		empleados = new ArrayList<Empleado>();
		proyectos = new ArrayList<Proyecto>();
		oficinas = new ArrayList<Oficina>();
	}

	public Empleado obtenerEmpleado(long id) {
		for (int i = 0; i < empleados.size(); i++) {
			if (id == empleados.get(i).getCedula()) {
				return empleados.get(i);
			}
		}
		return null;
	}

	public Proyecto obtenerProyecto(int id) {
		for (int i = 0; i < proyectos.size(); i++) {
			if (id == proyectos.get(i).getIdProyecto()) {
				return proyectos.get(i);
			}
		}
		return null;
	}

	public Oficina obtenerOficina(int id) {
		for (int i = 0; i < oficinas.size(); i++) {
			if (id == oficinas.get(i).getIdOficina()) {
				return oficinas.get(i);
			}
		}
		return null;
	}

	public int getIdDept() {
		return idDept;
	}

	public void setIdDept(int idDept) {
		this.idDept = idDept;
	}

	public long getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(long presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Empleado getJefe() {
		return jefe;
	}

	public void setJefe(Empleado jefe) {
		this.jefe = jefe;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public ArrayList<Proyecto> getProyectos() {
		return proyectos;
	}

	public ArrayList<Oficina> getOficinas() {
		return oficinas;
	}

}
