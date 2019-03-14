package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//1
        System.out.print("Будь ласка, напишіть речення: ");
        String str = scanner.nextLine();

//створення масиву слів за допомогою методу split(),
//який прибирає з рядка регулярні вирази
// "\s"-символ пробіла, "\\" відповідає за "\",
// "[]+" - символи зустрічаються один або бідьше разів
        String[] arrStr = str.split("[\\s.,?!+=_']+");

        String max = arrStr[0];
//Шукаю найдовше слово в масиві
        for (int i = 1; i < arrStr.length; i++) {
// якщо елемент з максимальною кількістью символів
//має менше символів, ніж порівнювальний елемен,
//то він і стає максимальним
            if (max.length() < arrStr[i].length())
                max = arrStr[i];
        }

        System.out.println("Відбувся пошук найдовшого слова!\nРезультат: " + max);

//2
        System.out.print("Будь ласка, напишіть речення, яке містить в собі слово end: ");
        String str2 = scanner.nextLine();
//щоб видалити з рядка потрібне слово і в даному випадку
// все після нього, то використовую метод replaceAll()
// регулярним виразом записую "end" та записую ".*", щоб видалити все піля цього слова
        String string = str2.replaceAll("end.*", "");
        System.out.println(string);

//в рядку можуть залишитися певні символи і також пробіли
//тому використовую метод split() та створюю масив рядків
        String[] arrStr2 = string.split("[\\s.,?!+=_']+");

//Сортування слів у алфавітному порядку
//за алоритмом Шелла з використанням метода compareTo()
        int d = arrStr2.length / 2;// так званий поділ масиву навпіл
        while (d > 0) {
            for (int i = 0; i < arrStr2.length - d; i++) {
                int j = i;
//використовую метод compareTo()
// 0, якщо аргумент рядка дорівнює цьому рядку
// значення менше 0, якщо цей рядок лексикографічно менше
// значення більше 0, якщо цей рядок лексикографічно більше
                while ((j >= 0) && (arrStr2[j].compareTo(arrStr2[j + d]) > 0)) {
                    String buf = arrStr2[j];
                    arrStr2[j] = arrStr2[j + d];
                    arrStr2[j + d] = buf;
                    j--;
                }
            }
            d = d / 2;
        }

        for (int i = 0; i < arrStr2.length; i++) {
            System.out.println(" " + arrStr2[i]);
        }

        System.out.println("\n");
//використання методу sort() классу Arrays для перевірки
        Arrays.sort(arrStr2);
        for (int i = 0; i < arrStr2.length; i++) {
            System.out.println(arrStr2[i]);
        }

    }
}

