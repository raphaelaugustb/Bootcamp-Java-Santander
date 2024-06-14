package Mercado;

import java.util.*;

public class EstoqueProdutos {
    Map<Long, Produto> estoqueProdutos;
    public EstoqueProdutos(){
        this.estoqueProdutos = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutos.put(cod, new Produto(nome, quantidade, preco));
    }
    public Map<Long, Produto> exibirProdutos(){
     return estoqueProdutos;
    }
    public double calcularValorTotalEstoque(){
        double valorEstoque = 0;
        for (Produto p : estoqueProdutos.values()){
            valorEstoque += p.getQuantidade() * p.getPreco();
        }
        return valorEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaiorValor = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoqueProdutos.values()){
            if (p.getPreco() > maiorPreco){
                produtoMaiorValor = p;
                maiorPreco = p.getPreco();
                break;
            }
        }
        return produtoMaiorValor;
    }
    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueProdutos.values()) {
            if (p.getPreco() < menorPreco) {
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    public Produto pesquisarProduto(long cod){
        Produto produtoSelecionado = null;
        if (estoqueProdutos.get(cod) == null){
            System.out.println("Produto nao Encontrado");
            return null;
        }else {
            System.out.println("Produto Encontrado");
            produtoSelecionado = estoqueProdutos.get(cod);
            return produtoSelecionado;
        }
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();
        System.out.println("Produto Selecionado" + estoque.pesquisarProduto(1L));
        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

    }
    }

