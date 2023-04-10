/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Juego;
import entidades.Jugador;
import entidades.RevolverDeAgua;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class juegoServicio {

    Juego juego = new Juego();

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {

        juego.setJugadores(jugadores);
        juego.setRevolver(r);

    }

    public void siguienteRonda() {
        jugadorServicio js = new jugadorServicio();
        boolean resultado = false;
        int vuelta = 0;
        do {

            for (int i = 0; i < 6; i++) {
                Jugador aux = juego.getJugadores().get(i);
                System.out.println(aux.toString());
                if (js.disparo(juego.getRevolver(), aux) == true) {
                    resultado = true;
                    System.out.println("El " + aux.getNombre() + " se mojo");
                    break;
                    //resultado=true;
                } else {
                    System.out.println("Te salvaste....:)");
                }

            }
        } while (resultado == false);

    }

//    public void imprimirJuego() {
//
//        for (int i = 0; i < juego.getJugadores().size(); i++) {
//            Jugador aux = juego.getJugadores().get(i);
//            System.out.println(aux.getNombre());
//        }
//
//        RevolverDeAgua aux2 = juego.getRevolver();
//        System.out.println(aux2.getPosicionActual());
//        System.out.println(aux2.getPosicionDeAgua());
//    }
}
