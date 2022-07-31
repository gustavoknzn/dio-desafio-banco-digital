package br.com.dio;

import lombok.*;

import java.util.List;

@Getter
@Setter
public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
    }

    public void listarContas() {
        contas.forEach(conta ->
                System.out.printf("Titular: %s%nNumero: %d - Agencia: %d%n", conta.cliente.getNome(), conta.getNumero(), conta.getAgencia()));
    }

}
