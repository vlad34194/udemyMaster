package whil;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long average = 0;
        int totalNumbers = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                sum += number;
                totalNumbers++;
            } else {

                break;
            }
            scanner.nextLine();
        }

        average = Math.round((double) sum / totalNumbers);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }

}
