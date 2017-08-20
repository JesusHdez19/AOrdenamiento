/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaordenamiento3cm1;

import algoritmos.Burbuja;
import algoritmos.BurbujaOptimizado;
import herramientas.Graficar;

/**
 *
 * @author Roberto Cruz Leija
 */
public class AAOrdenamiento3CM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //double [] datos = new double[]{6,5,3,1,8,7,2,4};
        double [] datos =herramientas.Datos.generarDatosAleatorios(50000, 100);
        double []tiempo=new double [10];
        double []tiempo2=new double [10];
        double []Carreras=new double [10];
        //double [] datos2 = new double[]{8,7,6,5,4,3,2,1};
         for(int i=0;i<10;i++){
        //double [] datos2 = new double[]{8,7,6,5,4,3,2,1};
        double [] datos3 = datos.clone();
        Burbuja b1 = new Burbuja();
        b1.ordenar(datos);
        
        BurbujaOptimizado b2 = new BurbujaOptimizado();
        b2.ordenar(datos3);
        
        tiempo[i]=b1.getTiempo_total();
        tiempo2[i]=b2.getTiempo_total();
        Carreras[i]=i+1;
        
        }
        Graficar g1 = new Graficar("Grafica", "x", "y");
        g1.grafica(tiempo,Carreras, "Burbuja");
        g1.grafica(tiempo2,Carreras, "Burbuja Optimizado");
        g1.Grafica();
    }
   
}
