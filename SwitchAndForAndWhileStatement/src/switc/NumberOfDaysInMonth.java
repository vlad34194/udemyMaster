package switc;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1600));
        System.out.println(getDaysInMonth(2,2018));

    }
    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((year < 1 || year > 9999) || (month < 1 || month > 12)) {
            return -1;
        }

        boolean isLeap = isLeapYear(year);
        int febDays = 28;
        if (isLeap){
            febDays=29;
        }

        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return febDays;
            default:
                return 0;
        }
    }
}
