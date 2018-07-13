package visual;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import mundo.Descripcion;
import mundo.Semana;
import mundo.calculoNivelR;
import mundo.consumoProducto;
import mundo.institucional;

public class panelInstitucional extends JPanel implements ActionListener{
	
	
	private JLabel labNombre;
	private JTextField txtNombre;
	
	private JLabel labCodigo;
	private JTextField txtCodigo;
	
	private JLabel labCostoInsumos;
	private JTextField txtCostoInsumos;
	
	private JLabel labDesviacion;
	private JTextField txtDesviacion;
	
	private JLabel labInsumoMa;
	private JTextField txtInsumoMa;
	
	private JLabel labManoObra;
	private JTextField txtManoObra;
	
	private JLabel labCargoEnergia;
	private JTextField txtCargoEnergia;
	
	private JLabel labRecorte;
	private JTextField txtRecorte;
	
	private JLabel labVestimento;
	private JTextField txtVestimento;
	
	private JLabel labCantidad;
	private JTextField txtCantidad;
	
	private JLabel labUnidadKilos;
	private JTextField txtUnidadKilos;
	
	private JLabel labConsumoUnitario;
	private JTextField txtConsumoUnitario;
	
	private JLabel labEntradasMes;
	private JTextField txtEntradasMes;
	
	private JLabel labInventarioFisico;
	private JTextField txtInventarioFisico;
	private ArrayList semana;
	private int cc;
	private JLabel labTotal;
	private JTextField txtTotal;
	
	private JLabel labPorctConsumo;
	private JTextField txtPorctConsumo;
	
	private JLabel labSemanaReales;
	private JTextField txtSemanaReales;
	
	private JLabel labNivel;
	private JTextField txtNivel;
	
	private JLabel labEntrada;
	private JTextField txtEntrada;
	
	private JLabel labSalida;
	private JTextField txtSalida;
	
	private JLabel labStock;
	private JTextField txtStock;
	
	private JButton butsiguiente;
	private JButton butAnterior;
	
	private JButton butSiguienteSemana;
	private JButton butAnteriorSemana;
	
	
	public panelInstitucional()
	{
		setLayout( new GridLayout( 1, 2 ) );
		
		JPanel panelDescripcion = new JPanel( );
		
        panelDescripcion.setBorder( new TitledBorder( "Descripcion" ) );
        panelDescripcion.setLayout( new BorderLayout( ) );
		
        // Descripcion Basica
		JPanel panelDescInfo = new JPanel();
		panelDescInfo.setLayout(new GridLayout(2,2));
		
		labNombre = new JLabel("Nombre");
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setBorder(null);
 
		labCodigo = new JLabel("Codigo");
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBorder(null);
		
		
		panelDescInfo.add(labNombre);
		panelDescInfo.add(txtNombre);
		panelDescInfo.add(labCodigo);
		panelDescInfo.add(txtCodigo);
		
		//Mas Detallada
		JPanel panelDescDisc = new JPanel();
		panelDescDisc.setLayout(new GridLayout(7,2));
		panelDescDisc.setBorder(new TitledBorder("Discriminacion de Costo"));
		
		labCostoInsumos = new JLabel("Costo Insumos");
		txtCostoInsumos = new JTextField();
		txtCostoInsumos.setEditable(false);
		txtCostoInsumos.setBorder(null);
		
		labDesviacion = new JLabel("Desviacion");
		txtDesviacion = new JTextField();
		txtDesviacion.setEditable(false);
		txtDesviacion.setBorder(null);
		
		labInsumoMa = new JLabel("Insumo Materiales");
		txtInsumoMa = new JTextField();
		txtInsumoMa.setEditable(false);
		txtInsumoMa.setBorder(null);
		
		labManoObra = new JLabel("Mano de Obra");
		txtManoObra = new JTextField();
		txtManoObra.setEditable(false);
		txtManoObra.setBorder(null);
		
		labCargoEnergia = new JLabel("Cargo de Energia");
		txtCargoEnergia = new JTextField();
		txtCargoEnergia.setEditable(false);
		txtCargoEnergia.setBorder(null);
		
		labRecorte = new JLabel("Recorte");
		txtRecorte = new JTextField();
		txtRecorte.setEditable(false);
		txtRecorte.setBorder(null);
		
		labVestimento = new JLabel("Vestimento");
		txtVestimento = new JTextField();
		txtVestimento.setEditable(false);
		txtVestimento.setBorder(null);
		
		panelDescDisc.add(labCostoInsumos);
		panelDescDisc.add(txtCostoInsumos);
		panelDescDisc.add(labDesviacion);
		panelDescDisc.add(txtDesviacion);
		panelDescDisc.add(labInsumoMa);
		panelDescDisc.add(txtInsumoMa);
		panelDescDisc.add(labManoObra);
		panelDescDisc.add(txtManoObra);
		panelDescDisc.add(labCargoEnergia);
		panelDescDisc.add(txtCargoEnergia);
		panelDescDisc.add(labRecorte);
		panelDescDisc.add(txtRecorte);
		panelDescDisc.add(labVestimento);
		panelDescDisc.add(txtVestimento);
		
		 butsiguiente = new JButton("Siguiente");
		 butAnterior = new JButton("Anterior");
		 JPanel dos = new JPanel();
		 dos.setLayout(new GridLayout(1, 2));
		 dos.add(butAnterior);
		 dos.add(butsiguiente);
		panelDescripcion.add(panelDescInfo, BorderLayout.NORTH);
		panelDescripcion.add(panelDescDisc, BorderLayout.CENTER);
		panelDescripcion.add(dos , BorderLayout.SOUTH);
		
		
		
		JPanel panelInfo = new JPanel();
		
		panelInfo.setLayout(new GridLayout(3,1));
		
		JPanel panelConsumoProducto = new JPanel();
		
		panelConsumoProducto.setLayout(new GridLayout(3,2));
		panelConsumoProducto.setBorder(new TitledBorder("Consumo de Productos"));
		
		labCantidad = new JLabel("Cantidad");
		txtCantidad = new JTextField();
		txtCantidad.setEditable(false);
		txtCantidad.setBorder(null);
		
		labUnidadKilos = new JLabel("Unidad de Kilos");
		txtUnidadKilos = new JTextField();
		txtUnidadKilos.setEditable(false);
		txtUnidadKilos.setBorder(null);
		
		
		labConsumoUnitario = new JLabel("Consumo Unitario");
		txtConsumoUnitario = new JTextField();
		txtConsumoUnitario.setEditable(false);
		txtConsumoUnitario.setBorder(null);
		
		panelConsumoProducto.add(labCantidad);
		panelConsumoProducto.add(txtCantidad);
		panelConsumoProducto.add(labUnidadKilos);
		panelConsumoProducto.add(txtUnidadKilos);
		panelConsumoProducto.add(labConsumoUnitario);
		panelConsumoProducto.add(txtConsumoUnitario);
		
		JPanel panelCalculoNivel = new JPanel();
		
		panelCalculoNivel.setLayout(new GridLayout(6,2));
		panelCalculoNivel.setBorder(new TitledBorder("Calculo Nivel de Rotacion"));

		labEntradasMes = new JLabel("Entradas por Mes");
		txtEntradasMes = new JTextField();
		txtEntradasMes.setEditable(false);
		txtEntradasMes.setBorder(null);
		
		labInventarioFisico = new JLabel("Inventario Fisico");
		txtInventarioFisico = new JTextField();
		txtInventarioFisico.setEditable(false);
		txtInventarioFisico.setBorder(null);
		
		labTotal = new JLabel("Total");
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setBorder(null);

		labPorctConsumo = new JLabel("Porcentaje de Consumo");
		txtPorctConsumo = new JTextField();
		txtPorctConsumo.setEditable(false);
		txtPorctConsumo.setBorder(null);
		
		labSemanaReales = new JLabel("Semana reales");
		txtSemanaReales = new JTextField();
		txtSemanaReales.setEditable(false);
		txtSemanaReales.setBorder(null);
		
		labNivel= new JLabel("Nivel");
		txtNivel = new JTextField();
		txtNivel.setEditable(false);
		txtNivel.setBorder(null);
		
		panelCalculoNivel.add(labEntradasMes);
		panelCalculoNivel.add(txtEntradasMes);
		panelCalculoNivel.add(labInventarioFisico);
		panelCalculoNivel.add(txtInventarioFisico);
		panelCalculoNivel.add(labTotal);
		panelCalculoNivel.add(txtTotal);
		panelCalculoNivel.add(labPorctConsumo);
		panelCalculoNivel.add(txtPorctConsumo);
		panelCalculoNivel.add(labSemanaReales);
		panelCalculoNivel.add(txtSemanaReales);
		panelCalculoNivel.add(labNivel);
		panelCalculoNivel.add(txtNivel);
		
		
		JPanel panelSemana = new JPanel();
		
		panelSemana.setLayout(new GridLayout(4,2));
		panelSemana.setBorder(new TitledBorder("Semana"));
		
		labEntrada = new JLabel("Entrada");
		txtEntrada = new JTextField();
		txtEntrada.setEditable(false);
		txtEntrada.setBorder(null);
		
		labSalida = new JLabel("Salida");
		txtSalida = new JTextField();
		txtSalida.setEditable(false);
		txtSalida.setBorder(null);
		
		labStock = new JLabel("Stock");
		txtStock = new JTextField();
		txtStock.setEditable(false);
		txtStock.setBorder(null);
		
		butSiguienteSemana = new JButton(">>");
		butAnteriorSemana = new JButton("<<");
		
		
		panelSemana.add(labEntrada);
		panelSemana.add(txtEntrada);
		panelSemana.add(labSalida);
		panelSemana.add(txtSalida);
		panelSemana.add(labStock);
		panelSemana.add(txtStock);
		panelSemana.add(butAnteriorSemana);
		panelSemana.add(butSiguienteSemana);
		
		
		
		
		panelInfo.add(panelConsumoProducto, BorderLayout.NORTH);
		panelInfo.add(panelCalculoNivel, BorderLayout.CENTER);
		panelInfo.add(panelSemana, BorderLayout.SOUTH);
		
		add(panelDescripcion);
		add(panelInfo);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void inicializar(institucional inst)
	{
		ArrayList si = inst.getInstitu();
		ArrayList s = (ArrayList) si.get(0);
Descripcion desc = (Descripcion) s.get(0);
consumoProducto cP = (consumoProducto) s.get(1);
calculoNivelR cN = (calculoNivelR) s.get(2);
semana = (ArrayList) s.get(3);
txtNombre.setText(desc.darNombre());
txtCodigo.setText(desc.darCodigo());
cc=0;
	
 txtCostoInsumos.setText(desc.darcosto());

txtDesviacion.setText(desc.darDesviacion());

txtInsumoMa.setText(desc.darInsumo());

 txtManoObra.setText(desc.darManoO());

txtCargoEnergia.setText(desc.darcargoE());

txtRecorte.setText(desc.darRecorte());

txtVestimento.setText(desc.darVestimentas());

txtCantidad.setText(cP.getCantidad());

txtUnidadKilos.setText(cP.getUnidad());

txtConsumoUnitario.setText(cP.getConsumoU());

txtEntradasMes.setText(cN.getentradaMes());

 txtInventarioFisico.setText(cN.getInventario());

 txtTotal.setText(cN.getTotal());

 txtPorctConsumo.setText(cN.getPorcentaje());

 txtNivel.setText(cN.getNivel());
 
 Semana sema = (Semana) semana.get(0);

 txtEntrada.setText(sema.getEntrada());

 txtSalida.setText(sema.getSalida());;

 txtStock.setText(sema.getStock());;
		
	}
	
	
	
	

}
