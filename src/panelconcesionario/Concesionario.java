package panelconcesionario;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

import clientes.FormularioClientes;
import coches.FormularioCoches;


public class Concesionario 
{
	public Concesionario()
	{
		FormularioClientes objetoFormularioCliente = new FormularioClientes();
		FormularioCoches objetoFormularioCoches = new FormularioCoches();		
		
		
		
	    JFrame panelConcesionario = new JFrame("CONCESIONARIO");
	    panelConcesionario.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass()
	    		.getResource("/iconos/concesionario.png")));
	   
	    JTabbedPane pestañas = new JTabbedPane();
	    pestañas.add("Clientes", objetoFormularioCliente.panelPrincipal);
	    pestañas.add("Coches", objetoFormularioCoches.panelPrincipal);
	   
	    pestañas.addMouseListener(new MouseListener() 
	    {			
			public void mouseReleased(MouseEvent e) {}			
			public void mousePressed(MouseEvent e) {}			
			public void mouseExited(MouseEvent e) {}			
			public void mouseEntered(MouseEvent e) {}
			
			public void mouseClicked(MouseEvent e) //Actualizar comboBox 
			{
				objetoFormularioCoches.cargarComboBox();
							
			}
		});
	    pestañas.setIconAt(0, new ImageIcon(getClass().getResource("/iconos/clientes.png")));
	    pestañas.setIconAt(1, new ImageIcon(getClass().getResource("/iconos/coches.png")));	
	   	 
	
	    panelConcesionario.getContentPane().add(pestañas);
	    panelConcesionario.setSize(750, 500);
	    panelConcesionario.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    panelConcesionario.setLocationRelativeTo(null);
	    panelConcesionario.setVisible(true);
	}
}
