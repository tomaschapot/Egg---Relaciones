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
    private ArrayList<Pelicula> cartelera;
    

    public Cine() {
        
        cartelera = new ArrayList();
        salas = new ArrayList();

    }

    ;
    
    public Cine(ArrayList<Sala> salas, String nombre,ArrayList<Pelicula> cartelera) {
        this.salas = salas;
        this.nombre = nombre;
        this.valorEntrada = valorEntrada;
        this.cartelera = cartelera;
        
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

    public Double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(Double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public ArrayList<Pelicula> getCartelera() {
        return cartelera;
    }

    public void setCartelera(ArrayList<Pelicula> cartelera) {
        this.cartelera = cartelera;
    }
    
    

    @Override
    public String toString() {
        return "Cine{" + "salas=" + salas + ", nombre=" + nombre + '}';
    }
    
    

}
