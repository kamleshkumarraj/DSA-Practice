import java.util.Scanner;

public class decimalToBinary {

    public static int  reverseDigit(int num) {
        int rev = 0;
        while(num > 0 ){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }
    public  static  int decToBin(int decimal) {
        int bin = 0;
        int i = 0;
        while (decimal > 0 ){
            bin += decimal % 2 * Math.pow(10, i);
            i++;
            decimal = decimal /2;
        }
        // int originalBin = reverseDigit(bin);
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter decimal number : ");
        int decimalNumber = sc.nextInt();

        System.out.println(decimalNumber + " ----> " + decToBin(decimalNumber));

        System.out.println(0*10+9);
    }
}
