/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej4;

import entidades.Sala;
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
        
        Sala s1 = cS.crearSala();
        cS.mostrarSala(s1);

    }
    
}
