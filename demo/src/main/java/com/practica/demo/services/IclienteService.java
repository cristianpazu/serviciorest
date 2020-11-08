package com.practica.demo.services;

import com.practica.demo.model.Cliente;

import java.util.List;

public interface IclienteService {
    Cliente create(Cliente cliente);

    Cliente update(Cliente cliente);

    Cliente findById(Integer id);

    List<Cliente> findAll();
    void delete(Integer id);
}
