package com.banco;

import java.util.*;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.contas = new ArrayList<>();
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "com.banco.utils.Banco{" +
                "nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
    public boolean contasVazio(){
        if (contas.isEmpty()){
            System.out.println("Não a contas nesse banco");
            return false;
        } else {
            return true;
        }
    }
    public void adicionarClienteBanco(Conta conta){
     contas.add(conta);
    }
    public void removerClienteBanco(Conta conta ){
        if (contasVazio()){
            if (contas.contains(conta)){
                contas.remove(conta);
            } else {
                System.out.println("Conta não encontrada");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

}
