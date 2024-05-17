
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
            double saldo = 15;
            double valorSolicitado = 22;
            double saldoAtual = verificarSaldo(saldo, valorSolicitado);
            System.out.println(saldoAtual);
        }
}
