package co.edu.uniquindio.poo.model;

public class EnvioExpress extends EnvioNacional {

    private boolean horasMax;

    public EnvioExpress(String codigo, String destinatario, int pesoKg, String ciudad, boolean domicilio, boolean horasMax) {
        super(codigo, destinatario, pesoKg, ciudad, domicilio);
        this.horasMax = horasMax;
    }

    public boolean isHorasMax() {
        return horasMax;
    }

    public void setHorasMax(boolean horasMax) {
        this.horasMax = horasMax;
    }

    @Override
    public float calcularCosto() {
        float costo= (float) (super.calcularCosto()*1.30);
        if(horasMax){
            costo+=5000;
        }
        return costo;
    }
}
