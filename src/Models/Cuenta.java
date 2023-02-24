package Models;

import java.util.List;

public class Cuenta {
    private String numeroCuenta;
    private String nombreCuenta;
    private List<Beneficiario> beneficiarios;
    private List<Tarjeta> tarjetas;

    public Cuenta(String numeroCuenta, String nombreCuenta, List<Beneficiario> beneficiarios, List<Tarjeta> tarjetas) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCuenta = nombreCuenta;
        this.beneficiarios = beneficiarios;
        this.tarjetas = tarjetas;
    }

    @Override
    public String toString() {
        return "\nCuenta{\n" +
                "numeroCuenta='" + numeroCuenta + '\n' +
                "nombreCuenta='" + nombreCuenta + '\n' +
                "beneficiarios=" + beneficiarios +
                "tarjetas=" + tarjetas +
                "}\n";
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public List<Beneficiario> getBeneficiarios() {
        return beneficiarios;
    }

    public void setBeneficiarios(List<Beneficiario> beneficiarios) {
        this.beneficiarios = beneficiarios;
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }
}
