package Modelo;
import java.util.Date;

public abstract class Material {
	
	
	private String codigo;
	private Date fechaPrestamo, fechaEntrega;
	private boolean disponible;
	private int numEjemplares;
	
	public Material(String codigo, Date fechaPrestamo, Date fechaEntrega, boolean disponible, int numEjemplares) {
		this.codigo = codigo;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaEntrega = fechaEntrega;
		this.disponible = disponible;
		this.numEjemplares = numEjemplares;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	
	
	
	
}
