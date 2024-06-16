package com.banco;

import com.banco.utils.VerificarCliente;

import java.io.InvalidObjectException;

public class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    private VerificarCliente verificarCliente = new VerificarCliente();

    public Conta(Cliente cliente) throws InvalidObjectException {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente =  verificarCliente.cliente(cliente);

    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
    private boolean verificarSaldo(double valor){
        if (this.saldo >= valor){
            return true;
        } else {
            throw new ArithmeticException("Saldo Inválido");
        }
    }
    @Override
    public void sacar(double valor) {
        if (verificarSaldo(valor)){
            saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (verificarSaldo(valor)){
            this.saldo = saldo - valor;
            contaDestino.depositar(valor);
        }
    }

    @Override
    public void imprimirExtrato() {
                    
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
