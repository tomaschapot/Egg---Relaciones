/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpruebaguia2;

import entidades.Equipo;
import entidades.Jugador;
import java.util.ArrayList;
import services.JugadorService;

/**
 *
 * @author tomic
 */
public class EjPruebaGuia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JugadorService jS = new JugadorService();

        ArrayList<Jugador> jugadores = jS.jugadorFactory();

        Equipo equipo = new Equipo("Las termitas", jugadores);

        for (Jugador aux : equipo.getJugadores()) {

            System.out.println(aux);

        }

    }

}
