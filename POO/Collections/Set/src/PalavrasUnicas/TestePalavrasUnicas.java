package PalavrasUnicas;

public class TestePalavrasUnicas {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Raphael");
        conjuntoPalavrasUnicas.adicionarPalavra("Mateus");
        conjuntoPalavrasUnicas.adicionarPalavra("Derek");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("Derek");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
