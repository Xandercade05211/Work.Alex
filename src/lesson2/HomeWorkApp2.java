package lesson2;

import java.util.Scanner;

public class HomeWorkApp2 {
    public static void printText(String word , int sum){
        for (int i = 0; i < sum; i++) {
            System.out.println(word);
        }
        //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
        //отпечатать в консоль указанную строку, указанное количество раз;
    }
    public static boolean printBool1(int a) {
        if (a < 0) {
            return true;
        } else
            return false;
        //3. Написать метод, которому в качестве параметра передается целое число. Метод должен
        //вернуть true, если число отрицательное, и вернуть false если положительное.
    }

        public static void printInt ( int v){
            if (v > 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
            //2. Написать метод, которому в качестве параметра передается целое число, метод должен
            //напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
            //считаем положительным числом.
        }

        public static boolean printBool ( int a, int b){
            if ((a + b) > 10 && (a + b) <= 20) {
                return true;
            }
            return false;
        }
        //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
        //в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false

        public static void main (String[]args){
            printBool(10, 10);
            printInt(565);
            printBool1(-1);
            printText("5rgffdsg" , 5);

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
