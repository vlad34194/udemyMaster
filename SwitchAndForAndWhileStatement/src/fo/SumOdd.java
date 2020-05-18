package fo;

public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(13,13));

    }
    public static boolean isOdd(int number){
        if((number>0)&&(number%2!=0)){
            return true;
        }
        return false;
    }
    public static int sumOdd(int start , int end){
        if(start<0||end<0){
            return -1;
        }
        if(end>=start){

            int sum = 0;
            for(int i=start;i<=end;i++){
                if(isOdd(i)){
                    sum+=i;
                }
            }
            return sum;
        }
        return -1;

    }
}
