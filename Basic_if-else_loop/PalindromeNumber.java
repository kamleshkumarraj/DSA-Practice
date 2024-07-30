public class PalindromeNumber {
    static boolean isPalindrome(int value){
        int sum = 0;
        for(int i=value; i>0; i=i/10){
            int unit_val = i % 10;
            sum = sum*10+unit_val;
        }
        if(sum == value) return true;
        else return false;

    }
    public static void main(String[] args) {
        if(isPalindrome(12344321)) System.out.println("Given number is palindrome number ");
        else System.out.println("Given number is not palindrome");
    }
}
