package examenrecuperatorioPoo;

import examenPoo2.reserva;

public class gestorEnvios {
    
    private envio[] envios;
    private int contador;


    public gestorEnvios(int capacidad){
    envios = new envio[capacidad];
    contador = 0;
    }

    public void agregarEnvio(envio envio){
        envios [contador] = envio;
        contador += 1;
    }
    public envio[] getEnvios(){
        return envios;
    }


}
