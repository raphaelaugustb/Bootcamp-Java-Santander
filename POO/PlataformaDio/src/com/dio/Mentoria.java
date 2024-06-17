package com.dio;

import java.time.LocalDate;

public class Mentoria {
    private String age;
    private String description;
    private LocalDate date;

    public Mentoria(String age, String description,  LocalDate date){
        this.age = age;
        this.description = description;
        this.date = date;
    }

    public String getAge() {
        return age;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "age='" + age + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
