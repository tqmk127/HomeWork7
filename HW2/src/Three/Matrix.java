package Three;

import java.util.Scanner; // імпорт сканера

public class Matrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть бажану кількість рядків: ");
        int n = scan.nextInt();//введення кількості рядків
        System.out.print("Введіть бажану кількість стовпчиків: ");
        int m = scan.nextInt();//ввеедння кількості стовпчиків
        int[][] matrix = new int[n][m];//оголошення двовимірного масиву цілих чисел

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {//заповнення матриці псевдовипадковими числами
                matrix[i][j] = ((int) (Math.random() * 15));
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.print("Введіть число, кількість збігів якого Ви хочете дізнатися: ");
        int repeat = scan.nextInt();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == repeat) { //пошук кількості чисел, які співпачають з веденним
                    counter++;//лічильник
                }
            }
        }

        System.out.print("Кількість зафіксованих збігів: " + counter);
    }
}
