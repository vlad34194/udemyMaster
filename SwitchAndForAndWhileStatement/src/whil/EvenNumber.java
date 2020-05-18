package whil;

public class EvenNumber {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }
            System.out.println("Even number " + number);
        }
        System.out.println("Total even numbers found -> " + evenNumbersFound);
    }
    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
