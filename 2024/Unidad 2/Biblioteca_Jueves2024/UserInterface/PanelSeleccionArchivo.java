package UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class PanelSeleccionArchivo extends JPanel implements ActionListener {
	
	JFileChooser selectorArchivo;
	
	public PanelSeleccionArchivo()
	{
		//logo del panel:
		ImageIcon logo = new ImageIcon("C:\\Users\\loaiz\\eclipse-workspace\\Biblioteca2024A\\src\\UserInterface\\logo.jpg");
		
		JLabel logo_panel = new JLabel(logo);
		//logo_panel.setIcon(logo);
		
		
		//botón para activar el FileChooser:
		JButton btn_selectorArchivo = new JButton("Abrir Archivo");
		
		btn_selectorArchivo.addActionListener(this);
		btn_selectorArchivo.setActionCommand("ABRIR_ARCHIVO");
		
		//boton de seleccion de archivo:
		selectorArchivo = new JFileChooser();
	
		
		//adicionar al panel:
		//this.add(logo_panel);
		this.add(btn_selectorArchivo);
		//this.add(selectorArchivo);
		
		
	}
	
	public void cargarInformacion(String rutaArchivo)
	{
		try 
		{
			String linea = "";
			BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
			while( (linea = br.readLine()) != null  )
			{
				System.out.println(linea);
			}
			
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("El error fue controlado...");
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String rutaArchivoSelect="";
		switch(e.getActionCommand())
		{
			case "ABRIR_ARCHIVO":
				System.out.println("Vamos a seleccionar el archivo");
				this.selectorArchivo.showOpenDialog(this);
				//obtener ruta del archivo:
				rutaArchivoSelect = selectorArchivo.getSelectedFile().toPath().toString();
				System.out.print(rutaArchivoSelect);
				
				//llamar función para abrir archivo y cargar información:
				cargarInformacion(rutaArchivoSelect);				
				
		}
		
	}
}
