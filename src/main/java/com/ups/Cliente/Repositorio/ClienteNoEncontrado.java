package com.ups.Cliente.Repositorio;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Cliente no encontrado!")
public class ClienteNoEncontrado extends RuntimeException {
    public ClienteNoEncontrado() {
    }

    public ClienteNoEncontrado(String message) {
        super(message);
    }
}