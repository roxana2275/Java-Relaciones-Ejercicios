/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Jugador;
import entidades.RevolverDeAgua;

/**
 *
 * @author Usuario
 */
public class jugadorServicio {
    
    public boolean disparo(RevolverDeAgua r, Jugador j){

        revolverDeAguaServicio rs = new revolverDeAguaServicio();
        if(rs.mojar(r)==true){
            j.setMojado(true);  
        }
        rs.siguienteChorro(r);
        return j.isMojado();
    }
    
}
