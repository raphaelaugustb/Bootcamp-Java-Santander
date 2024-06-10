package List.OperacoesBasicas.SomaNumeros;
import java.util.*;

import static java.util.Collections.reverseOrder;


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

    public ListaNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    public void listaVazia() {
   if (listaNumeros.isEmpty()){
       throw new NoSuchElementException(" Lista está vazia");
   }
    }
    public void adicionarNumero(int numero){
    listaNumeros.add(numero);
    }
    public int calcularSoma(){
        listaVazia();
       int somaNumeros = 0;
            for (Integer i : listaNumeros){
                somaNumeros += i;
             }
            return somaNumeros;
    }
    public List<Integer> listaOrdenadaAscendente() {
        listaVazia();
        List<Integer> listaOrdenadaAscendente = new ArrayList<>(listaNumeros);
        Collections.sort(listaOrdenadaAscendente);
        return listaOrdenadaAscendente;
    }
    public List<Integer> listaOrdenadaDecrescente() {
        listaVazia();
        List<Integer> listaOrdenadaDecrecente = new ArrayList<>(listaNumeros);
        Collections.sort(listaOrdenadaDecrecente,reverseOrder());
        return listaOrdenadaDecrecente;
    }
    public int encontrarMaiorNumero(){
        listaVazia();
      return listaOrdenadaAscendente().getLast();
    }
    public int encontrarMenorNumero(){
        listaVazia();
        return listaOrdenadaAscendente().getFirst();
    }
    public List<Integer> exibirNumeros(){
        listaVazia();

        return listaNumeros;
    }

}
