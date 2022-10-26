/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Butaca;
import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import entidades.Sala;
import enums.Columna;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class CineService {

    private Scanner read;

    public CineService() {

        read = new Scanner(System.in).useDelimiter("\n");

    }

    ;
    
    
    public Cine crearCine() {

        Cine c1 = new Cine();

        String respuesta = "Si";

        System.out.println("Ingrese el nombre del cine");
        c1.setNombre(read.next());

        System.out.println("Ingrese el valor de la entrada");
        c1.setValorEntrada(read.nextDouble());

        System.out.println("Ingrese las peliculas en cartelera");
        while (respuesta.equalsIgnoreCase("Si")) {

            Pelicula p1 = crearPelicula();
            c1.getCartelera().add(p1);

            System.out.println("Quiere ingresar una pelicula extra? Si/No");
            respuesta = read.next();
        }
        respuesta = "Si";

        System.out.println("Ingrese las salas");

        while (respuesta.equalsIgnoreCase("Si")) {

            Sala s1 = crearSala();
            c1.getSalas().add(s1);

            System.out.println("Quiere ingresar una sala extra? Si/No");
            respuesta = read.next();
        }

        return c1;

    }

    //Salas
    //Creo la sala, asigno cantidad de butacas y genero la matriz
    public Sala crearSala() {

        Integer cantFilas;
        Integer cantColumnas;

        System.out.println("Ingrese la cantidad de filas de la sala");
        cantFilas = read.nextInt();

        System.out.println("Ingrese la cantidad de columnas de la sala");
        cantColumnas = read.nextInt();

        Sala s1 = new Sala(cantFilas, cantColumnas);
        enumerarAsientos(s1);

        return s1;

    }

    // Uso el enun para levantar la letra por indice y le asigno letra y numero.
    private void enumerarAsientos(Sala s1) {

        int contador = s1.getCantidadDeFilas();
        for (int i = 0; i < s1.getCantidadDeFilas(); i++) {

            for (int j = 0; j < s1.getCantidadDeColumnas(); j++) {

                Butaca b1 = new Butaca();

                b1.setNumeroDeButaca(contador);

                for (Columna c1 : Columna.values()) {

                    if (c1.ordinal() == j) {
                        b1.setLetraButaca(c1.toString());
                    }
                }

                s1.getMatrizButacas()[i][j] = b1;

            }
            contador--;
        }

    }

    public void mostrarSala(Sala s1) {

        for (int i = 0; i < s1.getCantidadDeFilas(); i++) {
            for (int j = 0; j < s1.getCantidadDeColumnas(); j++) {
                System.out.print(s1.getMatrizButacas()[i][j]);
            }
            System.out.println("     ");
        }

    }

    public void llenarSala(Cine c1,Sala s1, ArrayList<Espectador> espectadores) {
        
        boolean encontrado = false;
        
        for (Espectador aux : espectadores) {

            for (int i = 0; i < s1.getCantidadDeFilas(); i++) {
                for (int j = 0; j < s1.getCantidadDeColumnas(); j++) {
                    
                    if(!s1.getMatrizButacas()[i][j].isOcupada() && aux.getDineroDisponible() > c1.getValorEntrada() ){
                        
                        s1.getMatrizButacas()[i][j].setOcupada(true);
                        encontrado = true;
                        break;
                    }
                }
                
                if(encontrado){
                    break;
                }
                
            }

        }

    }

    public Pelicula crearPelicula() {

        Pelicula p1 = new Pelicula();

        System.out.println("Ingrese el titulo");
        p1.setTitulo(read.next());
        System.out.println("Ingrese el director");
        p1.setDirector(read.next());
        System.out.println("Ingrese la edad minima");
        p1.setEdadMinima(read.nextInt());
        System.out.println("Ingrese la duracion");
        p1.setDuracion(read.nextDouble());

        return p1;

    }

    public Espectador crearEspectador() {

        Espectador e1 = new Espectador();

        System.out.println("Ingrese el nombre");
        e1.setNombre(read.next());

        System.out.println("Ingrese la edad");
        e1.setEdad(read.nextInt());

        System.out.println("Ingrese el dinero disponible");
        e1.setDineroDisponible(read.nextDouble());

        return e1;
    }

    public ArrayList<Espectador> espectadorFabrica() {

        Integer cantidadEspectadores;
        ArrayList<Espectador> espectadores = new ArrayList();

        System.out.println("Ingrese la cantidad de espectadores a ingresar");
        cantidadEspectadores = read.nextInt();

        for (int i = 0; i < cantidadEspectadores; i++) {

            Espectador e1 = crearEspectador();
            espectadores.add(e1);

        }

        return espectadores;

    }

}
