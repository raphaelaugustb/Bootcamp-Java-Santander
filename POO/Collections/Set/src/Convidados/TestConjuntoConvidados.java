package Convidados;
public class TestConjuntoConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado(" Raphael", 23);
        conjuntoConvidados.adicionarConvidado("Mateus", 20);
        System.out.println(conjuntoConvidados.contarConvidado());
        conjuntoConvidados.removerConvidadoPorCodigoConvite(20);
        System.out.println(conjuntoConvidados.contarConvidado());
    }
}
