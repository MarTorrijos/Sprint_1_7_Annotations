package main.java.level_1.exercici_1.model;

public class Worker {

    private String name;
    private String surname;
    private int hourlyPrice;

    public Worker(String name, String surname, int hourlyPrice) {
        this.name = name;
        this.surname = surname;
        this.hourlyPrice = hourlyPrice;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getHourlyPrice() {
        return hourlyPrice;
    }

    public int calculateSalary(int workedHours, int hourlyPrice) {
        return workedHours * hourlyPrice;
    }

}
