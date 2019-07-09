package logica;

public class Empleado {
	private long cedula;
	private String nombreU;
	private String nombreD;
	private String apellidoU;
	private String apellidoD;
	private Cargo cargo;
	// Atributos para busquedas
	public int idProyecto;
	public int idOficina;

	public Empleado(long cedula, String nombreU, String nombreD, String apellidoU, String apellidoD, Proyecto proyecto,
			Oficina oficina) {
		setCedula(cedula);
		setNombreU(nombreU);
		setNombreD(nombreD);
		setApellidoU(apellidoU);
		setApellidoD(apellidoD);
		idOficina = oficina.getIdOficina();
		oficina.idEmpleado.add(this.cedula);
		idProyecto = proyecto.getIdProyecto();
		proyecto.idEmpleado = this.cedula;
	}

	public Empleado(long cedula, String nombreU, String nombreD, String apellidoU, String apellidoD, Oficina oficina) {
		setCedula(cedula);
		setNombreU(nombreU);
		setNombreD(nombreD);
		setApellidoU(apellidoU);
		setApellidoD(apellidoD);
		idOficina = oficina.getIdOficina();
		oficina.idEmpleado.add(this.cedula);
	}

	public Empleado(long cedula, String nombreU, String apellidoU, Proyecto proyecto, Oficina oficina) {
		setCedula(cedula);
		setNombreU(nombreU);
		setApellidoU(apellidoU);
		idOficina = oficina.getIdOficina();
		oficina.idEmpleado.add(this.cedula);
		idProyecto = proyecto.getIdProyecto();
		proyecto.idEmpleado = cedula;
	}

	public Empleado(long cedula, String nombreU, String apellidoU, Oficina oficina) {
		setCedula(cedula);
		setNombreU(nombreU);
		setApellidoU(apellidoU);
		idOficina = oficina.getIdOficina();
		oficina.idEmpleado.add(this.cedula);
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public String getNombreU() {
		return nombreU;
	}

	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
	}

	public String getNombreD() {
		return nombreD;
	}

	public void setNombreD(String nombreD) {
		this.nombreD = nombreD;
	}

	public String getApellidoU() {
		return apellidoU;
	}

	public void setApellidoU(String apellidoU) {
		this.apellidoU = apellidoU;
	}

	public String getApellidoD() {
		return apellidoD;
	}

	public void setApellidoD(String apellidoD) {
		this.apellidoD = apellidoD;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}
