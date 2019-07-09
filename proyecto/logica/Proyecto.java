package logica;

public class Proyecto {
	private int idProyecto;
	private long presupuesto;
	private String nombre;
	private String descripcion;
	// Atributo para busqueda
	public long idEmpleado;

	public Proyecto(int id, long presupuesto, String nombre, String descripcion) {
		setIdProyecto(id);
		setPresupuesto(presupuesto);
		setNombre(nombre);
		setDescripcion(descripcion);
	}

	public int getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	public long getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(long presupuesto) {
		this.presupuesto = presupuesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
