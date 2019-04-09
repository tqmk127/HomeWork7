package first;

import first.MyException;

public class Ship {

    private Float S = null;// Відстань, яку човен пройшов туди і назад
    private Float V = null;// Швидкість човна
    private Float U = null;//Швидкість течії

    private float v1;// Швидкість човна, який пливе за течією
    private float v2;// Швидкість човна, який пливе проти течії

    public Ship() {
    }

    public void SetS(float S) throws MyException {
        if (S <= 0)  //відстань не повинна дорівнювати 0 або бути від'ємним
            throw new MyException("Distance (S) can not be initialise like zero or negative number.");
        this.S = S;
    }

    public void SetV(float V) throws MyException {
        if (V <= 0) // швидкість не повинна дорівнювати 0 або бути від'ємною
            throw new MyException("Speed of the ship (V) can not be initialise like zero or negative number.");
        this.V = V;
    }

    public void SetU(float U) throws MyException {
        if (U <= 0) // швидкість не повинна дорівнювати 0 або бути від'ємною
            throw new MyException("Speed of the flow (U) can not be initialise like zero or negative number.");
        this.U = U;
    }

    //метод отримання середньої швидкості човна
    public float getVs() throws MyException {
        if (V == null && U == null) //швидкість течії та човна не ініціалізовані
            throw new MyException("Speed of the flow (U) and speed of the ship (V) are not initialized.");
        v1 = V + U;// отримання швидкісті човна, який пливе ЗА течією
        v2 = V - U;// отримання швидкісті човна, який пливе ПРОТИ течією
        return (v1 + v2) / 2;
    }

    // метод отримання часу, за який човен пройшов всю загальну відстань
    public float getTime() throws MyException {
        if (V == null && U == null && S == null) //швидкість течії, човна і відстань не ініціалізовані
            throw new MyException("Distance (S), speed of the ship (V) and speed of the flow (U) are not initialized.");
        float s1 = S / 2;

        v1 = V + U;// отримання швидкісті човна, який пливе ЗА течією
        v2 = V - U;// отримання швидкісті човна, який пливе ПРОТИ течією

        if ( v2 == 0) // можливість утворення 0
            throw new MyException("Division by zero.");//ділення на нуль
        if ( v2 < 0) // можливість утворення числа з мінусом
            throw new MyException("Division by negative number.");// ділення на від'ємне число

        float t1 = s1 / v1;//отримання часу,за який човен пройшов шлях ЗА течією
        float t2 = s1 / v2;//отримання часу,за який човен пройшов шлях ПРОТИ течії
        return t1 + t2;
    }

    public void print() throws MyException {
        System.out.println("=== Середня швидкість човна: " + getVs() + " км/год ===");
        String str = String.format("=== Час, за який човен пройшов загальну відстань: %.1f год. ===", getTime());
        System.out.println(str);
    }
}
