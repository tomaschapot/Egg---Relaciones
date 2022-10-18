/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpruebaguia;

import ejpruebaguia.entidades.Persona;
import ejpruebaguia.services.PersonaService;

/**
 *
 * @author tomic
 */
public class EjPruebaGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaService pS = new PersonaService();
        
        Persona p1 = pS.crearPersona();
        
        System.out.println(p1.getDni().getNumero());
        
    }
    
}
