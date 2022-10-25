/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Baraja;
import entidades.Carta;
import enums.Numero;
import enums.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class BarajaService {

    Scanner read;

    public BarajaService() {

        read = new Scanner(System.in).useDelimiter("\n");

    }

    public Baraja crearBaraja() {

        Baraja b1 = new Baraja();
        ArrayList<Carta> baraja = new ArrayList();

        for (Palo aux : Palo.values()) {
            for (Numero num : Numero.values()) {
                Carta c1 = new Carta();
                c1.setNumero(num);
                c1.setPalo(aux);
                baraja.add(c1);
            }
        }

        b1.setBaraja(baraja);

        return b1;

    }

    public void mostrarBaraja(Baraja b1) {

        Iterator it = b1.getBaraja().iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public void barajar(Baraja b1) {

        Collections.shuffle(b1.getBaraja());
    }

    public void siguienteCarta(Baraja b1) {

        Iterator it = b1.getBaraja().iterator();

        if (it.hasNext()) {
            System.out.println(it.next());
            b1.getCartasJugadas().add((Carta) it.next());
            it.remove();
        } else {
            System.out.println("No quedan mas cartas");
        }

    }

    public void darCartas(Baraja b1) {

        Iterator it = b1.getBaraja().iterator();
        Integer numeroDeCartas;
        Integer i = 0;

        System.out.println("Cuantas cartas quiere obtener");
        numeroDeCartas = read.nextInt();

        if (numeroDeCartas > b1.getBaraja().size()) {

            System.out.println("No se puede sacar mas cartas de las que hay");

        } else {
            while (it.hasNext() && numeroDeCartas > i) {

                System.out.println(it.next());
                b1.getCartasJugadas().add((Carta) it.next());
                it.remove();

                numeroDeCartas--;

            }

        }

    }
     public void mostrarCartasJugadas(Baraja b1){
         
         for(Carta aux : b1.getCartasJugadas()){
             System.out.println(aux);
         }
         
     }

}
