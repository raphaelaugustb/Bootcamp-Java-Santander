package com.banco.utils;

public class VerificarCpf {
    public boolean cpf(String cpf){
    if (cpf.length() == 14){
        return true;
    } else {
        throw new IllegalArgumentException("Cpf Inválido");
    }
    }
}

