package com.practica.demo.controller;

import com.practica.demo.exception.exceptions;
import com.practica.demo.model.Cliente;
import com.practica.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll(){
        return  new ResponseEntity<>(clienteService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente){
        return new ResponseEntity<>(clienteService.create(cliente), HttpStatus.CREATED);
    }
    @PutMapping
    public  ResponseEntity<Object> update(@RequestBody Cliente cliente){
        return  new ResponseEntity<>(clienteService.update(cliente), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente>  finById(@PathVariable("id") Integer idcliente){
        Cliente cliente = clienteService.findById(idcliente);
        if(cliente== null){
            throw new exceptions("el cliente no encontrado");
        }

        return new ResponseEntity<>(cliente, HttpStatus.OK) ;


    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object>  delete(@PathVariable("id")  Integer idcliente) throws Exception {
       Cliente cliente = clienteService.findById(idcliente);
           if(cliente== null){
               throw new exceptions("el cliente no existe o fue eliminado");
           }

        clienteService.delete(idcliente);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

}
