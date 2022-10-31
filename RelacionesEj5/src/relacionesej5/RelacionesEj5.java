/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej5;

import Entity.Cuota;
import Service.ServiceCuota;

/**
 *
 * @author tomic
 */
public class RelacionesEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiceCuota sC = new ServiceCuota();
        
        Cuota c1 =sC.crearCuota();
        
        System.out.println(c1);
        
    }

}
