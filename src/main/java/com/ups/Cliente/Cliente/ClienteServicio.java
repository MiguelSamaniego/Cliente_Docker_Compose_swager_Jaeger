package com.ups.Cliente.Cliente;

import com.ups.Cliente.Modelo.Cliente;
import com.ups.Cliente.Repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicio {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public List<Cliente> findAll() {
        return (List<Cliente>) clienteRepositorio.findAll();
    }

    public Optional findId(int codigo) {
        return (Optional) clienteRepositorio.findById(codigo);
    }

    public void Crear(Cliente cliente) {
        clienteRepositorio.save(cliente);
    }

    public List<String> Nombres() {
        return clienteRepositorio.finallNombres();
    }

    public Cliente buscaIdCliente(String cedula) {
        return clienteRepositorio.buscaIDCliente(cedula);
    }

    public void Eliminar(int codigo) {
        clienteRepositorio.deleteById(codigo);
    }
}