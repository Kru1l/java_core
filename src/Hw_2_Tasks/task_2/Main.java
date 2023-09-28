package Hw_2_Tasks.task_2;

//Створити та описати наступну iєрархію:
//        PC-Laptop-Ultrabook
//        PC-Laptop- Workstation
//        Загальна кількість вкористаних класів - 4!

public class Main {
    public static void main(String[] args) {
        PC pc = new PC("Ryzen-7000x", "Radeon");
        Ultrabook ultrabook = new Ultrabook("Core i9", "GeForce-4070GT", 14.5, true, "Be quiet!");

        System.out.println(pc);
        System.out.println(ultrabook);
    }
}