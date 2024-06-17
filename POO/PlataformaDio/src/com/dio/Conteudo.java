package com.dio;

public abstract class Conteudo {
   protected static final double XP_PADRAO = 10d;
   private String tittle;
   private String description;

    public Conteudo(String tittle, String description) {
        this.tittle = tittle;
        this.description = description;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDescription() {
        return description;
    }

    public abstract double calcularXp();
}
