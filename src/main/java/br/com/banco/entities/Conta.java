package br.com.banco.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "conta")
public class Conta implements Serializable {
    private static final long serialVersionUID = 2L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome_responsavel;

    public Conta(int id, String nome_responsavel) {
        this.id = id;
        this.nome_responsavel = nome_responsavel;
    }

    public int getId() {
        return id;
    }

    public String getNome_responsavel() {
        return nome_responsavel;
    }
}
