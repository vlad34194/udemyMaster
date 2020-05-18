package switc;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
    }
    public static int getGreatestCommonDivisor(int n1,int n2){
        if(n1 < 10 || n2 < 10){
            return -1;
        }
        int t1 = n1 < n2 ? n1 : n2;
        for(int i = t1 ; i > 0;i--){
            if(n1 % i == 0 && n2 % i == 0) return i;;
        }
        return 1;
    }
}
