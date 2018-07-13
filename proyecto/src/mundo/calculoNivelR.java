package mundo;

public class calculoNivelR {

	private String entradasMes;
	private String inventario;
	private String total;
	private String porcentajeConsumo;
	private String semanaR;
	private String nivel;
	
	
	public calculoNivelR(String e, String i, String t, String p, String s, String n)
	{
		entradasMes = e;
		inventario = i;
		total = t;
		porcentajeConsumo = p;
		semanaR = s;
		nivel = n;
	}
	

	public String getentradaMes()
	{
		return entradasMes;
	}
	public String getInventario()
	{
		return inventario;
	}
	public String getTotal()
	{
		return total;
	}
	public String getPorcentaje()
	{
		return porcentajeConsumo;
	}
	public String getNivel()
	{
		return nivel;
	}
	
}
