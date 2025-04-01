package src.main.java.level_1.exercici_1;

import src.main.java.level_1.exercici_1.model.OnlineWorker;
import src.main.java.level_1.exercici_1.model.PresentialWorker;

public class Main {

    public static void main(String[] args) {

        OnlineWorker onlineWorker = new OnlineWorker("Marcos", "García", 20);
        System.out.println(onlineWorker + ". Tiene un salario de "
                + onlineWorker.calculateSalary(100, onlineWorker.getHourlyPrice()) + " euros.");

        PresentialWorker presentialWorker = new PresentialWorker("Maria", "Torres", 24);
        System.out.println(presentialWorker + ". Tiene un salario de "
                + onlineWorker.calculateSalary(100, presentialWorker.getHourlyPrice()) + " euros.");

    }

}