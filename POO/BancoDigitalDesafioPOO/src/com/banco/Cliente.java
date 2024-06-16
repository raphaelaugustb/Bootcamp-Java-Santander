package com.banco;

import com.banco.utils.VerificarCpf;

public class Cliente {
    private final String nome;
    private String cpf;
    public Cliente (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }

    public String getNome() {
        return nome;
    }



}
