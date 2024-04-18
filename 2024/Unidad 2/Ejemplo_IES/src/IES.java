import java.util.ArrayList;

public class IES {
	
	
	/* atributos */
	private String nit, nombre, direccion;
	private int numEmpleados;
	private float patrimonioInicial;
	
	/* implementación de la relación entre IES y personas */
	/* personas es un arreglo dinámico (ArrayList) que guarda objetos de clase
	 * Persona <Persona>   */
	private ArrayList<Estudiante> estudiantes;
	private ArrayList<Docente> docentes;
	

	/* métodos */
	public IES(String nit, String nombre, String direccion) {
		this.nit = nit;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public IES() {
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * Agrega nuevo estudiante a la lista de estudiantes:
	 * @param nuevoEstudiante
	 */
	public void matricularEstudiante(Estudiante nuevoEstudiante)
	{
		estudiantes.add(nuevoEstudiante);
	}
	
	/**
	 * vincular nuevo docente
	 * @param nuevoDocente
	 */
	public void vincularDocente(Docente nuevoDocente)
	{
		docentes.add(nuevoDocente);
	}
	
	public int contarEstudiantesCiudad(String cualCiudad)
	{
		int conteo = 0;
		/*completar*/
		return  conteo;
	}
	
	public int contarDocentesCiudad(String cualCiudad)
	{
		int conteo= 0;
		/*completar*/
		return conteo;
		
		
	}
	
	
	

}
