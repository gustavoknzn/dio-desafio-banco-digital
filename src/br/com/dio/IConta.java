package br.com.dio;

import br.com.dio.entity.Conta;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta destino);

    void imprimirExtrato();
}
