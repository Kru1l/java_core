package Hw_2_Tasks.task_4;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Citizen {
    private int id;
    private String name;
    private String surName;
    private String email;
    private int age;
    private Gender gender;
    private final ArrayList<Skill> skills = new ArrayList<>();
    private Car car;

    public Citizen() {}

    public Citizen(int id, String name, String surName, String email, int age, Gender gender, String model, int year, double power) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.car = new Car(model, year, power);
    }
}
