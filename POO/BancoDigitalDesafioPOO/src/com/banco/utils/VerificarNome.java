package com.banco.utils;

import com.banco.Cliente;
public class VerificarNome {
 public  boolean nome(Cliente cliente){
     if (cliente.getNome().matches("[A-z]*")){
         return true;
     } else {
         throw new IllegalArgumentException("Nome Invalido");
     }
 }

}
