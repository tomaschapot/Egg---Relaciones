/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author tomic
 */
public class Perro {

    private String nombre;
    private int edad;
    private int tamanio;

    public Perro() {

    }

    ;
    
    public Perro(String nombre, int edad, int tamanio) {

        this.nombre = nombre;
        this.edad = edad;
        this.tamanio = tamanio;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }
    
    

}
