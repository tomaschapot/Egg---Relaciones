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
public class Cine {

    private ArrayList<Sala> salas;
    private String nombre;
    private Double valorEntrada;
    

    public Cine() {

    }

    ;
    
    public Cine(ArrayList<Sala> salas, String nombre) {
        this.salas = salas;
        this.nombre = nombre;
        this.valorEntrada = valorEntrada;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cine{" + "salas=" + salas + ", nombre=" + nombre + '}';
    }
    
    

}
