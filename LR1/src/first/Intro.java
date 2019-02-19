package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intro
{
    public static void main(String[] args) throws IOException {

        System.out.println("Ласкаво просимо!");
        System.out.println("Яке Ваше ім'я?");
        BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
        String userName = input.readLine();
        System.out.println("Приві,"+userName+"!");
        int now = 2019;
        System.out.println("Скільки Вам років?");
        int age = Integer.parseInt(input.readLine());
        System.out.println("Ви народилися в " + (now - age) +  " році.");
    }
}
