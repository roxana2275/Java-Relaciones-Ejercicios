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
public enum TipoCarroceria {
    SEDAN(1,"Sedan"), SUV(2,"Suv"), CONVERTIBLE(3,"Convertible"), DOBLE_CABINA(4,"Doble Cabina"), FURGON(5,"Furgon"), HATCHBACK(6,"Hatchback"), COUPE(7,"Coupe"), BYD(8,"Byd"), STATION_WAGON(9,"Station Wagon");
    public int Clave;
    public String descripcion;

    private TipoCarroceria(int Clave, String descripcion) {
        this.Clave = Clave;
        this.descripcion = descripcion;
    }

  

    public static TipoCarroceria getSEDAN() {
        return SEDAN;
    }

    public static TipoCarroceria getSUV() {
        return SUV;
    }

    public static TipoCarroceria getCONVERTIBLE() {
        return CONVERTIBLE;
    }

    public static TipoCarroceria getDOBLE_CABINA() {
        return DOBLE_CABINA;
    }

    public static TipoCarroceria getFURGON() {
        return FURGON;
    }

    public static TipoCarroceria getHATCHBACK() {
        return HATCHBACK;
    }

    public static TipoCarroceria getCOUPE() {
        return COUPE;
    }

    public static TipoCarroceria getBYD() {
        return BYD;
    }

    public static TipoCarroceria getSTATION_WAGON() {
        return STATION_WAGON;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getClave() {
        return Clave;
    }
    
}
