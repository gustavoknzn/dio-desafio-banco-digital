package br.com.dio;

import lombok.*;

@Getter
@Setter
public class Cliente {

    public Cliente(String nome) {
        this.nome = nome;
    }

    private String nome;
}
