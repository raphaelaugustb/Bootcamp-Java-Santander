package PalavrasUnicas;


import java.util.*;

public class ConjuntoPalavrasUnicas {
    private final Set<String> conjuntoPalavras;
    public ConjuntoPalavrasUnicas(){
        this.conjuntoPalavras = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
    }
    public void removerPalavra(String palavra){

        String palavraRemover = "";
            if (conjuntoPalavras.contains(palavra)){
                conjuntoPalavras.remove(palavra);
                System.out.println("Palavra encontrada.");
            } else {
                System.out.println("Palavra não encontrada.");
            
        }
            
    }
    public void verificarPalavra(String palavra){
        String palavraVerificar = "";
        for (String p: conjuntoPalavras){
            if (p.equalsIgnoreCase(palavra)){
                palavraVerificar = p;
                break;
            } else {
                System.out.println(" Palavra não encontrada.");
            }
        }
        System.out.println("Palavra Encontrada " + palavraVerificar);
    }
    public void exibirPalavrasUnicas(){
        for (String p : conjuntoPalavras){
            System.out.println(p);
        }
    }
}
