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
public class Baraja {

    private ArrayList<Carta> baraja;
    private ArrayList<Carta> cartasJugadas;

    public Baraja() {
        cartasJugadas = new ArrayList();
    }
    

    ;

    public Baraja(ArrayList<Carta> baraja, ArrayList<Carta> cartasJugadas) {
        this.baraja = baraja;
        this.cartasJugadas = cartasJugadas;
    }

    ;

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getCartasJugadas() {
        return cartasJugadas;
    }

    public void setCartasJugadas(ArrayList<Carta> cartasJugadas) {
        this.cartasJugadas = cartasJugadas;
    }
    

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }

}
