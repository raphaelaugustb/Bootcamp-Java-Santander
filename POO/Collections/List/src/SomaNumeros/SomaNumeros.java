package List.OperacoesBasicas.SomaNumeros;

import java.util.*;

public class SomaNumeros {
    public static ListaNumeros listaNumeros = new ListaNumeros();

    static List<Integer> listaDescrescente = listaNumeros.listaOrdenadaDecrescente();
    static List<Integer> listaAscendente = listaNumeros.listaOrdenadaAscendente();

    static int calcularSoma = listaNumeros.calcularSoma();

    static int maiorNumero = listaNumeros.encontrarMaiorNumero();
    static int menorNumero = listaNumeros.encontrarMenorNumero();

    public static void main(String[] args) {

        listaNumeros.adicionarNumero(3);
        listaNumeros.adicionarNumero(4);
        listaNumeros.adicionarNumero(3);
        listaNumeros.adicionarNumero(20);
        listaNumeros.adicionarNumero(8);
        listaNumeros.adicionarNumero(100);

        System.out.println(calcularSoma);
        System.out.println(maiorNumero);
        System.out.println(menorNumero);
        System.out.println(listaAscendente);
        System.out.println(listaDescrescente);
    }


}
