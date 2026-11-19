package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        printThreeWords();  //1

        checkSumSign();  //2

        printColor();  //3

        compareNumbers();  //4

        System.out.println(isSumInRange(6, 14));  //5

        checkNumberSign(-10);  //6

        System.out.println(isNumberNegative(0));  //7

        printString("Hello, World!", 3);  //8

        System.out.println(isLeapYear(2000));  //9

        //10
        int[] array = {1,1,1,0,0,0,1,0,0,0,1,1,1};
        for(int i=0; i< array.length;i++){
            if (array[i] == 0) {
                array[i] = 1;
            }else {
                array[i] = 0;
            }
        }
        for(int num: array){
            System.out.print(num+" ");
        }

        //11

        int[] numbers = new int[100];
        for (int i=0, j=1; i< numbers.length; i++, j++){
            numbers[i]=j;
        }
        System.out.println("\n"+Arrays.toString(numbers));

        //12

        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i=0; i< nums.length;i++){
            if (nums[i]<6){
                nums[i]*=2;
            }
        }
        System.out.println(Arrays.toString(nums));

        //13

        int[][] twoDimArray= new int [5][5];
        for(int i=0; i< twoDimArray.length;i++){
            for(int j=0; j< twoDimArray[i].length; j++){
                if (i==j){
                    twoDimArray[i][j]=1;
                }
                if (i+j==twoDimArray.length-1){
                    twoDimArray[i][j]=1;
                }
            }
        }

        System.out.println(Arrays.deepToString(twoDimArray));

        //14

        int[] createdArray = createArray(8, 25);
        System.out.println(Arrays.toString(createdArray));

    }

    //1
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    //2
    public static void checkSumSign() {
        int a = 10;
        int b = -10;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //3
    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
    }

    //4
    public static void compareNumbers() {
        int a = 907;
        int b = 908;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //5
    public static boolean isSumInRange(int x, int y) {
        return x + y >= 10 && x + y <= 20;
    }

    //6
    public static void checkNumberSign(int c) {
        if (c >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //7
    public static boolean isNumberNegative(int f) {
        return f < 0;
    }

    //8
    public static void printString(String str, int num) {
        for (int i = num; i > 0; i--) {
            System.out.println(str);
        }
    }

    //9
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }


    //14

    public static int[] createArray(int len, int initialValue){
        int[] array = new int[len];
        for(int i=0; i<len; i++){
            array[i]=initialValue;
        }
        return array;
    }

}
