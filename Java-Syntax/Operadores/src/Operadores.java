//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Operadores {
    public static void main(String[] args) {

        int multiplicacao = 2*2;
        int divisao = 1/2;
        int soma = 1+1;
        int subtracao = 2-1;

        // ++ Incrementa 1 a unidade / -- Decrementa 1 a unidade
        // ! operador de negacao / != diferente ! =
        // ? verdadeiro / : falso
        // && "e" / || "ou"

        // Exemplo
        int a = 5;
        int b = 6;

       String resultado = a==b ? "verdadeiro" : "falso";
       int numero1 = 1;
       int numero2 = 1;
       boolean simNAO = numero1 == numero2;
       String resultadoNumeros = numero1==numero2 ? "Verdadeiro" : "Falso";
       System.out.print("numero1 é igual ao número2? " + resultadoNumeros);
    }
}