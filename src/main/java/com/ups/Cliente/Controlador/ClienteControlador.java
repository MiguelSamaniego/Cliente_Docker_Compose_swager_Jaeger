package com.ups.Cliente.Controlador;

import com.ups.Cliente.Cliente.ClienteServicio;
import com.ups.Cliente.Modelo.Cliente;
import com.ups.Cliente.Modelo.Peticiones.CrearCliente;
import com.ups.Cliente.Modelo.Peticiones.ModificarCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
public class ClienteControlador {

    private ClienteServicio clienteServicio;

    @Autowired
    public void setClienteRepositorio(ClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio;
    }

    @PostMapping("/create")
    public ResponseEntity<Cliente> createPersona(@RequestBody CrearCliente crearCliente) {

        Cliente cliente = new Cliente();
        cliente.setIdentificador(crearCliente.getIdentificador());
        cliente.setApellido(crearCliente.getApellido());
        cliente.setNombre(crearCliente.getNombre());


        clienteServicio.Crear(cliente);
        return ResponseEntity.ok(cliente);
    }

    @GetMapping("/cliente")
    public ResponseEntity<List<Cliente>> getAllPersonas() {
        List<Cliente> personaList = clienteServicio.findAll();
        return new ResponseEntity<List<Cliente>>(personaList, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{codigo}")
    public ResponseEntity<String> delitePersona(@PathVariable int codigo) {

        clienteServicio.Eliminar(codigo);
        return ResponseEntity.ok("Cliente Eliminado");
    }

    @PutMapping("/modificar")
    public ResponseEntity<String> updatePersona(@RequestBody ModificarCliente modificarCliente) {

        Optional<Cliente> Datos = clienteServicio.findId(modificarCliente.getId());
        if (Datos.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        Cliente cliente = Datos.get();
        cliente.setApellido(modificarCliente.getApellido());
        cliente.setNombre(modificarCliente.getNombre());

        clienteServicio.Crear(cliente);
        return ResponseEntity.ok("Cliente Actualizado");
    }


    @RequestMapping("/show")
    public String show(){
        return "<h1>Hola cliente</h1>";
    }

}