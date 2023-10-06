package Lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {
    //8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть
    //положительным, или отрицательным), при этом метод должен сместить все элементы массива
    //на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
    //вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5,
    //6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете
    //выбирать сами.
    public static void methodToShiftAllElementsOfTheArrayByNPositions(int[] array, int n) {
        int[] sum = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int newIndex = (i + n) % array.length;
            sum[newIndex] = array[i];
        }
        System.arraycopy(sum , 0 ,array,0,array.length);
    }


    //7** Написать метод, в который передается не пустой одномерный целочисленный массив,
    //метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
    //массива равны.
    //Примеры:
    //checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    //checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1

    public static boolean thereIsAPlaceInTheArray(int[] array) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] += left;

            for (int j = 0; j < array.length; j++) {
                array[j] += right;
            }
        }

        if (left == right) {
            return true;
        } else {
            return false;
        }
    }

    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void findTheMinMaxArray() {
        int[] minMaxArr = new int[]{-121, 20, 34324, -12, 685, -432, -65, 93};
        int max = minMaxArr[0];
        int min = minMaxArr[0];
        for (int i = 0; i < minMaxArr.length; i++) {
            if (minMaxArr[i] > max) {
                max = minMaxArr[i];
            }
            if (minMaxArr[i] < min) {
                min = minMaxArr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
    //одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] returningAOneDimensionalArray(int len, int initiaValue) {
        int[] fullArray = new int[len];
        for (int i = 0; i < len; i++) {
            fullArray[i] = initiaValue;
        }
        return fullArray;
    }


    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
    //одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    //(можно только одну из диагоналей, если обе сложно). Определить элементы одной из
    //диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
    //[1][1], [2][2], …, [n][n];

    public static void fillDiagonalsTheArray() {
        int n = 3;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
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
        fillDiagonalsTheArray();
        System.out.println();
        System.out.println(Arrays.toString(returningAOneDimensionalArray(10, 5)));
        System.out.println();
        findTheMinMaxArray();
        System.out.println();
        int[] array = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3,};

        System.out.println();
        methodToShiftAllElementsOfTheArrayByNPositions(5 , 1);

    }
}
