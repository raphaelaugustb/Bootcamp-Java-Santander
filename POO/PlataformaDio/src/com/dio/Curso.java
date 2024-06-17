package com.dio;

public class Curso {
    private String tittle;
    private String description;
    private int workLoad;

    public Curso(String tittle, String description, int workLoad){
        this.tittle = tittle;
        this.description = description;
        this.workLoad = workLoad;
    }
    public String getTittle(){
        return tittle;
    }

    public String getDescription() {
        return description;
    }

    public int getWorkLoad() {
        return workLoad;
    }
    public void calcularXp(){

    }

    @Override
    public String toString() {
        return "Curso{" +
                "tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                ", workLoad=" + workLoad +
                '}';
    }
}
