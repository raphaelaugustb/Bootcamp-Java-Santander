import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static double verificarSaldo(double saldoAtual, double valorSolicitado) {
        if (saldoAtual > valorSolicitado){
            saldoAtual = saldoAtual - valorSolicitado;

        }
        else{
            String saldoErro = "Saldo insuficiente";
            System.out.println(saldoErro);

        }
        return saldoAtual;
    }

    public static void main(String[] args) {
            Scanner pegarDadosUsuario = new Scanner(System.in).useLocale(Locale.US);

            double saldo = 15;
            double valorSolicitado = 22;
            double valorNecessario = valorSolicitado - saldo;

            System.out.println( "Saldo Atual: "+ saldo + "\nValor do saldo a ser alterado: ");
            saldo = pegarDadosUsuario.nextDouble();
            System.out.println("Valor Solicitado:");
            valorSolicitado = pegarDadosUsuario.nextDouble();

            double saldoAtual = verificarSaldo(saldo, valorSolicitado);
            System.out.println("Você precisa de " + valorNecessario + " para realizar essa operação."+
                    "\nSaldo Atual: " +saldoAtual + ".");

    }
}
