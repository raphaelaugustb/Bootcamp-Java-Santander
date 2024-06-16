package com.banco.utils;
import com.banco.Cliente;
import java.io.InvalidObjectException;

public class VerificarCliente {
    public Cliente cliente(Cliente cliente) throws InvalidObjectException {
        VerificarCpf verificarCpf = new VerificarCpf();
        VerificarNome verificarNome = new VerificarNome();
        if (verificarCpf.cpf(cliente.getCpf()) && verificarNome.nome(cliente)) {
            return cliente;
        } else {
            throw new InvalidObjectException("Cliente Inválido");
        }
    }
}