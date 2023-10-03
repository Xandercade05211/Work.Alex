package lesson2;

import java.util.Scanner;

public class HomeWorkApp2 {
    //5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
    //(високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
    //100-го, при этом каждый 400-й – високосный.
    public static boolean definitionOfTheYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }


    //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
    //отпечатать в консоль указанную строку, указанное количество раз;
    public static void printText(String word, int sum) {
        for (int i = 0; i < sum; i++) {
            System.out.println(word);
        }
    }
    //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
    //отпечатать в консоль указанную строку, указанное количество раз;
    public static boolean printBool(int a) {
        return a < 0;
    }
    //2. Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
    //считаем положительным числом.
    public static void printInt(int v) {
        if (v > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }
    //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    //в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false
    public static boolean printBool(int a, int b) {
        return (a + b) > 10 && (a + b) <= 20;
    }

    public static void main(String[] args) {
        System.out.println(printBool(10, 10));
        printInt(565);
        System.out.println(printBool(-1));
        printText("5rgffdsg", 5);
        System.out.println(definitionOfTheYear(2024));

        /*
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        */
        /*
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > j) {
                    System.out.print("* ");
                } else if (i < j) {
                    System.out.print("0 ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j < 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

         */

       /*
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('$');
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print('*');
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print('*');
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println('*');
        }

       // System.out.println('*');

        */
    }
}
