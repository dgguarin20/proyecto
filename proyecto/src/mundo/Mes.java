package mundo;

import java.util.ArrayList;

public class Mes {
	private String nombre;
	private consumoProducto consumoPro;
	private calculoNivelR calculo;
	
	public Mes(ArrayList d, String n, consumoProducto c, calculoNivelR cal)
	{
		nombre = n;
		consumoPro = c;
		calculo = cal;
	}
	
	

	public String getNombre()
	{
		return nombre;
	}
	public consumoProducto getConsumo()
	{
		return consumoPro;
	}
}
