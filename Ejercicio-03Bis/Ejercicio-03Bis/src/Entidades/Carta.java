/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Entidades.enumeraciones.Numeros;
import Entidades.enumeraciones.Palo;

/**
 *
 * @author Usuario Final
 */
public class Carta {
    private Numeros numero;
    
    private Palo palo;

    public Carta() {
    }

    public Carta(Numeros numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Numeros getNumero() {
        return numero;
    }

    public void setNumero(Numeros numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return  "numero=" + numero + ", palo=" + palo + '}';
    }
    
    
    
}
