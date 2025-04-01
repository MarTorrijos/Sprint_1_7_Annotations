package src.main.java.level_1.exercici_2;

import src.main.java.level_1.exercici_2.model.OnlineWorker;
import src.main.java.level_1.exercici_2.model.PresentialWorker;

public class WorkerInstances {

    public void run() {
        OnlineWorker onlineWorker = new OnlineWorker("Marcos", "García", 20);
        System.out.println(onlineWorker + ". Tiene un salario de "
                + onlineWorker.calculateSalary(100, onlineWorker.getHourlyPrice()) + " euros.");

        System.out.println(getDeprecatedOnline(onlineWorker));

        PresentialWorker presentialWorker = new PresentialWorker("Maria", "Torres", 24);
        System.out.println(presentialWorker + ". Tiene un salario de "
                + presentialWorker.calculateSalary(100, presentialWorker.getHourlyPrice()) + " euros.");

        System.out.println(getDeprecatedPresential(presentialWorker));
    }

    @SuppressWarnings("deprecation")
    public static String getDeprecatedPresential(PresentialWorker worker) {
        return worker.deprecatedMethod();
    }

    @SuppressWarnings("deprecation")
    public static String getDeprecatedOnline(OnlineWorker worker) {
        return worker.deprecatedMethod();
    }

}