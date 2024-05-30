package UserInterface;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.ArrayList;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	
	PanelSeleccionArchivo miPanelIzquierdo;
	PanelListaUsuarios miPanelDerecho;
	
	public static void main(String[] args)
	{
		
		VentanaPrincipal miVentana = new VentanaPrincipal();
		miVentana.setVisible(true);		
	}	
	
	public VentanaPrincipal()
	{
		this.setSize(800, 600);
		this.setTitle("Mi primera ventana en JFrame");		
		
		
		miPanelIzquierdo = new PanelSeleccionArchivo(this);
		add(miPanelIzquierdo);
		
		/*
		miPanelDerecho = new PanelListaUsuarios(this);
		add(miPanelDerecho);
		*/
		
	}
	
	public void actualizarPanelListaUsuarios(ArrayList<String> usuarios)
	{
		
	}
	
}
