package co.edu.uniquindio.poo.model;

public class EnvioInternacional extends Envio{

    private String pais;
    private boolean seguro;

    public EnvioInternacional(String codigo, String destinatario, int pesoKg, String pais, boolean seguro) {
        super(codigo, destinatario, pesoKg);
        this.pais = pais;
        this.seguro = seguro;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    @Override
    public float calcularCosto(){
        float costo= 15000+9000*getPesoKg();
        if(seguro){
            costo+=20000;
        }
        return costo;
    }
}
