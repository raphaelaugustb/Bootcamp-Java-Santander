package com.junitimplementation;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String validarIdadeAdulto(){
        if (this.idade >= 18){
            return  "Mais 18 anos";
        }else {
            return "Menos de 18 anos";
        }
    }
}
