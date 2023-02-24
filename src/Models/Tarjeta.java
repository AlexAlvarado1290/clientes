package Models;

public class Tarjeta {
    private String numeroTarjeta;
    private String nombreTarjeta;
    private int cvv;
    private String fechaVencimiento;

    public Tarjeta(String numeroTarjeta, String nombreTarjeta, int cvv, String fechaVencimiento) {
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTarjeta = nombreTarjeta;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "\nTarjeta{\n" +
                "numeroTarjeta='" + numeroTarjeta + '\n' +
                ", nombreTarjeta='" + nombreTarjeta + '\n' +
                ", cvv=" + cvv +
                ", fechaVencimiento='" + fechaVencimiento + '\n' +
                "}\n";
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
