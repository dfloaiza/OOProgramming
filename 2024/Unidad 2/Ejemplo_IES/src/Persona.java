import java.util.Date;

import org.w3c.dom.html.HTMLScriptElement;

public abstract class Persona {
	
	/* atributos */
	private String documento, nombre, direccion, email, telefono;
	private Date fechaNac;
	
	/* métodos */
	
	/* constructores */
	public Persona()
	{
		
	}
	
	public Persona(String documento, String nombre)
	{
		this.documento = documento;
		this.nombre = nombre;		
	}
	
	public Persona(String pDocumento, String pNombre, String pDireccion,
				   String pEmail, String pTelefono, Date pFechaNac)
	{
		this.documento = pDocumento;
		this.nombre = pNombre;
		this.direccion = pDireccion;
		this.email = pEmail;
		this.telefono = pTelefono;
		this.fechaNac = pFechaNac;
	}
	
	/* consulta y modificación (getters / setters)   */

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
	

}
