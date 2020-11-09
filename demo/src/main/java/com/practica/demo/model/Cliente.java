
package com.practica.demo.model;
import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idCliente;
    @Column(name = "nombre", length = 200)
    private String name;

    @Column(name = "apellido",  length = 200)
    private  String apellido;

    @Column(name = "documento",  length = 200)
    private String documento;

    @Column(name = "telefono",  length = 200)
    private String telefono;

    @Column(name = "sexo", length = 200)
    private String sexo;

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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}