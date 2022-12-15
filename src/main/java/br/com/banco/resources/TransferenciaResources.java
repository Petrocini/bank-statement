package br.com.banco.resources;

import br.com.banco.entities.Conta;
import br.com.banco.entities.Transferencia;
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

    @GetMapping
    public ResponseEntity<List<Transferencia>> findTransferencias() {
        List<Transferencia> transferencias = new ArrayList<>();
        transferencias.add(new Transferencia(1, new Date(), 10, "SAQUE", null, new Conta( 2, "Lucas Petrocini")));
        return ResponseEntity.ok().body(transferencias);
    }

}
