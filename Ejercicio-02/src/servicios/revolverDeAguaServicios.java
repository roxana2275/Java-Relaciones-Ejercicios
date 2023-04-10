/*
 Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package servicios;

import entidades.RevolverDeAgua;

/**
 *
 * @author Usuario
 */
public class revolverDeAguaServicios {
    RevolverDeAgua rev = new RevolverDeAgua();
    public RevolverDeAgua llenarRevolver(){
        
        rev.setPosicionActual((int)(Math.random() * 6) + 1);
        rev.setPosicionAgua((int)(Math.random() * 6) + 1);
        return rev;
    } 
    public boolean mojar(){
        boolean mojar;
        if(rev.getPosicionActual()==rev.getPosicionAgua()){
            mojar = true;
        }else{
            mojar=false;
            siguienteChorro();
        }
        return mojar;
    }
    
    public void siguienteChorro(){
        
        if(rev.getPosicionActual()==6){
            rev.setPosicionActual(1);
        }else{
            rev.setPosicionActual(rev.getPosicionActual()+1);
        }
        
    }
    
    public void mostrarRevolver(){
        System.out.println(rev.toString());
        
    }
}
