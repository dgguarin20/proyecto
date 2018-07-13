package mundo;

public class Descripcion {
	

	private String nombre;
	private String codigo;
	private String promedio;
	private String costoJ;
	private String desviacion;
	private String insumoM;
	private String manoObra;
	private String cargoE;
	private String recorte;
	private String vestimentas;

	
	public Descripcion(String nombrep, String codigop,String promediop, String costop, String desviacionp,
			String insumop, String manoObrap, String cargoep,String recortep, String vestimentasp)
	{
		nombre = nombrep;
		codigo = codigop;
		promedio = promediop;
		costoJ = costop;
		desviacion = desviacionp;
		insumoM = insumop;
		manoObra = manoObrap;
		cargoE = cargoep;
		recorte = recortep;
		vestimentas = vestimentasp;
		
	}
	public String darInsumo()
	{
		return insumoM;
	}
	public String darManoO()
	{
		return manoObra;
	}
	public String darcargoE()
	{
		return cargoE;
	}
	public String darRecorte()
	{
		return recorte;
	}
	public String darVestimentas()
	{
		return vestimentas;
	}
	public String darNombre()
	{
		return nombre;
	}
	public String darCodigo()
	{
		return codigo;
	}
	public String darpromedio()
	{
		return promedio;
	}
	public String darcosto()
	{
		return costoJ;
	}
	public String darDesviacion()
	{
		return desviacion;
	}
	
}
