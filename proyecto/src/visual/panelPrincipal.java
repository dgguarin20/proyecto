package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class panelPrincipal extends JPanel{

	public panelPrincipal()
	{
		
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(1795, "", "Servilletas");
		dataset.setValue(38036, "", "Rollos");
		dataset.setValue(78016, "","Institucional");
		JFreeChart chart = ChartFactory.createBarChart("","","",dataset,PlotOrientation.VERTICAL, false, true, false);
	
		CategoryPlot p= chart.getCategoryPlot();
		p.setRangeGridlinePaint(Color.black);
		p.setBackgroundPaint(Color.gray);
		chart.setBackgroundPaint(Color.LIGHT_GRAY);
		ImageIcon im = new ImageIcon(chart.createBufferedImage(550, 380));
		JLabel picLabel = new JLabel(im);
		add(picLabel, BorderLayout.NORTH);
		

		/**
		DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
		dataset2.setValue(2438, "", "B");
		JFreeChart chart2 = ChartFactory.createBarChart("","","",dataset2,PlotOrientation.VERTICAL, false, true, false);
		CategoryPlot p2= chart2.getCategoryPlot();
		p2.setRangeGridlinePaint(Color.black);
		
		ImageIcon im2 = new ImageIcon(chart2.createBufferedImage(180, 400));
		JLabel picLabel2 = new JLabel(im2);
		add(picLabel2);
		
		
		
		DefaultCategoryDataset dataset3 = new DefaultCategoryDataset();
		dataset3.setValue(65971, "", "C");
		JFreeChart chart3 = ChartFactory.createBarChart("","","",dataset3,PlotOrientation.VERTICAL, false, true, false);
		CategoryPlot p3= chart3.getCategoryPlot();
		p3.setRangeGridlinePaint(Color.black);
		ImageIcon im3 = new ImageIcon(chart3.createBufferedImage(180, 400));
		JLabel picLabel3 = new JLabel(im3);
		add(picLabel3);
		**/
	}
	public void inicializar()
	{
		
	}
	
	
}
