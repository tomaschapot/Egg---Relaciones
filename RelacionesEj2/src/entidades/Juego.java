/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua r1;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int numeroDeRonda;

    public Juego() {

        jugadores = new ArrayList();
        numeroDeRonda = 1;
    }

    ;

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getR1() {
        return r1;
    }

    public void setR1(RevolverDeAgua r1) {
        this.r1 = r1;
    }

    public void llenarJuego() {

        //Recibe la cantidad de jugadores y el revolver y los guarda en el juego.
        int cantJugadores;

        r1 = new RevolverDeAgua();
        r1.llenarRevolver();

        System.out.println("Ingrese la cantidad de Jugadores (No puede ser mayor a 6)");

        cantJugadores = leer.nextInt();

        while (cantJugadores > 6 || cantJugadores < 0) {
            System.out.println("Se ingreso una cantidad invalida");
            System.out.println("Ingrese la cantidad de Jugadores (No puede ser mayor a 6)");
            cantJugadores = leer.nextInt();
        }

        for (int i = 0; i < cantJugadores; i++) {

            Jugador p1 = new Jugador();

            System.out.println("Ingrese el Id del jugador ");
            p1.setId(leer.next());

            System.out.println("Ingrese el nombre del jugador");
            p1.setNombre("#" + p1.getId().concat(leer.next()));

            jugadores.add(p1);

        }

    }

    public void ronda() {

        System.out.println("Ronda: " + numeroDeRonda);

        for (Jugador jugador : jugadores) {

            System.out.println(r1);
            jugador.disparo(r1);
            System.out.println(jugador);

            if (jugador.isMojado()) {

                System.out.println("Round over, jugador: " + jugador.getNombre()
                        + " Loses");

                break;

            }

        }
        numeroDeRonda++;

    }

    public void jugar() {

        llenarJuego();

        int cantidadDeRondas = jugadores.size() - 1;

        while (cantidadDeRondas > 0) {

            ronda();

            for (Jugador jugador : jugadores) {

                if (jugador.isMojado()) {
                    cantidadDeRondas--;
                    jugadores.remove(jugadores.indexOf(jugador));
                    break;
                }
            }

            if (jugadores.size() > 1) {
                System.out.println("Jugadores Restantes: " + jugadores.toString());
            } else {
                System.out.println(jugadores.get(0).getNombre() + " Wins");
            }

        }

    }

    @Override
    public String toString() {
        return jugadores + "Numero de Ronda: " + numeroDeRonda + "\n";
    }

}
