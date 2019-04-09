package first;

public class DemoMyException {

    public static void main(String[] args) throws MyException {

        ////////////////////////=2=//////////////////////////

        Exp exp = new Exp();
        exp.Excep("");

        ////////////////////////=3=//////////////////////////
        Ship task = new Ship();

        task.SetS(163.6f);
        task.SetV(30.1f);
        task.SetU(13.1f);

        task.getTime();
        task.getVs();
        task.print();
        /////////////////////////////////////////////////
    }
}
