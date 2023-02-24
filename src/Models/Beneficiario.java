package Models;

public class Beneficiario {

    private String nombreBeneficiario;
    private String DPIBeneficiario;
    private String direccionBeneficiario;

    public Beneficiario(String nombreBeneficiario, String DPIBeneficiario, String direccionBeneficiario) {
        this.nombreBeneficiario = nombreBeneficiario;
        this.DPIBeneficiario = DPIBeneficiario;
        this.direccionBeneficiario = direccionBeneficiario;
    }

    @Override
    public String toString() {
        return "\nBeneficiario{\n" +
                "nombreBeneficiario='" + nombreBeneficiario + '\n' +
                ", DPIBeneficiario='" + DPIBeneficiario + '\n' +
                ", direccionBeneficiario='" + direccionBeneficiario + '\n' +
                "}\n";
    }

    public String getNombreBeneficiario() {
        return nombreBeneficiario;
    }

    public void setNombreBeneficiario(String nombreBeneficiario) {
        this.nombreBeneficiario = nombreBeneficiario;
    }

    public String getDPIBeneficiario() {
        return DPIBeneficiario;
    }

    public void setDPIBeneficiario(String DPIBeneficiario) {
        this.DPIBeneficiario = DPIBeneficiario;
    }

    public String getDireccionBeneficiario() {
        return direccionBeneficiario;
    }

    public void setDireccionBeneficiario(String direccionBeneficiario) {
        this.direccionBeneficiario = direccionBeneficiario;
    }
}
