import java.util.ArrayList;

public class Biblioteca {

	//Atributos:
	private String nombre, direccion;
	
	//implementación de la relación Biblioteca -> Libro
	public ArrayList<Libro> coleccion;
	
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


	public ArrayList<Libro> getColeccion() {
		return coleccion;
	}


	public void setColeccion(ArrayList<Libro> coleccion) {
		this.coleccion = coleccion;
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
	

}
