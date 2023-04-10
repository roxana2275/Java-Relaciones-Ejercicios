/*
 Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
 */
package servicios;

import entidades.Juego;
import entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class juegoServicios {
    
    

    public Juego llenarJuego() {
        revolverDeAguaServicios rev = new revolverDeAguaServicios();
        Juego juego = new Juego();
        ArrayList<Jugador> jug = new ArrayList();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de jugadores de 1 a 6");
        int cantidad = leer.nextInt();

        if (cantidad < 0 && cantidad > 6) {
            cantidad = 6;
        }
        for (int i = 1; i < cantidad+1; i++) {
            Jugador j = new Jugador();
            j.setId(i);
            j.setNombre("Jugador "+i);
            j.setMojado(false);
            jug.add(j);
        }
        juego.setJugadores(jug); 
        juego.setRevolver(rev.llenarRevolver());
       return juego;
    }
    public void ronda(){
        Juego juego=llenarJuego();
        for(int i=0; i<juego.getJugadores().size();i++){
            
        }
    }

}
