/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import entidades.Perro;
import entidades.Persona;

/**
 *
 * @author tomic
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Realizar un programa para que una Persona pueda adoptar un Perro. 
        Vamos a contar de dos
        clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la 
        clase Persona con
        atributos: nombre, apellido, edad, documento y Perro.
        Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a 
        tener que
        pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
        mostrar desde
        la clase Persona, la información del Perro y de la Persona.*/
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();

        p1.setNombre("Mateo");
        p1.setApellido("Tobal");
        p1.setEdad(18);
        p1.setDocumento(20201018);
        p1.setPerro(perro1);

        perro1.setEdad(3);
        perro1.setNombre("Rodri");
        perro1.setTamanio(18);

        perro2.setEdad(3);
        perro2.setNombre("Rodri");
        perro2.setTamanio(18);

        p2.setNombre("Mateo");
        p2.setApellido("Tobal");
        p2.setEdad(18);
        p2.setDocumento(20201018);
        p2.setPerro(perro2);

        System.out.println(p1);
        System.out.println(p2);

    }

}
