package OperacoesBasicas.SomaNumeros;
import java.util.*;


public class ListaNumeros implements Comparable<Integer>{
    @Override
    public int compareTo(Integer i) {
       for (int numero : listaNumeros){
           if (numero < i ){
               return -1;

           }
           if(numero > i){
               return 1;
           }
        }
       return 0;
    }
    private final List<Integer> listaNumeros;
    private List<Integer> listaOrdenada;
    public ListaNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
    listaNumeros.add(numero);
    }
    public int calcularSoma(){
       int somaNumeros = 0;
            for (Integer i : listaNumeros){
                somaNumeros += i;
             }
            return somaNumeros;
    }
    public List<Integer> listaOrdenada() {
        listaOrdenada = listaNumeros;
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }
    public int encontrarMaiorNumero(){
      return listaOrdenada().getLast();
    }
    public int encontrarMenorNumero(){
        return listaOrdenada().getFirst();
    }
    public List<Integer> exibirNumeros(){

        return listaNumeros;
    }

}
