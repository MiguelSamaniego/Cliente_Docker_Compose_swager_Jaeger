package com.ups.Cliente.Modelo;

import javax.persistence.*;

import java.io.Serializable;
@NamedQuery(name = "getByLevel",
        query = "SELECT c FROM Cliente c WHERE c.id >= :level")
@Entity
@Table(name = "cliente")
public class Cliente  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String identificador;
    private String nombre;
    private String apellido;

    public Cliente() {
    }

    public Cliente(int id, String identificador, String nombre, String apellido) {
        this.id = id;
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellido = apellido;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente cliente)) return false;

        return getId() == cliente.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", identificador='" + identificador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
