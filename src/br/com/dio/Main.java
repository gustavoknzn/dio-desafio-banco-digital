package br.com.dio;

import br.com.dio.entity.*;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("Banana Bank");
		Cliente cliente = new Cliente("Gustavo");

		Conta contaCorrente = new ContaCorrente(cliente);
		Conta contaPoupanca = new ContaPoupanca(cliente);

		banco.setContas(Arrays.asList(contaCorrente, contaPoupanca));

//		contaCorrente.imprimirExtrato();
//		contaPoupanca.imprimirExtrato();

		banco.listarContas();
	}
}
