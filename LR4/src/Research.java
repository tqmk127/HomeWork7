public class Research extends Rocket {

    private int MinPassengers;
    private int MaxPassengers;


    public Research(String name, double speed, double weight, int amountOfPassengers,
                    int movement, int MinPassengers, int MaxPassengers) {

        super(name, speed, weight, amountOfPassengers, movement);

        this.MinPassengers = MinPassengers;
        this.MaxPassengers = MaxPassengers;
    }


    public int getMinPassengers() {
        return MinPassengers;
    }

    public int getMaxPassengers() {
        return MaxPassengers;
    }

    @Override//перевизначення метода
    public void printInfo() {
        super.printInfo();//виклик метода суперкласу
        System.out.println("Max. к-сть пасажирів: " + getMinPassengers()
                + "\nMin. к-сть пасажирів: " + getMaxPassengers());
    }
}
