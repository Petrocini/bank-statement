package br.com.banco.resources;

import br.com.banco.entities.Conta;
import br.com.banco.entities.Transferencia;
import br.com.banco.services.TransferenciaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/transferencias")
public class TransferenciaResources {

    @Autowired
    private TransferenciaServices services;

    @GetMapping
    public ResponseEntity<List<Transferencia>> findTransferencias() {
        List<Transferencia> transferencias = services.findAll();
        return ResponseEntity.ok().body(transferencias);
    }

}
