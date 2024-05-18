import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void verificarSaldo(double saldoAtual, double valorSolicitado) {
        if (saldoAtual > valorSolicitado){
            saldoAtual = saldoAtual - valorSolicitado;
            String saldoRealizado = "Saque de: " + valorSolicitado + " reais realizado." + "\nSaldo Atual: " +saldoAtual + " reais.";
            System.out.println(saldoRealizado);
        }
        else{
            double valorNecessario = valorSolicitado - saldoAtual;
            String saldoErro = "Saldo insuficiente: " + "Você precisa de " + valorNecessario + " reais para realizar essa operação. "
                    + "\nSaldo Atual: " +saldoAtual + " reais.";
            System.out.println(saldoErro);
        }
    }

    public static void main(String[] args) {
            Scanner pegarDadosUsuario = new Scanner(System.in).useLocale(Locale.US);
            double saldo = 15;
            double valorSolicitado;
            System.out.println( "Saldo Atual: "+ saldo + " reais. \nValor do saldo a ser alterado: ");
            saldo = pegarDadosUsuario.nextDouble();
            System.out.println("Valor Solicitado:");
            valorSolicitado = pegarDadosUsuario.nextDouble();
            verificarSaldo(saldo, valorSolicitado);

    }
}
