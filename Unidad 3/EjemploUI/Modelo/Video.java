package Modelo;
import java.util.Date;

public class Video extends Material{
	
	private int duracion, anio;
	private String titulo, genero, director;
	
	public Video(String codigo, Date fechaPrestamo, Date fechaEntrega, boolean disponible, int numEjemplares,
			int duracion, int anio, String titulo, String genero, String director) {
		super(codigo, fechaPrestamo, fechaEntrega, disponible, numEjemplares);
		this.duracion = duracion;
		this.anio = anio;
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	

}
