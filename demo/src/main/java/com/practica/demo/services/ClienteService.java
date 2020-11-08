package com.practica.demo.services;

import com.practica.demo.model.Cliente;
import com.practica.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//gestiona la operacion del negocio
@Service
public class ClienteService implements  IclienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente findById(Integer id) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        //utilizamos el orElse, si el objeto no es ubicado nos devolvera null
        return  clienteOptional.orElse(null);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
   clienteRepository.deleteById(id);


    }
}
