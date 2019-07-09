package logica;

public class Telefono {
	private int id;
	private long telefono;
	
	public Telefono(int id, int telefono) {
		setId(id);
		setTelefono(telefono);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

}
