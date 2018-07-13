package mundo;

public class Semana {
	
	private String entrada;
	private String salida;
	private String stock;
	private int numerosemana;
	
	public Semana(String e, String s, String st, int n)
	{
		entrada = e;
		salida = s;
		stock = st;
		numerosemana = n;
	
	}
	
	public String getEntrada()
	{
		return entrada;
	}
	
	public String getSalida()
	{
		return salida;
	}
	public String getStock()
	{
		return stock;
	}
	public int getNum()
	{
		return numerosemana;
	}
	
	
}
