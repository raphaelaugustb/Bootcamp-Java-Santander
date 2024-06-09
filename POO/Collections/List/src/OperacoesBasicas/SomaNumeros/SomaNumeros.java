package OperacoesBasicas.SomaNumeros;

public class SomaNumeros {
    public static void main(String[] args) {
    ListaNumeros listaNumeros = new ListaNumeros();
    listaNumeros.adicionarNumero(3);
    listaNumeros.adicionarNumero(4);
    listaNumeros.adicionarNumero(3);
        listaNumeros.adicionarNumero(20); listaNumeros.adicionarNumero(8);
        ; listaNumeros.adicionarNumero(100);



    System.out.println(listaNumeros.exibirNumeros());
    System.out.println(listaNumeros.calcularSoma());
    System.out.println(listaNumeros.encontrarMaiorNumero());
    System.out.println(listaNumeros.encontrarMenorNumero());
        System.out.println(listaNumeros.listaOrdenada());
}



}
