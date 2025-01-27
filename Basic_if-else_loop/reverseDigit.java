import java.util.Scanner;

public class reverseDigit {
    static int reverse(int digit){
        int ans = 0;
        int a=0;
        for(int i=digit ; i > 0 ; i=i/10){
            a++;
        }
        for(int i=digit ; i > 0 ; i=i/10){
            int unit = i%10;
            ans = ans + (int)(unit * (Math.pow(10, --a)));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit to reverse : ");
        int digit = sc.nextInt();
        System.out.println(reverse(digit));

    }
}
