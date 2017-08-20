/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 *
 * @author jesushernandez
 */
public class Graficar {
    // grafica
    private JFreeChart grafica;
    // coleccion de series
    private XYSeriesCollection series;
    private String Nombre,ejeX,ejeY;
    
    public Graficar(String nombre,String ty,String tx) {
        this.grafica = null;
        this.Nombre = nombre;
        this.ejeX = tx;
        this.ejeY = ty;
        this.series = new XYSeriesCollection();
    }
    
    public void grafica(double tiempo[], double Carreras[], String Nombre){
        XYSeries serieOrden = new XYSeries(Nombre);
        // recorrer los datos para agregarlos a la serie
        for (int x = 0 ; x < Carreras.length;x++){
        serieOrden.add(tiempo[x], Carreras[x]);
      }
     // agregamos al serie a la coleccion de series
     this.series.addSeries(serieOrden);
    }
    
    public void Grafica(){
    
        this.grafica = ChartFactory.createXYLineChart(Nombre, ejeX, ejeY, series);
        
        // utilizar un panel especial dentro de jfreechart
        ChartFrame panel = new ChartFrame("grafica",grafica);
        panel.pack();
        panel.setVisible(true);
        
        
    }
    
}
