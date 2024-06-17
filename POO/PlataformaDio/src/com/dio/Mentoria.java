package com.dio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate date;

    public Mentoria(String tittle, String description, LocalDate date){
        super(tittle,description);
        this.date = date;
    }


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "age='" + getTittle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
