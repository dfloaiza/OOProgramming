import java.util.ArrayList;

public class Biblioteca {

	//Atributos:
	private String nombre, direccion;
	
	//implementación de la relación Biblioteca -> Libro
	public ArrayList<Libro> coleccion;
	//implementación de la relación Biblioteca -> Usuario
	public ArrayList<Usuario> usuarios;
	
	//Métodos:
	public Biblioteca()
	{
		
	}	
	
	public Biblioteca(String nombre, String direccion)
	{
		this.nombre = nombre;
		this.direccion = direccion;
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



	
	public void adicionarNuevoLibro(Libro nuevoLibro)
	{
		this.coleccion.add(nuevoLibro);
	}
	
	public void adicionarNuevoLibro(String titulo, String ISBN, String editorial,String genero, String autores)
	{
		Libro nuevoLibro = new Libro();
		
		nuevoLibro.setTitulo(titulo);
		nuevoLibro.setISBN(ISBN);
		nuevoLibro.setEditorial(editorial);
		nuevoLibro.setGenero(genero);
		nuevoLibro.setAutores(autores);
		
		coleccion.add(nuevoLibro);		
	}
	
	public void registrarUsuario(Usuario nuevoUsuario)
	{
		usuarios.add(nuevoUsuario);
	}
	
	//métodos de consulta para usuarios y libros
	public ArrayList<Libro> getColeccion() {
		return coleccion;
	}


	public void setColeccion(ArrayList<Libro> coleccion) {
		this.coleccion = coleccion;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public Usuario getUsuarioById(String id)
	{
		//for(int i = 0; i < usuarios.size(); i++)
		
		Usuario usuarioDevuelto = new Usuario(); 
		
		for(Usuario u: usuarios)	
		{
			if(u.getCodigo().equals(id))
			{
				usuarioDevuelto = u;
				break;
			}
		}
		return usuarioDevuelto;
	}
	
	//Ejercicio:
	public Libro getBookByISBN(String ISBN)
	{
		
	}
	
	public Libro getBookByTitle(String title)
	{
		
	}
	

}
