package com.dio;

import com.dio.exception.InvalidBootcampException;

import java.awt.geom.IllegalPathStateException;
import java.util.*;

public class Dev {
    private String  name;
    private List<Conteudo> signedContents;
    private List<Conteudo> finishedContent;

    public Dev(String name, List<Conteudo> signedContents, List<Conteudo> finishedContent) {
        this.name = name;
        this.signedContents = signedContents;
        this.finishedContent = finishedContent;
    }
    public void addNewSignedBootcamp(Bootcamp bootcamp) throws InvalidBootcampException {
        if (bootcamp.getContents().isEmpty()){
            throw new InvalidBootcampException("Bootcamp não encontrado");
        } else {
            signedContents.addAll(bootcamp.getContents());
            bootcamp.addNewSignedDevs(this);
            System.out.println("Inscrição Concluída no bootcamp: " + bootcamp.getName());
        }
    }
    public void addNewContent(Conteudo content){
        signedContents.add(content);
    }
    public double calcularTotalXp() {
        double soma = 0;
        for (Conteudo c : signedContents){
            double next = c.calcularXp();
            soma += next;
        }
        return soma;
    }

    public List<Conteudo> getSignedContents() {
        return signedContents;
    }
}
