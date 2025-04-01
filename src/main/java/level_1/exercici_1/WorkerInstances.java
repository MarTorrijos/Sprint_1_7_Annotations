package main.java.level_1.exercici_1;

import main.java.level_1.exercici_1.model.OnlineWorker;
import main.java.level_1.exercici_1.model.PresentialWorker;

public class WorkerInstances {

    public void run() {
        OnlineWorker onlineWorker = new OnlineWorker("Marcos", "García", 20);
        System.out.println(onlineWorker + ". Tiene un salario de "
                + onlineWorker.calculateSalary(100, onlineWorker.getHourlyPrice()) + " euros.");

        PresentialWorker presentialWorker = new PresentialWorker("Maria", "Torres", 24);
        System.out.println(presentialWorker + ". Tiene un salario de "
                + onlineWorker.calculateSalary(100, presentialWorker.getHourlyPrice()) + " euros.");
    }

}
