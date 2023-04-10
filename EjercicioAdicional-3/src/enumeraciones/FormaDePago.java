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
public enum FormaDePago {
    VISA(1,"Visa"), MASTERCARD(2,"Mastercard"),PAGOS_LINK(3,"Pagos Link"),PAGO_MIS_CUENTAS(4,"Pago Mis Cuentas"), EFECTIVO(5,"Efectivo");
    
    public int Clave;
    public String Descripcion;

    private FormaDePago(int Clave, String Descripcion) {
        this.Clave = Clave;
        this.Descripcion = Descripcion;
    }

  

    public static FormaDePago getVISA() {
        return VISA;
    }

    public static FormaDePago getMASTERCARD() {
        return MASTERCARD;
    }

    public static FormaDePago getPAGOS_LINK() {
        return PAGOS_LINK;
    }

    public static FormaDePago getPAGO_MIS_CUENTAS() {
        return PAGO_MIS_CUENTAS;
    }

    public static FormaDePago getEFECTIVO() {
        return EFECTIVO;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getClave() {
        return Clave;
    }
    

}
