/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.RevolverDeAgua;

/**
 *
 * @author Usuario
 */
public class revolverDeAguaServicio {
    
    
    public RevolverDeAgua llenarRevolver(){
        RevolverDeAgua rv = new RevolverDeAgua();
        rv.setPosicionActual((int)(Math.random() * 6) + 1);
        rv.setPosicionDeAgua((int)(Math.random() * 6) + 1);
        return rv;
    }
    
    public boolean mojar(RevolverDeAgua rv){
        
        boolean mojado;
        if(rv.getPosicionActual()==rv.getPosicionDeAgua()){
            System.out.println(rv.getPosicionActual());
            System.out.println(rv.getPosicionDeAgua());
            mojado=true;
        }else{
            mojado=false;
        }
        return mojado;
    }
    
    public void siguienteChorro(RevolverDeAgua rv){
        
        if(rv.getPosicionActual()==6){
            rv.setPosicionActual(1);
        }else{
             rv.setPosicionActual(rv.getPosicionActual()+1);
        }
    }
    
    public void imprimir(RevolverDeAgua rv){
        System.out.println(rv.toString());
    }
}
