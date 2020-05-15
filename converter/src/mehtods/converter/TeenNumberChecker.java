package mehtods.converter;

public class TeenNumberChecker {
    public static void main(String[] args) {
        hasTeen(9,99,19);
        hasTeen(23,15,42);
        isTeen(9);
        isTeen(13);
    }
    public static boolean hasTeen(int a, int b, int c){
        if((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >=13 && c <= 19)){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }
    public static boolean isTeen(int n){
        if(n >= 13 && n <=19){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }
}
