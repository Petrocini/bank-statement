package br.com.banco.config;

import br.com.banco.entities.Conta;
import br.com.banco.entities.Transferencia;
import br.com.banco.repositories.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.Date;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private TransferenciaRepository transferenciaRepository;

    @Override
    public void run(String... args) throws Exception {
        Conta c1 = new Conta(1, "Fulano");
        Conta c2 = new Conta(2, "Sicrano");

        Transferencia t1 = new Transferencia(1, new Date(), 30895.46, "DEPOSITO", null, 1);
        Transferencia t2 = new Transferencia(2, new Date(), 30895.46, "DEPOSITO", null, 2);

        transferenciaRepository.saveAll(Arrays.asList(t1, t2));

    }
}
