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
public class Jugador {

    private String id;
    private String nombre;
    private boolean mojado;

    public Jugador() {

    }

    ;
    
    public Jugador(String id, String nombre, boolean mojado) {

        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public void disparo(RevolverDeAgua r) {

        this.setMojado(r.mojar());
        r.siguienteChorro();

    }

    @Override
    public String toString() {
        return "Jugador: " + nombre;
    }

}
