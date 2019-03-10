public class Satellite extends Rocket {

    private String date;//дата вильоту

    public Satellite(String name, double speed, double weight, int amountOfPassengers, int movement, String date) {
        super(name, speed, weight, amountOfPassengers, movement);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    @Override//перевизначення метода
    public void printInfo() {
        super.printInfo();//виклик метода суперкласу
        System.out.println("Дата вильоту: " + getDate());
    }
}
