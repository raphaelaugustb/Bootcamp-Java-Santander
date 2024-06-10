package Convidados;

import java.util.*;

public class ConjuntoConvidados {
    private Set<Convidado> conjuntoConvidados;
    public ConjuntoConvidados(){
        this.conjuntoConvidados = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        conjuntoConvidados.add(new Convidado(nome,codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoRemover = null;
        for (Convidado c : conjuntoConvidados){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoRemover = c;
                break;
            } else {
                System.out.println(" Convidado nao encontrado");
            }

        }
        conjuntoConvidados.remove(convidadoRemover);
    }
    public int contarConvidado(){
        int totalConvidados = conjuntoConvidados.size();
        return totalConvidados;
    }
    public void exibirConvidados(){
        for(Convidado c : conjuntoConvidados){
                System.out.println(c);

        }
    }

}


