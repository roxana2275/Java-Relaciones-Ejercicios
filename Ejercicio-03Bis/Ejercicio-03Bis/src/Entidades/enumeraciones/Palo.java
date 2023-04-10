/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.enumeraciones;

/**
 *
 * @author Usuario Final
 */
public enum Palo {
    // un palo (espadas, bastos, oros y copas)
    ESPADA(3),BASTOS(1),OROS(4),COPAS(2);
    
    private int codigo;

    private Palo() {
    }

    private Palo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static Palo getESPADA() {
        return ESPADA;
    }

    public static Palo getBASTOS() {
        return BASTOS;
    }

    public static Palo getOROS() {
        return OROS;
    }

    public static Palo getCOPAS() {
        return COPAS;
    }
 
    
    
}
