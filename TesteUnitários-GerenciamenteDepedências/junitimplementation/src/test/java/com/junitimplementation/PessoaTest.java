package com.junitimplementation;

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {
    @Test
    public void validarVerificadorAdulto(){
        Pessoa pessoa = new Pessoa("Raphael", 19);
        Assert.assertEquals("Mais 18 anos", pessoa.validarIdadeAdulto());
    }
}
