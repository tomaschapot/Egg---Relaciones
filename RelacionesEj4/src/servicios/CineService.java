/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Butaca;
import entidades.Sala;
import enums.Columna;
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
            contador --;
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

}
