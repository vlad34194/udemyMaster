package mehtods.converter;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
    }
    public static long toMilesPerHour(double kilometersPerHour) {


        if (kilometersPerHour >= 0) {

            double miles = kilometersPerHour / 1.609;

            long rounded = Math.round(miles);

            return rounded;

        } else {

            return -1;

        }


    }


    public static void printConversion(double kilometersPerHour) {


        if (kilometersPerHour >= 0) {

            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");

        } else {

            System.out.println("Invalid Value");

        }

    }
}
