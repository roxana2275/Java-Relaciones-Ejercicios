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
public enum Columnas {
    A(1),B(2),C(3),D(4),E(5),F(6);
    private int clave;

    private Columnas() {
    }

    private Columnas(int clave) {
        this.clave = clave;
    }

    public static Columnas getA() {
        return A;
    }

    public static Columnas getB() {
        return B;
    }

    public static Columnas getC() {
        return C;
    }

    public static Columnas getD() {
        return D;
    }

    public static Columnas getE() {
        return E;
    }

    public static Columnas getF() {
        return F;
    }

    public int getClave() {
        return clave;
    }


    
}
