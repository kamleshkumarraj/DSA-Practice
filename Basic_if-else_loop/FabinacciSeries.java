import java.util.Scanner;

public class FabinacciSeries {
    static void printFabinacciSeries(int n){
        int a = 0;
        int b =1;
        int c;
        System.out.print(a+" ");
        System.out.print(b+" ");  
        for(int i=2; i<=n; i++){     
            c = a+b;
            System.out.print(c+" ");   
            a =b;
            b =c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for printitng the series : ");
        int n = sc.nextInt();
        printFabinacciSeries(n);
    }
}
