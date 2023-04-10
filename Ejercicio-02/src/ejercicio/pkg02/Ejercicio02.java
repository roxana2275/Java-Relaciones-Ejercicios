/*
 Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja.

 */
package ejercicio.pkg02;

import entidades.Jugador;
import entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Jugador>jugadores = new ArrayList<>();
        RevolverDeAgua revAgua = new RevolverDeAgua();
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de jugadores de 1 a 6");
        int cantidad = leer.nextInt();
        
        if(cantidad<0 && cantidad>6){
            cantidad=6;
        }
        for (int i = 1; i < cantidad+1; i++) {
                Jugador j=new Jugador();
                j.setId(i);
                j.setNombre("Jugador "+i);
                j.setMojado(false);
                jugadores.add(j);
            }
    
    
    }
    
}
