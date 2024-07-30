import java.util.Scanner;

public class CheckPrime {
    static boolean isPrime(int value){
        int flag = 0;
        for(int i=1; i<=value ; i++){
            if(value % i ==0) flag++;
        }
        if(flag == 2) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for checking prime ");
        int value = sc.nextInt();
        if(isPrime(value)) System.out.println("Given value is prime number ");
        else System.out.println("Given number is not prime number ");

    }
}
