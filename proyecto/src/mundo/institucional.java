package mundo;

import java.util.ArrayList;

public class institucional {
	
	
	private ArrayList insti;
	private int count;
	
	public institucional()
	{
		insti = new ArrayList();
		count = 0;
	}
	public void agregarInstitu(ArrayList obj)
	{

		for(int i = 0; i<obj.size();i++)
		{  
			ArrayList info = (ArrayList) obj.get(i);
			String promedio = (String) info.get(0);
			String descripcion = (String) info.get(1);
			String codigo = (String) info.get(2);
			
		
			ArrayList consumo = (ArrayList) info.get(3);
		
			consumoProducto conP = new consumoProducto((String)consumo.get(0), (String)consumo.get(1),(String)consumo.get(2));
			ArrayList calc = (ArrayList) info.get(4);
		
			calculoNivelR calcNo = new calculoNivelR((String) calc.get(0),(String) calc.get(1),(String) calc.get(2),(String) calc.get(3),
					(String) calc.get(4),(String) calc.get(5));
			ArrayList sem = (ArrayList) info.get(5);
		
			ArrayList semaa = new ArrayList() ;
			Descripcion desc = new Descripcion(descripcion, codigo, promedio, (String)info.get(6),
					(String)info.get(7),(String)info.get(8),(String)info.get(9),(String)info.get(10),
					(String)info.get(11),(String)info.get(12));
			for(int j = 0; j< sem.size();j++){
				
				ArrayList semi = (ArrayList) sem.get(j);
				String entrada = (String) semi.get(0) ;

				String salida=(String) semi.get(1);
				
				String stock = (String)semi.get(2);
				
				int numerosemana =j;
				Semana sema= new Semana(entrada,salida,stock,numerosemana);
				semaa.add(sema);
				
			}
			ArrayList all = new ArrayList();
			all.add(desc);
			all.add(conP);
			all.add(calcNo);
			all.add(semaa);
			insti.add(all);
			
		}
		}

	
	public ArrayList getInstitu()
	{
		return insti;
	}
}
