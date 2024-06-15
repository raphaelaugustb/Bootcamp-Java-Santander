import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidObjectException {
        Cliente venilton = new Cliente("Venilton","07211839724");


        Conta Veniltoncc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        Veniltoncc.depositar(100);
        Veniltoncc.transferir(100, poupanca);

        Veniltoncc.imprimirExtrato();
        poupanca.imprimirExtrato();
        Banco santander = new Banco("Santander");
        santander.adicionarClienteBanco(Veniltoncc);
        System.out.println(santander.getContas());
    }
}