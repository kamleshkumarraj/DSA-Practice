import java.util.Scanner;

public class binToDec {
    public static int binToDecimal(int binary){
        // Your code here
        int dec = 0;
        int i = 0 ;
        while(binary > 0){
            int firstBitFromBin = binary % 10;
            dec += (int)(firstBitFromBin * Math.pow(2,i));
            binary = binary/10;
            i++;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your binary number : ");
        int binaryNumber = sc.nextInt();
        // validate correct binary.
        
        System.out.println(binaryNumber + " ---> " + binToDecimal(binaryNumber));
    }
}
