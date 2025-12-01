package examenrecuperatorioPoo;

public class envio {
    private String codigo;
    private String destinatario;
    private String costoBase;

    public envio(String codigo, String destinatario, String costoBase){
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.costoBase = costoBase;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setCostoBase(String costoBase) {
        this.costoBase = costoBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getCostoBase() {
        return costoBase;
    }

    public String obtenerdetalles(){
        return "codigo:" + codigo + 
        "destinatario:" + destinatario +
        "costoBase:" + costoBase;
    }
}
