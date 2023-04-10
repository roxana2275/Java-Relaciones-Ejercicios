/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeraciones;


/**
 *
 * @author Usuario
 */
public enum Filas {
    F_UNO(1), F_DOS(2),F_TRES(3),F_CUATRO(4),F_CINCO(5),F_SEIS(6),F_SIETE(7),F_OCHO(8);
    private int clave;

    private Filas() {
    }

    
    private Filas(int clave) {
        this.clave = clave;
    }

    public static Filas getF_UNO() {
        return F_UNO;
    }

    public static Filas getF_DOS() {
        return F_DOS;
    }

    public static Filas getF_TRES() {
        return F_TRES;
    }

    public static Filas getF_CUATRO() {
        return F_CUATRO;
    }

    public static Filas getF_CINCO() {
        return F_CINCO;
    }

    public static Filas getF_SEIS() {
        return F_SEIS;
    }

    public static Filas getF_SIETE() {
        return F_SIETE;
    }

    public static Filas getF_OCHO() {
        return F_OCHO;
    }

    public int getClave() {
        return clave;
    }

 
    
}
