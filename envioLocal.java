package examenrecuperatorioPoo;

public class envioLocal extends envio{
    
    private int distanciaKm;


    public envioLocal(String codigo, String destinatario, Double costoBase, int distanciaKm){
        super(codigo, destinatario, costoBase);
        this.distanciaKm = distanciaKm;
    }

    @Override
     public String obtenerdetalles(){
        return super.obtenerdetalles() + 
        "distanciaKm:" + distanciaKm;
    }
    


}
