package mehtods.converter;

public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true,1);
        shouldWakeUp(false,2);

    }

    private static void shouldWakeUp(boolean barking, int hourOfDay) {
        if ((barking) && (hourOfDay >= 0) && (hourOfDay < 8)) {
            System.out.println("true");
        } else if ((barking) && hourOfDay == 23) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
