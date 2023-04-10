/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compartadores;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.Comparator;



/**
 *
 * @author Usuario Final
 */
public class Comparador {

  public static Comparator<Carta> ordenarPorPalo =  new Comparator<Carta>() {
      @Override
      public int compare(Carta t, Carta t1) {
          return t.getPalo().getCodigo() - t1.getPalo().getCodigo();
      }
  };
    public static Comparator<Carta> ordenarPorNumero =  new Comparator<Carta>() {
      @Override
      public int compare(Carta t, Carta t1) {
          return t.getNumero().getCodigo() - t1.getNumero().getCodigo();
      }
  };
   
    
}
