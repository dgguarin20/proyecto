package visual;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelAgregar extends JPanel implements ActionListener{

	private JButton butagregar;
	private JLabel labMes;
	private JTextField txtMes;
	private visualPrincipal principal;
	
	public panelAgregar(visualPrincipal ventana)
	{
		try {
			principal = ventana;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JPanel pan = new JPanel();
		pan.setLayout(new GridLayout(1,2));
		labMes = new JLabel("Mes que se agrega");
		txtMes = new JTextField();
		txtMes.setEditable(true);
		pan.add(labMes);
		pan.add(txtMes);
		butagregar = new JButton ( "Agregar");
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		panel.add(pan);
		panel.add(butagregar);
		
		add(panel, BorderLayout.CENTER);
		
		 butagregar.setActionCommand("Agregar");
		 butagregar.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		String comando= evento.getActionCommand();
		if(comando.equals("Agregar"))
		{
			System.out.println("hola");
			principal.cargarArchivo();
			
		}
		
	}

}
