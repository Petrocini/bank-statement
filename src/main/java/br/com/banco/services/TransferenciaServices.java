package br.com.banco.services;

import br.com.banco.entities.Transferencia;
import br.com.banco.repositories.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransferenciaServices {

    @Autowired
    private TransferenciaRepository repository;

    public List<Transferencia> findAll() {
        return repository.findAll();
    }

}
