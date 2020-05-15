package mehtods.converter;

public class EqualSumChecker {
    public static void main(String[] args) {
        hasEqualSum(1,1,1);
        hasEqualSum(1,1,2);
    }
    private static boolean hasEqualSum(int a, int b, int c){
        if(a + b == c){
//            System.out.println("true");
            return true;
        }else{
//            System.out.println("false");
            return false;
        }
    }
}
