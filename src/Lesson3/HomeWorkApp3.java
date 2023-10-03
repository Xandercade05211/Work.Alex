package Lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {
    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
    //одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    //(можно только одну из диагоналей, если обе сложно). Определить элементы одной из
    //диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
    //[1][1], [2][2], …, [n][n];

    public static void squareTwo_DmensionalIntegerArray() {
        int n = 3;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }


    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
    //умножить на 2;
    public static void multiplyByTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
    //значениями 1 2 3 4 5 6 7 8 … 100;
    public static void fillInTheArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
    //0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void switchPlaces() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*
     public static int arrSum(int[] arr){
         int sum = 0;
         for (int i = 0; i < arr.length; i++) {
             sum+=arr[i];
         }
         return sum;
     }
     public static void print2DArray(int[][] arr){
         for (int i = 0; i < arr.length; i++) {
             System.out.print(i + " ");
         }
         System.out.println();
         for (int i = 0; i < arr.length; i++) {
             System.out.print(i + 1 + " ");
             for (int j = 0; j < arr.length; j++) {
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }
     }
     public static void print1DArray(int[] arr){
         for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i] + " ");
         }
         System.out.println();
     }

     */
    public static void main(String[] args) {
        // print1DArray(new int[]{12});
        //print2DArray(new int[][]{new int[]{10}});
        // System.out.println(arrSum(new int[]{15}));
        switchPlaces();
        System.out.println();
        fillInTheArray();
        System.out.println();
        multiplyByTwo();
        System.out.println();
        squareTwo_DmensionalIntegerArray();
    }
}
