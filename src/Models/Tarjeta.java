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
        StringBuilder sb = new StringBuilder();
        sb.append("\nNo. Tarjeta :").append(numeroTarjeta);
        sb.append("\nNombre de la tarjeta :").append(nombreTarjeta);
        sb.append("\nCVV :").append(cvv);
        sb.append("\nFecha de vencimiento: ").append(fechaVencimiento);

        return sb.toString();
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
