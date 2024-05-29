import java.util.Scanner;

public class Mercado {
    public static int valorMesada (){
        Scanner usuarioMesada = new Scanner(System.in);
        System.out.println("Insira o valor da Mesada:");
        return usuarioMesada.nextInt();
    }
    public static int valorProduto (){
        Scanner usuarioProduto = new Scanner(System.in);
        System.out.println("Insira o valor do produto:");
        return usuarioProduto.nextInt();
    }

    public static void verificarProduto(int mesada, int produto ){
        if (mesada >= 0 ){
            String mensagemComprado = "Comprei um produto de " + produto+  " reais." + " Valor restante da mesada: " +
                    mesada + " reais";
            System.out.println(mensagemComprado);

        } else {
            int mesadaAtual = mesada + produto;
            int produtoErro = (mesadaAtual - produto)*-1;
               String mensagemErro= "Valor do Produto Inválido \nO produto de "+ produto + " reais custa " + produtoErro +
                       " reais a mais que a sua mesada de " + mesadaAtual + " reais";
            System.out.println(mensagemErro);
            return;
        }
    }
    public static void main(String[] args) {
        int mesada = valorMesada();
        while (
            mesada > 0
        ){
            int produto = valorProduto();
            mesada = mesada - produto;
            verificarProduto(mesada, produto);
        }

    }
}

