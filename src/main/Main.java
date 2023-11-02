package main;

import Operaciones.Resta;
import Operaciones.Suma;

public class Main {

    public static void main(String args[]) {

        Suma mensajerosuma = new Suma();
        mensajerosuma.Datos();
        mensajerosuma.SumaM();
        mensajerosuma.ResultadoSuma();
        
        System.out.println("");

        Resta mensajeroresta = new Resta();
        mensajeroresta.Datos();
        mensajeroresta.RestaM();
        mensajeroresta.ResultadoResta();

    }

}
