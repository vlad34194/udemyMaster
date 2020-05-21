package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
    public static int[] getIntegers(int capacity){
        int[] arr = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < arr.length; i++) {
         arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Element " + i + " contens " + arr[i]);
        }
    }
    public static int[] sortIntegers(int[] arr){
//        int[] sortedArr = new int[arr.length];
//        for (int i = 0; i <arr.length ; i++) {
//            sortedArr[i] = arr[i];
//        }
        int[] sortedArr = Arrays.copyOf(arr,arr.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArr.length-1; i++) {
                if(sortedArr[i] < sortedArr[i+1]){
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArr;
    }
}
