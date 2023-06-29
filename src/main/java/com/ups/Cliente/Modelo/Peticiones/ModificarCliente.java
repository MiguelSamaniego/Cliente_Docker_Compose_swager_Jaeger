package com.ups.Cliente.Modelo.Peticiones;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModificarCliente {
    @JsonProperty
    private int id;
    @JsonProperty
    private String identificador;
    @JsonProperty
    private String nombre;
    @JsonProperty
    private String apellido;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
