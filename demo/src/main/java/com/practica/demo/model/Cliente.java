
package com.practica.demo.model;
import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idCliente;
    @Column(name = "nombre", length = 20)
    private String name;

    @Column(name = "apellido",  length = 20)
    private  String apellido;

    @Column(name = "direccion",  length = 20)
    private String direccion;

    @Column(name = "telefono",  length = 20)
    private String telefono;

    @Column(name = "email", length = 20)
    private String email;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}