package UserInterface;

import javax.swing.*;

public class PanelListaUsuarios extends JPanel{
	
	JList<String> listaUsuarios;

	public PanelListaUsuarios(VentanaPrincipal miVentanaPpal) {
		
		listaUsuarios = new JList<String>();		
		
		listaUsuarios.add("Linea1", this);
		listaUsuarios.add("Linea2",this);
		
		add(listaUsuarios);
	}
	
	
	

}
