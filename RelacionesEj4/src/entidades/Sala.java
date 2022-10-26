/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author tomic
 */
public class Sala {

    private Integer cantidadDeFilas;
    private Integer cantidadDeColumnas;
    private Butaca matrizButacas[][];
    private Integer capacidadMaxima;
    

    public Sala() {

    }

    ;
    
    public Sala(Integer cantidadDeFilas, Integer cantidadDeColumnas) {

        this.cantidadDeColumnas = cantidadDeColumnas;
        this.cantidadDeFilas = cantidadDeFilas;
        capacidadMaxima = cantidadDeFilas * cantidadDeColumnas;
        matrizButacas = new Butaca[cantidadDeFilas][cantidadDeColumnas];
    }

    public Integer getCantidadDeFilas() {
        return cantidadDeFilas;
    }

    public void setCantidadDeFilas(Integer cantidadDeFilas) {
        this.cantidadDeFilas = cantidadDeFilas;
    }

    public Integer getCantidadDeColumnas() {
        return cantidadDeColumnas;
    }

    public void setCantidadDeColumnas(Integer cantidadDeColumnas) {
        this.cantidadDeColumnas = cantidadDeColumnas;
    }

    public Butaca[][] getMatrizButacas() {
        return matrizButacas;
    }

    public void setMatrizButacas(Butaca[][] matrizButacas) {
        this.matrizButacas = matrizButacas;
    }

   

    public Integer getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public String toString() {
        return "Sala{" + "cantidadDeFilas=" + cantidadDeFilas + ", cantidadDeColumnas=" + cantidadDeColumnas + ", matrizButacas=" + matrizButacas + ", capacidadMaxima=" + capacidadMaxima + '}';
    }

    
   

}
