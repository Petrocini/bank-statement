package br.com.banco.entities;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "transferencia")
public class Transferencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date data_transferencia;
    private double valor;
    private String tipo;
    private String nome_operador_transacao;
    private Conta conta_id;

    public Transferencia(int id, Date data_transferencia, double valor, String tipo, String nome_operador_transacao, Conta conta_id) {
        this.id = id;
        this.data_transferencia = data_transferencia;
        this.valor = valor;
        this.tipo = tipo;
        this.nome_operador_transacao = nome_operador_transacao;
        this.conta_id = conta_id;
    }

    public int getId() {
        return id;
    }

    public Date getData_transferencia() {
        return data_transferencia;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome_operador_transacao() {
        return nome_operador_transacao;
    }

    public Conta getConta_id() {
        return conta_id;
    }
}
