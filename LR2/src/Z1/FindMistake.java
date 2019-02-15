package Z1;

public class FindMistake {
   /*
        int a;
        double d = 10.5;
        a = d * 3;// ми з быльшого типу записуєм в менший по розміру
                  // Вариант 1 (int) (d * 3)
                  //Вариант 2 сделать а double
        System.out.println("a = " + a);*/
   public static void main(String[] args)
    {
        int a;
        double d = 10.5;
        a = (int) (d * 3);
        System.out.println("a = " + a);
    }
}
