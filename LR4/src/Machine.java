
public abstract class Machine implements Run {

    protected final double MinSpeed = 1.7; //(км/с)
    protected final double MaxSpeed = 10.5; //(км/с)
    protected String name;
    protected double speed;

    //конструктор з параметрами
    public Machine(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    //абстрактні методи, які не містять тіла
    abstract double getMinSpeed();
    abstract double getMaxSpeed();
    abstract String getName();

    @Override//перевизначення метода
    public void printInfo()
    {
        System.out.println("Назва: "+getName()+"\nMin. швидкість: "+ getMinSpeed()+"км/с\nMax. швидкість: "
                + getMaxSpeed()+ "км/с\nШвидкість: "+ getSpeed()+"км/с");
    }
}
