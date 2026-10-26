package co.edu.uniquindio.poo.model;

public abstract class Envio {

    private String codigo;
    private String destinatario;
    private int pesoKg;
    private EmpresaEnvios ownedByEmpresa;

    public Envio(String codigo, String destinatario, int pesoKg) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.pesoKg = pesoKg;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public float getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(int pesoKg) {
        this.pesoKg = pesoKg;
    }

    public EmpresaEnvios getOwnedByEmpresa() {
        return ownedByEmpresa;
    }

    public void setOwnedByEmpresa(EmpresaEnvios ownedByEmpresa) {
        this.ownedByEmpresa = ownedByEmpresa;
    }

    public abstract float calcularCosto();

    @Override
    public String toString() {
        return "Envio{" +
                "codigo='" + codigo + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", pesoKg=" + pesoKg +
                '}';
    }

}
