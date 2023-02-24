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
        return "\nCliente{\n"+
                "nombreCliente='" + nombreCliente + '\n' +
                "apellidoCliente='" + apellidoCliente + '\n' +
                "Cuentas=" + Cuentas +
                "}\n";
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
