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
public class RevolverDeAgua {

    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {

    }

    ;

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void llenarRevolver() {

        //Genera la posicion aleatoria donde se encuentra el revolver.
        posicionActual = (int) Math.round((Math.random() * 6));

        //Genera la posicion aleatoria donde se encuentra el agua.
        posicionAgua = (int) Math.round((Math.random() * 6));

    }

    public boolean mojar() {

        //Chequea si se mojo con el disparo.
        return posicionActual == posicionAgua;

    }

    public void siguienteChorro() {

        //Mueve el tambor
        if (posicionActual < 6) {
            posicionActual++;
        } else {
            posicionActual = 0;
        }

    }

    @Override
    public String toString() {
        return "RevolverDeAgua: " + "posicionActual=" + posicionActual
                + ", posicionAgua=" + posicionAgua;
    }

}
