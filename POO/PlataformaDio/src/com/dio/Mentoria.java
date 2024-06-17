package com.dio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate date;
    private double xp_adicional;
    public Mentoria(String tittle, String description, LocalDate date, double xp_adicional){
        super(tittle,description);
        this.date = date;
        this.xp_adicional = xp_adicional;
    }


    @Override
    public double calcularXp() {
        return XP_PADRAO + xp_adicional;
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
