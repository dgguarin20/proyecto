package mundo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import visual.visualPrincipal;

public class archivo {
	
	private institucional inst;
	private servilleta serv;
	private rollo rollos;
	
	public archivo() 
	{
		inst = new institucional();
		serv = new servilleta();
		rollos = new rollo();
	}
	public institucional darinst()
	{
		return inst;
	}
	public servilleta darserv()
	{
		return serv;
	}
	public rollo darRollos()
	{
		return rollos;
	}
	
	public void AgregarArchivo(String direccion) throws IOException
	{
		FileInputStream fis = new FileInputStream(new File(direccion));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		System.out.println("blah");
		XSSFSheet sheetS = wb.getSheet("SERVILLETAS");
		XSSFSheet sheetR = wb.getSheet("ROLLOS");
		XSSFSheet sheetI = wb.getSheet("INSTITUCIONAL");
		System.out.println("blah");
		
		AgregarServilletas(sheetS);
		
		AgregarRollos(sheetR);
		AgregarInstitucional(sheetI);
		System.out.println("blah");
		
	}
	

	
	public void AgregarServilletas(XSSFSheet sheet)
	{
		int rowStart = sheet.getFirstRowNum();
		int rowEnd = sheet.getLastRowNum();
		ArrayList obj = new ArrayList();
		
		ArrayList consumoP = new ArrayList();
		ArrayList calculo = new ArrayList();
		
		ArrayList semanainfo = new ArrayList();
		int contador ;
		System.out.println("blah1");
		for (int i = rowStart+1; i<rowEnd; i=1+i)
		{
			
				Row row = sheet.getRow(i);
				ArrayList info = new ArrayList();
				contador = 0;
				ArrayList semana = new ArrayList();
				Cell c = row.getCell(row.getFirstCellNum());
				DataFormatter f = new DataFormatter();
				String ver = f.formatCellValue(c);
				if(!ver.equals(""))
				{
				for (int j = row.getFirstCellNum(); j<row.getLastCellNum(); j++)
				{
					
					Cell cell = row.getCell(j);
					DataFormatter formatter = new DataFormatter();
					String val = formatter.formatCellValue(cell);
					if(contador >=0 && contador <=2)
					{
						consumoP.add(val);
					}
					else if(contador >= 3 && contador <= 8)
					{
						calculo.add(val);
					}
					else if(contador >=9 && contador <=11 )
					{
						semanainfo.add(val);
						if(contador ==11)
						{
							semana.add(semanainfo);
							semanainfo = new ArrayList();
						}
					}
					else if(contador >= 12 && contador <=14)
					{
						semanainfo.add(val);
						if(contador ==14)
						{
							semana.add(semanainfo);
							semanainfo = new ArrayList();
						}
					}
					else if(contador >= 15 && contador <= 17)
					{
						semanainfo.add(val);
						if(contador ==17)
						{
							semana.add(semanainfo);
							semanainfo = new ArrayList();
						}
					}
					else if(contador >= 18 && contador <=20)
					{
						info.add(val);
						if(contador==20){
							System.out.println("omg"+semana.size());
						info.add(consumoP);
						info.add(calculo);
						info.add(semana);
						}
					
					}
					else
					{
						info.add(val);
						
					}
				contador = contador+1; 
				System.out.println(""+contador);
				}
				obj.add(info);
				System.out.println(""+obj.size()+"c");
				System.out.println(""+info.size()+"i");
				}

		}
		
		System.out.println(""+obj.size());
		serv.agregarservilletatu(obj);
		
		
	}
	
	public void AgregarRollos(XSSFSheet sheet)
	{
		int rowStart = sheet.getFirstRowNum();
		int rowEnd = sheet.getLastRowNum();
		ArrayList obj = new ArrayList();
		
		ArrayList consumoP = new ArrayList();
		ArrayList calculo = new ArrayList();
		
		ArrayList semanainfo = new ArrayList();
		int contador ;
		System.out.println("blah1");
		for (int i = rowStart+1; i<rowEnd; i=1+i)
		{
			
				Row row = sheet.getRow(i);
				ArrayList info = new ArrayList();
				contador = 0;
				ArrayList semana = new ArrayList();
				Cell c = row.getCell(row.getFirstCellNum());
				DataFormatter f = new DataFormatter();
				String ver = f.formatCellValue(c);
				if(!ver.equals(""))
				{
				for (int j = row.getFirstCellNum(); j<row.getLastCellNum(); j++)
				{
					
					Cell cell = row.getCell(j);
					DataFormatter formatter = new DataFormatter();
					String val = formatter.formatCellValue(cell);
					if(contador >=0 && contador <=2)
					{
						consumoP.add(val);
					}
					else if(contador >= 3 && contador <= 8)
					{
						calculo.add(val);
					}
					else if(contador >=9 && contador <=11 )
					{
						semanainfo.add(val);
						if(contador ==11)
						{
							semana.add(semanainfo);
							semanainfo = new ArrayList();
						}
					}
					else if(contador >= 12 && contador <=14)
					{
						semanainfo.add(val);
						if(contador ==14)
						{
							semana.add(semanainfo);
							semanainfo = new ArrayList();
						}
					}
					else if(contador >= 15 && contador <= 17)
					{
						semanainfo.add(val);
						if(contador ==17)
						{
							semana.add(semanainfo);
							semanainfo = new ArrayList();
						}
					}
					else if(contador >= 18 && contador <=20)
					{
						info.add(val);
						if(contador==20){
							System.out.println("omg"+semana.size());
						info.add(consumoP);
						info.add(calculo);
						info.add(semana);
						}
					
					}
					else
					{
						info.add(val);
						
					}
				contador = contador+1; 
				System.out.println(""+contador);
				}
				obj.add(info);
				System.out.println(""+obj.size()+"c");
				System.out.println(""+info.size()+"i");
				}

		}
		
		System.out.println(""+obj.size());
		rollos.agregarrolltu(obj);
		
		
	}
	
	public void AgregarInstitucional(XSSFSheet sheet)
	{int rowStart = sheet.getFirstRowNum();
	int rowEnd = sheet.getLastRowNum();
	ArrayList obj = new ArrayList();
	
	ArrayList consumoP = new ArrayList();
	ArrayList calculo = new ArrayList();
	
	ArrayList semanainfo = new ArrayList();
	int contador ;
	System.out.println("blah1");
	for (int i = rowStart+1; i<rowEnd; i=1+i)
	{
		
			Row row = sheet.getRow(i);
			ArrayList info = new ArrayList();
			contador = 0;
			ArrayList semana = new ArrayList();
			Cell c = row.getCell(row.getFirstCellNum());
			DataFormatter f = new DataFormatter();
			String ver = f.formatCellValue(c);
			if(!ver.equals(""))
			{
			for (int j = row.getFirstCellNum(); j<row.getLastCellNum(); j++)
			{
				
				Cell cell = row.getCell(j);
				DataFormatter formatter = new DataFormatter();
				String val = formatter.formatCellValue(cell);
				if(contador >=0 && contador <=2)
				{
					consumoP.add(val);
				}
				else if(contador >= 3 && contador <= 8)
				{
					calculo.add(val);
				}
				else if(contador >=9 && contador <=11 )
				{
					semanainfo.add(val);
					if(contador ==11)
					{
						semana.add(semanainfo);
						semanainfo = new ArrayList();
					}
				}
				else if(contador >= 12 && contador <=14)
				{
					semanainfo.add(val);
					if(contador ==14)
					{
						semana.add(semanainfo);
						semanainfo = new ArrayList();
					}
				}
				else if(contador >= 15 && contador <= 17)
				{
					semanainfo.add(val);
					if(contador ==17)
					{
						semana.add(semanainfo);
						semanainfo = new ArrayList();
					}
				}
				else if(contador >= 18 && contador <=20)
				{
					info.add(val);
					if(contador==20){
						System.out.println("omg"+semana.size());
					info.add(consumoP);
					info.add(calculo);
					info.add(semana);
					}
				
				}
				else
				{
					info.add(val);
					
				}
			contador = contador+1; 
			System.out.println(""+contador);
			}
			obj.add(info);
			System.out.println(""+obj.size()+"c");
			System.out.println(""+info.size()+"i");
			}

	}
	
	System.out.println(""+obj.size());
		inst.agregarInstitu(obj);
		
		
		
	}
	
}
