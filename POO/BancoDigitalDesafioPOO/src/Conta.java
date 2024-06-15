import java.io.InvalidObjectException;
import java.util.*;

public class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public boolean verificarCpf(Cliente cliente){
        if (cliente.getCpf().length() > 10){
            return true;
        } else {
            throw new IllegalArgumentException("Cpf Inválido");
        }
    }
    public boolean verificarNome(Cliente cliente){
        if (cliente.getNome().matches("[A-z]*")){
            return true;
        } else {
            throw new IllegalArgumentException("Nome Invalido");
        }
    }
    public Cliente verificarClinte(Cliente cliente) throws InvalidObjectException {
       if (verificarCpf(cliente) && verificarNome(cliente)){
            return cliente;
       } else {
           throw new InvalidObjectException("Cliente Inválido");
       }
    }
    public Conta(Cliente cliente) throws InvalidObjectException {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = verificarClinte(cliente);

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

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
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
