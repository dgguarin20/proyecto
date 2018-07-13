package visual;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

import javax.swing.*;

import mundo.archivo;
import mundo.institucional;
import mundo.rollo;
import mundo.servilleta;




public class visualPrincipal extends JFrame {

	private panelInformacion panelInfo;
	private panelOpciones panelOptions;
	private servilleta serv;
	private rollo roll;
	private institucional insti;
	private JFileChooser todo;
	private archivo cargar;
	private int ver;
	
	public visualPrincipal() throws Exception{
		  cargar = new archivo();	
		  ver=0;
		  this.setTitle( "Proyecto" );
	      setSize( 1150, 450 );
	      setResizable( false );
	      setDefaultCloseOperation( EXIT_ON_CLOSE );
	      setLayout( new BorderLayout( ) );
		
	      panelInfo = new panelInformacion("principal",this,ver);
	      this.add(panelInfo, BorderLayout.CENTER);
	      
	      panelOptions = new panelOpciones(this);
	      this.add(panelOptions, BorderLayout.SOUTH);
	     
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

        visualPrincipal visual = new visualPrincipal();
        visual.setVisible(true);
		
	}
	
	public void actualizar(String p)
	{	
	     
		this.remove(this.panelInfo);
		this.repaint();
		this.revalidate();

		panelInfo = new panelInformacion(p,this,ver);
		this.add(panelInfo, BorderLayout.CENTER);
		this.revalidate();
	
		
	}
	public void cargarArchivo()
	{
		  JFileChooser fc = new JFileChooser( "" );
		  todo = fc;
	      fc.setDialogTitle( "Abrir archivo" );
	      int resultado = fc.showOpenDialog( this );;
		  
	      if( resultado == JFileChooser.APPROVE_OPTION)
	      {
	    	  File arch = fc.getSelectedFile( );
	    	  try {
   		  
	    		  this.cargar.AgregarArchivo(arch.getAbsolutePath());
	    		 
	    		  ver=1;
	    	  }
	    	  catch(Exception e) {
	    		  
	    		  JOptionPane.showMessageDialog( this, "Error al cargar el archivo!", "Error", JOptionPane.INFORMATION_MESSAGE );
	              System.exit( 0 );
	    		  
	    	  }
	    	  
	      }

	}
	
	public void inicializar()
	{
		
	}
	public institucional darInst()
	{
			return cargar.darinst();
	}
	public rollo darR()
	{
		return cargar.darRollos();
	}
	public servilleta darserv()
	{
		return cargar.darserv();
	}
	
	
}
