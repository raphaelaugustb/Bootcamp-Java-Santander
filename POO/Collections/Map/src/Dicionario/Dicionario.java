package Dicionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Dicionario {
    Map<String, String> dicionario;
    public Dicionario() {
        this.dicionario = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        dicionario.remove(palavra);
    }
    public void exibirPalavras(){
        for (Object p: dicionario.values()){
            System.out.println(p);
        }
    }
    public String pesquisarPorPalavra(String palavra){
        String palavraSelecionado = dicionario.get(palavra);
        return palavraSelecionado;
    }
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        dicionario.exibirPalavras();

        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
