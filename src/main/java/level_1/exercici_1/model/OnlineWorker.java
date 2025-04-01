package main.java.level_1.exercici_1.model;

public class OnlineWorker extends Worker {

    private final int INTERNETPRICE = 50;

    public OnlineWorker(String name, String surname, int hourlyPrice) {
        super(name, surname, hourlyPrice);
    }

    @Override
    public String toString() {
        return "Trabajador online llamado " + getName() + " " + getSurname() + " cuyo precio/hora es de "
                + getHourlyPrice() + " euros";
    }

    @Override
    public int calculateSalary(int workedHours, int hourlyPrice) {
        return workedHours * hourlyPrice + INTERNETPRICE;
    }

}