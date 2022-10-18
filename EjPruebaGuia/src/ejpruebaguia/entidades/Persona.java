/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpruebaguia.entidades;

/**
 *
 * @author tomic
 */
public class Persona {

    private String nombre;
    private int edad;
    private Dni dni;

    public Persona() {

    }

    ;
    
    public Persona(String nombre, int edad, Dni dni) {

        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;

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

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + '}';
    }

}
