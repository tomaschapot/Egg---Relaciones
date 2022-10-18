/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Jugador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class JugadorService {

    private Scanner leer;
    
   

    public JugadorService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Jugador crearJugador() {

        Jugador j1 = new Jugador();

        System.out.println("Ingrese el nombre");
        j1.setNombre(leer.next());

        System.out.println("Ingrese el apellido");
        j1.setApellido(leer.next());

        System.out.println("Ingrese la posicion");
        j1.setPosicion(leer.next());

        System.out.println("Ingrese el numero");
        j1.setNumero(leer.nextInt());

        return j1;

    }

    public ArrayList<Jugador> jugadorFactory() {

        String respuesta;
        ArrayList<Jugador> lista = new ArrayList();

        do {

            System.out.println("-----Creando Jugador -----");
            Jugador p1 = crearJugador();

            lista.add(p1);

            System.out.println("Quiere ingresar un nuevo jugador? s/n");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("s"));

        return lista;

    }

}
