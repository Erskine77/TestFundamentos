package org.erskineespaderos.bean;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class LlamadaLocal extends Llamada {
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public double calcularPrecio(){
       double result = 0;
       result = this.getPrecio() * this.getDuracion();              
       return result;
    }
    
    public String toString(){
       return "Numero origen: " + this.getNumeroOrigen() + 
               " Numero destino: " + this.getNumeroDestino();
   }
}
