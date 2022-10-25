/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej3;

import entidades.Baraja;
import servicios.BarajaService;

/**
 *
 * @author tomic
 */
public class RelacionesEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarajaService bS = new BarajaService();
        
        Baraja b1 = bS.crearBaraja();
        
        bS.mostrarBaraja(b1);
        bS.barajar(b1);
        System.out.println("---------------------");
        bS.mostrarBaraja(b1);
        bS.siguienteCarta(b1);
        System.out.println("---------------------");
        bS.mostrarBaraja(b1);
        bS.darCartas(b1);
        System.out.println("---------------------");
        bS.mostrarCartasJugadas(b1);
        
    }
    
}
