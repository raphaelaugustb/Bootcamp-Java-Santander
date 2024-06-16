package com.banco;

import java.io.InvalidObjectException;

public class Main {
    public static void main(String[] args) throws InvalidObjectException {
        Cliente venilton = new Cliente("Venilton","207-547-289.96");
        Conta venilton_cc = new ContaCorrente(venilton);
        Conta venilton_poupanca = new ContaPoupanca(venilton);


        Cliente robson = new Cliente("Robson","207-547-284.96");
        Conta robson_cc = new ContaCorrente(robson);
        Conta robson_poupanca = new ContaPoupanca(robson);

        venilton_cc.depositar(150);
        venilton_cc.transferir(120, robson_cc);

        Banco santander = new Banco("Santander");
        santander.adicionarClienteBanco(venilton_cc);
        santander.adicionarClienteBanco(robson_cc);

        System.out.println(santander.getContas());
    }
}