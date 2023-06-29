package com.ups.Cliente.Modelo.Peticiones;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CrearCliente {
    @JsonProperty
    private String identificador;
    @JsonProperty
    private String nombre;
    @JsonProperty
    private String apellido;
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
