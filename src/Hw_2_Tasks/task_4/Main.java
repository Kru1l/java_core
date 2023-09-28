package Hw_2_Tasks.task_4;

// Створити клас котрий відповідає наступній моделі:
//        {
//        id: 1,
//        name: 'vasya',
//        surname: 'pupkin',
//        email: 'asd@asd.com',
//        age: 31,
//        gender: 'MALE',
//        skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Skill> citizenSkills = new ArrayList<>();
        Citizen citizen = new Citizen(1, "Kole", "Merfy", "merfy34@mail.com", 36, Gender.MALE, "Honda", 2015, 3.5);

        citizen.getSkills().add(new Skill("Java", 10));
        citizen.getSkills().add(new Skill("Python", 8));

        System.out.println(citizen);
    }
}