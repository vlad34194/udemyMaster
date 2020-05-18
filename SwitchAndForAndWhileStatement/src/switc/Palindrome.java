package switc;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        while (number !=0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return (originalNumber == reverse);
    }
}
