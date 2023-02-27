package Models;

import java.util.List;

public class Cliente {
    private String nombreCliente;
    private String apellidoCliente;
    private List<Cuenta> Cuentas;

    public Cliente(String nombreCliente, String apellidoCliente, List<Cuenta> cuentas) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.Cuentas = cuentas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Nombre del cliente :").append(nombreCliente);
        sb.append("\n").append("Apellido del cliente:").append(apellidoCliente).append("\n");
        for (Cuenta cuenta: Cuentas){
            sb.append("\u001B[32m").append("Cuentas :").append(cuenta.toString()).append("\n");
        }
        sb.append("\u001B[0m");
        return sb.toString();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public List<Cuenta> getCuentas() {
        return Cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.Cuentas = cuentas;
    }
}
