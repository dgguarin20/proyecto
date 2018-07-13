package mundo;

public class consumoProducto {
	private String cantidad;
	private String unidad;
	private String consumoU;
	
	public consumoProducto(String c, String u, String co)
	{
		cantidad = c;
		unidad = u;
		consumoU = co;
	}
	
	public String getCantidad()
	{
		return cantidad;
	}
	public String getUnidad()
	{
		return unidad;
	}
	public String getConsumoU()
	{
		return consumoU;
	}
	
}
