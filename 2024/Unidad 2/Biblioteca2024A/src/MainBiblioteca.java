
public class MainBiblioteca {
	
	
	public static void main(String[] args)
	{
		
		
		Biblioteca miBiblioteca = new Biblioteca("La biblioteca de Diego", "Calle falsa 123");
		
				
		Libro nuevoLibro1 = new Libro("La ciudad y los perros","Mario Vargas Llosa");
		Libro nuevoLibro2 = new Libro("Un mundo feliz","Aldous Huxley");
		
		//poniendo la lista de libros pública y adicionando directamente:
		miBiblioteca.coleccion.add(nuevoLibro1);
		miBiblioteca.coleccion.add(nuevoLibro2);
		
		//Encapsulando la lista de libros y usando un método de modificación:
		miBiblioteca.adicionarNuevoLibro(nuevoLibro1);
		miBiblioteca.adicionarNuevoLibro(nuevoLibro2);
		
	}

}
