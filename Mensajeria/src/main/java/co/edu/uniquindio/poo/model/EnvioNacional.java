package co.edu.uniquindio.poo.model;

public class EnvioNacional extends Envio{

    private String ciudad;
    private boolean domicilio;

    public EnvioNacional(String codigo, String destinatario, int pesoKg, String ciudad, boolean domicilio) {
        super(codigo, destinatario, pesoKg);
        this.ciudad = ciudad;
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public boolean isDomicilio() {
        return domicilio;
    }

    public void setDomicilio(boolean domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public float calcularCosto() {
        float costo= 6000+2000*getPesoKg();
        if(domicilio){
            costo+=3000;
        }
        return costo;
    }
}
