/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej4;

import entidades.Cine;
import entidades.Espectador;
import entidades.Sala;
import java.util.ArrayList;
import servicios.CineService;

/**
 *
 * @author tomic
 */
public class RelacionesEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CineService cS = new CineService();
        ArrayList<Espectador> espectadores = new ArrayList();
        
        Cine c1 = cS.crearCine();
        
        c1.getSalas().toString();
        cS.mostrarSala(c1.getSalas().get(0));
        
        espectadores = cS.espectadorFabrica();
        
        cS.llenarSala(c1, c1.getSalas().get(0), espectadores);
        
        cS.mostrarSala(c1.getSalas().get(0));
        
        

    }
    
}
