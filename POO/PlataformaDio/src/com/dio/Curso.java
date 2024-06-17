package com.dio;

public class Curso  extends Conteudo{
    private final int workLoad;

    public Curso(String tittle, String description, int workLoad){
        super(tittle, description);
        this.workLoad = workLoad;
    }


    public int getWorkLoad() {
        return workLoad;
    }
    public double calcularXp(){
        return XP_PADRAO * workLoad;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "tittle='" + getTittle()+ '\'' +
                ", description='" + getDescription() + '\'' +
                ", workLoad=" + workLoad +
                "h}";
    }
}
