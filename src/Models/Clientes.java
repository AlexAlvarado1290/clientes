package Models;

import java.util.List;

public class Clientes {

    public List<Cliente> clientes;

    public Clientes(List<Cliente> clienteList) {
        this.clientes = clienteList;
    }

    public List<Cliente> getClienteList() {
        return clientes;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clientes = clienteList;
    }
}
