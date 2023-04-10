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
public enum TipoPoliza {
    RESPONSABILIDAD_CIVIL(1,"Responsabilidad Civil"), DANIOS_TERCEROS_Y_DESTRUCCION_TOTAL(2,"Danio a tercero y destruccion total"), TODO_RIESGO(3,"Todo Riesgo");
    public int Clave;
    public String Descripcion;

    private TipoPoliza(int Clave, String Descripcion) {
        this.Clave = Clave;
        this.Descripcion = Descripcion;
    }

  
    public static TipoPoliza getRESPONSABILIDAD_CIVIL() {
        return RESPONSABILIDAD_CIVIL;
    }

    public static TipoPoliza getDANIOS_TERCEROS_Y_DESTRUCCION_TOTAL() {
        return DANIOS_TERCEROS_Y_DESTRUCCION_TOTAL;
    }

    public static TipoPoliza getTODO_RIESGO() {
        return TODO_RIESGO;
    }

    public int getClave() {
        return Clave;
    }

    public String getDescripcion() {
        return Descripcion;
    }
    
}
