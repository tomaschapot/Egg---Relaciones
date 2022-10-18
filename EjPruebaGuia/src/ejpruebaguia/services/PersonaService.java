/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpruebaguia.services;

import ejpruebaguia.entidades.Dni;
import ejpruebaguia.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class PersonaService {

    private Scanner leer;

    public PersonaService() {

        leer = new Scanner(System.in).useDelimiter("\n");

    }

    ;
    
    public Persona crearPersona() {

        Persona p1 = new Persona();
        Dni d1 = new Dni();

        System.out.println("Ingrese el nombre");
        p1.setNombre(leer.next());

        System.out.println("Ingrese la edad");
        p1.setEdad(leer.nextInt());

        System.out.println("Ingrese el numero de Dni");
        d1.setNumero(leer.nextLong());

        System.out.println("Ingrese el codigo");
        d1.setCodigo(leer.next());

        p1.setDni(d1);

        return p1;

    }

}
