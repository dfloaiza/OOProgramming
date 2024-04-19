
public class Libro 
{
	//atributos: 
	private String titulo, ISBN, editorial,genero, autores;
	private int anioPublicacion;	
	private int numEjemplares;
	
	//métodos:	
	public Libro()
	{		
	}
	
	public Libro(String titulo, String autores)
	{
		this.titulo = titulo;
		this.autores = autores;		
	}
	
	public Libro(String titulo, String ISBN, String autores)
	{
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.autores = autores;		
	}

	public Libro(String titulo, String iSBN, String editorial, String genero, String autores, int anioPublicacion,
			int numEjemplares) {
		this.titulo = titulo;
		ISBN = iSBN;
		this.editorial = editorial;
		this.genero = genero;
		this.autores = autores;
		this.anioPublicacion = anioPublicacion;
		this.numEjemplares = numEjemplares;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	
	

}
