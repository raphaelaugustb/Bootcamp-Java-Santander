import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidObjectException {
        Cliente venilton = new Cliente("Venilton","12312312312");
        Cliente robson = new Cliente("Robson","020753632812");
        Conta venilton_cc = new ContaCorrente(venilton);
        Conta venilton_poupanca = new ContaPoupanca(venilton);

        Conta robson_cc = new ContaCorrente(venilton);
        Conta robson_poupanca = new ContaPoupanca(venilton);
        venilton_cc.depositar(100);
        venilton_cc.transferir(150, robson_poupanca);

        venilton_cc.imprimirExtrato();
        robson_poupanca.imprimirExtrato();
        Banco santander = new Banco("Santander");
        santander.adicionarClienteBanco(venilton_cc);
        System.out.println(santander.getContas());
    }
}