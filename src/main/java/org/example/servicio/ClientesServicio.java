package org.example.servicio;


import org.example.entidades.Cliente;
import org.example.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public List<Cliente> listarClientes(){

        return clienteRepositorio.findAll();

    }

    public Cliente agregarCliente(Cliente cliente) {

        return clienteRepositorio.save(cliente);
    }

    public Cliente editarCliente(Integer id) {

        return clienteRepositorio.findById(id).get();
    }

    public Cliente actualizarCliente(Cliente cliente) {

        return clienteRepositorio.save(cliente);
    }

    public void eliminarCliente(Integer id) {

        clienteRepositorio.deleteById(id);
    }
}
