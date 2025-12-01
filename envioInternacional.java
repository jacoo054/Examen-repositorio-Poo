package examenrecuperatorioPoo;

public class envioInternacional extends envio{

    private double impuestoAduana;

    public envioInternacional(String codigo, String destinatario, Double costoBase, Double impuestoAduana){
        super(codigo, destinatario, destinatario);
        this.impuestoAduana = impuestoAduana;
    }

    @Override
     public String obtenerdetalles(){
        return super.obtenerdetalles()+
        "impuestoAduana:" + impuestoAduana;
    }

    public double getCostoTotal(){
        return getCostoBase() + impuestoAduana;

    }
    
}
