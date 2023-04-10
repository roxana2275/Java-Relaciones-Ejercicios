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
public enum Numeros {
UNO(1) , DOS(2) ,TRES(3) ,CUATRO(4) ,CINCO(5), SEIS(6) ,SIETE(7),DIEZ(10), ONCE(11) ,DOCE(12) ;
    
    private int codigo;

    public static Numeros getUNO() {
        return UNO;
    }

    public static Numeros getDOS() {
        return DOS;
    }

    public static Numeros getTRES() {
        return TRES;
    }

    public static Numeros getCUATRO() {
        return CUATRO;
    }

    public static Numeros getCINCO() {
        return CINCO;
    }

    public static Numeros getSEIS() {
        return SEIS;
    }

    public static Numeros getSIETE() {
        return SIETE;
    }

    public static Numeros getDIEZ() {
        return DIEZ;
    }

    public static Numeros getONCE() {
        return ONCE;
    }

    public static Numeros getDOCE() {
        return DOCE;
    }


    private Numeros() {
    }

    private Numeros(int codigo) {
        this.codigo = codigo;
    }
 
    public int getCodigo() {
        return codigo;
    }


}
