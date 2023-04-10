/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg02bis;

import entidades.Jugador;
import entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.juegoServicio;
import servicios.revolverDeAguaServicio;

/**
 *
 * @author Usuario
 */
public class Ejercicio02Bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        ArrayList<Jugador> jugadores = new ArrayList();
        
        System.out.println("Ingrese la cantidad de jugadores");
        int cantidad= leer.nextInt();
        if(cantidad<0 && cantidad>6){
            cantidad=6;
        }
        
        for (int i = 0; i < cantidad; i++) {
            Jugador j = new Jugador();
            j.setId(i+1);
            j.setNombre("Jugador "+(i+1));
            j.setMojado(false);
            jugadores.add(j);
            
        }
        
        revolverDeAguaServicio rs = new revolverDeAguaServicio();
        RevolverDeAgua r = rs.llenarRevolver();
        
        rs.imprimir(r);
        
        juegoServicio js = new juegoServicio();
        js.llenarJuego(jugadores, r);
//        js.imprimirJuego();
        js.siguienteRonda();
    }
    
}
