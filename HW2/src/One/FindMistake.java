package One;

public class FindMistake {
 /*
 int a;
 double d = 10.5;
 a = d * 3;// ми з більшого типу записуєм в менший по розміру
           // Варіант 1 (int) (d * 3)
           //Варіант 2 зробити а double
 System.out.println("a = " + a);*/

    public static void main(String[] args) {
        int a;
        double d = 10.5;
        a = (int) (d * 3); //зміна типу виразу
        System.out.println("a = " + a);

        double A;// зміна типу А на double
        double D = 10.5;
        A = D * 3;
        System.out.println("A = " + A);
    }
}
