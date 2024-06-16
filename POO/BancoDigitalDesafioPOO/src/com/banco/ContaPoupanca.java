package com.banco;

import java.io.InvalidObjectException;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) throws InvalidObjectException {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}