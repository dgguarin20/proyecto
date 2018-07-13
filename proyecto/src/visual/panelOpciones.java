package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class panelOpciones extends JPanel implements ActionListener {

	
	public final static String SERVILLETAS= "Servilletas";
	public final static String ROLLOS= "Rollos";
	public final static String INSTITUCIONAL= "Institucional";
	public final static String PRINCIPAL= "principal";
	public final static String AGREGAR= "agregar";
	
	private JButton butServilleta;
	private JButton butRollo;
	private JButton butInstitucional;
	private JButton butPrincipal;
	private JButton butAgregar;
	
	private visualPrincipal principal;
	
	public panelOpciones(visualPrincipal ventana)
	{
		principal = ventana;
		setLayout( new BorderLayout( ) );
		
		setLayout(new GridLayout(1,5));


        
        butServilleta = new JButton("Servilletas");
        butRollo = new JButton ("Rollos");
        butInstitucional = new JButton("Institucional");
        butPrincipal = new JButton("Principal");
        butAgregar = new JButton("Agregar");
        
        add(butServilleta);
        add(butRollo);
        add(butInstitucional);
        add(butPrincipal);
        add(butAgregar);
        
        butServilleta.setActionCommand(SERVILLETAS);
        butRollo.setActionCommand(ROLLOS);
        butInstitucional.setActionCommand(INSTITUCIONAL);
        butPrincipal.setActionCommand(PRINCIPAL);
        butAgregar.setActionCommand(AGREGAR);
        
        butServilleta.addActionListener(this);
        butRollo.addActionListener(this);
        butInstitucional.addActionListener(this);
        butPrincipal.addActionListener(this);
        butAgregar.addActionListener(this);

	}
	
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		String comando= evento.getActionCommand();
		
		if(comando.equals(SERVILLETAS))
		{	
			principal.actualizar(SERVILLETAS);
			
		}
		else if(comando.equals(ROLLOS))
		{
			principal.actualizar(ROLLOS);
		}
		else if(comando.equals(INSTITUCIONAL))
		{
			
			principal.actualizar(INSTITUCIONAL);
		}
		else if(comando.equals(PRINCIPAL))
		{
			principal.actualizar(PRINCIPAL);

		}
		else if(comando.equals(AGREGAR))
		{
			principal.actualizar(AGREGAR);
		}
		
	}

}
