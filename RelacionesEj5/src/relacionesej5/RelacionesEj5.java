/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej5;

import Entity.Poliza;
import Service.ServicePoliza;


/**
 *
 * @author tomic
 */
public class RelacionesEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicePoliza sPoliza = new ServicePoliza();
        
        Poliza p1 = sPoliza.crearPoliza();
        
        
        System.out.println(p1);
        
    }

}
