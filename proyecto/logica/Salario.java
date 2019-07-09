package logica;

import java.util.Date;

public class Salario {
	private Date fechaInicio;
	private Date fechaFin;
	private int sueldo;

	@SuppressWarnings("deprecation")
	public Salario(int sueldo, int diaI, int mesI, int anioI, int diaF, int mesF, int anioF) {
		setSueldo(sueldo);
		setFechaInicio(new Date(anioI, mesI - 1, diaI));
		setFechaFin(new Date(anioF, mesF - 1, diaF));
	}

	public Salario(int sueldo, int diaI, int mesI, int anioI) {
		setSueldo(sueldo);
		setFechaInicio(new Date(anioI, mesI - 1, diaI));
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}

	@SuppressWarnings("deprecation")
	public String getFechaInicial() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(fechaInicio.getDate());
		stringBuilder.append(" ");
		stringBuilder.append((fechaInicio.getMonth() + 1));
		stringBuilder.append(" ");
		stringBuilder.append(fechaInicio.getYear());
		return stringBuilder.toString();
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	@SuppressWarnings("deprecation")
	public String getFechaFinal() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(fechaFin.getDate());
		stringBuilder.append(" ");
		stringBuilder.append((fechaFin.getMonth() + 1));
		stringBuilder.append(" ");
		stringBuilder.append(fechaFin.getYear());
		return stringBuilder.toString();
	}
	

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
}
