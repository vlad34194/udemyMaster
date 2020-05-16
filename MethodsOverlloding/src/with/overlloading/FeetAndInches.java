package with.overlloading;

public class FeetAndInches {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(157);
        double centimeters = calcFeetAndInchesToCentimeters(6,0);
        if(centimeters < 0.0){
            System.out.println("Invalid parameters");
        }

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet <= 0 || inches <= 0) && inches > 12){
            return -1.0;
        }else{
            double cetimeters = (feet * 12) * 2.54;
            cetimeters += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + cetimeters + " cm");
            return cetimeters;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches <= 0 ){
            return -1.0;
        }else{
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet,inches);
        }
    }
}
