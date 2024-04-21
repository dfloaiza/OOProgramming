
public class Usuario {
	
	/* atributos: */
	private String codigo, nombre, carrera;
	private float multas;
	private int prestamosActivos;
	
	/* métodos: */
	public Usuario()
	{
		
	}
	
	public Usuario(String codigo, String nombre, String carrera)
	{
		this.codigo = codigo;
		this.nombre = nombre;
		this.carrera = carrera;
		this.multas = 0.0f;
		this.prestamosActivos = 0;
	}
	
	/* métodos de consulta y modificación */
	
	/**
	 * getCodigo
	 * @return valor del atributo codigo
	 */
	public String getCodigo()
	{
		return this.codigo;
	}
	
	public void setCodigo(String newCodigo)
	{
		this.codigo = newCodigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public void setMultas(float multas) throws Exception {
		if(multas > 0)
			this.multas = multas;
		else
			throw new Exception();
	}

	public int getPrestamosActivos() {
		return prestamosActivos;
	}

	public void setPrestamosActivos(int prestamosActivos) {
		this.prestamosActivos = prestamosActivos;
	}
	

	
}
