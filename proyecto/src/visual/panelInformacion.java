package visual;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class panelInformacion extends JPanel {
	
	public final static String SERVILLETAS= "Servilletas";
	public final static String ROLLOS= "Rollos";
	public final static String INSTITUCIONAL= "Institucional";
	public final static String PRINCIPAL= "principal";
	public final static String AGREGAR= "agregar";

	
	public panelInformacion(String comando, visualPrincipal ventana,int ver)
	{
		if(comando.equals(SERVILLETAS))
		{
		     panelServilleta panelInfo = new panelServilleta();
		     if(ver==1)
		     {
		     panelInfo.inicializar(ventana.darserv());
		     }
		     add(panelInfo);
		}
		else if(comando.equals(ROLLOS))
		{
			 panelRollo panelInfo = new panelRollo();
			 if(ver==1){
			 panelInfo.inicializar(ventana.darR());
			 }
		     add(panelInfo);
		}
		else if(comando.equals(INSTITUCIONAL))
		{
			 panelInstitucional panelInfo = new panelInstitucional();
			 if(ver==1){
			 panelInfo.inicializar(ventana.darInst());
			 }
		     add(panelInfo);
		}
		else if(comando.equals(PRINCIPAL))
		{
			panelPrincipal panelInfo = new panelPrincipal();
			
		    add(panelInfo);
			
		}
		else if(comando.equals(AGREGAR))
		{
			panelAgregar panelInfo = new panelAgregar(ventana);
		    add(panelInfo);
			
		}

	}
	
	


}
