

import java.util.Scanner;

public class SimulacaoBancaria {
    public static boolean verificarSaldo(double saldo, double saque) {
        boolean realizarSaque;
        if (saldo > saque) {
            System.out.println("Você sacou: " + saque);
             realizarSaque = true;
        } else {
            System.out.println("Saldo insuficiente.");
            realizarSaque = false;
        }
        return realizarSaque;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("""
                    Opções disponíveis na sua conta:
                    1.Depositar
                    2.Sacar
                    3.Consultar Saldo
                    0.Encerrar"""
            );
            int opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o Saldo a ser depositado:");
                    saldo = scanner.nextInt();
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Valor do saque:");
                        double saque = scanner.nextInt();
                        boolean realizarSaque = verificarSaldo(saldo, saque);
                        if(realizarSaque){
                            saldo = saldo - saque;
                            System.out.println("Saldo atual: " + saldo);
                        }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
