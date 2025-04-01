package main.java.level_1.exercici_1.model;

public class PresentialWorker extends Worker {

    private final int GAS = 30;

    public PresentialWorker(String name, String surname, int hourlyPrice) {
        super(name, surname, hourlyPrice);
    }

    @Override
    public String toString() {
        return "Trabajador presencial llamado " + getName() + " " + getSurname() + " cuyo precio/hora es de "
                + getHourlyPrice() + " euros";
    }

    @Override
    public int calculateSalary(int workedHours, int hourlyPrice) {
        return workedHours * hourlyPrice + GAS;
    }

}