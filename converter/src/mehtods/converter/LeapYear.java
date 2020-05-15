package mehtods.converter;

public class LeapYear {
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);

    }
    public static boolean isLeapYear(int year) {
        if(year >= 1 && year <= 9999){
            System.out.println("true");
            return ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0);
        }
        System.out.println("false");
        return false;
    }
}
