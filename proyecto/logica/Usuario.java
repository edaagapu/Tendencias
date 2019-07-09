package logica;

public class Usuario {
	private Empleado empleado;
	private String password;

	public Usuario(Empleado empleado, String password) throws Exception {
		this.empleado = empleado;
		setPassword(empleado.getCedula(), password);
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public String getPassword() {
		return decodificar(password);
	}

	public void setPassword(long usuario, String pass) throws Exception {
		if (usuario == empleado.getCedula()) {
			this.password = codificar(pass);
		} else {
			throw new Exception("No se puede cambiar la contraseña");
		}

	}

	private String codificar(String password) {
		char[] codificador = new char[password.length()];
		for (int i = 0; i < codificador.length; i++) {
			codificador[i] = password.charAt(i);
			int flag = (int) (codificador[i]);
			flag += 9;
			codificador[i] = (char) (flag);
		}
		String resultado = new String(codificador);
		return resultado;
	}

	private String decodificar(String password) {
		char[] decodificador = new char[password.length()];
		for (int i = 0; i < decodificador.length; i++) {
			decodificador[i] = password.charAt(i);
			int flag = (int) (decodificador[i]);
			flag -= 9;
			decodificador[i] = (char) (flag);
		}
		String resultado = new String(decodificador);
		return resultado;
	}

}
