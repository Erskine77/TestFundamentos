package org.erskineespaderos.sistema;

import java.util.ArrayList;
import java.util.List;
import org.erskineespaderos.bean.Llamada;
import org.erskineespaderos.bean.LlamadaDepartamental;
import org.erskineespaderos.bean.LlamadaLocal;

public class Principal {
    public static void main(String args[]){
        Llamada localUno = new LlamadaLocal();
        LlamadaLocal localDos = new LlamadaLocal();
        LlamadaDepartamental llamadaDepartamentalUno = new LlamadaDepartamental();
        List<Llamada> listaLlamadas = new ArrayList<Llamada>();
        //List<Object> listaLlamadas = new ArrayList<Object>(); //Object generico
        localUno.setNumeroOrigen("123");
        localUno.setNumeroDestino("456");
        localUno.setDuracion(3.30);
        ((LlamadaLocal)localUno).setPrecio(1.15);
        localDos.setNumeroOrigen("555");
        localDos.setNumeroDestino("666");
        localDos.setDuracion(5.30);
        localDos.setPrecio(1.15);
        llamadaDepartamentalUno.setNumeroOrigen("987");
        llamadaDepartamentalUno.setNumeroDestino("654");
        llamadaDepartamentalUno.setDuracion(5.30);
        llamadaDepartamentalUno.setFranja(2);
        llamadaDepartamentalUno.setPrecioTres(2.5);
        
        listaLlamadas.add(localUno);
        listaLlamadas.add(localDos);
        listaLlamadas.add(llamadaDepartamentalUno);
        
        for (Llamada elemento : listaLlamadas){
            if(elemento instanceof LlamadaLocal){
                System.out.println("LOCAL: " + elemento + " Precio: " + elemento.calcularPrecio());
            } else if(elemento instanceof LlamadaDepartamental){
                System.out.println("DEPTO: " + elemento + " Precio: " + elemento.calcularPrecio());
            } else {
                System.out.println("Llamada no Registrada");
            }
        }        
    }
}
