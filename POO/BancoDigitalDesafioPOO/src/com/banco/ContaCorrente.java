package com.banco;

import java.io.InvalidObjectException;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) throws InvalidObjectException {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}
