package UserInterface;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	
	
	public static void main(String[] args)
	{
		
		VentanaPrincipal miVentana = new VentanaPrincipal();
		miVentana.setVisible(true);		
	}	
	
	public VentanaPrincipal()
	{
		this.setSize(800, 600);
		this.setTitle("Mi primera ventana en JFrame");		
		
		
		PanelSeleccionArchivo miPanelIzquierdo = new PanelSeleccionArchivo();
		this.add(miPanelIzquierdo);
		
	}
	
}
