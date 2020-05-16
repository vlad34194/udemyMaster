package with.overlloading;

public class SecondAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));

    }
    public static String getDurationString(long minutes, long seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }else{
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;
            return hours + " h " + remainingMinutes + " m " + seconds + " s";
        }
    }
    public static String getDurationString(long seconds){
        if(seconds < 0){
            return "Invalid Value";
        }else{
            long minutes = seconds / 60;
            long remainigMinutes = minutes % 60;
            return getDurationString(minutes,remainigMinutes);
        }
    }

}
