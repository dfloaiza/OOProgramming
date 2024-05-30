package Modelo;
import java.util.ArrayList;

public class Biblioteca {

	//Atributos:
	private String nombre, direccion;
	
	//implementación de la relación Biblioteca -> Libro
	public ArrayList<Material> coleccion;
	//implementación de la relación Biblioteca -> Usuario
	public ArrayList<Usuario> usuarios;
	
	//Métodos:
	public Biblioteca()
	{
		
	}	
	
	public void agregarMaterial()
	{
		//pedir tipo de material a agregar
		
			
		//agregar el material con unos valores por parámetro
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
	

	
	public void registrarUsuario(Usuario nuevoUsuario)
	{
		usuarios.add(nuevoUsuario);
	}
	
	//métodos de consulta para usuarios y libros
	public ArrayList<Material> getColeccion() {
		return coleccion;
	}


	public void setColeccion(ArrayList<Material> coleccion) {
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
	
		

}
